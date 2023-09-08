package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.VisitingScientistPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class VisitingScientistSteps {

    @Autowired
    VisitingScientistPage visitingScientistPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat aktivitas litabmas pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatAktivitasLitabmasPadaHalamanPortofolioVisitingScientist() {
        assertThat("data is not visible", visitingScientistPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat pt pengundang pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatPtPengundangPadaHalamanPortofolioVisitingScientist() {
        assertThat("data is not visible", visitingScientistPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat lama kegiatan pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatLamaKegiatanPadaHalamanPortofolioVisitingScientist() {
        assertThat("data is not visible", visitingScientistPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal pelaksanaan pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatTanggalPelaksanaanPadaHalamanPortofolioVisitingScientist() {
        assertThat("data is not visible", visitingScientistPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat nomor sk penugasan pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatNomorSkPenugasanPadaHalamanPortofolioVisitingScientist() {
        assertThat("data is not visible", visitingScientistPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio visiting scientist")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioVisitingScientist(String category) {
        visitingScientistPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengatur aktivitas litabmas menjadi {string} pada halaman portofolio visiting scientist")
    public void penggunaMengaturAktivitasLitabmasMenjadiPadaHalamanPortofolioVisitingScientist(String data) {
        portofolioData.setAktivitasLitabmas(data);
        visitingScientistPage.setAktivitasLitabmas(data);
    }

    @Dan("pengguna mengatur pt pengundang menjadi {string} pada halaman portofolio visiting scientist")
    public void penggunaMengaturPtPengundangMenjadiPadaHalamanPortofolioVisitingScientist(String data) {
        visitingScientistPage.setPengundang(data);
    }

    @Dan("pengguna mengisi lama kegiatan dengan {string} pada halaman portofolio visiting scientist")
    public void penggunaMengisiLamaKegiatanDenganPadaHalamanPortofolioVisitingScientist(String days) {
        visitingScientistPage.fillLamaKegiatanForm(days);
    }

    @Dan("pengguna mengisi kegiatan penting dengan {string} pada halaman portofolio visiting scientist")
    public void penggunaMengisiKegiatanPentingDenganPadaHalamanPortofolioVisitingScientist(String data) {
        visitingScientistPage.fillKegiatanPentingForm(data);
    }

    @Dan("pengguna mengisi tanggal pelaksanaan dengan {string} pada halaman portofolio visiting scientist")
    public void penggunaMengisiTanggalPelaksanaanDenganPadaHalamanPortofolioVisitingScientist(String date) {
        visitingScientistPage.setTanggalPelaksanaan(date);
    }

    @Dan("pengguna mengisi nomor sk penugasan dengan {string} pada halaman portofolio visiting scientist")
    public void penggunaMengisiNomorSkPenugasanDenganPadaHalamanPortofolioVisitingScientist(String data) {
        switch (data) {
            case "nomorAcak":
                data = String.valueOf(System.currentTimeMillis());
                break;
            default:
                break;
        }
        visitingScientistPage.fillNoSKTugasForm(data);
    }

    @Dan("pengguna mengisi tanggal sk penugasan dengan {string} pada halaman portofolio visiting scientist")
    public void penggunaMengisiTanggalSkPenugasanDenganPadaHalamanPortofolioVisitingScientist(String data) {
        visitingScientistPage.fillTanggalSKTugasForm(data);
    }

    @Maka("pengguna harus melihat data dengan aktivitas litabmas yang mengandung {string} pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatDataDenganAKtivitasLitabmasYangMengandungPadaHalamanPortofolioVisitingScientist(String data) {
        assertThat("data is different with expected", visitingScientistPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio visiting scientist")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioVisitingScientist(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getAktivitasLitabmas();
                break;
            default:
                break;
        }
        visitingScientistPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio visiting scientist")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioVisitingScientist() {
        assertThat("data is different with expected", visitingScientistPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getAktivitasLitabmas())));
    }
}
