package com.cherniauski.trening.task7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Documented
public @interface CreateJavaDoc {
String author();
int version();

}
