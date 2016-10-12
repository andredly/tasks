package com.cherniauski.trening.task7;

@CreateJavaDoc(author = "Andre",version = 1)
public class ClassForJavaDoc {

    private int fieldInt;
    private String fieldString;

    @CreateJavaDocConstructor(create = "Create",param = {"int", "string"})
    public ClassForJavaDoc(int fieldInt, String fieldString) {
        this.fieldInt = fieldInt;
        this.fieldString = fieldString;
    }

    @CreateJavaDocMethod(description = "Get",get = "int")
    public int getFieldInt() {
        return fieldInt;
    }
    @CreateJavaDocMethod(description = "Set",param = "int")
    public void setFieldInt(int fieldInt) {
        this.fieldInt = fieldInt;
    }

    @CreateJavaDocMethod(description = "Get",get = "String")
    public String getFieldString() {
        return fieldString;
    }

    @CreateJavaDocMethod(description = "Set",param = "String")
    public void setFieldString(String fieldString) {
        this.fieldString = fieldString;
    }
}
