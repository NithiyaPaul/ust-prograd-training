package com.example.onlineMovieTickets.Service;

import com.example.onlineMovieTickets.Entity.Movie;
import com.example.onlineMovieTickets.Entity.MovieShow;
import com.example.onlineMovieTickets.Entity.Payment;
import com.example.onlineMovieTickets.Entity.Seat;
import com.example.onlineMovieTickets.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment saveBooking(Payment payment) {
        return repository.save(payment);
    }

    public Payment getById(Long id){
        return repository.getById(id);
    }

    public List<Payment> findBookingHistoryByCustomer(Long id) {
        return repository.findBookingHistoryByCustomer(id);
    }
}
