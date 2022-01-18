package com.example.onlineMovieTickets.MovieController;

import com.example.onlineMovieTickets.Entity.Customer;
import com.example.onlineMovieTickets.Service.CustomerService;
import com.example.onlineMovieTickets.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class AuthController {
    String email;
    @Autowired
    private CustomerService service;
    @Autowired
    private MovieService movieService;
    public Customer customer;

    @RequestMapping("/")
    public String index() {
        return "LoginPage";
    }

    @PostMapping("/login")
    public String customerRegistration(HttpServletRequest req, Model model) {
        Customer customer = new Customer(req.getParameter("userName"),
                req.getParameter("userEmail"), req.getParameter("userPhone"),
                req.getParameter("userAddress"), req.getParameter("userPassword"));
        service.saveCustomer(customer);
        return "LoginPage";
    }

    @PostMapping("/home")
    public String customerLogin(HttpServletRequest req,Model model){
        customer = service.findCustomerByEmail(req.getParameter("Email"));
        if(!(Objects.isNull(customer))){
            if(customer.getPassword().equals(req.getParameter("Password"))){
                email = customer.getEmail();
                System.out.println(email);
                return listAllMovies(model);
            }
            else {
                model.addAttribute("message","Invalid Credentials");
                return "LoginPage";
            }
        }
        else {
            model.addAttribute("message","Invalid Credentials");
            return "LoginPage";
        }
    }

    public String listAllMovies(Model model) {
        model.addAttribute("movie", movieService.listTendingMovies());
        model.addAttribute("malayalamMovies", movieService.listMalayalamMovies());
        model.addAttribute("hindiMovies", movieService.listHindiMovies());
        model.addAttribute("tamilMovies", movieService.listTamilMovies());
        model.addAttribute("customer",customer);
        return "HomePage";
    }

    @RequestMapping("/logout")
    public String logout() {
        email = "";
        return "redirect:/";
    }

    @RequestMapping("/index")
    public String viewHomePage(Model model) {
        return listAllMovies(model);
    }
}
