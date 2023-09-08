package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.BiodataPage")
public class BiodataPage extends GeneralPage {

    @FindBy(xpath = "//div[@class='card-body']//h5")
    private List<WebElementFacade> listBiodataCardTitleAttribute;

    @FindBy(xpath = "(//div[@class='card-list-item']//h5)[1]")
    private WebElementFacade tanggalVerifikasiDetailAttribute;

    @FindBy(xpath = "(//div[@class='row row-xs']//div[contains(@class,'col-8')])[1]")
    private WebElementFacade statusVerifikasiDetailAttribute;

    @FindBy(xpath = "//a[@href='https://dev-humancapital.its.ac.id/profil/biodata/edit/data-riset']")
    private WebElementFacade risetEditButton;

    @FindBy(xpath = "//input[@id='google_scholar']")
    private WebElementFacade idGoogleScholarForm;

    @FindBy(xpath = "//h5[contains(text(),'Kepegawaian')]")
    private WebElementFacade kepegawaianTitle;

    @FindBy(xpath = "//a[@href='https://dev-humancapital.its.ac.id/profil/biodata/edit/ajukan-perubahan-data-diri']")
    private WebElementFacade ajukanPerubahanDataButton;

    public List<String> getBiodataCardTitle() {
        return getTextListWebElement(listBiodataCardTitleAttribute);
    }

    public String getTanggalVerifikasiDetailAttribute() {
        return tanggalVerifikasiDetailAttribute.getText();
    }

    public String getStatusVerifikasiDetailAttribute() {
        return statusVerifikasiDetailAttribute.getText();
    }

    public void clickRisetEditButton() {
        scrollToElement(kepegawaianTitle);
        risetEditButton.click();
    }

    public void fillIDGoogleScholar(String data) {
        idGoogleScholarForm.type(data);
    }
}
