package com.supemir.tp2.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomers(Model model) {
        try {
            List<Customer> customers = customerService.getAll();
            model.addAttribute("customers",customers);
        } catch (Exception e) {
            model.addAttribute("error",e.getMessage());
        }
        return "customers";
    }
}
