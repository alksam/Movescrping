package org.example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter

@ToString


public class MovieDTO {
    private String title;
    private String overview;
    private String rating;
    private String releaseYear;
    private  transient LocalDate releaseDate;

    public MovieDTO(String overview, String releaseYear, LocalDate releaseDate, String title, String rating) {
        this.overview = overview;
        this.releaseYear = releaseYear;
        this.releaseDate = releaseDate;
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", overview='" + overview + '\'' +
                ", rating='" + rating + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}

