package com.ticketBooking.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {

    @Size(min = 6,max = 12,message = "size should be between 6 to 12 characters..")
    private String username;


    @Size(min = 6,max = 12,message = "size should be between 6 to 12 characters..")
    private String password;
}
