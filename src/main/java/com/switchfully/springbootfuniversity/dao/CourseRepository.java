package com.switchfully.springbootfuniversity.dao;

import com.switchfully.springbootfuniversity.model.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Repository
public class CourseRepository {

    private final ConcurrentHashMap<String, Course> coursesById;

    public CourseRepository() {
        this.coursesById = new ConcurrentHashMap<>();
    }

    public Course getById(String id){
        var foundCourse = coursesById.get(id);
        if(foundCourse == null){
            throw new IllegalArgumentException("No course could be found with id: " + id);
        }
        return foundCourse;
    }

    public List<Course> getAll(){
        return new ArrayList<>(coursesById.values());
    }
    public List<Course> getAll(int studyPoint){
        return coursesById.values().stream()
                .filter(course -> course.getAmountOfStudyPoints() == studyPoint)
                .collect(Collectors.toList());
    }

    public Course deleteById(String id){
        return coursesById.remove(id);
    }

    public Course save(Course course){
        coursesById.put(course.getId(), course);
        return course;

    }
}
