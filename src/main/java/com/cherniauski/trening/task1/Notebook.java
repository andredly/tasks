package com.cherniauski.trening.task1;

import java.util.Arrays;

/**
 * The class <code>Notebook</code> represents a notebook.
 */
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
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @throws NullPointerException if the Note is null
     */
    public boolean addNote(Note note) {
        isNull(note);
        if (countNote < 0||countNote>size) {
            throw new IndexOutOfBoundsException();
        }
        if (countNote >= notes.length) {
            notes = Arrays.copyOf(notes, notes.length << 1);
        }
        notes[countNote++] = note;
        return true;
    }


    /**
     * Removes the first occurrence of Note from Notebook
     * @param note Note to be removed from Notebook, if present (not null)
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
     * Removes the Note at the specified position in this Notebook.
     * @param index index the index of the Note to be removed
     * @return the Note that was removed from the Notebook
     * @throws NullPointerException if the Note is null
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public Note removeNote(int index) {
        if(index<0)return null;
        Note oldNote = notes[index];
        remove(index);
        return oldNote;
    }

    /**
     * Returns the index of the first occurrence of the Note
     * in this Notebook, or -1 if this Notebook does not contain the Note.
     * @param note (not null)
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
     *Print all Notes
     */
    public void viewAll(){
        for (int i = 0; i < countNote; i++) {
            System.out.println(i+" "+notes[i]);
        }
    }


    /**
     * Returns the Note at the specified position in this Notebook.
     * @param index index of the Note to return
     * @return the Note at the specified position in this Notebook
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public Note getNote(int index){
        if(index<0)return null;
        return notes[index];
    }

    /**
     * Replaces the Note at the specified position in this Notebook with
     * the specified Note.
     * @param index index of the element to replace
     * @param note the Note previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public void replace(int index,Note note){
        isNull(note);
        if(index<0) throw new IndexOutOfBoundsException("Index: "+index+ " incorrect");
        notes[index]=note;
    }

    /**
     * Checks that the specified object reference is not {@code null}
     * @param note
     * @throws NullPointerException if {@code note} is {@code null}
     */
    private void isNull(Note note) {
        if (note == null) {
            throw new NullPointerException();
        }
    }

    /**
     * Private remove method.
     */
    private void remove(int index){
        int copy = countNote - index - 1;
        if (copy > 0)
            System.arraycopy(notes, index + 1, notes, index,
                    copy);
        notes[--countNote] = null;
    }
}
