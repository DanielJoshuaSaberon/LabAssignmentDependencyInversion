package LabAssignmentDepencyInversion;

public class Thesis implements LibraryResources{
    private String title;
    //
    public Thesis(String title) {
        this.title = title;
    }
    //
    @Override
    public void borrow() {
        System.out.println("The thesis titled " + title + " has been borrowed by a student.");

    }
}

