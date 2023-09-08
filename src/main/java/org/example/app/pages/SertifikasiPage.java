package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.PortofolioPage")
public class SertifikasiPage extends GeneralPage {

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

    @FindBy(xpath = "//span[@id='select2-jenis_sertifikasi-container']")
    private WebElementFacade jenisSertifikasiDropdown;

    @FindBy(xpath = "//span[@id='select2-bidang_studi-container']")
    private WebElementFacade bidangStudiDropdown;

    @FindBy(xpath = "//input[@id='tahun_sertifikasi']")
    private WebElementFacade tahunSertifikasiForm;

    @FindBy(xpath = "//input[@id='sk_sert']")
    private WebElementFacade nomorSKSertifikasiForm;

    @FindBy(xpath = "//input[@id='tgl_sk_sertifikasi']")
    private WebElementFacade tanggalSKSertifikasiForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade namaSertifikasi;

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

    public void setJenisSertifikasi(String type) {
        jenisSertifikasiDropdown.click();
        dropdownSearchForm.typeAndEnter(type);
    }

    public void setBidangStudi(String data) {
        bidangStudiDropdown.click();
        dropdownSearchForm.typeAndEnter(data);
        waitABit(1000);
        dropdownSearchForm.type("\n");
    }

    public void fillTahunSertifikasiForm(String data) {
        tahunSertifikasiForm.type(data);
    }

    public void fillNomorSKSertifikasiForm(String data) {
        nomorSKSertifikasiForm.type(data);
    }

    public void fillTanggalSKSertifikasiForm(String data) {
        tanggalSKSertifikasiForm.type(data);
    }

    public String getNamaSertifikasi(){
        return namaSertifikasi.getText();
    }
}
