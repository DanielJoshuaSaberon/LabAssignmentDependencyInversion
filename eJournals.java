package LabAssignmentDepencyInversion;

public class eJournals implements LibraryResources{
    private String title;
    //
    public eJournals(String title) {
        this.title = title;
    }
    //
    @Override
    public void borrow() {
        System.out.println("The eJournal url " + title + " has been borrowed" );
    }
}

