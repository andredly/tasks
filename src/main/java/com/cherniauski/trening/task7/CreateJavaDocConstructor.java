package com.cherniauski.trening.task7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.CONSTRUCTOR)
@Documented
public @interface CreateJavaDocConstructor {
String create();
String []param();
}
