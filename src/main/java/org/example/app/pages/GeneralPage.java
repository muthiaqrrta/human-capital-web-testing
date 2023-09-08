package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;

public class GeneralPage extends PageObject {

    @FindBy(xpath = "//h4")
    private WebElementFacade namaFitur;

    @FindBy(xpath = "//tr[@role='row']//td[1]")
    private List<WebElementFacade> listFirstColumnAttribute;

    @FindBy(xpath = "//tr[@role='row']//td[2]")
    private List<WebElementFacade> listSecondColumnAttribute;

    @FindBy(xpath = "//tr[@role='row']//td[3]")
    private List<WebElementFacade> listThirdColumnAttribute;

    @FindBy(xpath = "//tr[@role='row']//td[4]")
    private List<WebElementFacade> listFourthColumnAttribute;

    @FindBy(xpath = "//tr[@role='row']//td[5]")
    private List<WebElementFacade> listFifthColumnAttribute;

    @FindBy(xpath = "//tr[@role='row']//td[6]")
    private List<WebElementFacade> listSixthColumnAttribute;

    @FindBy(xpath = "//tr[@role='row']//td[7]")
    private List<WebElementFacade> listSeventhColumnAttribute;

    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade searchForm;

    @FindBy(xpath = "//a[contains(@class,'btn-its-3')]")
    private WebElementFacade tambahDataButton;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElementFacade simpanButton;

    @FindBy(xpath = "//a[text()='Kembali']")
    private WebElementFacade kembaliButton;

    @FindBy(xpath = "//a[contains(@class,'btn-its-3')]/following-sibling::a")
    private WebElementFacade filterButton;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox']")
    private List<WebElementFacade> listFilterOptions;

    @FindBy(xpath = "//button[@id='filter']")
    private WebElementFacade tampilkanButton;

    @FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
    private WebElementFacade successNotification;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private List<WebElementFacade> emptyList;

    @FindBy(xpath = "//tr[@role='row']//td//a")
    private List<WebElementFacade> listLinkColumnAttribute;

    @FindBy(xpath = "(//div[@class='dropdown'])[1]")
    private WebElementFacade hapusDropdown;

    @FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//a[text()='Hapus']")
    private WebElementFacade hapusButton;

    @FindBy(xpath = "//button[text()='Hapus']")
    private WebElementFacade verifHapusButton;

    @FindBy(xpath = "(//a[contains(text(), 'Edit')])[1]")
    private WebElementFacade editDataButton;

    public String getNamaFitur(){
        return namaFitur.getText();
    }

    public boolean isFirstColumnAttributeVisible() {
        return isListWebElementVisible(listFirstColumnAttribute);
    }

    public boolean isSecondColumnAttributeVisible() {
        return isListWebElementVisible(listSecondColumnAttribute);
    }

    public boolean isThirdColumnAttributeVisible() {
        return isListWebElementVisible(listThirdColumnAttribute);
    }

    public boolean isFourthColumnAttributeVisible() {
        return isListWebElementVisible(listFourthColumnAttribute);
    }

    public boolean isFifthColumnAttributeVisible() {
        return isListWebElementVisible(listFifthColumnAttribute);
    }

    public boolean isSixthColumnAttributeVisible() {
        return isListWebElementVisible(listSixthColumnAttribute);
    }

    public boolean isSeventhColumnAttributeVisible() {
        return isListWebElementVisible(listSeventhColumnAttribute);
    }

    public List<String> getFirstColumnAttribute() {
        return getTextListWebElement(listFirstColumnAttribute);
    }

    public List<String> getSecondColumnAttribute() {
        return getTextListWebElement(listSecondColumnAttribute);
    }

    public List<String> getThirdColumnAttribute() {
        return getTextListWebElement(listThirdColumnAttribute);
    }

    public List<String> getFourthColumnAttribute() {
        return getTextListWebElement(listFourthColumnAttribute);
    }

    public void fillSearchFormAndHitEnter(String data) {
        searchForm.typeAndEnter(data);
        waitABit(1000);
    }

    public void clickTambahDataButton() {
        tambahDataButton.click();
    }

    public void clickSimpanButton() {
        scrollToBottomPage();
        simpanButton.click();
        waitABit(2000);
    }

    public void clickKembaliButton() {
        kembaliButton.click();
        waitABit(1000);
    }

    public void clickFilterButton() {
        filterButton.click();
    }

    public void setFilter(String filter) {
        for (WebElementFacade webElementFacade : listFilterOptions) {
            if (webElementFacade.getText().contains(filter)) {
                if (webElementFacade.isVisible()) {
                    webElementFacade.click();
                }
                tampilkanButton.click();
                break;
            }
        }
    }

    public boolean isSuccessNotificationVisible() {
        return successNotification.isVisible();
    }

    public boolean isEmptyListVisible() {
        return isListWebElementVisible(emptyList);
    }

    public void clickFirstListLink() {
        listLinkColumnAttribute.get(0).waitUntilClickable().click();
    }

    public List<String> getLinkColumnAttribute() {
        return getTextListWebElement(listLinkColumnAttribute);
    }

    public String getFirstLinkColumnAttribute() {
        return listLinkColumnAttribute.get(0).getText();
    }

    public void clickHapusButton() {
        hapusDropdown.click();
        hapusButton.waitUntilClickable().click();
        verifHapusButton.waitUntilClickable().click();
    }

    public void clickEditDataButton() {
        editDataButton.click();
    }

    public void scrollToElement(WebElementFacade webElementFacade) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webElementFacade);
        waitABit(1000);
    }

    public void scrollToBottomPage() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        waitABit(1000);
    }

    public boolean isListWebElementVisible(List<WebElementFacade> listWebElement) {
        if (listWebElement.size() > 0) {
            for (WebElementFacade webElementFacade : listWebElement) {
                if (!webElementFacade.isVisible()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public List<String> getTextListWebElement(List<WebElementFacade> listWebElement) {
        List<String> stringList = new ArrayList<>();
        for (WebElementFacade webElementFacade : listWebElement) {
            stringList.add(webElementFacade.getText().trim());
        }
        return stringList;
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
        waitABit(1000);
    }
}