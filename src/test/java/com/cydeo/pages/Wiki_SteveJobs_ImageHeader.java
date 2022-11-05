package com.cydeo.pages;

import com.cydeo.step_definitions.Wiki_SteveJobs_ImageHeader_StepDef;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_SteveJobs_ImageHeader {
    public Wiki_SteveJobs_ImageHeader(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
        @FindBy()
        public WebElement searchBox;

        @FindBy()
    public WebElement imageHeader;


}
