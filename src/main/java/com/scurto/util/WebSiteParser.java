package com.scurto.util;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class WebSiteParser {

    public static ArrayList<String> getParsedUrlsFromWebSite(String websiteUrl) {
        ArrayList<String> parsedUrlsList = new ArrayList<>();
        try {
            parsedUrlsList.addAll(getProperLinks(websiteUrl));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parsedUrlsList;
    }

    private static TreeSet<String> getProperLinks(String url) throws IOException {
        TreeSet<String> pageUrls = new TreeSet<>();
        Document doc;
        doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                .referrer("http://www.google.com")
                .timeout(1000) //it's in milliseconds, so this means 5 seconds.
                .ignoreHttpErrors(true).get();


        Elements links = doc.body().select("a");

        for (Element link : links) {
            String linkHref = link.attr("href");
            System.out.println(linkHref);
            System.out.println(linkHref.endsWith(".xml"));
            if (!(linkHref.equalsIgnoreCase(url)
                    || linkHref.endsWith(".xml")
                    || linkHref.endsWith(".txt")
                    || linkHref.contains("#")
            ) && (linkHref.startsWith("http://"+url)
                    || linkHref.startsWith("https://"+url)
                    || linkHref.startsWith(url))) {
                pageUrls.add(linkHref);
            }
        }
        return pageUrls;
    }

    public static boolean isActiveLink(String linkHref) throws IOException {
        Connection.Response execute = Jsoup.connect(linkHref)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                .referrer("http://www.google.com")
                .ignoreHttpErrors(true).execute();

        if (execute.statusCode() == 200) {
            Document doc;
            doc = Jsoup.connect(linkHref)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                    .referrer("http://www.google.com")
                    .timeout(1000) //it's in milliseconds, so this means 5 seconds.
                    .ignoreHttpErrors(true).get();


            for (Element element : doc.body().getAllElements()) {
                if (element.className().equalsIgnoreCase("adsbygoogle")
                        || element.id().equalsIgnoreCase("aw0")
                        || element.id().equalsIgnoreCase("adContent")
                        || element.id().equalsIgnoreCase("adContent-anchor")
                        || element.id().equalsIgnoreCase("adunit")
                        ) {
                    return true;
                }
            }
            return false;
        }

        return false;
    }
}
