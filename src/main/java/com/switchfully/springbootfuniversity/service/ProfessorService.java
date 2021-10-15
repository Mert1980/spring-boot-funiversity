package com.switchfully.springbootfuniversity.service;

import com.switchfully.springbootfuniversity.dao.ProfessorRepository;
import com.switchfully.springbootfuniversity.model.entity.Professor;
import com.switchfully.springbootfuniversity.service.dto.CreateProfessorDto;
import com.switchfully.springbootfuniversity.service.dto.ProfessorDto;
import com.switchfully.springbootfuniversity.service.dto.UpdateProfessorDto;
import com.switchfully.springbootfuniversity.service.mapper.ProfessorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService implements FuniversityService<ProfessorDto, CreateProfessorDto, UpdateProfessorDto>{

    private final ProfessorRepository professorRepository;
    private final ProfessorMapper professorMapper;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository, ProfessorMapper professorMapper) {
        this.professorRepository = professorRepository;
        this.professorMapper = professorMapper;
    }

    @Override
    public ProfessorDto getById(String id) {
        return professorMapper.toDto(professorRepository.getById(id));
    }

    @Override
    public List<ProfessorDto> getAll() {
        return professorMapper.toDto(professorRepository.getAll());
    }

    @Override
    public ProfessorDto deleteById(String id) {
        return professorMapper.toDto(professorRepository.deleteById(id));
    }

    @Override
    public ProfessorDto create(CreateProfessorDto createProfessorDto) {
        Professor professor = professorMapper.createToProfessor(createProfessorDto);
        return professorMapper.toDto(professorRepository.save(professor));
    }

    @Override
    public ProfessorDto update(String id, UpdateProfessorDto updateProfessorDto) {
        Professor professorToBeUpdated = professorRepository.getById(id);
        Professor updatedProfessor = professorMapper.updateToProfessor(updateProfessorDto, professorToBeUpdated);
        return professorMapper.toDto(professorRepository.save(updatedProfessor));
    }
}
