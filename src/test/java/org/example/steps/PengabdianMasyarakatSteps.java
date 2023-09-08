package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PengabdianMasyarakatPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class PengabdianMasyarakatSteps {

    @Autowired
    PengabdianMasyarakatPage pengabdianMasyarakatPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatJudulPadaHalamanPortofolioPengabdianMasyarakat() {
        assertThat("community service title is not visible", pengabdianMasyarakatPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tahun pelaksanaan pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatTahunPelaksanaanPadaHalamanPortofolioPengabdianMasyarakat() {
        assertThat("data is not visible", pengabdianMasyarakatPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal sk penugasan pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatTanggalSkPenugasanPadaHalamanPortofolioPengabdianMasyarakat() {
        assertThat("data is not visible", pengabdianMasyarakatPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat lokasi kegiatan pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatLokasiKegiatanPadaHalamanPortofolioPengabdianMasyarakat() {
        assertThat("activity location is not visible", pengabdianMasyarakatPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat lama kegiatan pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatLamaKegiatanPadaHalamanPortofolioPengabdianMasyarakat() {
        assertThat("activity duration is not visible", pengabdianMasyarakatPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioPengabdianMasyarakat(String category) {
        pengabdianMasyarakatPage.setKategori(category);
    }

    @Dan("pengguna mengisi judul dengan {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengisiJudulDenganPadaHalamanPortofolioPengabdianMasyarakat(String title) {
        switch (title) {
            case "randomTitle":
                title = "Pengmas " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(title);
        pengabdianMasyarakatPage.fillJudulForm(title);
    }

    @Dan("pengguna mengisi lama kegiatan dengan {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengisiLamaKegiatanDenganPadaHalamanPortofolioPengabdianMasyarakat(String days) {
        pengabdianMasyarakatPage.fillLamaKegiatanForm(days);
    }

    @Dan("pengguna mengisi tahun usulan dengan {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengisiTahunUsulanDenganPadaHalamanPortofolioPengabdianMasyarakat(String year) {
        pengabdianMasyarakatPage.fillTahunUsulanForm(year);
    }

    @Dan("pengguna mengisi tahun kegiatan dengan {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengisiTahunKegiatanPadaHalamanPortofolioPengabdianMasyarakat(String year) {
        pengabdianMasyarakatPage.fillTahunKegiatanForm(year);
    }

    @Dan("pengguna mengisi tahun pelaksanaan dengan {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengisiTahunPelaksanaanDenganPadaHalamanPortofolioPengabdianMasyarakat(String year) {
        pengabdianMasyarakatPage.fillTahunPelaksanaanForm(year);
    }

    @Dan("pengguna mengisi tahun pelaksanaan ke dengan {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaMengisiTahunPelaksaanKeDenganPadaHalamanPortofolioPengabdianMasyarakat(String number) {
        pengabdianMasyarakatPage.fillTahunPelaksanaanKeForm(number);
    }

    @Dan("pengguna harus melihat data dengan judul yang mengandung {string} pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatDataDenganJudulYangMengandungPadaHalamanPortofolioPengabdianMasyarakat(String data) {
        assertThat("data is different with expected", pengabdianMasyarakatPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio pengabdian masyarakat")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioPengabdianMasyarakat(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getJudul();
                break;
            default:
                break;
        }
        pengabdianMasyarakatPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pengabdian masyarakat")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioPengabdianMasyarakat() {
        assertThat("data is different with expected", pengabdianMasyarakatPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getJudul())));
    }
}
