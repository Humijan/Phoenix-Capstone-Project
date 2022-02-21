package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base{

	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Phones & PDAs")
	private WebElement phoneAndPADS;
	
	@FindBy(xpath="(//*[@class='img-responsive'])[2]")
	private WebElement imageHTCTouchHD;
	
	@FindBy(linkText="HTC Touch HD")
	private WebElement HTCTouchHDtest;
	
	@FindBy(xpath="(//p[@class='price'])[1]")
	private WebElement priceHTCTouchHD;
	
	@FindBy(xpath="(//*[@class='price-tax'])[1]")
	private WebElement exTaxHTCTouchHD;
	
	@FindBy(xpath="(//*[@class='fa fa-shopping-cart'])[3]")
	private WebElement addToCardIconHTCTouchHD;
	
	@FindBy(xpath="(//*[contains(text(),'Add to Cart')])[1]")
	private WebElement addToCardTextHTCTouchHD;
	
	@FindBy(xpath="(//*[@class='fa fa-heart'])[2]")
	private WebElement addToWishListHTCTouchHD;
	
	@FindBy(xpath="(//*[@class='fa fa-exchange'])[1]")
	private WebElement compareProductHTCTouchHD;
	
	@FindBy(xpath="(//*[@class='img-responsive'])[3]")
	private WebElement imageIphone;
	
	@FindBy(linkText="iPhone")
	private WebElement Iphonetext;
	
	@FindBy(xpath="(//p[@class='price'])[2]")
	private WebElement priceIphone;
	
	@FindBy(xpath="(//*[@class='price-tax'])[2]")
	private WebElement exTaxIPhone;
	
	@FindBy(xpath="(//*[@class='fa fa-shopping-cart'])[4")
	private WebElement addToCardIconIphone;
	
	@FindBy(xpath="(//*[contains(text(),'Add to Cart')])[2]")
	private WebElement addToCardTexIphone;
	
	@FindBy(xpath="(//*[@class='fa fa-heart'])[3]")
	private WebElement addToWishListIphone;
	
	@FindBy(xpath="(//*[@class='fa fa-exchange'])[2]")
	private WebElement compareProductIphone;
	
	@FindBy(xpath="(//*[@class='img-responsive'])[4]")
	private WebElement imagePalmTreoPro;
	
	@FindBy(linkText="Palm Treo Pro")
	private WebElement palmTreoProtext;
	
	@FindBy(xpath="(//p[@class='price'])[3]")
	private WebElement pricePalmTreoProtext;
	
	@FindBy(xpath="(//*[@class='price-tax'])[3]")
	private WebElement exTaxPalmTreoPro;
	
	@FindBy(xpath="(//*[@class='fa fa-shopping-cart'])[5")
	private WebElement AddToCardIconPalmTreoPro;
	
	@FindBy(xpath="(//*[contains(text(),'Add to Cart')])[3")
	private WebElement addToCardTextPalmTreoPro;
	
	@FindBy(xpath="(//*[@class='fa fa-heart'])[4]")
	private WebElement addToWishListPalmTreoPro;
	
	@FindBy(xpath="(//*[@class='fa fa-exchange'])[3]")
	private WebElement compareProductPalmTreoPro;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
