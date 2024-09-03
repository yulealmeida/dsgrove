package com.dsgrove.dsgrove.controllers;

import com.dsgrove.dsgrove.dto.MovieDTO;
import com.dsgrove.dsgrove.dto.ScoreDTO;
import com.dsgrove.dsgrove.services.MovieService;
import com.dsgrove.dsgrove.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {


    @Autowired
    private ScoreService service;
    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO moviedto = service.saveScore(dto);
        return moviedto;

    }
}
