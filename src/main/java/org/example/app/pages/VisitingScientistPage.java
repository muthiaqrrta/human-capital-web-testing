package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.VisitingScientistPage")
public class VisitingScientistPage extends GeneralPage {

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//span[@id='select2-kategori_kegiatan-container']")
    private WebElementFacade kategoriKegiatanDropdown;

    @FindBy(xpath = "//input[@id='tgl_pelaksanaan']")
    private WebElementFacade tanggalPelaksanaanForm;

    @FindBy(xpath = "//input[@name='lama_kegiatan']")
    private WebElementFacade lamaKegiatanForm;

    @FindBy(xpath = "//span[@id='select2-id_litabmas-m4-container']")
    private WebElementFacade aktivitasLitabmasDropdown;

    @FindBy(xpath = "//span[@id='select2-pt_pengundang-sa-container']")
    private WebElementFacade pengundangDropdown;

    @FindBy(xpath = "//textarea[@name='kegiatan_penting']")
    private WebElementFacade kegiatanPentingForm;

    @FindBy(xpath = "//input[@id='no_sk_tugas']")
    private WebElementFacade noSKTugasForm;

    @FindBy(xpath = "//input[@id='tgl_sk_tugas']")
    private WebElementFacade tanggalSKTugasForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    public void setKategoriKegiatan (String category) {
        kategoriKegiatanDropdown.click();
        dropdownSearchForm.type(category);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void setTanggalPelaksanaan(String date) {
        tanggalPelaksanaanForm.type(date);
    }

    public void fillLamaKegiatanForm (String days) {
        lamaKegiatanForm.type(days);
    }

    public void setAktivitasLitabmas(String data) {
        aktivitasLitabmasDropdown.click();
        dropdownSearchForm.typeAndEnter(data);
    }

    public void setPengundang(String data) {
        pengundangDropdown.click();
        dropdownSearchForm.typeAndEnter(data);
    }

    public void fillKegiatanPentingForm(String data) {
        kegiatanPentingForm.type(data);
    }

    public void fillNoSKTugasForm(String data) {
        noSKTugasForm.type(data);
    }

    public void fillTanggalSKTugasForm(String data) {
        tanggalSKTugasForm.type(data);
    }
}
