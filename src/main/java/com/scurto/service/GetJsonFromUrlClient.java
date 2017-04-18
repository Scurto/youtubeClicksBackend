package com.scurto.service;

import com.scurto.model.SiteDto;
import com.scurto.model.SitesDtoList;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by scurto on 17.04.2017.
 */
@Component
public class GetJsonFromUrlClient {
//   HttpClient from library org.apache.httpcomponents
    HttpClient httpClient = HttpClientBuilder.create().build();

    ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);

    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    public List<SiteDto> getJsonFromUrl() {
        String url = "https://api.stackexchange.com/2.2/sites?page=1&pagesize=999&filter=!SmOhH.E-bogj91YODR";
        try {
            SitesDtoList response = restTemplate.getForObject(new URI(url), SitesDtoList.class);
            return response.getItems();
        } catch (URISyntaxException e) {
            throw new RuntimeException();
        }
    }
}
