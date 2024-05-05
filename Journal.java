package LabAssignmentDepencyInversion;

public class Journal implements LibraryResources{
    private String title;
    //
    public Journal(String title) {
        this.title = title;
    }
    //
    @Override
    public void borrow() {
        System.out.println("Borrowing journal: " + title);
    }
}
