package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryProductPage {

	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addbtn;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocartbtn;
	
	public SkillraryProductPage(WebDriver driver)
	{ PageFactory.initElements(driver,this); }

	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtocartbtn()
	{ addtocartbtn.click(); }
}
