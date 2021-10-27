package midterm;

public class NotebookComputer extends AbstractNotebookComputer {
    private String owner;

    public NotebookComputer(String owner) {
        this.owner=owner;
    }

    @Override
    double requiredSpace() {
        return 250;
    }

    public String toString(){
        return owner+ "'s Notebook computer";
    }
}
