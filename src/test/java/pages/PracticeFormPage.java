package pages;

import components.Calendar;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {

    private Calendar calendar = new Calendar();

    public PracticeFormPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public PracticeFormPage firstName(String firstName) {
        $("#firstName").setValue(firstName);

        return this;
    }

    public PracticeFormPage lastName(String lastName) {
        $("#lastName").setValue(lastName);

        return this;
    }

    public PracticeFormPage email(String email) {
        $("#userEmail").setValue(email);

        return this;
    }

    public PracticeFormPage gender(String gender) {
        $("#genterWrapper").$(byText(gender)).click();

        return this;
    }

    public PracticeFormPage phone(String phone) {
        $("#userNumber").setValue(phone);

        return this;
    }

    public PracticeFormPage setDateOfBirth(String day, String month, String year) {
        calendar.setDate(day, month, year);

        return this;
    }

    public PracticeFormPage subjects(String subjects) {
        $("#subjectsInput").setValue(subjects).pressEnter();

        return this;
    }

    public PracticeFormPage hobbies(String hobbies) {
        $("#hobbiesWrapper").$(byText(hobbies)).click();

        return this;
    }

    public PracticeFormPage picture(String picture) {
        $("#uploadPicture").uploadFile(new File(picture));

        return this;
    }

    public PracticeFormPage address(String address) {
        $("#currentAddress").setValue(address);

        return this;
    }

    public PracticeFormPage state(String state) {
        $("#react-select-3-input").setValue(state).pressEnter();

        return this;
    }

    public PracticeFormPage city(String city) {
        $("#react-select-4-input").setValue(city).pressEnter();

        return this;
    }

    public PracticeFormPage clickButton() {
        $("#submit").scrollTo().click();

        return this;
    }

    public PracticeFormPage checkResultsTitle(String checkResultsTitle) {
        $("#example-modal-sizes-title-lg").shouldHave(text (checkResultsTitle));

        return this;
    }

    public PracticeFormPage checkResultsValue(String fullName, String email, String gender, String phone,
                                              String birthDay, String subjects, String hobbies, String file,
                                              String address, String stateAndCity) {
        $x("//table//tr[1]/td[2]").shouldHave(text(fullName));
        $x("//table//tr[2]/td[2]").shouldHave(text(email));
        $x("//table//tr[3]/td[2]").shouldHave(text(gender));
        $x("//table//tr[4]/td[2]").shouldHave(text(phone));
        $x("//table//tr[5]/td[2]").shouldHave(text(birthDay));
        $x("//table//tr[6]/td[2]").shouldHave(text(subjects));
        $x("//table//tr[7]/td[2]").shouldHave(text(hobbies));
        $x("//table//tr[8]/td[2]").shouldHave(text(file));
        $x("//table//tr[9]/td[2]").shouldHave(text(address));
        $x("//table//tr[10]/td[2]").shouldHave(text(stateAndCity));

        return this;
    }

}