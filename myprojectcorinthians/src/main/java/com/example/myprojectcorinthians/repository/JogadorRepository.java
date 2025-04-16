package com.example.myprojectcorinthians.repository;

import com.example.myprojectcorinthians.entity.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Component
public class JogadorRepository {
    @Repository
    public interface JogadorRepositoryJpa extends JpaRepository<Jogador, Long> {


    }



}
