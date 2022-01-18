package com.example.onlineMovieTickets.Repository;

import com.example.onlineMovieTickets.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    @Query("SELECT movie FROM Movie movie WHERE movie.language = 'Malayalam'")
    List<Movie> findAllMalayalamMovies();

    @Query("SELECT movie FROM Movie movie WHERE movie.language = 'Hindi'")
    List<Movie> findAllHindiMovies();

    @Query("SELECT movie FROM Movie movie WHERE movie.language = 'Tamil'")
    List<Movie> findAllTamilMovies();

    @Query("SELECT movie FROM Movie movie WHERE movie.rating > 4.0")
    List<Movie> findAllTendingMovies();
}
