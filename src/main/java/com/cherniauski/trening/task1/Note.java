package com.cherniauski.trening.task1;

import java.util.Date;

/**
 * The class <code>Note</code> represents a record in notebook.
 * @author Andrey
 */
    public class Note {
    private String record;
    private Date date;

    /**
     * Constructs an note.
     * @param record record value
     * @param date date record
     */
    public Note(String record, Date date) {
        this.record = record;
        this.date = date;
    }

    /**
     * Constructs an note.
     */
    public Note() {
        this("", new Date());
    }

        /**
         * Returns the record.
         * @return returns the record.
         */
    public String getRecord() {
        return record;
    }

        /**
         * Sets the record value.
         * @param record the record value.
         */
    public void setRecord(String record) {
        this.record = record;
    }

        /**
         * Returns a value this Date
         * @return returns a value this Date
         */
    public Date getDate() {
        return date;
    }

        /**
         * Sets the Date
         * @param date  the date value
         */
    public void setDate(Date date) {
        this.date = date;
    }

        /**
         * Returns a string representation of the contents.
         * @return a string representation
         */
    @Override
    public String toString() {
        return "record='" + record + '\'' +
                ", date=" + date +
                '}';
    }

        /**
         * Indicates whether some other object is "equal to" this one.
         * @param o  the reference object with which to compare.
         * @return {@code true} if this object is the same as the obj
         *          argument; {@code false} otherwise.
         */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note1 = (Note) o;

        return record.equals(note1.record) && date.equals(note1.date);
    }
}
