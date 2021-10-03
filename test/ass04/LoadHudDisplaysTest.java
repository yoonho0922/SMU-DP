package ass04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoadHudDisplaysTest {

    @Test
    void load() {
        final String displayFileName = "src/ass04/displays.txt";
        ArrayList<String> list;
        LoadHudDisplays loadDisplay = new LoadHudDisplays(displayFileName);
        list = loadDisplay.load();
        System.out.printf("display.size() = %d\n", list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}