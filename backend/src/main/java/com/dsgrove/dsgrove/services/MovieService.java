package com.dsgrove.dsgrove.services;

import com.dsgrove.dsgrove.clients.TMDBHttpClient;
import com.dsgrove.dsgrove.dto.MovieDTO;
import com.dsgrove.dsgrove.entities.Movie;
import com.dsgrove.dsgrove.exceptions.CustomException;
import com.dsgrove.dsgrove.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private TMDBHttpClient client;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        if (id == 666) {
            throw new CustomException("Nao mecha com as forcas do mal");
        }
        Movie result = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Movie not found"));
        return new MovieDTO(result);
    }


}
