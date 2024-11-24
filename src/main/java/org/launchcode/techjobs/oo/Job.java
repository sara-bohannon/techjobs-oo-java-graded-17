package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {

        StringBuilder jobList = new StringBuilder();
        String lineSeparator = System.lineSeparator();

        jobList.append(lineSeparator);
        jobList.append("ID: " + this.id + lineSeparator);
        jobList.append("Name: " + (this.name == null || this.name.isEmpty() ? "Data not available" : this.name) + lineSeparator);
        jobList.append("Employer: " + (this.employer == null || this.employer.getValue().isEmpty() ? "Data not available" : this.employer.getValue()) + lineSeparator);
        jobList.append("Location: " + (this.location == null || this.location.getValue().isEmpty() ? "Data not available" : this.location.getValue()) + lineSeparator);
        jobList.append("Position Type: " + (this.positionType == null || this.positionType.getValue().isEmpty() ? "Data not available" : this.positionType.getValue()) + lineSeparator);
        jobList.append("Core Competency: " + (this.coreCompetency == null || this.coreCompetency.getValue().isEmpty() ? "Data not available" : this.coreCompetency.getValue()));

        jobList.append(lineSeparator);

        return jobList.toString();
    }
}