package LabAssignmentDepencyInversion;

public class Book implements LibraryResources{
    public String title;
    //
    public Book(String title) {
        this.title = title;
    }
    //
    @Override
    public void borrow() {
        System.out.println("Borrowing book: " + title);
    }
}
