package com.StayonTrack.StayonTrack.Repository;

import com.StayonTrack.StayonTrack.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

