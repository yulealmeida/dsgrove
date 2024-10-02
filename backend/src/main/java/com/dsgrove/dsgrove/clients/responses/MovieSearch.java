package com.dsgrove.dsgrove.clients.responses;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MovieSearch {
    private int page;
    private List<Movie> results;
    private int total_pages;
    private int total_results;

    // Getters e Setters
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getTotalPages() {
        return total_pages;
    }

    public void setTotalPages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotalResults() {
        return total_results;
    }

    public void setTotalResults(int total_results) {
        this.total_results = total_results;
    }

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Movie {
        private boolean adult;
        private String backdrop_path;
        private List<Integer> genre_ids;
        private int id;
        private String original_language;
        private String original_title;
        private String overview;
        private double popularity;
        private String poster_path;
        private String release_date;
        private String title;
        private boolean video;
        private double vote_average;
        private int vote_count;

        // Getters e Setters
        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getBackdropPath() {
            return backdrop_path;
        }

        public void setBackdropPath(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public List<Integer> getGenreIds() {
            return genre_ids;
        }

        public void setGenreIds(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOriginalLanguage() {
            return original_language;
        }

        public void setOriginalLanguage(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginalTitle() {
            return original_title;
        }

        public void setOriginalTitle(String original_title) {
            this.original_title = original_title;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPosterPath() {
            return poster_path;
        }

        public void setPosterPath(String poster_path) {
            this.poster_path = poster_path;
        }

        public String getReleaseDate() {
            return release_date;
        }

        public void setReleaseDate(String release_date) {
            this.release_date = release_date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVoteAverage() {
            return vote_average;
        }

        public void setVoteAverage(double vote_average) {
            this.vote_average = vote_average;
        }

        public int getVoteCount() {
            return vote_count;
        }

        public void setVoteCount(int vote_count) {
            this.vote_count = vote_count;
        }
    }
}
