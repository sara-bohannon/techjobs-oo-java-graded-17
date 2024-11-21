package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value); // Calls the constructor of JobField to handle the ID assignment
    }

    // Custom toString method that returns the value of the PositionType
    @Override
    public String toString() {
        return getValue(); // Returns the value field as a string representation
    }

    // Custom equals method comparing PositionType objects by their ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId(); // Objects are equal if they have the same ID
    }

    // Custom hashCode method based on the ID
    @Override
    public int hashCode() {
        return Objects.hash(getId()); // Hashcode is based on the ID
    }
}


//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    @Override
//    public String toString() {
//        return value;
//    }
//    // TODO: Add a custom toString() method that returns the data stored in 'value'. Above
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
