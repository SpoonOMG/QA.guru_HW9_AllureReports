package guru.qa.simpletest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestWithLambda {
    @Test
    void SearchIssueTestWithLambda(){
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Переходим в репозиторий 14го потока по allure",()->{
            open("https://github.com/qa-guru/qa_guru_14_10");
        });
        step("Кликаем на таб 'issue'",()->{
            $("#issues-tab").click();
        });
        step("Проверяем наличие issue под названием 'Issue for Autotest'", ()->{
            $("#issue_2_link").shouldHave(Condition.text("Issue for Autotest"));
        });
    }
}
