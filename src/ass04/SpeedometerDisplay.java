package ass04;

public class SpeedometerDisplay extends InfoDisplayDecorator {

    public SpeedometerDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    protected String getDisplayText() {
        return "Speed: 50";
    }
}
