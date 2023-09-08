package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.PengembanganDiriPage")
public class PengembanganDiriPage extends GeneralPage {

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

    @FindBy(xpath = "//span[@id='select2-tingkat-container']")
    private WebElementFacade tingkatFormDropdown;

    @FindBy(xpath = "//input[@id='tgl_mulai']")
    private WebElementFacade tanggalMulai;

    @FindBy(xpath = "//input[@id='tgl_selesai']")
    private WebElementFacade tanggalSelesai;

    @FindBy(xpath = "//span[@id='select2-id_jenis_kembang_diri-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//input[@id='penyelenggara']")
    private WebElementFacade namaPenyelenggaraForm;

    @FindBy(xpath = "//span[@id='select2-kategori-container']")
    private WebElementFacade kategoriDropdown;

    @FindBy(xpath = "//input[@id='tahun']")
    private WebElementFacade tahunForm;

    @FindBy(xpath = "//input[@id='durasi_jam']")
    private WebElementFacade durasiJamForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade judulPengembanganDiri;

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

    public void setTingkatDropdown(String scale) {
        tingkatFormDropdown.click();
        for (WebElementFacade webElementFacade : listDropdownOptions) {
            if (webElementFacade.getText().contains(scale)) {
                withAction().moveToElement(webElementFacade).click().build().perform();
                break;
            }
        }
    }

    public void setTanggalMulai(String date) {
        scrollToBottomPage();
        tanggalMulai.type(date);
    }

    public void setTanggalSelesai(String date) {
        scrollToBottomPage();
        tanggalSelesai.type(date);
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

    public void fillTahunForm (String year) {
        scrollToElement(tingkatFormDropdown);
        tahunForm.type(year);
    }

    public void fillDurasiJamForm (String hour) {
        scrollToBottomPage();
        durasiJamForm.type(hour);
    }

    public String getJudulPengembanganDiri(){
        return judulPengembanganDiri.getText();
    }
}
