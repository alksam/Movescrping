package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Move {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

public static MovieResultDTO getresponse(String rating) {

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc&vote_average.gte="+rating)
            .get()
            .addHeader("accept", "application/json")
            .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5OWFhZjE2MzUyMWZjZGNhMjE5YTQ5YTZlZjdjZjBlYyIsInN1YiI6IjY1YzQ5YzZhZmQ2ZmExMDE4Nzc5M2ZlYSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.zUBjBxwTApKTnTPVeLZjp_PYHmV2C9IgSZnTGWprNxo")
            .build();
Response response = null;
try {
        response = client.newCall(request).execute();
        String res = response.body().string();
        System.out.println(res);
        MovieResultDTO movieDTO = gson.fromJson(res, MovieResultDTO.class);
        return movieDTO;
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}
public static MovieResultDTO getSortedByReleaseDate (String releaseDate) {
    OkHttpClient client1 = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc&vote_average.gte="+releaseDate)
            .get()
            .addHeader("accept", "application/json")
            .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5OWFhZjE2MzUyMWZjZGNhMjE5YTQ5YTZlZjdjZjBlYyIsInN1YiI6IjY1YzQ5YzZhZmQ2ZmExMDE4Nzc5M2ZlYSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.zUBjBxwTApKTnTPVeLZjp_PYHmV2C9IgSZnTGWprNxo")
            .build();
    Response response = null;
    try {
        response = client1.newCall(request).execute();
        String res = response.body().string();
        System.out.println(res);
        MovieResultDTO movieDTO = gson.fromJson(res, MovieResultDTO.class);
        return movieDTO;
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

/*
    public static MovieResultDTO getMovieDetails(String imdbId) throws IOException {
        Move move = new Move();
       /String response = move.getresponse(imdbId);
        MovieResultDTO movieDTO = gson.fromJson(response, MovieResultDTO.class);
        return movieDTO;
    }
'*/

}


