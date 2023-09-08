package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.KaryaCiptaPage")
public class KaryaCiptaPage extends GeneralPage {

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

    @FindBy(xpath = "//span[@id='select2-id_kat_karya_cipta-container']")
    private WebElementFacade kategoriKaryaCiptaDropdown;

    @FindBy(xpath = "//span[@id='select2-id_tingkat-container']")
    private WebElementFacade tingkatDropdown;

    @FindBy(xpath = "//input[@id='tanggal_rilis']")
    private WebElementFacade tanggalRilisForm;

    @FindBy(xpath = "//span[@id='select2-kategori_karya_cipta-container']")
    private WebElementFacade kategoriKaryaCiptaFilterDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade judulKaryaCipta;

    @FindBy(xpath = "//input[@id='tanggal_permohonan']")
    private WebElementFacade tanggalPermohonanForm;

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

    public void setKategoriKaryaCipta(String category) {
        kategoriKaryaCiptaDropdown.click();
        dropdownSearchForm.typeAndEnter(category);
    }

    public void setTingkat(String level) {
        tingkatDropdown.click();
        dropdownSearchForm.typeAndEnter(level);
    }

    public void setTanggalRilis(String publicationDate) {
        scrollToElement(judulForm);
        tanggalRilisForm.type(publicationDate);
    }

    public void clickShowButton(){
        tampilkanButton.click();
    }

    public void setKategoriKaryaCiptaFilter(String filter) {
        kategoriKaryaCiptaFilterDropdown.click();
        dropdownSearchForm.type(filter);
        waitABit(1000);
        dropdownSearchForm.type("\n");
    }

    public void fillNamaForm(String name) {
        namaForm.type(name);
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

    public String getJudulKaryaCipta(){
        return judulKaryaCipta.getText();
    }

    public void setTanggalPermohonan(String tanggal) {
        scrollToElement(judulForm);
        tanggalPermohonanForm.type(tanggal);
    }
}
