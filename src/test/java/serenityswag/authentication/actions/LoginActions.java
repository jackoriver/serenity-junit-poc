package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import serenityswag.authentication.Users;

public class LoginActions extends UIInteractionSteps {

    @Step("Login as {0}")
    public void as(Users user) {

        openUrl("https://www.saucedemo.com/");

        find("[data-test='username']").sendKeys(user.getUsername());
        find("[data-test='password']").sendKeys(user.getPassword());
        find("[data-test='login-button']").click();
    }

}
