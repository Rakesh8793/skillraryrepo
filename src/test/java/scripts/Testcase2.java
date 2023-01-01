package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {

	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryPage sp = new SkillraryPage(driver);
		sp.gearsbtn();
		sp.skillrarydemoappbtn();
		
		driverutilities.switchTabs(driver);
		SkillraryDemoPage dp = new SkillraryDemoPage(driver);
		driverutilities.dropdown(dp.getCoursedd(), pdata.getData("coursename"));
		
		TestingPage tp = new TestingPage(driver);
		Thread.sleep(3000);
		Point loc1 = tp.getSeleniumtraining().getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		driverutilities.scrollBar(driver, x1, y1+100);
		driverutilities.dragAndDrop(driver, tp.getSeleniumtraining(), tp.getCartarea());
		Point loc = tp.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollBar(driver, x, y);
		Thread.sleep(3000);
		tp.facebookicon();
		Thread.sleep(3000);
		
		
	}
	
	
}
