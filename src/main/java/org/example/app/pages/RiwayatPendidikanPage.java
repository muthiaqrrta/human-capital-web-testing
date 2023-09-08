package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.RiwayatPendidikanPage")
public class RiwayatPendidikanPage extends GeneralPage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade searchForm;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private List<WebElementFacade> emptyList;

    @FindBy(xpath = "//a[contains(@class,'btn-its-3')]")
    private WebElementFacade tambahDataButton;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElementFacade simpanButton;

    @FindBy(xpath = "//a[contains(@class,'btn-its-3')]/following-sibling::a")
    private WebElementFacade filterButton;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox']")
    private List<WebElementFacade> listFilterOptions;

    @FindBy(xpath = "//button[@id='filter']")
    private WebElementFacade tampilkanButton;

    @FindBy(xpath = "//input[@id='nama_institusi']")
    private WebElementFacade namaInstitusiForm;

    @FindBy(xpath = "//span[@id='select2-jenjang_pendidikan-container']")
    private WebElementFacade jenjangPendidikanDropdown;

    @FindBy(xpath = "//input[@id='satuan_pendidikan']")
    private WebElementFacade satuanPendidikanForm;

    @FindBy(xpath = "//span[@id='select2-bidang_studi-container']")
    private WebElementFacade bidangStudiDropdown;

    @FindBy(xpath = "//input[@id='program_studi']")
    private WebElementFacade programStudiForm;

    @FindBy(xpath = "//input[@id='nim']")
    private WebElementFacade nomorIndukForm;

    @FindBy(xpath = "//input[@id='thn_masuk']")
    private WebElementFacade tahunMasukForm;

    @FindBy(xpath = "//input[@id='thn_lulus']")
    private WebElementFacade tahunLulusForm;

    @FindBy(xpath = "//input[@id='tgl_lulus']")
    private WebElementFacade tanggalLulusForm;

    @FindBy(xpath = "//input[@id='ipk']")
    private WebElementFacade skorForm;

    @FindBy(xpath = "//input[@id='sks_lulus']")
    private WebElementFacade sksLulusForm;

    @FindBy(xpath = "(//div[@class='form-row']//div[@class='radio-button-its'])")
    private List<WebElementFacade> kependidikanOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade namaInstitusiPendidikan;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-secondary']")
    private WebElementFacade belumDiajukanFilter;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-info']")
    private WebElementFacade menungguVerifFilter;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-success']")
    private WebElementFacade disetujuiFilter;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-danger']")
    private WebElementFacade ditolakFilter;

    public void fillNamaInstitusiForm(String institutionName) {
        namaInstitusiForm.type(institutionName);
    }

    public void setJenjangPendidikan(String educationalStage) {
        jenjangPendidikanDropdown.click();
        dropdownSearchForm.typeAndEnter(educationalStage);
    }

    public void fillSatuanPendidikanForm(String educationUnits) {
        scrollToElement(jenjangPendidikanDropdown);
        satuanPendidikanForm.type(educationUnits);
    }

    public void setBidangStudi(String bidangStudi) {
        scrollToElement(namaInstitusiForm);
        bidangStudiDropdown.click();
        dropdownSearchForm.typeAndEnter(bidangStudi);
    }

    public void setProgramStudi(String programStudi) {
        scrollToElement(bidangStudiDropdown);
        programStudiForm.type(programStudi);
    }

    public void fillNomorIndukForm(String registrationNumber) {
        scrollToElement(programStudiForm);
        nomorIndukForm.type(registrationNumber);
    }

    public void fillTahunMasukForm(String entryYear) {
        scrollToElement(nomorIndukForm);
        tahunMasukForm.type(entryYear);
    }

    public void fillTahunLulusForm(String graduationYear) {
        scrollToElement(tahunMasukForm);
        tahunLulusForm.type(graduationYear);
    }

    public void setTanggalLulus(String graduationDate) {
        scrollToElement(tahunLulusForm);
        tanggalLulusForm.type(graduationDate);
    }

    public void setSkor(String score) {
        scrollToElement(tanggalLulusForm);
        skorForm.type(score);
    }

    public void setSksLulus(String sksLulus) {
        scrollToElement(skorForm);
        sksLulusForm.type(sksLulus);
    }

    public void kependidikan() {
        kependidikanOptions.get(0).click();
    }

    public void tidakKependidikan() {
        kependidikanOptions.get(1).click();
    }

    public String getNamaInstitusiPendidikan(){
        return namaInstitusiPendidikan.getText();
    }

    public void selectBelumDiajukanFilter() {
        menungguVerifFilter.click();
        disetujuiFilter.click();
        ditolakFilter.click();
        waitABit(1000);
    }
}