package com.babiel.exercises.AddressBook.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class firstNameConstraintValidator implements ConstraintValidator<Firstname, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
        boolean result = s.contains("n");
        return result;
    }
}
