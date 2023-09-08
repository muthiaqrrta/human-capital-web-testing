package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.TesPage")
public class TesPage extends GeneralPage {

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//input[@id='penyelenggara']")
    private WebElementFacade namaPenyelenggaraForm;

    @FindBy(xpath = "//span[@id='select2-kategori-container']")
    private WebElementFacade kategoriDropdown;

    @FindBy(xpath = "//input[@id='tgl_tes']")
    private WebElementFacade tanggalTesForm;

    @FindBy(xpath = "//input[@id='skor']")
    private WebElementFacade skorForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    public void setKategoriKegiatan (String category) {
        kategoriKegiatanDropdown.click();
        dropdownSearchForm.type(category);
        waitABit(2000);
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

    public void fillNamaPenyelenggaraForm(String name) {
        namaPenyelenggaraForm.type(name);
    }

    public void setKategori(String category) {
        kategoriDropdown.click();
        dropdownSearchForm.typeAndEnter(category);
    }

    public void fillTanggalTesForm(String data) {
        tanggalTesForm.type(data);
    }

    public void fillSkorForm(String data) {
        skorForm.type(data);
    }
}
