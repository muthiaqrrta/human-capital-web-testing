package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.PenghargaanPage")
public class PenghargaanPage extends GeneralPage {

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

    @FindBy(xpath = "//span[@id='select2-id_jns_penghargaan-container']")
    private WebElementFacade jenisPenghargaanDropdown;

    @FindBy(xpath = "//input[@id='thn_penghargaan']")
    private WebElementFacade tahunPenghargaanForm;

    @FindBy(xpath = "//input[@id='instansi_pemberi']")
    private WebElementFacade instansiPemberiForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade namaPenghargaan;

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

    public void setJenisPenghargaan(String type) {
        jenisPenghargaanDropdown.click();
        dropdownSearchForm.typeAndEnter(type);
    }

    public void fillTahunPenghargaanForm(String year) {
        tahunPenghargaanForm.type(year);
    }

    public void fillInstansiPemberiForm(String data) {
        instansiPemberiForm.type(data);
    }

    public String getNamaPenghargaan(){
        return namaPenghargaan.getText();
    }
}
