package com.babiel.exercises.AddressBook.controller;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = firstNameConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Firstname {

    public String message() default "must contain jtp";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}