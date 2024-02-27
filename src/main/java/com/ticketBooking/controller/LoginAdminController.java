package com.ticketBooking.controller;

import com.ticketBooking.exception.LoginException;
import com.ticketBooking.payload.AdminDTO;
import com.ticketBooking.service.LoginAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/bus")
public class LoginAdminController {
    @Autowired
    private LoginAdminService loginAdminService;



    @PostMapping("/loginAdmin")
    public ResponseEntity<String> loginUser(@Valid @RequestBody AdminDTO dto) throws LoginException
    {
        String str = loginAdminService.loginAdmin(dto);

        return new ResponseEntity<>(str, HttpStatus.OK);
    }

    @PostMapping("/logoutAdmin/{key}")
    public ResponseEntity<String> logoutUser(@PathVariable("key") String key) throws LoginException
    {
        String msg = loginAdminService.logoutAdmin(key);

        return new ResponseEntity<>(msg,HttpStatus.OK);
    }
}
