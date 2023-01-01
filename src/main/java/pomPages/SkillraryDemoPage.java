package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {

	@FindBy(id="course")
	private WebElement coursebtn;
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingbtn;
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public SkillraryDemoPage(WebDriver driver)
	{ PageFactory.initElements(driver, this); }

	public WebElement getCoursebtn() {
		return coursebtn;
	}
	public void seleniumtrainingbtn()
	{ seleniumtrainingbtn.click(); }

	public WebElement getCoursedd() {
		return coursedd;
	}
	
}
