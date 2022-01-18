package com.example.onlineMovieTickets.Entity;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean isbooked;
    @OneToOne
    private MovieShow movieShow;
    @OneToOne
    private TheaterSeat theatreSeat;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Seat() {
    }

    public Seat(boolean isbooked, MovieShow movieShow, TheaterSeat theatreSeat, Customer customer) {
        this.isbooked = isbooked;
        this.movieShow = movieShow;
        this.theatreSeat = theatreSeat;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsbooked() {
        return isbooked;
    }

    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }

    public MovieShow getMovieShow() {
        return movieShow;
    }

    public void setMovieShow(MovieShow movieShow) {
        this.movieShow = movieShow;
    }

    public TheaterSeat getTheatreSeat() {
        return theatreSeat;
    }

    public void setTheatreSeat(TheaterSeat theatreSeat) {
        this.theatreSeat = theatreSeat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
