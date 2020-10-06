
package com.example.sqliteexample;



public class StudentModel {


    private final String ID;String id;
    String note;


    public StudentModel (String ID, String Notes) {
        this.ID = id;
        this.Notes = note;
    }

    public StudentModel(String id, String Note) {
        this.id = id;
        this.note = Note;

    }

    public Integer getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   public String getNote() {
        return note;
    }

    public void setNote(String Note) {
        this.note = Note;
    }




}