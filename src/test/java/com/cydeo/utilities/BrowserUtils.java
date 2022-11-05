package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    //Methods are static. Because we do not want to create an object to call those methods.
    // We just want to call those methods with class name. That is why they are static type


    /**
     * This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     *
     * @param seconds
     */
    public static void sleep(int seconds) {
        // 1 second = 1000 millis
        // millis = seconds*1000

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }


    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle
    public static void verifyTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    /**
     * This method will accept dropdown as a WebElement
     * and return all the options text in the List of String
     *
     * @return List<String>
     */
    public static List<String> dropDownOptionsAsString(WebElement dropDownElement) {

        Select selectDropDwon = new Select(dropDownElement);

        List<WebElement> actualOptionsAsWebElement = selectDropDwon.getOptions();
        List<String> actualOptionsAsString = new ArrayList<>();
        for (WebElement eachMonth : actualOptionsAsWebElement) {
            actualOptionsAsString.add(eachMonth.getText());
        }
        return actualOptionsAsString;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                each.click();

            }


        }
    }
}
