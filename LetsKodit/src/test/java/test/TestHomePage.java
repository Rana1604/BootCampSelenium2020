package test;

import homepage.pageobject.HomePagePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePagePageObject {

    public void getInitElements() {
        PageFactory.initElements(driver, HomePagePageObject.class);

    }

    @Test()
    public void testMPractice() throws InterruptedException {
        getInitElements();
        clickPractice();
        sleepFor(2);
    }




}
