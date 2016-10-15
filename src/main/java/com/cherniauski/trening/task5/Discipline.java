package com.cherniauski.trening.task5;


import java.util.*;

public enum Discipline {
    OPERATING_SYSTEM("Operating system") {

    }, COMPUTER_NETWORKS("Computer networks") {

    }, DATABASE_SYSTEM("Data system") {

    }, WEB_TECHNOLOGY("Web Technology") {

    };
    Map<Discipline, Group> map = new HashMap<>();
    String typeDiscipline;
    Discipline(String typeDiscipline) {
        this.typeDiscipline=typeDiscipline;
    }

    public void addGroup(Group group) {
        map.put(this,group);
    }

    public Group getGroupOfDiscipline() {
        return map.get(this);
    }

    public String getTypeDiscipline(){
        return typeDiscipline;
    }

}
