
package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTestsWithPageObjects {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://www.demoqa.com";
        Configuration.startMaximized = true;

    }

    @Test
    void positiveFillTest() {
        practiceFormPage.openPage()
                .firstName("Ulyanov")
                .lastName("Sergey")
                .email("I1T@qa.ru")
                .gender("Male")
                .phone("1234567890")
                .setDateOfBirth("17", "February", "1990")
                .subjects("Computer Science")
                .hobbies("Sports")
                .picture("src/test/resources/DZ1.png")
                .address("Saratov")
                .state("NCR")
                .city("Delhi");
        practiceFormPage.clickButton();

        practiceFormPage.checkResultsTitle("Thanks for submitting the form");
        practiceFormPage.checkResultsValue(
                "Ulyanov Sergey",
                "I1T@qa.ru",
                "Male",
                "1234567890",
                "17 February,1990",
                "Computer Science",
                "Sports",
                "DZ1.png",
                "Saratov",
                "NCR Delhi");

    }
}
