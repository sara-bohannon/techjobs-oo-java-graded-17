package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {
    public Employer(String value) {
        super(value);
    }
}

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }
//
//    public Employer(String value) {
//        this();
//        this.value = value;
//    }
//
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
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
