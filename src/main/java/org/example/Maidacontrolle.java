package org.example;

import java.util.List;

public interface Maidacontrolle <T> {
    List<T> getByRating(String rating);
    List<T> getSortedByReleaseDate();
}


