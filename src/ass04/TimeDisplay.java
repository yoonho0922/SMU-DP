package ass04;

public class TimeDisplay extends InfoDisplayDecorator {

    public TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    protected String getDisplayText() {
        return java.time.LocalDateTime.now().toString();
    }
}
