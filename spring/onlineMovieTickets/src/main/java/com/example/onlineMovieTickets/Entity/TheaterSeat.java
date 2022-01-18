package com.example.onlineMovieTickets.Entity;

import javax.persistence.*;

@Entity
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String seat_number;
    private String type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="theater_id")
    private Theater theater;

    public TheaterSeat() {
    }

    public TheaterSeat(Long id, String seat_number, String type) {
        this.id = id;
        this.seat_number = seat_number;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
