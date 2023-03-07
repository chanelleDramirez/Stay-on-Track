package com.StayonTrack.StayonTrack.Repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SecurityProperties.User, Long> {
    SecurityProperties.User findByUsername(String username);
}

