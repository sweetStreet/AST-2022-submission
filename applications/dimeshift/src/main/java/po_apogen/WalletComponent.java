package po_apogen;

import custom_classes.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import po_utils.BasePageObject;
import po_utils.PageComponent;

public class WalletComponent extends BasePageObject implements PageComponent{

	public WalletComponent(WebDriver driver) {
		super(driver);
	}

	public void goToAddWalletPage() {
		this.clickOn(By.id("add_wallet_button"));
	}

	public void goToGoalsPage() {
		this.clickOn(By.xpath("//*[@id=\"header\"]/div/div[2]/ul/li[3]/a[1]"));
	}

	public void manageWalletAccess(Id id){
		this.clickOn(By.cssSelector("#wallet_items > a:nth-child(" + id.value + ") " +
				"> div.item_buttons.wallet_buttons > button.btn.btn-default.btn-xs.item_button_accesses"));
	}

	public void editWallet(Id id){
		this.clickOn(By.cssSelector("#wallet_items > a:nth-child(" + id.value + ") " +
				"> div.item_buttons.wallet_buttons > button.btn.btn-default.btn-xs.item_button_edit"));
	}

	public void hideWallet(Id id){
		this.clickOn(By.cssSelector("#wallet_items > a:nth-child(" + id.value + ") " +
				"> div.item_buttons.wallet_buttons > button.btn.btn-default.btn-xs.item_button_remove"));
	}

	public void goToTrashPage() {
		this.clickOn(By.linkText("Trash"));
	}

	public void goToTransaction(Id id){
		this.clickOn(By.xpath("//*[@id=\"wallet_items\"]/a[" + id.value + "]"));
	}

	/* method preconditions */

	public boolean isWalletPresent(Id id){
		if(this.isElementPresentOnPage(By.xpath("//*[@id=\"wallet_items\"]/a[" + id.value + "]"))){
			return true;
		}
		return false;
	}

	public boolean existWalletShared(){
		if(this.isElementPresentOnPage(By.xpath("//*[@id=\"wallet_items\"]/a[@style=\"background: #eee\"]"))){
			return true;
		}
		return false;
	}

	//assume that wallet with Id id is present
	public boolean isWalletShared(Id id){
		WebElement wallet = this.findElement(By.xpath("//*[@id=\"wallet_items\"]/a[" + id.value + "]"));
		WebElement walletShared = this.elementPresentOnPage(By.xpath("//*[@id=\"wallet_items\"]/a[@style=\"background: #eee\"]"));
		if(walletShared != null && wallet.getText().equals(walletShared.getText())){
			return true;
		}
		return false;
	}

	public String getActiveFilter(){
		WebElement element = this.findElement(By.xpath("//*[@id]/div/div[1]" +
				"/div[2]/div[1]/div[2]/ul/li[@class=\"active\"]"));
		return this.getText(element);
	}

	public String getActiveAccessFilter(){
		WebElement element = this.findElement(By.xpath("//*[@id]/div/div[1]" +
				"/div[2]/div[2]/div[2]/ul/li[@class=\"active\"]"));
		return this.getText(element);
	}
}
