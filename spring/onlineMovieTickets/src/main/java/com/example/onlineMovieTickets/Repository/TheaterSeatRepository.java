package com.example.onlineMovieTickets.Repository;

import com.example.onlineMovieTickets.Entity.Movie;
import com.example.onlineMovieTickets.Entity.TheaterSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatRepository extends JpaRepository<TheaterSeat,Long> {
}
