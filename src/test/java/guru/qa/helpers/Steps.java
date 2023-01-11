package guru.qa.helpers;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Steps {
    @Step("Переходим в репозиторий 14го потока по allure")
    public void openRepository(){
        open("https://github.com/qa-guru/qa_guru_14_10");
    }

    @Step("Кликаем на таб 'issue'")
    public void clickIssueTab(){
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие issue под названием 'Issue for Autotest'")
    public void checkIssue(){
        $("#issue_2_link").shouldHave(Condition.text("Issue for Autotest"));
    }
}
