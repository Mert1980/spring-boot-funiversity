package com.switchfully.springbootfuniversity.service;

import com.switchfully.springbootfuniversity.model.entity.Professor;

import java.util.List;

public interface FuniversityService<T, U, R> {

    T getById(String id);
    List<T> getAll();
    T deleteById(String id);
    T create(U element);
    T update(String id, R element);
}
