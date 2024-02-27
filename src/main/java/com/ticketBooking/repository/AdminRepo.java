package com.ticketBooking.repository;

import com.ticketBooking.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {

    public Admin findByAdminUserNameAndAdminPassword(String username,String password);

    public Admin findByAdminUserName(String username);

    public Admin findByAdminPassword(String password);

}
