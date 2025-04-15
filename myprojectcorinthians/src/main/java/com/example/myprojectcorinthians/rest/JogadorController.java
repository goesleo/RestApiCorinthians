package com.example.myprojectcorinthians.rest;


import com.example.myprojectcorinthians.entity.Jogador;
import com.example.myprojectcorinthians.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Jogador")
public class JogadorController {

    //Vai Corinthians
    @Autowired
    private JogadorRepository repository;

    //adiciona jogador
    @PostMapping
    public Jogador create(@RequestBody Jogador jogador) {
        return repository.save(jogador);
    }

    //LISTAR OS JOGADORES
    @GetMapping
    public List<Jogador> findAll() {
        return repository.findAll();
    }







}
