package com.cherniauski.trening.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Discipline {
    OPERATING_SYSTEM {

    }, COMPUTER_NETWORKS {

    }, DATABASE_SYSTEM {

    }, WEB_TECHNOLOGY{

    };
    Map<Discipline,List<Group>> map=new HashMap<>();

    public void addGroup(Group group){
        List<Group> list=new ArrayList<>();
        if (map.get(this)==null){
            list.add(group);
            map.put(this,list);
        }else {
            map.get(this).add(group);
        }
    }
    public List<Group> getGroupOfDiscipline(){

        return map.get(this);
    }

}
