package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearchPage {
	
		
	WebDriver driver;
	
	public AdvancedSearchPage(WebDriver driver1) {
	     PageFactory.initElements(driver1, this);
	 }
@FindBy(how = How.XPATH, using = "//input[@id='advanced-search-field']") 
private WebElement txtbx_Search;	
	
@FindBy(how = How.CSS, using = "#token-input-QueryDescriptor_AdvancedSearchOptions_ArtistCriteria_InvolvedMakerName") 
private WebElement txtbx_Name;

@FindBy(how = How.CSS, using = "#QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_Title") 
private WebElement txtbx_Title;

@FindBy(how = How.XPATH, using = "//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_ShowImage']") 
private WebElement txtbx_ImageCheckbox;

@FindBy(how = How.XPATH, using = "//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_StartDate']") 
private WebElement txtbx_StartDate;

@FindBy(how = How.XPATH, using = "//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_EndDate']") 
private WebElement txtbx_EndDate;

@FindBy(how = How.XPATH, using = "//input[@value='Find']") 
private WebElement btn_Find;

@FindBy(how = How.NAME, using = "gdprChoice") 
private WebElement btn_GDPR;

@FindBy(how = How.XPATH, using = "//a[contains(@class,'search-view-button button-like button-big bg-lighter mobile-lg-1-2 mobile-lg-reset-margin-left')]") 
private WebElement btn_CollectionSearch;

public void enter_Input(String Name) {
	txtbx_Search.sendKeys(Name);
	 }
public void enter_Name(String Name) {
	 txtbx_Name.sendKeys(Name);
	 }
public void enter_Title(String Title) {
	 txtbx_Title.sendKeys(Title);
	 }
public void enter_ImageCheckbox() {
	 txtbx_ImageCheckbox.click();
     }
public void enter_StartDate(String StartDate) {
	 txtbx_StartDate.sendKeys(StartDate);
	 }
public void enter_EndDate(String EndDate) {
	 txtbx_EndDate.sendKeys(EndDate);
	 }
public void clickOn_Find() {
	 btn_Find.click();
	 }
public void accept_GDPR() {
	 btn_GDPR.click();
	 }
public void CollectionSearch() {
	btn_CollectionSearch.click();
	 }
public void navigateTo_AdvancedSearch() {
driver.get("https://www.rijksmuseum.nl/en/search/advanced");
     }

public void fill_Details() throws InterruptedException {
	 enter_Input("Utagawa Kuniyoshi");
	 enter_Name("Utagawa Kuniyoshi");
	 enter_Title("De CHofu Tama");
	 enter_ImageCheckbox();
	 enter_StartDate("1847");
	 enter_EndDate("1850");
	 Thread.sleep(3000);
	 clickOn_Find();
	 
     }



}





