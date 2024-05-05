package LabAssignmentDepencyInversion;

public class BorrowingResource {
    public static void main(String[]args){
        Student student = new Student();
        //
        LibraryResources book = new Book("Automata Theory");
        LibraryResources journal = new Journal("w33 Schools, ReactJs");
        LibraryResources thesis = new Thesis("Plantearette");
        LibraryResources capstone = new Capstone("Online Membership and Billing System");
        LibraryResources ejournals = new eJournals("college.neu.edu.ph");
        LibraryResources newspaper = new Newspaper("Manila Bulletin");
        //
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
        student.borrowResource(capstone);
        student.borrowResource(ejournals);
        student.borrowResource(newspaper);
    }
}
