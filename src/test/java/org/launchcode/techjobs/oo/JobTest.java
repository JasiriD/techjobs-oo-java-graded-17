package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    //Tests if 2 created jobs are automatically assigned different IDs
    @Test
    public void testSettingJobId(){
        //2 Job objects created using empty constructor
        Job job1 = new Job();
        Job job2 = new Job();

        //Comparing the IDs
        assertNotEquals(job1.getId(), job2.getId());
    }

    //Tests if the full constructor properly inserts passed values into new Job object
    @Test
    public void testJobConstructorSetsAllFields() {
        //Creating job object where all fields are passed into constructor
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Checks if job1 object is of proper class

        assertTrue(job1 instanceof Job);

        //Checks if all passed parameters outside of name are objects of the proper class
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

        //Tests if passed parameters (Passed classes) have proper text values
        assertEquals(job1.getName(), "Product tester" );
        assertEquals(job1.getEmployer().getValue(), "ACME" );
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    //Tests that the equals method properly checks Job objects for ID and nothing else
    @Test
    public void testJobsForEquality() {

        //Creates two new job objects that are identical outside of ID
        //IDs are automatically assigned when a new job object is created, so these are automatically different
        Job job1 = new Job("NameE", new Employer("EmployerE"), new Location("LocationE"), new PositionType("PositionE"), new CoreCompetency("CoreCompetencyE"));
        Job job2 = new Job("NameE", new Employer("EmployerE"), new Location("LocationE"), new PositionType("PositionE"), new CoreCompetency("CoreCompetencyE"));

        //This was code to check the IDs because I didn't exactly know why they were different for a minute
        //System.out.println(job1.getId());
        //System.out.println(job2.getId());

        //Test passes if these are not equal according to method
        assertFalse(job1.equals(job2));
    }


    //First test of ToString method. Tests if the output returns an output with blank lines at the beginning and end
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        //New job object
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Code to assign the first and last letters of the toString output to temp variables
        String start = String.valueOf(job1.toString().charAt(0));
        //This takes the character at the position of job1.toString().length - 1, or the last character, and assigns it to a temp string
        String end = String.valueOf(job1.toString().charAt(job1.toString().length() - 1));

        //Tests if start and end temp variables are equal to lineSeparator
        //I tried to use System.lineSeperator but I wasn't exactly sure how to get it working with the tests. This works. Maybe something I could ask about during a demo??
        assertEquals(start,"\n");
        assertEquals(end,"\n");
    }

    //Tests if data is returned in proper format from toString function
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        //New job object
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //String that represents the proper output of toString
        String testString = "\n" +
                "ID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";

        //Compares toString output to testString
        assertEquals(job1.toString(), testString);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        //Test job with empty employer object
        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //String that represents the proper output of toString
        String testString = "\n" +
                "ID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: Data not available\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";

        //Compares toString output to testString
        assertEquals(job1.toString(), testString);
    }
}