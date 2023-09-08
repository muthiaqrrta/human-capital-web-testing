package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.KaryaIlmiahPage")
public class KaryaIlmiahPage extends GeneralPage {

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

    @FindBy(xpath = "//span[@id='select2-id_tingkat-container']")
    private WebElementFacade tingkatDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaForm;

    @FindBy(xpath = "//span[@id='select2-jenis-container']")
    private WebElementFacade jenisDropdown;

    @FindBy(xpath = "//span[@id='select2-jenis_karil-container']")
    private WebElementFacade jenisKaryaIlmiahFilterDropdown;

    @FindBy(xpath = "//span[@id='select2-id_karya_ilmiah-container']")
    private WebElementFacade cariKaryaIlmiahDropdown;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox']")
    private WebElementFacade judulBaruCheckbox;

    @FindBy(xpath = "//a[text()='Selanjutnya']")
    private WebElementFacade selanjutnyaButton;

    @FindBy(xpath = "//a[@href='#author-add-auto']")
    private WebElementFacade menambahkanPenulisIcon;

    @FindBy(xpath = "//span[@id='select2-jenis_penulis-container']")
    private WebElementFacade jenisPenulisDropdown;

    @FindBy(xpath = "//span[@id='select2-id_sdm-container']")
    private WebElementFacade namaPenulisDropdown;

    @FindBy(xpath = "//span[@id='select2-is_corresponding_author-container']")
    private WebElementFacade correspondingAuthorDropdown;

    @FindBy(xpath = "//button[text()='Tambah']")
    private WebElementFacade tambahButton;

    @FindBy(xpath = "//a[@href='#finish']")
    private WebElementFacade selesaiButton;

    @FindBy(xpath = "//span[@id='select2-id_jenis_karya_ilmiah-container']")
    private WebElementFacade jenisKaryaIlmiahDropdown;

    @FindBy(xpath = "//textarea[@name='abstrak']")
    private WebElementFacade abstrakForm;

    @FindBy(xpath = "//input[@id='tanggal_terbit']")
    private WebElementFacade tanggalTerbitForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium mg-b-0'])[1]")
    private WebElementFacade judulKaryaIlmiah;

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

    public void clickShowButton(){
        tampilkanButton.click();
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

    public void setJenisKaryaIlmiahFilter(String filter) {
        jenisKaryaIlmiahFilterDropdown.click();
        dropdownSearchForm.type(filter);
        waitABit(1000);
        dropdownSearchForm.type("\n");
    }

    public void mencariJudulKaryaIlmiah(String judul) {
        cariKaryaIlmiahDropdown.click();
        dropdownSearchForm.type(judul);
        waitABit(2000);
        listDropdownOptions.get(0).click();
    }

    public void clickSelanjutnyaButton() {
        selanjutnyaButton.click();
    }

    public void clickTambahPenulisIcon() {
        menambahkanPenulisIcon.click();
        jenisPenulisDropdown.waitUntilVisible();
    }

    public void setJenisPenulis(String data) {
        jenisPenulisDropdown.click();
        dropdownSearchForm.typeAndEnter(data);
    }

    public void setNamaPenulis(String data) {
        namaPenulisDropdown.click();
        dropdownSearchForm.type(data);
        waitABit(2000);
        listDropdownOptions.get(0).click();
    }

    public void setCorrespondingAuthor(String data) {
        correspondingAuthorDropdown.click();
        dropdownSearchForm.typeAndEnter(data);
    }

    public void clickTambahButton() {
        tambahButton.click();
        waitABit(1000);
    }

    public void clickSelesaiButton() {
        selesaiButton.click();
    }

    public void mencentangCheckbox() {
        judulBaruCheckbox.click();
    }

    public void setJenisKaryaIlmiah(String data) {
        jenisKaryaIlmiahDropdown.click();
        dropdownSearchForm.typeAndEnter(data);
    }

    public void fillAbstrakForm(String abstrak) {
        scrollToElement(judulForm);
        abstrakForm.type(abstrak);
    }

    public void setTanggalTerbit(String tanggal) {
        scrollToElement(tanggalTerbitForm);
        tanggalTerbitForm.type(tanggal);
    }

    public String getJudulKaryaIlmiah(){
        return judulKaryaIlmiah.getText();
    }
}
