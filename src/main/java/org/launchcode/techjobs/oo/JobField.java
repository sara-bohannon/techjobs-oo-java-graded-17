package org.launchcode.techjobs.oo;

public abstract class JobField {
    protected int id;
    protected String value;
    private static int nextId = 1;

    public JobField(String value) {
        this.id = nextId;
        this.value = value;
        nextId++;
    }


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (this.value == null || this.value.isEmpty()) {
            return "Data not available";
        }
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobField other = (JobField) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}



