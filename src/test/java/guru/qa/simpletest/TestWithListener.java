package guru.qa.simpletest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestWithListener {

    @Test
    void SearchIssueTestWithListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/qa-guru/qa_guru_14_10");
        $("#issues-tab").click();
        $("#issue_2_link").shouldHave(Condition.text("Issue for Autotest"));
    }
}
