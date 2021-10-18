package com.switchfully.springbootfuniversity.view.controller;

import com.switchfully.springbootfuniversity.model.dto.*;
import com.switchfully.springbootfuniversity.service.CourseService;
import com.switchfully.springbootfuniversity.service.FuniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="courses")
public class CourseController {

    private final FuniversityService<CourseDto, CreateCourseDto, UpdateCourseDto> courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDto createCourse(@RequestBody CreateCourseDto createCourseDto) {
        return courseService.create(createCourseDto);
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDto> getAllCourses() {
        return courseService.getAll();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public CourseDto getCourse(@PathVariable(value = "id") String id){
        return courseService.getById(id);
    }

    @PostMapping(path="/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public CourseDto updateCourse(@PathVariable(value = "id") String id, @RequestBody UpdateCourseDto updateCourseDto){
        return courseService.update(id, updateCourseDto);
    }
}
