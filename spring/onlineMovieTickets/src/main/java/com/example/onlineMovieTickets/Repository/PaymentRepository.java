package com.example.onlineMovieTickets.Repository;


import com.example.onlineMovieTickets.Entity.Movie;
import com.example.onlineMovieTickets.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    @Query("SELECT d FROM Payment d WHERE d.customer.id = :id")
    List<Payment> findBookingHistoryByCustomer(Long id);
}
