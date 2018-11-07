package ru.raiffeisen.training;


import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})

public @interface LOgger {

    LoggingLevel level() default LoggingLevel.OFF;




}


