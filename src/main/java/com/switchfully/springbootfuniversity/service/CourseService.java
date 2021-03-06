package com.switchfully.springbootfuniversity.service;

import com.switchfully.springbootfuniversity.dao.CourseRepository;
import com.switchfully.springbootfuniversity.dao.ProfessorRepository;
import com.switchfully.springbootfuniversity.model.dto.CourseDto;
import com.switchfully.springbootfuniversity.model.dto.CreateCourseDto;
import com.switchfully.springbootfuniversity.model.dto.UpdateCourseDto;
import com.switchfully.springbootfuniversity.model.entity.Course;
import com.switchfully.springbootfuniversity.service.mapper.CourseMapper;
import com.switchfully.springbootfuniversity.view.exceptions.ProfessorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements FuniversityService<CourseDto, CreateCourseDto, UpdateCourseDto> {

    private final CourseRepository courseRepository;
    private final ProfessorRepository professorRepository;
    private final CourseMapper courseMapper;

    @Autowired
    public CourseService(CourseRepository courseRepository, ProfessorRepository professorRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.professorRepository = professorRepository;
        this.courseMapper = courseMapper;
    }

    @Override
    public CourseDto getById(String id) {
        return courseMapper.toDto(courseRepository.getById(id));
    }

    @Override
    public List<CourseDto> getAll() {
        return courseMapper.toDto(courseRepository.getAll());
    }

    public List<CourseDto> getAll(int studyPoint) {
        return courseMapper.toDto(courseRepository.getAll(studyPoint));
    }

    @Override
    public CourseDto deleteById(String id) {
        return courseMapper.toDto(courseRepository.deleteById(id));
    }

    @Override
    public CourseDto create(CreateCourseDto createCourseDto) {
        validateProfessorId(createCourseDto.getProfessorId());
        Course course = courseMapper.createToCourse(createCourseDto);
        return courseMapper.toDto(courseRepository.save(course));
    }

    private void validateProfessorId(String professorId) throws ProfessorNotFoundException {
        professorRepository.getById(professorId);
    }

    @Override
    public CourseDto update(String id, UpdateCourseDto updateCourseDto) {
        Course courseToBeUpdated = courseRepository.getById(id);
        Course updatedCourse = courseMapper.updateToCourse(updateCourseDto, courseToBeUpdated);
        return courseMapper.toDto(courseRepository.save(updatedCourse));
    }
}
