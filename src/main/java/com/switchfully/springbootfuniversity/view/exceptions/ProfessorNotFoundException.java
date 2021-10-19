package com.switchfully.springbootfuniversity.view.exceptions;

public class ProfessorNotFoundException extends IllegalStateException {
    public ProfessorNotFoundException(String s) {
        super("Professor can not be found.");
    }
}
