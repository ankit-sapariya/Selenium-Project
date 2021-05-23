package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SkillraryLoginpage {
@FindBy(xpath= "//a[text()=' GEARS ']" )
private WebElement gearsbtn;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement demoApp;

public SkillraryLoginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void gearsbutton() {
	gearsbtn.click();	
}
public void skillraryDemoApp() {
	demoApp.click();
}
}
