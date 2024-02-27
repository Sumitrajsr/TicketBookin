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
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userLoginId;


    @NotNull(message = "username can not be null..")
    @NotBlank(message = "username can not be blank..")
    @NotEmpty(message = "username can not be empty..")
    private String userName;

    @Size(min = 6, max = 12, message = "password should be between 6 to 12 characters")
    private String password;


    @NotNull(message = "firstName can not be null..")
    @NotBlank(message = "firstName can not be blank..")
    @NotEmpty(message = "firstName can not be empty..")
    private String firstName;

    private String lastName;

    private Long contact;

    @NotNull(message = "email can not be null..")
    @NotBlank(message = "email can not be blank..")
    @NotEmpty(message = "email can not be empty..")
    private String email;
}
