package com.switchfully.springbootfuniversity.service.mapper;

import com.switchfully.springbootfuniversity.model.dto.CourseDto;
import com.switchfully.springbootfuniversity.model.dto.CreateCourseDto;
import com.switchfully.springbootfuniversity.model.dto.UpdateCourseDto;
import com.switchfully.springbootfuniversity.model.entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseMapper {

    public CourseDto toDto(Course course){
        return new CourseDto()
                .setId(course.getId())
                .setName(course.getName())
                .setAmountOfStudyPoints(course.getAmountOfStudyPoints())
                .setProfessorId(course.getProfessorId());
    }

    public Course createToCourse(CreateCourseDto createCourseDto){
        return new Course(createCourseDto.getName(), createCourseDto.getAmountOfStudyPoints(),createCourseDto.getProfessorId());
    }

    public Course updateToCourse(UpdateCourseDto updateCourseDto, Course course){
        course.setName(updateCourseDto.getName());
        course.setAmountOfStudyPoints(updateCourseDto.getAmountOfStudyPoints());
        course.setProfessorId(updateCourseDto.getProfessorId());
        return course;
    }

    public List<CourseDto> toDto(List<Course> courses){
        return courses.stream().map(this::toDto).collect(Collectors.toList());
    }
}
