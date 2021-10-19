package com.switchfully.springbootfuniversity.model.entity;

import java.util.Objects;
import java.util.UUID;

public class Course {

    private final String id;
    private String name;
    private int amountOfStudyPoints;
    private String professorId;

    public Course(String name, int amountOfStudyPoints, String professorId) {
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

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
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

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amountOfStudyPoints=" + amountOfStudyPoints +
                ", professorId='" + professorId + '\'' +
                '}';
    }
}
