package com.dsgrove.dsgrove.repositories;

import com.dsgrove.dsgrove.entities.Movie;
import com.dsgrove.dsgrove.entities.Score;
import com.dsgrove.dsgrove.entities.ScorePK;
import com.dsgrove.dsgrove.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,ScorePK> {

}
