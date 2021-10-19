package com.switchfully.springbootfuniversity.view.controller;

import com.switchfully.springbootfuniversity.model.dto.*;
import com.switchfully.springbootfuniversity.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping(path="courses")
@Validated
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDto createCourse(@RequestBody @Valid CreateCourseDto createCourseDto) {
        return courseService.create(createCourseDto);
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDto> getCoursesByStudyPoints(@RequestParam(required = false) @Min(1) @Max(6) Integer studyPoint) {
        if(studyPoint != null){
            return courseService.getAll(studyPoint);
        }
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
