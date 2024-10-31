import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().driverVersion("129.0.6668.101").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        System.out.println("Driver Path: " + driverPath);
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").sendKeys("Alex Petrov");
        $("#userEmail").sendKeys("AlexPetrov@mail.com");

    }
}
