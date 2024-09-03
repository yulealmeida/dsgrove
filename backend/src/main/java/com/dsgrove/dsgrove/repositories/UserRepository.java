package com.dsgrove.dsgrove.repositories;

import com.dsgrove.dsgrove.entities.Movie;
import com.dsgrove.dsgrove.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail (String email);
}
