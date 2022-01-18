package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Entity.MovieShow;
import com.example.onlineMovieTickets.Repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowService {
    @Autowired
    private MovieShowRepository repository;

    public List<MovieShow> findAllShowsByTheaterId(Long id){
        return  repository.findAllShowByTheaterId(id);
    }

    public MovieShow getShowById(Long id){
        return repository.getById(id);
    }

}
