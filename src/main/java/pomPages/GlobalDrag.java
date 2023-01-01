package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalDrag {

	@FindBy(xpath="//img[@alt='The peaks of High Tatras']")
	private WebElement photo;
	@FindBy(xpath="//div[@class='ui-widget-content ui-state-default ui-droppable']")
	private WebElement trash;
	
	public GlobalDrag(WebDriver Driver)
	{ PageFactory.initElements(Driver,this);}

	public WebElement getPhoto() {
		return photo;
	}

	public WebElement getTrash() {
		return trash;
	}
	
	
	
}
