package com.TMDBCLITool;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequestUtil {
    private static final HttpClient client;

    static {
        client = HttpClient.newHttpClient();
    }

    public static String sendGetRequest(String url) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .header("accept", "application/json")
                    .header("Authorization", "Bearer " + System.getenv("TMDB_SECRET"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                return "Failed to fetch data";
            } else {
                return response.body();
            }
        } catch (URISyntaxException | IOException | InterruptedException e) {
            return "Failed to fetch data";
        }
    }
}
