package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{
    public PositionType(String value){
        super(value);
    }
    /*private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    //toString function which returns value
    //Not sure how this is different from a getter for value (Like the one on line 37)
    @Override
    public String toString(){
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    //Generated equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType that)) return false;
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }

    //Generated hashcode method
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
*/
}
