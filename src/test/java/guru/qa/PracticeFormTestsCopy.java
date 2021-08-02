package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTestsCopy {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://www.demoqa.com";
        Configuration.startMaximized = true;

    }

    @Test
    void positiveFillTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Ulyanov");
        $("#lastName").setValue("Sergey");
        $("#userEmail").setValue("I1T@qa.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__day--017").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/DZ1.png"));
        $("#currentAddress").setValue("Saratov");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").scrollTo().click();

        $("#example-modal-sizes-title-lg").shouldHave(text ("Thanks for submitting the form"));
        $x("//table//tr[1]/td[2]").shouldHave(text("Ulyanov Sergey"));
        $x("//table//tr[2]/td[2]").shouldHave(text("I1T@qa.ru"));
        $x("//table//tr[3]/td[2]").shouldHave(text("Male"));
        $x("//table//tr[4]/td[2]").shouldHave(text("1234567890"));
        $x("//table//tr[5]/td[2]").shouldHave(text("17 February,1990"));
        $x("//table//tr[6]/td[2]").shouldHave(text("Computer Science"));
        $x("//table//tr[7]/td[2]").shouldHave(text("Sports"));
        $x("//table//tr[8]/td[2]").shouldHave(text("DZ1.png"));
        $x("//table//tr[9]/td[2]").shouldHave(text("Saratov"));
        $x("//table//tr[10]/td[2]").shouldHave(text("NCR Delhi"));

    }
}
