package LabAssignmentDepencyInversion;

public class Newspaper implements LibraryResources {
    private String title;
    //
    public Newspaper(String title) {
        this.title = title;
    }
    //
    @Override
    public void borrow() {
        System.out.println("The borrowing newspaper " + title );
    }
}

