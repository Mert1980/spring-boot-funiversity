package com.switchfully.springbootfuniversity.service.mapper;

import com.switchfully.springbootfuniversity.model.entity.Professor;
import com.switchfully.springbootfuniversity.service.dto.CreateProfessorDto;
import com.switchfully.springbootfuniversity.service.dto.ProfessorDto;
import com.switchfully.springbootfuniversity.service.dto.UpdateProfessorDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfessorMapper {

    public ProfessorDto toDto(Professor professor) {
        return new ProfessorDto()
                .setId(professor.getId())
                .setFirstName(professor.getFirstName())
                .setLastName(professor.getLastName());
    }

    public Professor createToProfessor(CreateProfessorDto createProfessorDto) {
        return new Professor(createProfessorDto.getFirstName(), createProfessorDto.getLastName());
    }

    public Professor updateToProfessor(UpdateProfessorDto updateProfessorDto, Professor professor) {
        professor.setFirstName(updateProfessorDto.getFirstName());
        professor.setLastName(updateProfessorDto.getLastName());
        return professor;
    }

    public List<ProfessorDto> toDto(List<Professor> professors) {
        return professors.stream().map(this::toDto).collect(Collectors.toList());
    }
}
