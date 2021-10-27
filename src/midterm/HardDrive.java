package midterm;

public class HardDrive extends AbstractExternalDevice {
    AbstractNotebookComputer computer;

    public HardDrive(String type, AbstractNotebookComputer computer) {
        super(type);
        this.computer = computer;
    }

    @Override
    double requiredSpace() {
        return computer.requiredSpace() + 40;
    }

    @Override
    public String toString(){
        return computer.toString() + ", " + super.toString();
    }
}
