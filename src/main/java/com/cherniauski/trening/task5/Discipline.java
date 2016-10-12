package com.cherniauski.trening.task5;

import com.cherniauski.trening.task5.mark.Mark;
import com.cherniauski.trening.task5.mark.Num;
import com.cherniauski.trening.task5.mark.Re;
import com.cherniauski.trening.task5.mark.Real;

/**
 * Created by ivc4 on 11.10.2016.
 */
public enum Discipline {
    OPERATING_SYSTEM {
        Mark<Real> mark;
        @Override
        public Mark get() {
            return this.mark;
        }

        @Override
        public void set(Mark mark) {
            this.mark=mark;
        }
    }, COMPUTER_NETWORKS{
        Mark mark;
        @Override
        public Mark get() {
            return this.mark;
        }
        @Override
        public void set(Mark mark) {
            this.mark=mark;
        }

    },DATABASE_SYSTEM{
        Mark mark;
        @Override
        public Mark get() {
            return this.mark;
        }
        @Override
        public void set(Mark mark) {
            this.mark=mark;
        }

    }, WEB_TECHNOLOGY{
        Mark mark;
        @Override
        public Mark get() {
            return this.mark;
        }
        @Override
        public void set(Mark mark) {
            this.mark=mark;
        }

    };

    Discipline() {
    }

    public abstract Mark get();
    public abstract void set(Mark mark);
}
