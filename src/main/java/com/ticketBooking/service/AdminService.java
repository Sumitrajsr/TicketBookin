package com.ticketBooking.service;

import com.ticketBooking.entity.Admin;
import com.ticketBooking.exception.AdminException;

public interface AdminService {

    public Admin addAdmin(Admin admin) throws AdminException;
}
