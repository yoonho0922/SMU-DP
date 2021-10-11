package ass04;

public class WeatherDisplay extends InfoDisplayDecorator {

    public WeatherDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    protected String getDisplayText() {
        return "Weather: 온도: 20, 습도: 60";
    }
}
