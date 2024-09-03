package com.dsgrove.dsgrove.services;

import com.dsgrove.dsgrove.dto.MovieDTO;
import com.dsgrove.dsgrove.dto.ScoreDTO;
import com.dsgrove.dsgrove.entities.Movie;
import com.dsgrove.dsgrove.entities.Score;
import com.dsgrove.dsgrove.entities.User;
import com.dsgrove.dsgrove.repositories.MovieRepository;
import com.dsgrove.dsgrove.repositories.ScoreRepository;
import com.dsgrove.dsgrove.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movierepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){
        User user = userRepository.findByEmail(dto.getEmail()); // Usar dto.getEmail "String"
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user); //"SaveAndFlush"

        }

        Movie movie = movierepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);



        double sum = 0.0;
       for (Score s : movie.getScores()){
           sum =  sum + s.getValue();

       }

       double avg = sum / movie.getScores().size();

       movie.setScore(avg);
       movie.setCount(movie.getScores().size());

       movie = movierepository.save(movie);

       return new MovieDTO(movie);



    }







}
