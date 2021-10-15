package com.switchfully.springbootfuniversity.dao;

import com.switchfully.springbootfuniversity.model.entity.Professor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProfessorRepository {

    private final ConcurrentHashMap<String, Professor> professorsById;

    public ProfessorRepository() {
        this.professorsById = new ConcurrentHashMap<>();
    }

    public Professor getById(String id){
        var foundProfessor = professorsById.get(id);
        if(foundProfessor == null){
            throw new IllegalArgumentException("No professor could be found with id: " + id);
        }
        return foundProfessor;
    }

    public List<Professor> getAll(){
        return new ArrayList<>(professorsById.values());
    }

    public Professor deleteById(String id){
        return professorsById.remove(id);
    }

    public Professor save(Professor professor){
        return professorsById.put(professor.getId(), professor);
    }
}