package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.HakKekayaanIntelektualPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class HakKekayaanIntelektualSteps {

    @Autowired
    HakKekayaanIntelektualPage hakKekayaanIntelektualPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul pada halaman portofolio hak kekayaan intelektual")
    public void penggunaHarusMelihatJudulPadaHalamanPortofolioHakKekayaanIntelektual() {
        assertThat("intellectual property right is not visible", hakKekayaanIntelektualPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioHakKekayaanIntelektual(String category) {
        hakKekayaanIntelektualPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengisi judul dengan {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengisiJudulDenganPadaHalamanPortofolioHakKekayaanIntelektual(String title) {
        switch (title) {
            case "namaAcak":
                title = "Title " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(title);
        hakKekayaanIntelektualPage.fillJudulForm(title);
    }

    @Dan("pengguna mengatur peran menjadi {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengaturPeranMenjadiPadaHalamanPortofolioHakKekayaanIntelektual(String role) {
        hakKekayaanIntelektualPage.setPeran(role);
    }

    @Dan("pengguna mengatur jenis hki menjadi {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengaturJenisHkiMenjadiPadaHalamanPortofolioHakKekayaanIntelektual(String type) {
        hakKekayaanIntelektualPage.setJenisHKI(type);
    }

    @Dan("pengguna mengatur tanggal pendaftaran menjadi {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengaturTanggalPendaftaranMenjadiPadaHalamanPortofolioHakKekayaanIntelektual(String date) {
        hakKekayaanIntelektualPage.setTanggalDaftar(date);
    }

    @Dan("pengguna mengatur tingkat menjadi {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengaturTingkatMenjadiPadaHalamanPortofolioHakKekayaanIntelektual(String scale) {
        hakKekayaanIntelektualPage.setTingkatHKI(scale);
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioHakKekayaanIntelektual(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getJudul();
                break;
            case "dataYangDihapus":
                data = portofolioData.getJudul();
                break;
            case "dataYangDiedit":
                data = portofolioData.getJudul();
                break;
            case "dataHasilEdit":
                data = portofolioData.getEditData();
                break;
            default:
                break;
        }
        hakKekayaanIntelektualPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio hak kekayaan intelektual")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioHakKekayaanIntelektual() {
        assertThat("data is different with expected", hakKekayaanIntelektualPage.getSecondColumnAttribute(),
                everyItem(containsString(portofolioData.getJudul())));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioHakKekayaanIntelektual(String data) {
        assertThat("data is different with expected", hakKekayaanIntelektualPage.getLinkColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan jenis hki {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaHarusMelihatDataDenganJenisHkiPadaHalamanPortofolioHakKekayaanIntelektual(String data) {
        assertThat("data is different with expected", hakKekayaanIntelektualPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioHakKekayaanIntelektual() {
        portofolioData.setJudul(hakKekayaanIntelektualPage.getFirstLinkColumnAttribute());
        hakKekayaanIntelektualPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat judul pada halaman detail portofolio hak kekayaan intelektual")
    public void penggunaHarusMelihatJudulPadaHalamanDetailPortofolioHakKekayaanIntelektual() {
        assertThat("judul is different with expected", portofolioData.getJudul(),
                (containsString(hakKekayaanIntelektualPage.getJudulHKI())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio hak kekayaan intelektual")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioHakKekayaanIntelektual() {
        hakKekayaanIntelektualPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio hak kekayaan intelektual")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioHakKekayaanIntelektual() {
        hakKekayaanIntelektualPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit judul dengan {string} pada halaman portofolio hak kekayaan intelektual")
    public void penggunaMengeditJudulDenganPadaHalamanPortofolioHakKekayaanIntelektual(String title) {
        switch (title) {
            case "namaAcak":
                title = "Title " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(title);
        hakKekayaanIntelektualPage.fillJudulForm(title);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio hak kekayaan intelektual")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioHakKekayaanIntelektual() {
        assertThat("data is different with expected", hakKekayaanIntelektualPage.getSecondColumnAttribute(),
                everyItem(containsString(portofolioData.getEditData())));
    }
}
