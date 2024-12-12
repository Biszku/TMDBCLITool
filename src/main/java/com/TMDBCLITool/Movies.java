package com.TMDBCLITool;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movies {
    private List<Movie> results;

    public Movies() {
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> movies) {
        this.results = movies;
    }

    @Override
    public String toString() {
        StringBuilder movies = new StringBuilder();
        for (int i = 0; i < results.size(); i++) {
            movies.append(results.get(i));
            if (i != results.size() - 1) {
                movies.append("\n");
            }
        }
        return movies.toString();
    }
}
