package com.example.onlineMovieTickets.Repository;

import com.example.onlineMovieTickets.Entity.Movie;
import com.example.onlineMovieTickets.Entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieShowRepository extends JpaRepository<MovieShow,Long> {
    @Query("SELECT show FROM MovieShow show WHERE show.movie.id = :id")
    List<MovieShow> findAllShowByTheaterId(@Param("id") Long Id);

}
