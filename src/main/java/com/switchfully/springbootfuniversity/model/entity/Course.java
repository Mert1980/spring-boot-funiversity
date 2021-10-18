package com.switchfully.springbootfuniversity.model.entity;

import java.util.Objects;
import java.util.UUID;

public class Course {

    private final String id;
    private String name;
    private int amountOfStudyPoints;
    private int professorId;

    public Course(String id, String name, int amountOfStudyPoints, int professorId) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.amountOfStudyPoints = amountOfStudyPoints;
        this.professorId = professorId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfStudyPoints() {
        return amountOfStudyPoints;
    }

    public void setAmountOfStudyPoints(int amountOfStudyPoints) {
        this.amountOfStudyPoints = amountOfStudyPoints;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(getId(), course.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
