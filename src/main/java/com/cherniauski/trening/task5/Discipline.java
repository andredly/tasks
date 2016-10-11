package com.cherniauski.trening.task5;

import com.cherniauski.trening.task5.mark.Mark;
import com.cherniauski.trening.task5.mark.Number;
import com.cherniauski.trening.task5.mark.Real;

/**
 * Created by ivc4 on 11.10.2016.
 */
public enum Discipline {
    OPERATING_SYSTEM(Mark.Number.ONE){


        public Discipline create(Number number){
            return null;
        }

    } , COMPUTER_NETWORKS(Mark.Real.GOOD),
    DATABASE_SYSTEM, WEB_TECHNOLOGY;

    Discipline(Mark.Number one) {

    }

    Discipline(Mark.Real good) {

    }

    Discipline() {
    }
}
