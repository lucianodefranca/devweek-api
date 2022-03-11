package com.luciano.devweek.controller;

import com.luciano.devweek.entity.Regiao;
import com.luciano.devweek.repository.RegiaoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/regioes")
public class RegiaoController {

    private final RegiaoRepository repository;

    public RegiaoController(RegiaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Regiao> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Regiao getRegiaoById(@PathVariable Long id) {
        Optional<Regiao> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
