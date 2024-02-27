package com.ticketBooking.service.impl;

import com.ticketBooking.entity.Admin;
import com.ticketBooking.exception.AdminException;
import com.ticketBooking.repository.AdminRepo;
import com.ticketBooking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Override
    public Admin addAdmin(Admin admin)throws AdminException {

        Admin adm = adminRepo.findByAdminUserNameAndAdminPassword(admin.getAdminUserName(),admin.getAdminPassword());

        if(adm!=null)
        {
            throw  new AdminException("Admin Already Exists..");
        }
        else
        {
            return adminRepo.save(admin);
        }
//		return ar.save(admin);

    }
}
