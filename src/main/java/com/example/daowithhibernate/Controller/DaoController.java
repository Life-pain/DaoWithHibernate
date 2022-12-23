package com.example.daowithhibernate.Controller;
import com.example.daowithhibernate.Entity.Persons;
import com.example.daowithhibernate.Repository.DaoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class DaoController {
    private final DaoRepository daoRepository;

    public DaoController(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/by-city")
    public ResponseEntity<List<Persons>> getPersons(@RequestParam String city) {
        List<Persons> names = daoRepository.getPersonsByCity(city);
        return ResponseEntity.ok().body(names);
    }
}