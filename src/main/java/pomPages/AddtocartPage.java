package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	@FindBy(id="add")
	private WebElement addbtn;

	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;

	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//to generate webElement address we right click on source get getters & setters method
	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtocartbtn() {
		addtocart.click();
	}


}
