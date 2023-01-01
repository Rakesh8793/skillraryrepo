package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryPage;
import pomPages.SkillraryProductPage;

public class Testcase1 extends BaseClass{

	@Test
	public void tc1() {
		SkillraryPage sp = new SkillraryPage(driver);
		sp.gearsbtn();
		sp.skillrarydemoappbtn();
		
		driverutilities.switchTabs(driver);
		SkillraryDemoPage dp = new SkillraryDemoPage(driver);
		driverutilities.mouseHover(driver, dp.getCoursebtn());
		dp.seleniumtrainingbtn();
		
		SkillraryProductPage pp = new SkillraryProductPage(driver);
		driverutilities.doubleClick(driver, pp.getAddbtn());
		pp.addtocartbtn();
		driverutilities.alertPopup(driver);
	}
	
}
