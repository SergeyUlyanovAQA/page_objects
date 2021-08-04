package pages;

import components.Calendar;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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

}