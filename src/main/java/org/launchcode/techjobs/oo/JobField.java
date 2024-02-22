package org.launchcode.techjobs.oo;

import java.util.Objects;

//Abstract class due to being a base class (Kind of like cat in the book example. You cant have a job with no Name, Employer, etc, so this will never be declared on its own)
public abstract class JobField {

    //I just copied and pasted all the code that I saw across all 4 classes

    private int id;
    private static int nextId = 1;
    private String value;
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters
    public int getId() { return id; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }
}
