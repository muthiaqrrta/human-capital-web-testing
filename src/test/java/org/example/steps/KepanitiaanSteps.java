package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.KepanitiaanPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class KepanitiaanSteps {

    @Autowired
    KepanitiaanPage kepanitiaanPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama kepanitiaan pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatNamaKepanitiaanPadaHalamanPortofolioKepanitiaan() {
        assertThat("committee name is not visible", kepanitiaanPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis kepanitiaan pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatJenisKepanitiaanPadaHalamanPortofolioKepanitiaan() {
        assertThat("committee type is not visible", kepanitiaanPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat nama instansi penyelenggara pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatNamaInstansiPenyelenggaraPadaHalamanPortofolioKepanitiaan() {
        assertThat("organizer name is not visible", kepanitiaanPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tmt sk penugasan pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatTmtSkPenugasanPadaHalamanPortofolioKepanitiaan() {
        assertThat("data is not visible", kepanitiaanPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tst sk penugasan pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatTstSkPenugasanPadaHalamanPortofolioKepanitiaan() {
        assertThat("data is not visible", kepanitiaanPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioKepanitiaan(String category) {
        kepanitiaanPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengisi nama kepanitiaan dengan {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengisiNamaKepanitiaanDenganPadaHalamanPortofolioKepanitiaan(String data) {
        switch (data) {
            case "namaAcak":
                data = "Committee " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(data);
        kepanitiaanPage.fillNamaForm(data);
    }

    @Dan("pengguna mengatur jenis kepanitiaan menjadi {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengaturJenisKepanitiaanMenjadiPadaHalamanPortofolioKepanitiaan(String type) {
        kepanitiaanPage.setJenis(type);
    }

    @Dan("pengguna mengisi nama instansi penyelenggara dengan {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengisiNamaInstansiPenyelenggaraDenganPadaHalamanPortofolioKepanitiaan(String name) {
        switch (name) {
            case "namaAcak":
                name = "Organizer " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        kepanitiaanPage.fillNamaPenyelenggaraForm(name);
    }

    @Dan("pengguna mengatur tingkat kepanitiaan menjadi {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengaturTingkatKepanitiaanMenjadiPadaHalamanPortofolioKepanitiaan(String scale) {
        kepanitiaanPage.setTingkatDropdown(scale);
    }

    @Dan("pengguna mengisi nomor sk penugasan dengan {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengisiNomorSkPenugasanDenganPadaHalamanPortofolioKepanitiaan(String data) {
        switch (data) {
            case "nomorAcak":
                data = String.valueOf(System.currentTimeMillis());
                break;
            default:
                break;
        }
        kepanitiaanPage.fillNoSKPenugasanForm(data);
    }

    @Dan("pengguna mengatur tmt sk penugasan menjadi {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengaturTmtSkPenugasanMenjadiPadaHalamanPortofolioKepanitiaan(String date) {
        kepanitiaanPage.fillTMTSKPenugasanForm(date);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioKepanitiaan() {
        assertThat("data is different with expected", kepanitiaanPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getNama())));
    }

    @Dan("pengguna harus melihat data dengan nama kepanitiaan yang mengandung {string} pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatDataDenganNamaKepanitiaanYangMengandungPadaHalamanPortofolioKepanitiaan(String data) {
        assertThat("data is different with expected", kepanitiaanPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioKepanitiaan(String type) {
        assertThat("data is different with expected", kepanitiaanPage.getSecondColumnAttribute(),
                everyItem(containsString(type)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio kepanitiaan")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioKepanitiaan(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getNama();
                break;
            case "dataYangDihapus":
                data = portofolioData.getNama();
                break;
            case "dataYangDiedit":
                data = portofolioData.getNama();
                break;
            case "dataHasilEdit":
                data = portofolioData.getEditData();
                break;
            default:
                break;
        }
        kepanitiaanPage.fillSearchFormAndHitEnter(data);
    }

    @Dan("pengguna mengatur filter menjadi {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengaturFilterMenjadiPadaHalamanPortofolioKepanitiaan(String filter) {
        kepanitiaanPage.setFilterKepanitiaan(filter);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio kepanitiaan")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioKepanitiaan() {
        portofolioData.setNama(kepanitiaanPage.getFirstLinkColumnAttribute());
        kepanitiaanPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama kepanitiaan pada halaman detail portofolio kepanitiaan")
    public void penggunaHarusMelihatNamaKepanitiaanPadaHalamanDetailPortofolioKepanitiaan() {
        assertThat("judul is different with expected", kepanitiaanPage.getNamaKepanitiaan(),
                (equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio kepanitiaan")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioKepanitiaan() {
        kepanitiaanPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio kepanitiaan")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioKepanitiaan() {
        kepanitiaanPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama kepanitiaan dengan {string} pada halaman portofolio kepanitiaan")
    public void penggunaMengeditNamaKepanitiaanDenganPadaHalamanPortofolioKepanitiaan(String data) {
        switch (data) {
            case "namaAcak":
                data = "Committee " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(data);
        kepanitiaanPage.fillNamaForm(data);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio kepanitiaan")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioKepanitiaan() {
        assertThat("data is different with expected", kepanitiaanPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getEditData())));
    }
}
