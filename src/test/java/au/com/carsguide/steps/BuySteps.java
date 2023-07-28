package au.com.carsguide.steps;

import au.com.carsguide.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }


    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverToBuySell();
    }

    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCar();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String selectMakeCar) throws Throwable {
        new NewAndUsedCarSearchPage().selectCarMake(selectMakeCar);
        throw new PendingException();
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws Throwable {
        new NewAndUsedCarSearchPage().selectMyModel(model);
        throw new PendingException();
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws Throwable {
        new NewAndUsedCarSearchPage().selectLocation(location);
        throw new PendingException();
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws Throwable {
        new NewAndUsedCarSearchPage().selectMyPrice(price);
        throw new PendingException();
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\"$")
    public void iShouldSeeTheMake(String results) {
        Assert.assertEquals(new ResultPage().verifyResult(), results);
    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCar();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarForSalePage().verifyToUsedCarPage(), "Used Cars For Sale", "Not Displayes");
        new UsedCarForSalePage().verifyToUsedCarPage();
    }

    @And("^I click 'Find a Dealer'$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindDealer();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDearlersPage().verifyCarDealerText(), "Find a Car Dealership Near You", "Not Displayed");

    }

    @And("^I should see the names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheNamesAreDisplayOnPage(String arg0) throws Throwable {

        throw new PendingException();
    }


    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
