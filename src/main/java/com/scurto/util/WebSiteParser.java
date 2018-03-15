package com.scurto.util;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebSiteParser {
    public static void main(String[] args) throws IOException {
        Document doc = null;
//        doc = Jsoup.connect("https://www.native-english.ru")


        String url = "https://www.native-english.ru/";
        doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                .referrer("http://www.google.com")
                .timeout(1000 * 5) //it's in milliseconds, so this means 5 seconds.
                .ignoreHttpErrors(true).get();


        Elements links = doc.body().select("a");
        for (Element link : links) {
            String linkHref = link.attr("href");
            System.out.println(linkHref);
            if (linkHref.startsWith("//")) {
                String substringHref = linkHref.substring(2, linkHref.length());
                Connection.Response execute = Jsoup.connect(url + substringHref)
                        .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                        .referrer("http://www.google.com")
                        .ignoreHttpErrors(true).execute();
                System.out.println(substringHref + " -> " + execute.statusCode() + " -> " + execute.url());
            } else {
                Connection.Response execute = Jsoup.connect(url + linkHref)
                        .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                        .referrer("http://www.google.com")
                        .ignoreHttpErrors(true).execute();
                System.out.println(linkHref + " -> " + execute.statusCode() + " -> " + execute.url());
            }

        }



    }
}
