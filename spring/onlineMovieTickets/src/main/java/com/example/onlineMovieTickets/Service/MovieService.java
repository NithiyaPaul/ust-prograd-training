package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Entity.Movie;
import com.example.onlineMovieTickets.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> listAll(){
        return repository.findAll();
    }

    public List<Movie> listMalayalamMovies() {
        return repository.findAllMalayalamMovies();
    }

    public List<Movie> listHindiMovies() {
        return repository.findAllHindiMovies();
    }

    public List<Movie> listTamilMovies() {
        return repository.findAllTamilMovies();
    }

    public List<Movie> listTendingMovies() {
        return repository.findAllTendingMovies();
    }

    public Movie getMovieById(Long id){
        return  repository.getById(id);
    }

}
