package com.ticketBooking.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer adminId;

    @NotNull( message = "This Field can not be null..")
    @NotBlank(message = "This Field can not be blank..")
    @NotEmpty(message = "This Field can not be empty..")
    private String adminUserName;

    @NotNull(message = "This Field can not be null..")
    @NotBlank(message = "This Field can not be blank..")
    @NotEmpty(message = "This Field can not be empty..")
    private String adminPassword;
}
