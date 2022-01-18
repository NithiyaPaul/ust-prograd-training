package com.example.onlineMovieTickets.Repository;

import com.example.onlineMovieTickets.Entity.Movie;
import com.example.onlineMovieTickets.Entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater,Long> {
}
