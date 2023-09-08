package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.RiwayatPekerjaanPage")
public class RiwayatPekerjaanPage extends GeneralPage {

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//input[@id='judul']")
    private WebElementFacade judulForm;

    @FindBy(xpath = "//span[@id='select2-peran-container']")
    private WebElementFacade peranDropdown;

    @FindBy(xpath = "//span[@id='select2-id_tingkat-container']")
    private WebElementFacade tingkatDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//span[@id='select2-kategori-container']")
    private WebElementFacade kategoriDropdown;

    @FindBy(xpath = "(//div[@class='form-row']//div[@class='radio-button-its'])")
    private List<WebElementFacade> radioOptions;

    @FindBy(xpath = "//select[@name='id_jenis_pekerjaan']//following-sibling::span//span[@class='select2-selection__rendered']")
    private WebElementFacade jenisPekerjaanDropdown;

    @FindBy(xpath = "//span[@id='select2-jenis_instansi-container']")
    private WebElementFacade jenisInstansiDropdown;

    @FindBy(xpath = "//span[@id='select2-id_kbli-container']")
    private WebElementFacade kbliNameDropdown;

    @FindBy(xpath = "//input[@id='instansi']")
    private WebElementFacade instansiForm;

    @FindBy(xpath = "//input[@id='tanggal_mulai_bekerja']")
    private WebElementFacade tanggalMulaiBekerjaForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade namaJabatanPekerjaan;

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

    public void setTingkat(String level) {
        tingkatDropdown.click();
        dropdownSearchForm.typeAndEnter(level);
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

    public void setKategori(String category) {
        kategoriDropdown.click();
        dropdownSearchForm.typeAndEnter(category);
    }

    public void selectYesOption() {
        scrollToBottomPage();
        radioOptions.get(0).click();
    }

    public void selectNoOption() {
        scrollToBottomPage();
        radioOptions.get(1).click();
    }

    public void selectOwnerYesOption() {
        scrollToBottomPage();
        radioOptions.get(2).click();
    }

    public void selectOwnerNoOption() {
        scrollToBottomPage();
        radioOptions.get(3).click();
    }

    public void setJenisPekerjaan(String type) {
        jenisPekerjaanDropdown.click();
        dropdownSearchForm.typeAndEnter(type);
    }

    public void setJenisInstansi(String type) {
        jenisInstansiDropdown.click();
        dropdownSearchForm.typeAndEnter(type);
    }

    public void setKBLIName(String name) {
        kbliNameDropdown.click();
        dropdownSearchForm.type(name);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void fillInstansiForm(String data) {
        instansiForm.type(data);
    }

    public void fillTanggalMulaiBekerjaForm(String date) {
        tanggalMulaiBekerjaForm.type(date);
    }

    public String getNamaJabatanPekerjaan(){
        return namaJabatanPekerjaan.getText();
    }
}
