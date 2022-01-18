package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Entity.Seat;
import com.example.onlineMovieTickets.Repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepository repository;

    public Seat saveSeat(Seat seat) {
        return repository.save(seat);
    }

    public List<Seat> getSelectedSeatByShowId(Long id){
        return repository.findSelectedSeatByShowId(id);
    }
}
