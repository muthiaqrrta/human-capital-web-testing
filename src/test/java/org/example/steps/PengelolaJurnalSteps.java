package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PengelolaJurnalPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class PengelolaJurnalSteps {

    @Autowired
    PengelolaJurnalPage pengelolaJurnalPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama jurnal pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatNamaJurnalPadaHalamanPortofolioPengelolaJurnal() {
        assertThat("journal name is not visible", pengelolaJurnalPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tingkat pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatTingkatPadaHalamanPortofolioPengelolaJurnal() {
        assertThat("journal level is not visible", pengelolaJurnalPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat media publikasi pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatMediaPublikasiPadaHalamanPortofolioPengelolaJurnal() {
        assertThat("publication media is not visible", pengelolaJurnalPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tmt tst sk penugasan pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatTmtTstSkPenugasanPadaHalamanPortofolioPengelolaJurnal() {
        assertThat("data is not visible", pengelolaJurnalPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status aktif pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatStatusAktifPadaHalamanPortofolioPengelolaJurnal() {
        assertThat("active status is not visible", pengelolaJurnalPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioPengelolaJurnal(String category) {
        pengelolaJurnalPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengisi nama jurnal dengan {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengisiNamaJurnalDenganPadaHalamanPortofolioPengelolaJurnal(String name) {
        switch (name) {
            case "namaAcak":
                name = "Jurnal " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(name);
        pengelolaJurnalPage.fillNamaForm(name);
    }

    @Dan("pengguna mengatur media publikasi menjadi {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengaturMediaPublikasiMenjadiPadaHalamanPortofolioPengelolaJurnal(String data) {
        pengelolaJurnalPage.setMediaPublikasi(data);
    }

    @Dan("pengguna mengatur tingkat menjadi {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengaturTingkatMenjadiPadaHalamanPortofolioPengelolaJurnal(String scale) {
        pengelolaJurnalPage.setTingkatDropdown(scale);
    }

    @Dan("pengguna mengatur peran menjadi {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengaturPeranMenjadiPadaHalamanPortofolioPengelolaJurnal(String role) {
        pengelolaJurnalPage.setPeran(role);
    }

    @Dan("pengguna mengisi nomor sk penugasan dengan {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengisiNomorSkPenugasanDenganPadaHalamanPortofolioPengelolaJurnal(String number) {
        switch (number) {
            case "nomorAcak":
                number = String.valueOf(System.currentTimeMillis());
                break;
            default:
                break;
        }
        pengelolaJurnalPage.fillNomorSKPenugasanForm(number);
    }

    @Dan("pengguna mengatur tmt sk penugasan menjadi {string} pada halaman portofolio pengelola jurnal")
    public void penggunaMengaturTmtSkPenugasanMenjadiPadaHalamanPortofolioPengelolaJurnal(String date) {
        pengelolaJurnalPage.fillTMTPenugasanForm(date);
    }

    @Dan("pengguna memilih {string} untuk opsi status aktif pada halaman portofolio pengelola jurnal")
    public void penggunaMemilihUntukOpsiStatusAktifPadaHalamanPortofolioPengelolaJurnal(String option) {
        switch (option) {
            case "ya":
                pengelolaJurnalPage.selectYesOption();
                break;
            case "tidak":
                pengelolaJurnalPage.selectNoOption();
                break;
        }
    }

    @Dan("pengguna harus melihat data dengan nama jurnal yang mengandung {string} pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatDataDenganNamaJurnalYangMengandungPadaHalamanPortofolioPengelolaJurnal(String data) {
        assertThat("data is different with expected", pengelolaJurnalPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan peran {string} pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatDataDenganPeranPadaHalamanPortofolioPengelolaJurnal(String data) {
        assertThat("data is different with expected", pengelolaJurnalPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio pengelola jurnal")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioPengelolaJurnal(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getNama();
                break;
            default:
                break;
        }
        pengelolaJurnalPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pengelola jurnal")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioPengelolaJurnal() {
        assertThat("data is different with expected", pengelolaJurnalPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getNama())));
    }
}
