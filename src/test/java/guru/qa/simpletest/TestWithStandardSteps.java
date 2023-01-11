package guru.qa.simpletest;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.helpers.Steps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;


public class TestWithStandardSteps {
    @Test
    void SearchIssueTestWithSteps(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        Steps steps = new Steps();

        steps.openRepository();
        steps.clickIssueTab();
        steps.checkIssue();
    }
}
