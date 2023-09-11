package org.learning.courseinfo.cli.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CourseRetrieverService {

    private static final String URL = "https://app.pluralsight.com/profile/data/author/%s/all-content";
    private static final HttpClient HTTP_CLIENT = HttpClient.newHttpClient();
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public List<PluralsightCourse> getCourseFor(String author) {
        HttpRequest request = HttpRequest
                .newBuilder(URI.create(String.format(URL, author)))
                .GET()
                .build();

        try {
            HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            CollectionType collectionType = OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, PluralsightCourse.class);
            return OBJECT_MAPPER.readValue(response.body(),collectionType);
        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException("Could not call Pluralsight API", ex);
        }
    }
}
