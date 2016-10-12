package com.cherniauski.trening.task5.mark;

import com.cherniauski.trening.task5.Discipline;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Mark<T> {
//    public Mark<T> mark=new Mark<>();
    public T type;
   public Mark(T type){
        this.type=type;
    }
    public T get() {
        return type;
    }

//    public Mark<T> createMark(Discipline discipline) {
//        switch (discipline) {
//            case DATABASE_SYSTEM: {
//                mark = Discipline.DATABASE_SYSTEM.get();
//                break;
//            }
//            case OPERATING_SYSTEM: {
//                mark = Discipline.OPERATING_SYSTEM.get();
//                break;
//            }
//            case COMPUTER_NETWORKS: {
//                mark = Discipline.COMPUTER_NETWORKS.get();
//                break;
//            }
//            case WEB_TECHNOLOGY: {
//                mark = Discipline.WEB_TECHNOLOGY.get();
//                break;
//            }
//        }
//        return mark;
//    }
}
