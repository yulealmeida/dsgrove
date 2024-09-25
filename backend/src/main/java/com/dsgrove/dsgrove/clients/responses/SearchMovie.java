package com.dsgrove.dsgrove.clients.responses;

import java.util.List;

public class SearchMovie {
    private boolean adult;
    private String backdropPath;
    private List<Integer> genreIds;
    private int id;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private double popularity;
    private String posterPath;
    private String releaseDate;
    private String title;
    private boolean video;
    private double voteAverage;
    private int voteCount;

    // Construtor
    public SearchMovie(boolean adult, String backdropPath, List<Integer> genreIds, int id, String originalLanguage,
                  String originalTitle, String overview, double popularity, String posterPath,
                  String releaseDate, String title, boolean video, double voteAverage, int voteCount) {
        this.adult = adult;
        this.backdropPath = backdropPath;
        this.genreIds = genreIds;
        this.id = id;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.title = title;
        this.video = video;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public boolean isAdult () {
        return adult;
    }

    public void setAdult (boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath () {
        return backdropPath;
    }

    public void setBackdropPath (String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public List<Integer> getGenreIds () {
        return genreIds;
    }

    public void setGenreIds (List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public int getVoteCount () {
        return voteCount;
    }

    public void setVoteCount (int voteCount) {
        this.voteCount = voteCount;
    }

    public boolean isVideo () {
        return video;
    }

    public void setVideo (boolean video) {
        this.video = video;
    }

    public double getVoteAverage () {
        return voteAverage;
    }

    public void setVoteAverage (double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getPosterPath () {
        return posterPath;
    }

    public void setPosterPath (String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOverview () {
        return overview;
    }

    public void setOverview (String overview) {
        this.overview = overview;
    }

    public String getOriginalLanguage () {
        return originalLanguage;
    }

    public void setOriginalLanguage (String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle () {
        return originalTitle;
    }

    public void setOriginalTitle (String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public double getPopularity () {
        return popularity;
    }

    public void setPopularity (double popularity) {
        this.popularity = popularity;
    }

    public String getReleaseDate () {
        return releaseDate;
    }

    public void setReleaseDate (String releaseDate) {
        this.releaseDate = releaseDate;
    }
    // Getters e Setters
    // ...


    public String getTitle() {
        return title;
    }
}

class Page {
    private int page;
    private List<SearchMovie> results;
    private int totalPages;
    private int totalResults;

    // Construtor
    public Page(int page, List<SearchMovie> results, int totalPages, int totalResults) {
        this.page = page;
        this.results = results;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
    }

    public int getPage () {
        return page;
    }

    public void setPage (int page) {
        this.page = page;
    }

    public int getTotalResults () {
        return totalResults;
    }

    public void setTotalResults (int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages () {
        return totalPages;
    }

    public void setTotalPages (int totalPages) {
        this.totalPages = totalPages;
    }

    public void setResults (List<SearchMovie> results) {
        this.results = results;
    }

    // Getters e Setters
    // ...

    public List<SearchMovie> getResults() {
        return results;
    }
}


