package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.TesPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class TesSteps {

    @Autowired
    TesPage tesPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama tes pada halaman portofolio tes")
    public void penggunaHarusMelihatNamaTesPadaHalamanPortofolioTes() {
        assertThat("test name is not visible", tesPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis tes pada halaman portofolio tes")
    public void penggunaHarusMelihatJenisTesPadaHalamanPortofolioTes() {
        assertThat("test type is not visible", tesPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat penyelenggara pada halaman portofolio tes")
    public void penggunaHarusMelihatPenyelenggaraPadaHalamanPortofolioTes() {
        assertThat("organizer name is not visible", tesPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal tes pada halaman portofolio tes")
    public void penggunaHarusMelihatTanggalTesPadaHalamanPortofolioTes() {
        assertThat("test date is not visible", tesPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur jenis tes menjadi {string} pada halaman portofolio tes")
    public void penggunaMengaturJenisTesMenjadiPadaHalamanPortofolioTes(String type) {
        tesPage.setJenis(type);
    }

    @Dan("pengguna mengisi nama tes dengan {string} pada halaman portofolio tes")
    public void penggunaMengisiNamaTesDenganPadaHalamanPortofolioTes(String name) {
        switch (name) {
            case "namaAcak":
                name = "Tes " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(name);
        tesPage.fillNamaForm(name);
    }

    @Dan("pengguna mengisi nama penyelenggara dengan {string} pada halaman portofolio tes")
    public void penggunaMengisiNamaPenyelenggaraDenganPadaHalamanPortofolioTes(String name) {
        switch (name) {
            case "namaAcak":
                name = "Organizer " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        tesPage.fillNamaPenyelenggaraForm(name);
    }

    @Dan("pengguna mengisi tanggal tes dengan {string} pada halaman portofolio tes")
    public void penggunaMengisiTanggalTesDenganPadaHalamanPortofolioTes(String date) {
        tesPage.fillTanggalTesForm(date);
    }

    @Dan("pengguna mengisi skor dengan {string} pada halaman portofolio tes")
    public void penggunaMengisiSkorDenganPadaHalamanPortofolioTes(String score) {
        tesPage.fillSkorForm(score);
    }

    @Maka("pengguna harus melihat data dengan nama tes yang mengandung {string} pada halaman portofolio tes")
    public void penggunaHarusMelihatDataDenganNamaTesYangMengandungPadaHalamanPortofolioTes(String data) {
        assertThat("data is different with expected", tesPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan jenis tes {string} pada halaman portofolio tes")
    public void penggunaHarusMelihatDataDenganJenisTesPadaHalamanPortofolioTes(String data) {
        assertThat("data is different with expected", tesPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio tes")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioTes(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getNama();
                break;
            default:
                break;
        }
        tesPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio tes")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioTes() {
        assertThat("data is different with expected", tesPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getNama())));
    }
}
