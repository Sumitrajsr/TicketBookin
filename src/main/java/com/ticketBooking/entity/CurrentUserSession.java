package com.ticketBooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentUserSession {
    @Id
    @Column(unique = true)
    private Integer userId;
    private String uuid;
    private LocalDateTime localDateTime;
}
