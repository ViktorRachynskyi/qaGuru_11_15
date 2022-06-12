package web.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends BaseTest {

    @Test
    void pageTitleTest() {
        open("https://www.github.com");
        $("title").shouldHave(attribute("text",
                "GitHub: Where the world builds software · GitHub"));
    }
}
