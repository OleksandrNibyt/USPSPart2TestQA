package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UspsStore extends Page {

    @FindBy(xpath = "//div[@class= 'nav-table']//span[text()='Stamps']")
    private WebElement stamps;

    @FindBy(xpath = "//div[contains(@class, 'premuim')][contains(text(),'Order Now')]")
    private WebElement boxes;

    @FindBy(id = "Ns")
    private WebElement sortBy;

    @FindBy(xpath = "//div[@class='result-products-holder']/div[@class='cartridge-viewport']/div[1]")
    private WebElement item;



    public void selectStampsCategory() {
        stamps.click();
    }

    public void selectBoxes() {
        boxes.click();
    }

    public void selectSortBy(String text){
        new Select(sortBy).selectByVisibleText(text);
    }

    public String getFirstResultItemName(){
        return item.getText();
    }
}
