package org.example;

import java.util.*;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.Arrays.stream;

public class Movecontrolle
{
    // Metode til at få film efter vurdering
    List<MovieDTO> getByRating(String rating) {
        return Move.getresponse(rating).getResults();

    }

    // Metode til at få film sorteret efter udgivelsesdato
    List<MovieDTO> getSortedByReleaseDate (String releaseDate) {

 return Move.getSortedByReleaseDate(releaseDate).getResults();
    };





    }



