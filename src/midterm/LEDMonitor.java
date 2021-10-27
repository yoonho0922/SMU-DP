package midterm;

public class LEDMonitor extends AbstractExternalDevice {
    AbstractNotebookComputer computer;

    public LEDMonitor(String type, AbstractNotebookComputer computer) {
        super(type);
        this.computer = computer;
    }

    @Override
    double requiredSpace() {
        return computer.requiredSpace() + 150;
    }

    @Override
    public String toString(){
        return computer.toString() + ", " + super.toString();
    }
}
