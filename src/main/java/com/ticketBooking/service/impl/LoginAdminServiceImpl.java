package com.ticketBooking.service.impl;

import com.ticketBooking.entity.Admin;
import com.ticketBooking.entity.CurrentUserSession;
import com.ticketBooking.exception.LoginException;
import com.ticketBooking.payload.AdminDTO;
import com.ticketBooking.repository.AdminRepo;
import com.ticketBooking.repository.SessionRepo;
import com.ticketBooking.service.LoginAdminService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
@Service
public class LoginAdminServiceImpl implements LoginAdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private SessionRepo sessionRepo;
    @Override
    public String loginAdmin(AdminDTO dto) throws LoginException {

        Admin exAdmin = adminRepo.findByAdminUserName(dto.getUsername());

        if(exAdmin == null)
        {
            throw new LoginException("Please Enter valid Username.. ");
        }

        Optional<CurrentUserSession> vcso = sessionRepo.findById(exAdmin.getAdminId());

        if(vcso.isPresent())
        {
            throw new LoginException("Adimin already logged in..");
        }

        if(exAdmin.getAdminPassword().equals(dto.getPassword()))
        {
            String key = RandomString.make(6);

            CurrentUserSession cus = new CurrentUserSession(exAdmin.getAdminId(), key, LocalDateTime.now());

            sessionRepo.save(cus);

            return "user Login Successfully";
        }
        else
        {
            throw new LoginException("Please Enter a valid password");
        }



    }

    @Override
    public String logoutAdmin(String key) throws LoginException {
//        System.out.println("Received UUID: " + key);
        CurrentUserSession validCustomerSession = sessionRepo.findByUuid(key);

        if(validCustomerSession == null) {
            throw new LoginException("User Not Logged In with this number");

        }


        sessionRepo.delete(validCustomerSession);


        return "Logged Out !";
    }

}

