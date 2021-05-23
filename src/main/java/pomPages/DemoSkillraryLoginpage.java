package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryLoginpage {
@FindBy(xpath="//a[text()='COURSE']")
private WebElement coursebtn;

@FindBy(xpath="//a[text()='Selenium Training']")
private WebElement seleniumtraining;

public DemoSkillraryLoginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void seleniumtrainingbtn() {
	seleniumtraining.click();
}
public WebElement getCoursebtn() {
	return coursebtn;
}

}
