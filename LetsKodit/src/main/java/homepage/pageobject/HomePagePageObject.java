package homepage.pageobject;

import homepage.webelement.HomePageWebElemen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePageObject extends HomePageWebElemen {

    @FindBy(xpath = webElementPractice)
    public static WebElement Practice;

    public static WebElement getPractice() {
        return Practice;
    }

    public static void clickPractice() {
        getPractice().click();
    }

}
