package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {

    public void openPage() {
        open("/automation-practice-form");
    }

    public void firstName(String firstName) {
        $("#firstName").setValue(firstName);
    }

    public void lastName(String lastName) {
        $("#lastName").setValue(lastName);
    }

    public void email(String email) {
        $("#userEmail").setValue(email);
    }

}
