package com.streamingsearcher.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.streamingsearcher.models.Example;
import com.streamingsearcher.models.Title;
import com.streamingsearcher.models.Titles.ContentTitles;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TitleServiceImpl extends AbstractClient implements TitleService{

    public TitleServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    //String uri = baseUrl;
    @Value("${get-info-title}")
    String getInfoTitle;

    @Value("${imdb-api}")
    String searchTitles;

    @Value("${imdb-api2}")
    String searchTitles2;

    //ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ContentTitles findTitles(String name) {
        HttpEntity<Title> entity = new HttpEntity<>(buildHeaders());
        String uri = searchTitles + name;
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ContentTitles contentTitles = gson.fromJson(response.getBody(), ContentTitles.class);
        return contentTitles;
    }

}
