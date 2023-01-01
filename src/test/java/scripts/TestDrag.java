package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.GlobalDrag;

public class TestDrag extends BaseClass{

	@Test
	public void globaltd() throws InterruptedException {
	GlobalDrag td = new GlobalDrag(driver);
	driverutilities.dragAndDrop(driver, td.getPhoto(), td.getTrash());
	Thread.sleep(3000);
	
	
}
}