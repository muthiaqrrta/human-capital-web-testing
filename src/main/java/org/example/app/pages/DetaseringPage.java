package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.DetaseringPage")
public class DetaseringPage extends GeneralPage {

    @FindBy(xpath = "//button[text()='Tampilkan']")
    private WebElementFacade tampilkanButton;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//input[@id='judul']")
    private WebElementFacade judulForm;

    @FindBy(xpath = "//span[@id='select2-peran-container']")
    private WebElementFacade peranDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-tingkat-container']")
    private WebElementFacade tingkatFormDropdown;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//span[@id='select2-id_afiliasi-o9-container']")
    private WebElementFacade afiliasiDropdown;

    @FindBy(xpath = "//input[@id='no_sk']")
    private WebElementFacade nomorSKPenugasanForm;

    @FindBy(xpath = "//input[@id='tanggal_sk_tugas']")
    private WebElementFacade tanggalSKPenugasanForm;

    @FindBy(xpath = "//span[@id='select2-kategori-container']")
    private WebElementFacade kategoriDropdown;

    @FindBy(xpath = "//span[@id='select2-org_sasaran-container']")
    private WebElementFacade organisasiSasaranFilterDropdown;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

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

    public void clickShowButton(){
        tampilkanButton.click();
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

    public void setAfiliasi(String afiliasi) {
        afiliasiDropdown.click();
        dropdownSearchForm.type(afiliasi);
        waitABit(1000);
        dropdownSearchForm.type("\n");
    }

    public void fillNomorSKPenugasanForm(String number) {
        scrollToBottomPage();
        nomorSKPenugasanForm.type(number);
    }

    public void setTanggalSKPenugasanForm(String date) {
        scrollToBottomPage();
        tanggalSKPenugasanForm.type(date);
    }

    public void setKategori(String category) {
        kategoriDropdown.click();
        dropdownSearchForm.typeAndEnter(category);
    }

    public void setOrganisasiSasaranFilter(String filter) {
        organisasiSasaranFilterDropdown.click();
        dropdownSearchForm.type(filter);
        waitABit(1000);
        dropdownSearchForm.type("\n");
    }
}
