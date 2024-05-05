package LabAssignmentDepencyInversion;

public class Capstone implements LibraryResources{
    private String title;
    //
    public Capstone(String title) {
        this.title = title;
    }
    //
    @Override
    public void borrow() {
        System.out.println("The details of the capstone project " + title + " have been borrowed by a student.");
    }
}
