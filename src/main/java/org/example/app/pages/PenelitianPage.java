package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.PenelitianPage")
public class PenelitianPage extends GeneralPage {

    @FindBy(xpath = "//input[@id='judul']")
    private WebElementFacade judulForm;

    @FindBy(xpath = "//input[@name='lama_kegiatan']")
    private WebElementFacade lamaKegiatanForm;

    @FindBy(xpath = "//input[@id='tahun_usulan']")
    private WebElementFacade tahunUsulanForm;

    @FindBy(xpath = "//input[@id='tahun_kegiatan']")
    private WebElementFacade tahunKegiatanForm;

    @FindBy(xpath = "//input[@id='tahun_pelaksanaan']")
    private WebElementFacade tahunPelaksanaanForm;

    @FindBy(xpath = "//input[@id='tahun_pelaksanaan_ke']")
    private WebElementFacade tahunPelaksanaanKeForm;

    @FindBy(xpath = "//span[@class='select2-results']//ul[@class='select2-results__options']//li")
    private List<WebElementFacade> listDropdownOptions;

    @FindBy(xpath = "(//h5[@class='tx-poppins tx-medium'])[1]")
    private WebElementFacade judulPenelitian;

    public void fillJudulForm(String title) {
        judulForm.type(title);
    }

    public void fillLamaKegiatanForm (String days) {
        lamaKegiatanForm.type(days);
    }

    public void fillTahunKegiatanForm (String year) {
        scrollToElement(lamaKegiatanForm);
        tahunKegiatanForm.type(year);
    }

    public void fillTahunUsulanForm (String year) {
        scrollToElement(lamaKegiatanForm);
        tahunUsulanForm.type(year);
    }

    public void fillTahunPelaksanaanForm (String year) {
        scrollToElement(lamaKegiatanForm);
        tahunPelaksanaanForm.type(year);
    }

    public void fillTahunPelaksanaanKeForm (String number) {
        scrollToElement(lamaKegiatanForm);
        tahunPelaksanaanKeForm.type(number);
    }

    public String getJudulPenelitian(){
        return judulPenelitian.getText();
    }
}
