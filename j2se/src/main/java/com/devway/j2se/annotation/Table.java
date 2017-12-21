package com.devway.j2se.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Table {
    public String tableName() default "testtt";
}
