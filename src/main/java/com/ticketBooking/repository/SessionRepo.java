package com.ticketBooking.repository;

import com.ticketBooking.entity.CurrentUserSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<CurrentUserSession, Integer> {
    public CurrentUserSession findByUuid(String uuid);
}

