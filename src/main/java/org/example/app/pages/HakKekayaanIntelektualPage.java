package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.HakKekayaanIntelektualPage")
public class HakKekayaanIntelektualPage extends GeneralPage {

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//input[@id='judul']")
    private WebElementFacade judulForm;

    @FindBy(xpath = "//span[@id='select2-peran-container']")
    private WebElementFacade peranDropdown;

    @FindBy(xpath = "//span[@id='select2-jenis_hki-container']")
    private WebElementFacade jenisHKIDropdown;

    @FindBy(xpath = "//input[@id='tgl_daftar']")
    private WebElementFacade tanggalDaftarForm;

    @FindBy(xpath = "//span[@id='select2-jenis_tingkat-container']")
    private WebElementFacade tingkatHKIDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-tingkat-container']")
    private WebElementFacade tingkatFormDropdown;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium mg-b-0'])[1]")
    private WebElementFacade judulHKI;

    public void setKategoriKegiatan (String category) {
        kategoriKegiatanDropdown.click();
        dropdownSearchForm.type(category);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void fillJudulForm(String title) {
        judulForm.type(title);
    }

    public void setPeran(String role) {
        peranDropdown.click();
        dropdownSearchForm.typeAndEnter(role);
    }

    public void setJenisHKI(String type) {
        scrollToElement(peranDropdown);
        jenisHKIDropdown.click();
        dropdownSearchForm.typeAndEnter(type);
    }

    public void setTanggalDaftar(String registrationDate) {
        scrollToElement(jenisHKIDropdown);
        tanggalDaftarForm.type(registrationDate);
    }

    public void setTingkatHKI(String scale) {
        scrollToElement(tanggalDaftarForm);
        tingkatHKIDropdown.click();
        dropdownSearchForm.typeAndEnter(scale);
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

    public void setJenis(String type) {
        jenisDropdown.click();
        for (WebElementFacade webElementFacade : listDropdownOptions) {
            if (webElementFacade.getText().contains(type)) {
                withAction().moveToElement(webElementFacade).click().build().perform();
                break;
            }
        }
    }

    public String getJudulHKI(){
        return judulHKI.getText();
    }
}
