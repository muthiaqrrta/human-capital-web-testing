package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.KepanitiaanPage")
public class KepanitiaanPage extends GeneralPage {

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//span[@id='select2-peran-container']")
    private WebElementFacade peranDropdown;

    @FindBy(xpath = "//span[@id='select2-id_tingkat-container']")
    private WebElementFacade tingkatDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-tingkat-container']")
    private WebElementFacade tingkatFormDropdown;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//input[@id='no_sk_penugasan']")
    private WebElementFacade noSKPenugasanForm;

    @FindBy(xpath = "//input[@id='penyelenggara']")
    private WebElementFacade namaPenyelenggaraForm;

    @FindBy(xpath = "//input[@name='tmt_sk_penugasan']")
    private WebElementFacade tmtSKPenugasanForm;

    @FindBy(xpath = "//span[@id='select2-kategori-container']")
    private WebElementFacade kategoriDropdown;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox']")
    private List<WebElementFacade> listFilterOptions;

    @FindBy(xpath = "//button[text()='Tampilkan']")
    private WebElementFacade tampilkanButton;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade namaKepanitiaan;

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

    public void setTingkat(String level) {
        tingkatDropdown.click();
        dropdownSearchForm.typeAndEnter(level);
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

    public void fillNoSKPenugasanForm(String number) {
        noSKPenugasanForm.type(number);
    }

    public void fillNamaPenyelenggaraForm(String name) {
        namaPenyelenggaraForm.type(name);
    }

    public void fillTMTSKPenugasanForm(String date) {
        tmtSKPenugasanForm.type(date);
    }

    public void setKategori(String category) {
        kategoriDropdown.click();
        dropdownSearchForm.typeAndEnter(category);
    }

    public void setFilterKepanitiaan(String filter) {
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

    public String getNamaKepanitiaan(){
        return namaKepanitiaan.getText();
    }
}
