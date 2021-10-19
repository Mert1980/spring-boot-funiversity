package com.switchfully.springbootfuniversity.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Valid
public class CreateCourseDto {

    private String name;
    @Min(value = 1, message = "Study points should not be less than 1")
    @Max(value = 6, message = "Study points should not be greater than 6")
    private int amountOfStudyPoints;
    private String professorId;

    public String getName() {
        return name;
    }

    public int getAmountOfStudyPoints() {
        return amountOfStudyPoints;
    }

    public String getProfessorId() {
        return professorId;
    }

    public CreateCourseDto setName(String name) {
        this.name = name;
        return this;
    }

    public CreateCourseDto setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
        return this;
    }

    public CreateCourseDto setProfessorId(String professorId) {
        this.professorId = professorId;
        return this;
    }
}
