package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    //ID constructor
    public Job(){
        id = nextId;
        nextId++;
    }

    //Second constructor that takes 5 parameters and assigns values to fields declared in Job class
    public Job(String aName,Employer aEmployer,Location aLocation,PositionType aPositionType,CoreCompetency aCoreCompetency){
        //Calling first ID constructor using 'this()' function
        this();
        //Assigning values to given parameters
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //Getters and Setters

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Employer
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    //Location
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    //PositionType
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    //CoreCompetency
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //Getter for ID field
    public int getId() {
        return id;
    }


    //Equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    //Hashcode Method
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //toString Method

    @Override
    public String toString(){
        //Placeholder String for output
        String outputString = "";

        //Starts outputString with separator
        outputString += "\n";

        //Adding each individual  class name to toString output
        outputString += "ID: " + this.id + "\n";

        //These if statements check if the given parameters are empty. If they are empty, replace whatever the actual name of the parameter is with "Data not available"
        if(this.name != "") {
            outputString += "Name: " + this.name + "\n";
        }else{
            outputString += "Name: Data not available\n";
        }

        if(this.employer.getValue() != "") {
            outputString += "Employer: " + this.employer + "\n";
        }else{
            outputString += "Employer: Data not available\n";
        }

        if(this.location.getValue() != ""){
            outputString += "Location: " + this.location + "\n";
        }
        else{
            outputString += "Location: Data not available\n";
        }

        if(this.positionType.getValue() != "") {
            outputString += "Position Type: " + this.positionType + "\n";
        }else{
            outputString += "Position Type: Data not available\n";
        }
        //This one has no separator due to code below adding it
        if(this.coreCompetency.getValue() != "") {
            outputString += "Core Competency: " + this.coreCompetency;
        }else{
            outputString += "Core Competency: Data not available";
        }

        //Ends outputString with separator
        outputString += "\n";

        //final return
        return outputString;
    }
}
