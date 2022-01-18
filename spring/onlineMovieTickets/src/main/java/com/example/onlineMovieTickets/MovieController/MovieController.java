package com.example.onlineMovieTickets.MovieController;

import com.example.onlineMovieTickets.Entity.*;
import com.example.onlineMovieTickets.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {
    @Autowired
    private MovieService movieService;
    @Autowired
    private TheaterSeatService theaterSeatService;
    @Autowired
    private MovieShowService movieShowService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private TheaterController controller;
    @Autowired
    private AuthController authController;

    public List<String> seatList = new ArrayList<String>();


    @RequestMapping("/movie/{id}")
    public String aboutMovie(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        model.addAttribute("customer",authController.customer);
        return "AboutMoviePage";
    }

    @RequestMapping("/show/{id}")
    public String showTimeList(@PathVariable Long id, Model model) {
        model.addAttribute("show", movieShowService.getShowById(id));
        model.addAttribute("showDetails", movieShowService.findAllShowsByTheaterId(id));
        model.addAttribute("customer",authController.customer);
        return "TheaterListPage";
    }

    @RequestMapping("/seat/{id}")
    public String seatBooking(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("selectedSeat",seatService.getSelectedSeatByShowId(id));
        model.addAttribute("customer",authController.customer);
        return "SeatMapPage";
    }

    @PostMapping("/book-ticket")
    public String payment(HttpServletRequest req,Model model) {
        String bookedSeats = req.getParameter("bookedSeats");
        String[] seats = bookedSeats.split(",");
        Double ticket_amount = 0.0;
        int count =0;
        seatList.clear();
        for (String seatId : seats) {
            Long id = Long.parseLong(seatId);
            Seat seat = new Seat(true, movieShowService.getShowById(Long.parseLong(req.getParameter("id"))),
                    theaterSeatService.getSeatById(id), customerService.getCustomerById(authController.customer.getId()));
            seatService.saveSeat(seat);
            seatList.add(seatService.saveSeat(seat).getTheatreSeat().getSeat_number());
        }
        for (String seatId : seats) {
            Long id = Long.parseLong(seatId);
            switch (theaterSeatService.getSeatById(id).getType()) {
                case "A":
                    ticket_amount = ticket_amount + controller.TYPE_A;
                    break;
                case "C":
                    ticket_amount = ticket_amount + controller.TYPE_C;
                    break;
                case "D":
                    ticket_amount = ticket_amount + controller.TYPE_D;
                    break;
                default:
                    System.out.println("Something went wrong!!!");
            }
            count++;
        }
        model.addAttribute("total_amt",ticket_amount);
        model.addAttribute("seatCount",count);
        model.addAttribute("showDetails",movieShowService.getShowById(Long.parseLong(req.getParameter("id"))));
        model.addAttribute("customer",authController.customer);
        return "PaymentPage";
    }

    @PostMapping("/confirmation")
    public String ticketConfirmation(HttpServletRequest req,Model model){
        Payment payment = new Payment(Double.parseDouble(req.getParameter("totalAmount")),"OD2022-" + req.getParameter("id"),
                movieShowService.getShowById(Long.parseLong(req.getParameter("id"))), customerService.getCustomerById(authController.customer.getId()));
        paymentService.saveBooking(payment);
        model.addAttribute("bookingNumber","OD2022-" + req.getParameter("id"));
        model.addAttribute("bookingId",paymentService.saveBooking(payment).getId());
        model.addAttribute("customer",authController.customer);

        return "ConfirmationPage";
    }

    @RequestMapping("/view-ticket/{id}")
    public String viewTicket(@PathVariable Long id,Model model){
        model.addAttribute("ticket",paymentService.getById(id));
        model.addAttribute("seatList",seatList);
        model.addAttribute("customer",authController.customer);
        return "TicketPage";
    }

    @RequestMapping("/booking-history")
    public String myBooking(Model model){
        model.addAttribute("history",paymentService.findBookingHistoryByCustomer(authController.customer.getId()));
        model.addAttribute("customer",authController.customer);
        return "BookingHistoryPage";
    }

}
