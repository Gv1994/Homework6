package Runner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.$;

public class ChromRunner {
    @BeforeTest
    public static void Setuo() {
        Selenide.open("https://ee.ge/registration");
        Configuration.browser = "1920x1080";
    }
}
