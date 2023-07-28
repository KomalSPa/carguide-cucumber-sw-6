package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import static au.com.carsguide.browserfactory.ManageBrowser.driver;

public class CarDearlersPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public CarDearlersPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement carDealerText;

    public String verifyCarDealerText(){
       return getTextFromElement(carDealerText);
    }
}
