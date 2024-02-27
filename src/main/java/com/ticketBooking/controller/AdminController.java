package com.ticketBooking.controller;

import com.ticketBooking.entity.Admin;
import com.ticketBooking.exception.AdminException;
import com.ticketBooking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/bus/")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/admin")
    public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) throws AdminException
    {
        Admin adm = adminService.addAdmin(admin);

        return new ResponseEntity<>(adm, HttpStatus.OK);

    }

}
