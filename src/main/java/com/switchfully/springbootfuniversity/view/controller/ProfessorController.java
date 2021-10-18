package com.switchfully.springbootfuniversity.view.controller;

import com.switchfully.springbootfuniversity.service.FuniversityService;
import com.switchfully.springbootfuniversity.model.dto.CreateProfessorDto;
import com.switchfully.springbootfuniversity.model.dto.ProfessorDto;
import com.switchfully.springbootfuniversity.model.dto.UpdateProfessorDto;
import com.switchfully.springbootfuniversity.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "professors")
public class ProfessorController {

    private final FuniversityService<ProfessorDto, CreateProfessorDto, UpdateProfessorDto> professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfessorDto createProfessor(@RequestBody CreateProfessorDto createProfessorDto) {
        return professorService.create(createProfessorDto);
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<ProfessorDto> getAllProfessors() {
        return professorService.getAll();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ProfessorDto getProfessor(@PathVariable(value = "id") String id){
        return professorService.getById(id);
    }

    @PostMapping(path="/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ProfessorDto updateProfessor(@PathVariable(value = "id") String id, @RequestBody UpdateProfessorDto updateProfessorDto){
        return professorService.update(id, updateProfessorDto);
    }
}
