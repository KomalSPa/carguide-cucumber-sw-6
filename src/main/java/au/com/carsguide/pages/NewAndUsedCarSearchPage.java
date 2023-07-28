package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement selectCar;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement selectModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement selectMyLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement selectPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement nextCarbutton;

    public void selectCarMake(String selectMakeCar){
        selectByValueFromDropDown(selectCar, selectMakeCar);
    }

    public void selectMyModel(String model){
        selectByValueFromDropDown(selectModel, model);
    }
public void selectLocation(String location){
        selectByValueFromDropDown(selectMyLocation, location);
}

public void selectMyPrice (String price){
        selectByValueFromDropDown(selectPrice, price);
}
public void clickOnNextCarButton(){
        clickOnElement(nextCarbutton);
}
}


