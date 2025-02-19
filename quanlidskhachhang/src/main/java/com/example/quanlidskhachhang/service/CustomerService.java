package com.example.quanlidskhachhang.service;

import com.example.quanlidskhachhang.model.Customer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private static List<Customer> customers;
    static
    {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "nguyen khac nhat", "nhat@codegym.vn", "HN"));
        customers.add(new Customer(2, "dang huy hoa", "hoa@codegym.vn", "DN"));
        customers.add(new Customer(3, "le thi chau", "chau@codegym.vn", "HN"));
        customers.add(new Customer(4, "nguyen thuy duong", "duong@codegym.vn", "SG"));
        customers.add(new Customer(5, "codegym", "cg@codegym.vn", "VN"));
    }
    public CustomerService() {
    }
    public List<Customer> findAll() {
        return customers;
    }
}
