package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository repository;
}
