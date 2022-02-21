package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base{ 
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText = " MP3 players")
	private WebElement  mp3PlayerText;
	
	@FindBy(xpath = "//a[contains(text(),'Show All MP3 Players')]")
	private WebElement showAllMp3Players;
		
	@FindBy(xpath = "//*[@class='img-thumbnail']")
	private WebElement imageMP3player ;
		
	@FindBy(linkText = "Refine Search")
	private WebElement  RefineSearch ;
	
	@FindBy(linkText = "test 11 (0)")
	private WebElement  test11 ;
	
	@FindBy(linkText ="test 12 (0)")
	private WebElement test12;
	
	@FindBy(linkText = "test 15 (0)")
	private WebElement test15;
	
	@FindBy(linkText = "test 16 (0)")
	private WebElement test16; 
	
	@FindBy(linkText = "test 17 (0)")
	private WebElement  test17;
	
	@FindBy(linkText = "test 18 (0)")
	private WebElement  test18;
	
	@FindBy(linkText = "test 19 (0)")
	private WebElement test;
	
	@FindBy(linkText = "test 20 (0)")
	private WebElement test20;
	
	@FindBy(linkText = "test 21 (0)")
	private WebElement test21 ;
	
	@FindBy(linkText = "test 22 (0)")
	private WebElement test22 ;
	
	@FindBy(linkText = "test 23 (0)")
	private WebElement test23 ;
	
	@FindBy(linkText = "test 24 (0)")
	private WebElement test24;
	
	@FindBy(linkText = "test 4 (0)")
	private WebElement test4 ;
	
	@FindBy(linkText = "test 5 (0)")
	private WebElement test5;
	
	@FindBy(linkText = "test 6 (0)")
	private WebElement test6;
	
	@FindBy(linkText = "test 7 (0)")
	private WebElement test7;
	
	@FindBy(linkText = "test 8 (0)")
	private WebElement test8;
	
	@FindBy(linkText = "test 9 (0)")
	private WebElement test9;
	
	@FindBy(xpath="//a[@class='btn btn-link']")
	private WebElement productCompare;
	
	@FindBy(xpath ="//*[@class='img-responsive'])[2]")
	private WebElement  imageIPodClassic;
	
	@FindBy(xpath = "(//*[@class='price'])[1]")
	private WebElement priceIpodClasic;
	
	
	@FindBy(xpath ="//*[@class='price-tax'])[1]")
	private WebElement exTaxiPodClassic;
	
	@FindBy(xpath = "(//*[@class='fa fa-shopping-cart'])[3]")
	private WebElement shoppingCartIconIpodClassic;
	
	@FindBy(xpath = "(//*[contains(text(),'Add to Cart')])[1]")
	private WebElement addToCardTextIpodClass;
	
	
	@FindBy(xpath = "(//*[@class='fa fa-heart'])[2]")
	private WebElement addToWishListIpodClassic;
	
	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProductIpodClassic;
	
	
	@FindBy(xpath="(//*[@class='img-responsive'])[3]")
	private WebElement imageIPodNano;
	
	@FindBy(xpath="//*[@class='price'])[2]\"")
	private WebElement priceIpodNano;
	
	@FindBy(xpath="(//*[@class='price-tax'])[2]")
	private WebElement exTaxipodNano;
	
	@FindBy(xpath="(//*[@class='fa fa-shopping-cart'])[4]")
	private WebElement shoppingCartIconIpodNano;
	
	@FindBy(xpath="//*[contains(text(),'Add to Cart')])[2]")
	private WebElement addToCardTextIpodNano;
	
	@FindBy(xpath="(//*[@class='fa fa-heart'])[3]")
	private WebElement addToWishListIpodNano;
	
	@FindBy(xpath="(//*[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProctIpodNano;
		

	@FindBy(xpath="(//*[@class='img-responsive'])[4]")
	private WebElement imageIPodShuffle;
	
	@FindBy(xpath="//*[@class='price'])[3]")
	private WebElement priceIpodShuffle;
	
	@FindBy(xpath="(//*[@class='price-tax'])[3]")
	private WebElement exTaxIpodShuffle;
	
	@FindBy(xpath="(//*[@class='fa fa-shopping-cart'])[5]")
	private WebElement shoppingcartIconIpodShuffle;
	

	@FindBy(xpath="//*[contains(text(),'Add to Cart')])[3]")
	private WebElement addToCartTextIpodShuffle;
	

	@FindBy(xpath="(//*[@class='fa fa-heart'])[4]")
	private WebElement addToWishListIpodShuffle;
	
	
	@FindBy(xpath="(//*[@class='fa fa-exchange'])[3]")
	private WebElement compareThisProductIpodShuffle;

	
	@FindBy(xpath="(//*[@class='img-responsive'])[5]")
	private WebElement imageIpodTouch;
	
	@FindBy(xpath="//*[@class='price'])[4]")
	private WebElement priceIpodTouch;
	
	@FindBy(xpath="//*[@class='price-tax'])[4]\"")
	private WebElement exTaxIpodTouch;
	
	@FindBy(xpath="(//*[@class='fa fa-shopping-cart'])6]")
	private WebElement shoppingCarticonipodTouch;
	

	@FindBy(xpath="//*[contains(text(),'Add to Cart')])[4]")
	private WebElement addToCartTextIpodTouch;
	
	
	@FindBy(xpath="(//*[@class='fa fa-heart'])[5]")
	private WebElement addToWishListIPodTouch;
	
	@FindBy(xpath="(//*[@class='fa fa-exchange'])[4]")
	private WebElement compareThisProductIpodTouch;	

	@FindBy(xpath="//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement totalCart;
	
	
	
	
	
	
}
