package scripts;

import org.testng.annotations.Test; 

import Lib.BaseClass1;
import pomPages.AddtocartPage;
import pomPages.DemoSkillraryLoginpage;
import pomPages.SkillraryLoginpage;
public class Addtocart extends BaseClass1{
@Test
public void addProduct() {
	SkillraryLoginpage s = new SkillraryLoginpage(driver);
	s.gearsbutton();
	s.skillraryDemoApp();
	utilities.switchTab(driver);
	
	DemoSkillraryLoginpage d = new 	DemoSkillraryLoginpage(driver);
	utilities.mouseHover(driver, d.getCoursebtn());
	d.seleniumtrainingbtn();
	
	
	AddtocartPage a = new AddtocartPage(driver);
	utilities.doubleClick(driver,a.getAddbtn());
	a.addtocartbtn();
	utilities.alertPopup(driver);
	
	
}
}
