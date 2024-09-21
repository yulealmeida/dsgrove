package com.dsgrove.dsgrove.clients;

import com.dsgrove.dsgrove.clients.responses.MovieResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class TMDBClient {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.themoviedb.org/3/movie/popular?language=pt-BR&page=1"))
            .header("accept", "application/json")
            .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3OTQ5ZjBiMzkyZjJiMTc2Yzc4YWM4ZTM1ZTQyNTJiMyIsIm5iZiI6MTcyNjg3Mzk3NC4xMzk1MTEsInN1YiI6IjY2ZWNhNzg1MTllNmYyN2YwNTQ2ZDU5YyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.jZfYoHy9o0RGkXD2RfI034bORzv5_U5-CJ2LOVDEm5s")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    public TMDBClient() throws IOException, InterruptedException {
    }

    public MovieResponse getMovies() throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.body(), MovieResponse.class);
    }





}
@Component
class Apiremota {
    @PostConstruct
    public void getApi() throws IOException, InterruptedException {
        var response = new TMDBClient().getMovies();
        System.out.println(response);
    }

}