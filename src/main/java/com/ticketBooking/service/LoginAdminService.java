package com.ticketBooking.service;


import com.ticketBooking.exception.LoginException;
import com.ticketBooking.payload.AdminDTO;

public interface LoginAdminService {

    public String loginAdmin(AdminDTO dto)throws LoginException;

    public String logoutAdmin(String key) throws LoginException;



}
