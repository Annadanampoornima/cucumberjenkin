package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CaseStudyAddtoproduct {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement loginbutton;
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="All")
	public static WebElement homepage;
	@FindBy(how=How.CSS,using="input[name='products']")
	public static WebElement allcategory;
	@FindBy(how=How.CSS,using="input[value='FIND DETAILS']")
	public static WebElement allcategory1;
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")
	public static WebElement addtocart;
	@FindBy(how=How.XPATH,using="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")
	public static WebElement cart;
	@FindBy(how=How.XPATH,using="//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")
	public static WebElement checkout;
	@FindBy(how=How.CSS,using="input[value='Proceed to Pay']")
	public static WebElement proceedtopay;
	@FindBy(how=How.XPATH,using="//*[@id='swit'][2]/div[2]/div/label")
	public static WebElement Bank;
	
}
