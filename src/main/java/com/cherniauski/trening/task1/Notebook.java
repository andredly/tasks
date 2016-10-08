package com.cherniauski.trening.task1;

import java.util.Arrays;

public class Notebook {
    private Note[] notes;
    private static final int DEFAULT_CAPACITY = 10;
    private int countNote;
    private static int size;

    public Notebook(int size) {
        if (size <= 0) {
            System.out.println("Error, it is impossible to create a notebook of zero or negative length.");
            throw new ArrayIndexOutOfBoundsException("Size: "+size+" incorrect");
        }
        this.notes = new Note[size];
        this.size=size;
    }

    public Notebook() {
        this.notes = new Note[DEFAULT_CAPACITY];
        this.size=Integer.MAX_VALUE;
    }

    /**
     * Appends the Note.
     * @param note element to be appended to this list(not null)
     * @return <tt>true</tt> if this Notebook changed as a result of the
     *         call
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException if the Note is null
     */
    public boolean addNote(Note note) {
        isNull(note);
        if (countNote < 0||countNote>size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (countNote >= notes.length) {
            notes = Arrays.copyOf(notes, notes.length << 1);
        }
        notes[countNote++] = note;
        return true;
    }


    /**
     * Removes the first occurrence of Note from Notebook
     * @param note element to be removed from Notebook, if present (not null)
     * @return <tt>true</tt> if an Note was removed as a result of this call
     * @throws NullPointerException if the Note is null
     */
    public boolean removeNote(Note note) {
        isNull(note);
        int index=indexOf(note);
        if ( index== -1) {
            return false;
        }
        remove(index);
        return true;
    }

    /**
     * @param index
     * @return
     */
    public Note removeNote(int index) {
        if(index<0)return null;
        Note oldNote = notes[index];
        remove(index);
        return oldNote;
    }

    /**
     * @param note
     * @return
     */
    public int indexOf(Note note) {
       isNull(note);
        for (int i = 0; i < countNote; i++) {
            if (notes[i].equals(note)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     */
    public void viewAll(){
        for (int i = 0; i < countNote; i++) {
            System.out.println(i+" "+notes[i]);
        }
    }


    /**
     * @param index
     * @return
     */
    public Note getNote(int index){
        if(index<0)return null;
        return notes[index];
    }

    /**
     * @param index
     * @param note
     */
    public void replace(int index,Note note){
        isNull(note);
        if(index<0) throw new IllegalArgumentException("Index: "+index+ " incorrect");
        notes[index]=note;
    }

    private void isNull(Note note) {
        if (note == null) {
            throw new NullPointerException();
        }
    }

    private void remove(int index){
        int copy = countNote - index - 1;
        if (copy > 0)
            System.arraycopy(notes, index + 1, notes, index,
                    copy);
        notes[--countNote] = null;
    }
}
