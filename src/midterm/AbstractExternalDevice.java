package midterm;

public abstract class AbstractExternalDevice extends AbstractNotebookComputer {
    private String deviceType;

    public AbstractExternalDevice(String type) {
        this.deviceType = type;
    }

    @Override
    public String toString() {
        return deviceType;
    }
}
