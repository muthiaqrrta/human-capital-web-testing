package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.PengelolaJurnalPage")
public class PengelolaJurnalPage extends GeneralPage {

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//span[@id='select2-peran-container']")
    private WebElementFacade peranDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-tingkat-container']")
    private WebElementFacade tingkatFormDropdown;

    @FindBy(xpath = "//input[@id='no_sk']")
    private WebElementFacade nomorSKPenugasanForm;

    @FindBy(xpath = "(//div[@class='form-row']//div[@class='radio-button-its'])")
    private List<WebElementFacade> radioOptions;

    @FindBy(xpath = "//span[@id='select2-media_publikasi-container']")
    private WebElementFacade mediaPublikasiDropdown;

    @FindBy(xpath = "//input[@id='tmt_penugasan']")
    private WebElementFacade tmtPenugasanForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    public void setKategoriKegiatan (String category) {
        kategoriKegiatanDropdown.click();
        dropdownSearchForm.type(category);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void setPeran(String role) {
        peranDropdown.click();
        dropdownSearchForm.typeAndEnter(role);
    }

    public void fillNamaForm(String name) {
        namaForm.type(name);
    }

    public void setTingkatDropdown(String scale) {
        tingkatFormDropdown.click();
        for (WebElementFacade webElementFacade : listDropdownOptions) {
            if (webElementFacade.getText().contains(scale)) {
                withAction().moveToElement(webElementFacade).click().build().perform();
                break;
            }
        }
    }

    public void fillNomorSKPenugasanForm(String number) {
        scrollToBottomPage();
        nomorSKPenugasanForm.type(number);
    }

    public void selectYesOption() {
        scrollToBottomPage();
        radioOptions.get(0).click();
    }

    public void selectNoOption() {
        scrollToBottomPage();
        radioOptions.get(1).click();
    }

    public void setMediaPublikasi (String data) {
        mediaPublikasiDropdown.click();
        dropdownSearchForm.type(data);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void fillTMTPenugasanForm(String date) {
        tmtPenugasanForm.type(date);
    }
}
