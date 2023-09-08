package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PortofolioPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PortofolioSteps {

    @Autowired
    PortofolioPage portofolioPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat fitur ini pada halaman portofolio:")
    public void penggunaHarusMelihatFiturIniPadaHalamanPortofolio(List<String> features) {
        List<String> profileFeatures = new ArrayList<>(features);
        assertThat("feature is not visible",
                portofolioPage.getFeatureTitleAttribute(), equalTo(profileFeatures));
    }

    @Dan("pengguna mengeklik fitur {string} pada halaman portofolio")
    public void penggunaMengeklikFiturPadaHalamanPortofolio(String feature) {
        portofolioData.setNamaFitur(feature);
        portofolioPage.clickFeatureButton(feature);
    }

    @Maka("pengguna harus melihat data kosong pada halaman portofolio")
    public void penggunaHarusMelihatDataKosongPadaHalamanPortofolio() {
        assertThat("empty list is not visible", portofolioPage.isEmptyListVisible(), equalTo(true));
    }

    @Ketika("pengguna mengeklik tombol filter pada halaman portofolio")
    public void penggunaMengeklikTombolFilterPadaHalamanPortofolio() {
        portofolioPage.clickFilterButton();
    }

    @Dan("pengguna mengatur filter menjadi {string} pada halaman portofolio")
    public void penggunaMengaturFilterMenjadiPadaHalamanPortofolio(String filter) {
        portofolioPage.setFilter(filter);
    }

    @Ketika("pengguna mengeklik tombol tambah data pada halaman portofolio")
    public void penggunaMengeklikTombolTambahDataPadaHalamanPortofolio() {
        portofolioPage.clickTambahDataButton();
    }

    @Dan("pengguna mengeklik tombol simpan pada halaman portofolio")
    public void penggunaMengeklikTombolSimpanPadaHalamanPortofolio() {
        portofolioPage.clickSimpanButton();
    }

    @Maka("pengguna harus melihat notifikasi berhasil pada halaman portofolio")
    public void penggunaHarusMelihatNotifikasiBerhasilPadaHalamanPortofolio() {
        assertThat("success notification is not visible", portofolioPage.isSuccessNotificationVisible(),
                equalTo(true));
    }

    @Ketika("pengguna mengeklik tombol kembali pada halaman portofolio")
    public void penggunaMengeklikTombolKembaliPadaHalamanPortofolio() {
        portofolioPage.clickKembaliButton();
    }

    @Maka("pengguna harus melihat judul fitur pada halaman portofolio")
    public void penggunaHarusMelihatJudulFiturPadaHalamanPortofolio() {
        assertThat("feature title is different with expected", portofolioPage.getNamaFitur(),
                equalTo(portofolioData.getNamaFitur()));
    }

    @Maka("pengguna harus melihat nama halaman pada halaman portofolio")
    public void penggunaHarusMelihatNamaHalamanPadaHalamanPortofolio() {
        assertThat("nama halaman is not visible", portofolioPage.getNamaFitur().toLowerCase(),
                equalTo("portofolio"));
    }
}
