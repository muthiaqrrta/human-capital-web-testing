package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.AnggotaKeluargaPage")
public class AnggotaKeluargaPage extends GeneralPage {

    @FindBy(xpath = "(//div[@class='form-row']//div[@class='radio-button-its'])")
    private List<WebElementFacade> pegawaiITSOptions;

    @FindBy(xpath = "(//div[@id='pilih_sdm']//span)[3]")
    private WebElementFacade pegawaiITSDropdown;

    @FindBy(xpath = "//input[@id='nama']")
    private WebElementFacade namaLengkapForm;

    @FindBy(xpath = "//input[@id='nik']")
    private WebElementFacade nikForm;

    @FindBy(xpath = "//input[@id='no_kk']")
    private WebElementFacade nomorKKForm;

    @FindBy(xpath = "//div[@id='c_jenis_kelamin']")
    private WebElementFacade jenisKelaminDropdown;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElementFacade dropdownSearchForm;

    @FindBy(xpath = "//div[@id='c_tanggal_lahir']")
    private WebElementFacade tanggalLahirForm;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    private WebElementFacade yearDropdown;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']//option")
    private List<WebElementFacade> listYear;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    private WebElementFacade monthDropdown;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']//option")
    private List<WebElementFacade> listMonth;

    @FindBy(xpath = "//div[@id='ui-datepicker-div']//table[@class='ui-datepicker-calendar']//a")
    private List<WebElementFacade> listDateInCurrentMonth;

    @FindBy(xpath = "((//div[@id='c_gol_darah']/following-sibling::div[@class='form-group form-floating'])//span)[3]")
    private WebElementFacade hubunganKeluargaDropdown;

    @FindBy(xpath = "(//div[@id='c_id_provinsi']//span)[3]")
    private WebElementFacade provinsiDropdown;

    @FindBy(xpath = "(//div[@id='c_id_kota']//span)[3]")
    private WebElementFacade kotaDropdown;

    @FindBy(xpath = "(//div[@id='c_id_kecamatan']//span)[3]")
    private WebElementFacade kecamatanDropdown;

    @FindBy(xpath = "(//div[@class='form-row']//div[@class='radio-button-its'])")
    private List<WebElementFacade> pnsOptions;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-secondary']")
    private WebElementFacade belumDiajukanFilter;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-info']")
    private WebElementFacade menungguVerifFilter;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-success']")
    private WebElementFacade disetujuiFilter;

    @FindBy(xpath = "//div[contains(@class,'animated')]//li[@class='label-danger']")
    private WebElementFacade ditolakFilter;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade namaAnggotaKeluarga;

    @FindBy(xpath = "//input[@name='nama']")
    private WebElementFacade namaLengkapEditForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    public void pegawaiITS() {
        pegawaiITSOptions.get(0).click();
    }

    public void bukanPegawaiITS() {
        pegawaiITSOptions.get(1).click();
    }

    public void fillNamaLengkapForm(String fullName) {
        namaLengkapForm.type(fullName);
    }

    public void fillNIKForm(String nik) {
        nikForm.type(nik);
    }

    public void fillNoKKForm(String number) {
        nomorKKForm.type(number);
    }

    public void setJenisKelamin(String gender) {
        scrollToElement(namaLengkapForm);
        jenisKelaminDropdown.click();
        dropdownSearchForm.typeAndEnter(gender);
    }

    public void clickTanggalLahir() {
        tanggalLahirForm.click();
    }

    public void setMonth(String month) {
        monthDropdown.click();
        for (WebElementFacade webElementFacade : listMonth) {
            if (webElementFacade.getText().contains(month)) {
                if (webElementFacade.isVisible()) {
                    webElementFacade.click();
                }
                break;
            }
        }
    }

    public void setYear(String year) {
        yearDropdown.click();
        for (WebElementFacade webElementFacade : listYear) {
            if (webElementFacade.getText().contains(year)) {
                if (webElementFacade.isVisible()) {
                    webElementFacade.click();
                }
                break;
            }
        }
    }

    public void setDate(String date) {
        for (WebElementFacade webElementFacade : listDateInCurrentMonth) {
            if (webElementFacade.getText().contains(date)) {
                if (webElementFacade.isVisible()) {
                    webElementFacade.click();
                }
                break;
            }
        }
    }

    public void setHubunganKeluarga(String familyRelationship) {
        scrollToElement(tanggalLahirForm);
        hubunganKeluargaDropdown.waitUntilClickable().click();
        dropdownSearchForm.type(familyRelationship);
        waitABit(2000);
        listDropdownOptions.get(0).click();
    }

    public void setProvinsi(String province) {
        scrollToElement(provinsiDropdown);
        provinsiDropdown.click();
        dropdownSearchForm.type(province);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void setKota(String city) {
        scrollToElement(provinsiDropdown);
        kotaDropdown.click();
        dropdownSearchForm.type(city);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void setKecamatan(String kecamatan) {
        scrollToElement(provinsiDropdown);
        kecamatanDropdown.click();
        dropdownSearchForm.type(kecamatan);
        waitABit(2000);
        dropdownSearchForm.type("\n");
    }

    public void pnsEmployee() {
        scrollToBottomPage();
        pnsOptions.get(2).click();
    }

    public void notPNSEmployee() {
        scrollToBottomPage();
        pnsOptions.get(3).click();
    }

    public void selectPegawaiITS(String employee) {
        pegawaiITSDropdown.click();
        dropdownSearchForm.type(employee);
        waitABit(2000);
        listDropdownOptions.get(0).click();
    }

    public void selectBelumDiajukanFilter() {
        menungguVerifFilter.click();
        disetujuiFilter.click();
        ditolakFilter.click();
        waitABit(1000);
    }

    public String getNamaAnggotaKeluarga(){
        return namaAnggotaKeluarga.getText();
    }

    public void fillNamaLengkapEditForm(String fullName) {
        namaLengkapEditForm.type(fullName);
    }
}