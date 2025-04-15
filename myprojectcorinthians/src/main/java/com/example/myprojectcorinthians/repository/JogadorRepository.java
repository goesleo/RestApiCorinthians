package com.example.myprojectcorinthians.repository;

import com.example.myprojectcorinthians.entity.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JogadorRepository {
    private Map<Long, Jogador> map = new HashMap<>();

    public Jogador save(Jogador jogador) {
        map.put(jogador.getId(), jogador);
        return jogador;
    }

    public Jogador findByID (Long id) {
        return map.get(id);
    }

    public List<Jogador> findAll() {
        return new ArrayList<Jogador>(map.values());
    }



    @Repository
    public interface JogadorRepositoryJpa extends JpaRepository<Jogador, Long> {


    }



}
