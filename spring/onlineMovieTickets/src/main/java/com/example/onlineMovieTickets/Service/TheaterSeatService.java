package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Entity.MovieShow;
import com.example.onlineMovieTickets.Entity.TheaterSeat;
import com.example.onlineMovieTickets.Repository.TheaterSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterSeatService {
    @Autowired
    private TheaterSeatRepository repository;

    public TheaterSeat getSeatById(Long id){
        return repository.getById(id);
    }
}
