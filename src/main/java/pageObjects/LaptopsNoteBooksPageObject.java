package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {

public LaptopsNoteBooksPageObject() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
private WebElement laptopAndNoteBookTab;

public void clickOnLaptopAndNoteBookTab() {
laptopAndNoteBookTab.click();
}

@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
private WebElement showAllLaptopAndNoteBook;

public void clickOnShowAllLaptopAndNoteBook() {
showAllLaptopAndNoteBook.click();
}

@FindBy(xpath = "//img[@title='MacBook']")
private WebElement macBookItem;

public void clickOnMackBookItem() {
macBookItem.click();
}

@FindBy(xpath = "//button[@id='button-cart']")
private WebElement addToCartMacBookButton;

public void clickOnAddToCartMacBookButton() {
addToCartMacBookButton.click();
}

@FindBy(xpath = "//span[@id='cart-total']")
private WebElement cartOption;

public void clickOnCartOption() {
cartOption.click();
}

@FindBy(xpath = "//i[@class='fa fa-times']")
private WebElement redXButton;

public void clickOnRedXButton() {
redXButton.click();
}

@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
private WebElement comparisonMacBookIcon;

public void clickOnComparisonMacBookIcon() {
comparisonMacBookIcon.click();
}

@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
private WebElement comparisonMacBookAirIcon;

public void clickOnComparisonMacBookAirIcon() {
comparisonMacBookAirIcon.click();
}

@FindBy(xpath = "//a[contains(text(), 'product comparison')]")
private WebElement productComparisonLink;

public void clickOnProductComparisonLink() {
productComparisonLink.click();
}

@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
private WebElement heartIconSonyVaio;

public void clickOnheartIconSonyVaio() {
heartIconSonyVaio.click();
}

@FindBy(xpath = "//img[@title='MacBook Pro']")
private WebElement macBookProItem;

public void clickOnmacBookProItem() {
macBookProItem.click();

//////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
//              locators 



//@FindBy(xpath = "//a[contains(text(),'Macs (0)')]")
//private WebElement macs0 ;

//@FindBy(xpath = " //a[contains(text(),'Windows (0)')]")
//private WebElement windows0;


//@FindBy(xpath ="(//*[@class='img-responsive'])[2]")  
//private WebElement imageHpLp3065;


//@FindBy(xpath ="//a[contains(text(),'HP LP3065')]")
//private WebElement hPLp3065;

//@FindBy(xpath="(//*[@class='price'])[1]")
//private WebElement priceHPLP3065;

//@FindBy(xpath ="(//*[@class='price-tax'])[1]")
//private WebElement eXTaxHPLP;

//@FindBy(xpath ="(//i[@class='fa fa-shopping-cart'])[3]")
//private WebElement shoppingCartIconHP;

//@FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[1]")
//private WebElement addToCarttextHP;

//@FindBy(xpath ="(//*[@class='fa fa-heart'])[1]")
//private WebElement addToWishListHP;

//@FindBy(xpath ="(//*[@class='fa fa-exchange'])[1]")
//private WebElement compareThisProductHP;


//@FindBy(xpath ="//*[@class='img-responsive'])[4]")      
//private WebElement imageMacBookAir;	

//@FindBy(xpath ="//a[contains(text(),'MacBook Air')]")
//private WebElement macBookAir;	 

//@FindBy(xpath ="(//*[@class='price'])[3]")
//private WebElement priceMacBookAir;
	
//@FindBy(xpath ="(//*[@class='price-tax'])[3]")
//private WebElement exTaxMacBookAir;
	
//@FindBy(xpath ="(//i[@class='fa fa-shopping-cart'])[5]")
//private WebElement shoppingCartIconMacBookAir;

//@FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[3]")
//private WebElement addToCardtextMacBookAir;
	
//@FindBy(xpath ="(//*[@class='fa fa-heart'])[3]")
//private WebElement addToWishListMacBookAir;

//@FindBy(xpath ="(//*[@class='fa fa-exchange'])[3]")
//private WebElement compareThisProductMacBookAir;

//@FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[4]")
//private WebElement addToCartTextMackBookPro;

//@FindBy(xpath ="(//*[@class='fa fa-heart'])[4]")
//private WebElement addToWishListMacBookPro;

//@FindBy(xpath ="(//*[@class='fa fa-exchange'])[4]")
//private WebElement compareThisProductMacBookPro;

//@FindBy(xpath ="//*[@class='img-responsive'])[6]")
//private WebElement imageSonyVAIO;

//@FindBy(xpath =" //a[contains(text(),'Sony VAIO')]")
//private WebElement sonyVAIO;

//@FindBy(xpath ="(//*[@class='price'])[5]")
//private WebElement priceSonyVAIO;


//@FindBy(xpath ="(//*[@class='price-tax'])[5]")
//private WebElement exTaxSonyVAIO;

//@FindBy(xpath ="(//i[@class='fa fa-shopping-cart'])[7]")
//private WebElement shoppingCartIconSonyAVIO;


//@FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[5]")
//private WebElement addToCartTextSonyVAIO;


//@FindBy(xpath ="(//*[@class='fa fa-heart'])[5]")
//private WebElement addToWishListSonyVAIO;

//@FindBy(xpath ="(//*[@class='fa fa-exchange'])[4]")
//private WebElement compareThisProductSonyVAIO;










}
}
