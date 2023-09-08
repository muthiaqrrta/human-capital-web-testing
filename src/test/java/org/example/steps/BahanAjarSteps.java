package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.BahanAjarPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class BahanAjarSteps {

    @Autowired
    BahanAjarPage bahanAjarPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul bahan ajar pada halaman portofolio bahan ajar")
    public void penggunaHarusMelihatJudulBahanAjarPadaHalamanPortofolioBahanAjar() {
        assertThat("teaching material title is not visible", bahanAjarPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio bahan ajar")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioBahanAjar(String category) {
        bahanAjarPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengatur jenis bahan ajar menjadi {string} pada halaman portofolio bahan ajar")
    public void penggunaMengaturJenisBahanAjarMenjadiPadaHalamanPortofolioBahanAjar(String type) {
        bahanAjarPage.setJenis(type);
    }

    @Dan("pengguna mengisi judul bahan ajar dengan {string} pada halaman portofolio bahan ajar")
    public void penggunaMengisiJudulBahanAjarDenganPadaHalamanPortofolioBahanAjar(String title) {
        switch (title) {
            case "judulAcak":
                title = "Title " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(title);
        bahanAjarPage.fillJudulBukuForm(title);
    }

    @Dan("pengguna mengisi nama penerbit dengan {string} pada halaman portofolio bahan ajar")
    public void penggunaMengisiNamaPenerbitDenganPadaHalamanPortofolioBahanAjar(String name) {
        switch (name) {
            case "namaAcak":
                name = "Publisher " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        bahanAjarPage.fillNamaPenerbitForm(name);
    }

    @Dan("pengguna mengatur peran menjadi {string} pada halaman portofolio bahan ajar")
    public void penggunaMengaturPeranMenjadiPadaHalamanPortofolioBahanAjar(String role) {
        bahanAjarPage.setPeran(role);
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio bahan ajar")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioBahanAjar(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getJudul();
                break;
            default:
                break;
        }
        bahanAjarPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio bahan ajar")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioBahanAjar() {
        assertThat("data is different with expected", bahanAjarPage.getSecondColumnAttribute(),
                everyItem(equalTo(portofolioData.getJudul())));
    }

    @Dan("pengguna harus melihat data yang mengandung {string} pada halaman portofolio bahan ajar")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioBahanAjar(String data) {
        assertThat("data is different with expected", bahanAjarPage.getLinkColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan jenis bahan ajar {string} pada halaman portofolio bahan ajar")
    public void penggunaHarusMelihatDataDenganJenisBahanAjarPadaHalamanPortofolioBahanAjar(String data) {
        assertThat("data is different with expected", bahanAjarPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }
}
