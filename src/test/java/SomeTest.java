import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SomeTest {

    @Test
    void successfulSearchTestYahoo() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("selenide").pressEnter();
        $("div[id=main]").shouldHave(text("selenide.org"));
    }

}
