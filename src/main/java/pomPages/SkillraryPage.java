package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoappbtn;
	
	public SkillraryPage(WebDriver driver)
	{	PageFactory.initElements(driver, this);		}
	
	public void gearsbtn()
	{ gearsbtn.click(); }
	public void skillrarydemoappbtn()
	{ skillrarydemoappbtn.click(); }
	
}
