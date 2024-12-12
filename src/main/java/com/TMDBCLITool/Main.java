package com.TMDBCLITool;

public class Main {

    public static void main(String[] args) {
        CLICommandController.setArgumentsSize((byte) 2);
        boolean isNumOfArgsValid = CLICommandController.isNumberOfArgumentsValid(args.length);

        if (!isNumOfArgsValid) {
            System.out.println("Invalid number of arguments provided");
            return;
        }

        String type = CLICommandController.getMoviesType(args);
        String url = null;

        switch (type) {
            case "playing" -> {
                url = "https://api.themoviedb.org/3/movie/now_playing";
            }
            case "popular" -> {
                url = "https://api.themoviedb.org/3/movie/popular";
            }
            case "top_rated" -> {
              url = "https://api.themoviedb.org/3/movie/top_rated";
            }
            case "upcoming" -> {
              url = "https://api.themoviedb.org/3/movie/upcoming";
            }
            default -> System.out.println("Invalid type of movies");
        }

        if (url == null) {
            return;
        }

        String response = HttpRequestUtil.sendGetRequest(url);
        Movies movies = JsonHandler.fromJson(JsonHandler.parse(response), Movies.class);
        System.out.println(movies);
    }
}