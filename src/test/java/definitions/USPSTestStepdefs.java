package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UspsStore;
import pages.UspsHome ;

import static org.assertj.core.api.Assertions.assertThat;

public class USPSTestStepdefs {
    @Given("I navigate to {string} page")
    public void iNavigateToPage(String page) {
    }

    @When("I go to usps {string} store")
    public void iGoToUspsStore(String store) {
        switch (store) {
            case "stamps":
                new UspsHome().clickStamps();
                new UspsStore().selectStampsCategory();
                break;
            case "boxes":
                new UspsHome().clickBoxes();
                break;
            case "postal":
                new UspsHome().clickPostalStore();
                break;
            default:
                throw new RuntimeException("Invalid store" + store);
        }
    }

    @And("I sort usps results by {string}")
    public void iSortUspsResultsBy(String sortBy) {
        new UspsStore().selectSortBy(sortBy);
    }

    @Then("I verify that usps {string} is cheapest")
    public void iVerifyThatUspsIsCheapest(String item) {
        String actualItem = new UspsStore().getFirstResultItemName();
        assertThat(actualItem).contains(item);
    }

    @And("I search in usps store for {string}")
    public void iSearchInUspsStoreFor(String arg0) {
    }

    @When("I go to to {string} under {string} menu")
    public void iGoToToUnderMenu(String arg0, String arg1) {
        new UspsHome().menuitems();
        new UspsHome().signIn();
    }

    @Then("I verify that {string} required")
    public void iVerifyThatRequired(String arg0) {
        new UspsHome().verifySignIn();
    }

    @Then("I verify that {string} is possible")
    public void iVerifyThatIsPossible(String arg0) {
        new UspsHome().signUpNow();
    }
}
