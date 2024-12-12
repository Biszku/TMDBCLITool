# TMDB CLI Tool

## Overview

TMDB CLI Tool is a simple command line application that provides videos according to your preferences.

## Features

- Retrieve a list of popular movies
- Retrieve a list of top-rated movies
- Retrieve a list of upcoming movies
- Retrieve a list of now playing movies

## Installation

1. Clone the repository:
```sh
  git clone https://github.com/Biszku/TMDBCLITool.git
  cd TMDBCLITool
```

2. Build the project using Maven:
```sh
  mvn clean compile
```

3. Make sure to have a valid API key from [The Movie Database](https://www.themoviedb.org/documentation/api) and set it as an environment variable:

Linux/Mac:
```sh
  export TMDB_API_KEY=your_api_key
```
Windows:
```sh
  set TMDB_API_KEY=your_api_key
```

## Usage

Run the application using the following command:

Choose one of the following types:
- popular
- top
- upcoming
- playing

```sh
  java -cp .\target\classes\ com.TMDBCLITool.Main --type <type>
```
