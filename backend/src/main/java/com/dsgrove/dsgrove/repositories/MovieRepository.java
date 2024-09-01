package com.dsgrove.dsgrove.repositories;

import com.dsgrove.dsgrove.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
