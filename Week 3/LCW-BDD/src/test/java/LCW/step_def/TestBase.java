package LCW.step_def;

import LCW.utils.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.time.Duration;

public class TestBase {
    @Before
    public void setUp() {
        Drivers.get().get("https://www.lcwaikiki.com/tr-TR/TR");
        Drivers.get().manage().window().maximize();
        Drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown() {
        Drivers.closeDriver();
    }
}
