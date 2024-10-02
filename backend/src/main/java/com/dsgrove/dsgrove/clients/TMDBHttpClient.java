package com.dsgrove.dsgrove.clients;

import com.dsgrove.dsgrove.clients.responses.MovieResponse;

import com.dsgrove.dsgrove.clients.responses.MovieSearch;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class TMDBHttpClient {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.themoviedb.org/3/movie/popular?language=pt-BR&page=1"))
            .header("accept", "application/json")
            .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3OTQ5ZjBiMzkyZjJiMTc2Yzc4YWM4ZTM1ZTQyNTJiMyIsIm5iZiI6MTcyNjg3Mzk3NC4xMzk1MTEsInN1YiI6IjY2ZWNhNzg1MTllNmYyN2YwNTQ2ZDU5YyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.jZfYoHy9o0RGkXD2RfI034bORzv5_U5-CJ2LOVDEm5s")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    HttpRequest movieSearch = HttpRequest.newBuilder()
            .uri(URI.create("https://api.themoviedb.org/3/search/movie?query=va%20e%20veja&include_adult=false&language=pt-BR&page=1"))
            .header("accept", "application/json")
            .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3OTQ5ZjBiMzkyZjJiMTc2Yzc4YWM4ZTM1ZTQyNTJiMyIsIm5iZiI6MTcyNjg3Mzk3NC4xMzk1MTEsInN1YiI6IjY2ZWNhNzg1MTllNmYyN2YwNTQ2ZDU5YyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.jZfYoHy9o0RGkXD2RfI034bORzv5_U5-CJ2LOVDEm5s")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    public TMDBHttpClient() throws IOException, InterruptedException {
    }

    public MovieResponse getMovies() throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.body(), MovieResponse.class);

    }

    public MovieSearch searchMovies() throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newHttpClient().send(movieSearch, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper(); // XPTO

         return objectMapper.readValue(response.body(), MovieSearch.class);
    }
}

@Component
class ApiRemota {

    @PostConstruct
    public void getApi() throws IOException, InterruptedException {

        var client = new TMDBHttpClient(); // Chamada HTTP Rest, programaticamente.

        MovieResponse movieResponse = client.getMovies();
        MovieSearch movieSearch = client.searchMovies();

        System.out.println(client);
    }

}