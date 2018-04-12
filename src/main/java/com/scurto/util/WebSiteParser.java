package com.scurto.util;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
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
                .proxy("92.53.73.138", 8118)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                .referrer("http://www.google.com")
                .timeout(20000) //it's in milliseconds, so this means 5 seconds.
                .ignoreHttpErrors(true).get();
//        https://free-proxy-list.net/

        Elements links = doc.body().select("a");
        String shortUrl = url.startsWith("https://") ? url.substring(8, url.length()) : url.substring(7, url.length());
        for (Element link : links) {
            String linkHref = link.attr("href");
            String decodeLinkHref = decode(linkHref);
            System.out.println(decodeLinkHref);
            if (!(linkHref.equalsIgnoreCase(url) || linkHref.endsWith(".xml") || linkHref.endsWith(".txt")
                    || linkHref.endsWith(".jpg") || linkHref.endsWith(".png")
                    || decodeLinkHref.contains("#")
            )) {
                if ((linkHref.startsWith("http://"+shortUrl)
                        || linkHref.startsWith("https://"+shortUrl))
                        || linkHref.startsWith(url)) {
                    pageUrls.add(decodeLinkHref);
                }
//                else if (decodeLinkHref.startsWith("/") && decodeLinkHref.length() > 10 && !decodeLinkHref.contains("?")) {
//                    Connection.Response execute = Jsoup.connect("http://"+linkHref)
//                            .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
//                            .referrer("http://www.google.com")
//                            .ignoreHttpErrors(true).execute();
//                    if (execute.statusCode() == 200) {
//                        pageUrls.add(decodeLinkHref);
//                    }
//                }
            }
        }
        return pageUrls;
    }

    public static String encode(String url)
    {
        try {
            String encodeURL= URLEncoder.encode( url, "UTF-8" );
            return encodeURL;
        } catch (UnsupportedEncodingException e) {
            return "Issue while encoding" +e.getMessage();
        }
    }

    public static String decode(String url)
    {
        try {
            String prevURL="";
            String decodeURL=url;
            while(!prevURL.equals(decodeURL))
            {
                prevURL=decodeURL;
                decodeURL= URLDecoder.decode( decodeURL, "UTF-8" );
            }
            return decodeURL;
        } catch (UnsupportedEncodingException e) {
            return "Issue while decoding" +e.getMessage();
        }
    }

    public static boolean isActiveLink(String linkHref) throws IOException {
        Connection.Response execute = Jsoup.connect(linkHref)
                .proxy("92.53.73.138", 8118)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                .referrer("http://www.google.com")
                .ignoreHttpErrors(true).execute();

        if (execute.statusCode() == 200) {
            Document doc;
            doc = Jsoup.connect(linkHref)
                    .proxy("92.53.73.138", 8118)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
//                    .referrer("http://www.google.com")
//                    .timeout(1000) //it's in milliseconds, so this means 5 seconds.
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
