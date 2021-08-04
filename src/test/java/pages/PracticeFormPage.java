package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {

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

}