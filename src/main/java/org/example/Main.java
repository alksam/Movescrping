package org.example;

import com.google.gson.JsonObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {




            public static void main(String[] args) {
                String imdbId = "tt1375666"; // Example IMDb ID
                MovieResultDTO movieDTO = Move.getresponse("8.5");
                for(int i =0 ; i < movieDTO.getResults().size(); i++ ){
                    System.out.println("Title: " + movieDTO.getResults().get(i).getTitle());
                    System.out.println("Overview: " + movieDTO.getResults().get(i).getOverview());
                }
                //System.out.println("Overview: " + movieDTO.getResults().get(0).getOverview());
                //System.out.println("Release Date: " + movieDTO.getReleaseDate());
                //System.out.println("Release Year: " + movieDTO.getReleaseYear());
                Movecontrolle move = new Movecontrolle();
                List<MovieDTO> movies = move.getByRating("8.0");
                for(int i =0 ; i < movies.size(); i++ ){
                    System.out.println("Title rating : " + movies.get(i).getTitle());
                    System.out.println("Overview rating : " + movies.get(i).getOverview());
                }
                List<MovieDTO> movies1 = move.getSortedByReleaseDate("1994");
                for(int i =0 ; i < movies1.size(); i++ ){
                    System.out.println("Title release date : " + movies1.get(i).getTitle());
                    System.out.println("Overview release date : " + movies1.get(i).getOverview());
                }

/*
                try {
                   MovieResultDTO movies = Move.getMovieDetails(move.getresponse(""));
                } catch (IOException e)
                    throw new RuntimeException(e);
                }
*/

            }
        }



        /* public static void main(String[] args) throws IO    Exception {
        Move wm = new Move();
        wm.getresponse("https://jsonplaceholder.typicode.com/todos/1");
        String key = System.getenv("99aaf163521fcdca219a49a6ef7cf0ec");


        // With DTOs:
        MovieDTO wdd = wm.getMovieDetails("tt0111161");

        System.out.println(" overview : " + wdd.getOverview());

        // With JsonObject:}}
*/




