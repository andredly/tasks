package com.cherniauski.trening.task7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Documented
public @interface CreateJavaDocMethod {
String description();
String param() default "";
String get() default "";
}
