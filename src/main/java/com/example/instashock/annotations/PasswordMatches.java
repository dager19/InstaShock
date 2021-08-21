package com.example.instashock.annotations;

import com.example.instashock.validations.PasswordMatchesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    String message() default  "Password is not the same";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default{};
}
