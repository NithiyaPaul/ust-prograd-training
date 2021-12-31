package com.example.Bank.BankController;

import com.example.Bank.entity.Customer;
import com.example.Bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class CustomerController {
    String email;
    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String index() {
        return "Login";
    }

    @PostMapping("/Login")
    public String customerRegistration(HttpServletRequest req, Model model){
        if(!(req.getParameter("Password").equals(req.getParameter("Confirm_Password")))){
            model.addAttribute("message","Password doesn't match");
            return "Register";
        }
        Customer customer = new Customer(req.getParameter("Username"),req.getParameter("Email"),req.getParameter("Password"));
        service.saveCustomer(customer);
        return "Login";
    }

    @PostMapping("/Home")
    public String customerLogin(HttpServletRequest req,Model model){
        Customer customer = service.findCustomerByEmail(req.getParameter("Email"));
        if(!(Objects.isNull(customer))){
            if(customer.getPassword().equals(req.getParameter("Password"))){
                email = customer.getEmail();
                return "Home";
            }
            else {
                model.addAttribute("message","Invalid Credentials");
                return "Login";
            }
        } else if (req.getParameter("Email").equals("admin@gmail.com") && req.getParameter("Password").equals("admin")){
            return "AdminDashboard";
        }
      else {
          model.addAttribute("message","Invalid Credentials");
          return "Login";
      }
    }

    @RequestMapping("/Register")
    public String register() {
        return "Register";
    }

    @RequestMapping("/profile")
    public String profile(Model model) {
        Customer customer = service.findCustomerByEmail(email);
        passValuesIntoModel(model,customer);
        return "Profile";
    }
    @RequestMapping("/add-profile/{id}")
    public String addProfile(@PathVariable Long id,Model model) {
        Customer customer = service.getCustomerById(id);
        passValuesIntoModel(model,customer);
        return "AddProfile";
    }

    @PostMapping("updateCustomer")
    public String updateCustomer(HttpServletRequest req) {
        Customer customer = service.getCustomerById(Long.parseLong(req.getParameter("userid")));
        customer.setName(req.getParameter("userName"));
        customer.setEmail(req.getParameter("email"));
        customer.setPhone(req.getParameter("phone"));
        customer.setAddress(req.getParameter("address"));
        customer.setCity(req.getParameter("city"));
        customer.setState(req.getParameter("state"));
        customer.setCountry(req.getParameter("country"));
        service.saveCustomer(customer);
        return "redirect:/profile";
    }

    public void passValuesIntoModel(Model model,Customer customer){
        model.addAttribute("id",customer.getId());
        model.addAttribute("name",customer.getName());
        model.addAttribute("email",customer.getEmail());
        model.addAttribute("phone",customer.getPhone());
        model.addAttribute("address",customer.getAddress());
        model.addAttribute("city",customer.getCity());
        model.addAttribute("country",customer.getCountry());
        model.addAttribute("state",customer.getState());
    }

    @RequestMapping("/Account")
    public String viewCustomerAccountPage() {
        return "Account";
    }
    @RequestMapping("/index")
    public String viewHomePage() {
        return "Home";
    }
    @RequestMapping("/logout")
    public String logout() {
        email = "";
        return "redirect:/";
    }
}
