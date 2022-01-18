package com.example.onlineMovieTickets.Repository;

import com.example.onlineMovieTickets.Entity.Seat;
import com.example.onlineMovieTickets.Entity.TheaterSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat,Long> {
    @Query("Select seat from Seat seat where seat.movieShow.id=:id and seat.isbooked =1")
    List<Seat> findSelectedSeatByShowId(Long id);
}
