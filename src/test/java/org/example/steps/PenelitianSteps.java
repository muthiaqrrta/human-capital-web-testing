package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PenelitianPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class PenelitianSteps {

    @Autowired
    PenelitianPage penelitianPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul pada halaman portofolio penelitian")
    public void penggunaHarusMelihatJudulPadaHalamanPortofolioPenelitian() {
        assertThat("research title is not visible", penelitianPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tahun pelaksanaan pada halaman portofolio penelitian")
    public void penggunaHarusMelihatTahunPelaksanaanPadaHalamanPortofolioPenelitian() {
        assertThat("research year is not visible", penelitianPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal sk penugasan pada halaman portofolio penelitian")
    public void penggunaHarusMelihatTanggalSkPenugasanPadaHalamanPortofolioPenelitian() {
        assertThat("assignment certificate date is not visible", penelitianPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat lokasi kegiatan pada halaman portofolio penelitian")
    public void penggunaHarusMelihatLokasiKegiatanPadaHalamanPortofolioPenelitian() {
        assertThat("activity location is not visible", penelitianPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat lama kegiatan pada halaman portofolio penelitian")
    public void penggunaHarusMelihatLamaKegiatanPadaHalamanPortofolioPenelitian() {
        assertThat("research duration is not visible", penelitianPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengisi judul dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengisiJudulDenganPadaHalamanPortofolioPenelitian(String title) {
        switch (title) {
            case "randomTitle":
                title = "Research " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(title);
        penelitianPage.fillJudulForm(title);
    }

    @Dan("pengguna mengisi lama kegiatan dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengisiLamaKegiatanDenganPadaHalamanPortofolioPenelitian(String days) {
        penelitianPage.fillLamaKegiatanForm(days);
    }

    @Dan("pengguna mengisi tahun usulan dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengisiTahunUsulanDenganPadaHalamanPortofolioPenelitian(String year) {
        penelitianPage.fillTahunUsulanForm(year);
    }

    @Dan("pengguna mengisi tahun kegiatan dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengisiTahunKegiatanDenganPadaHalamanPortofolioPenelitian(String year) {
        penelitianPage.fillTahunKegiatanForm(year);
    }

    @Dan("pengguna mengisi tahun pelaksanaan dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengisiTahunPelaksanaanDenganPadaHalamanPortofolioPenelitian(String year) {
        penelitianPage.fillTahunPelaksanaanForm(year);
    }

    @Dan("pengguna mengisi tahun pelaksanaan ke dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengisiTahunPelaksanaanKeDenganPadaHalamanPortofolioPenelitian(String number) {
        penelitianPage.fillTahunPelaksanaanKeForm(number);
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio penelitian")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioPenelitian(String data) {
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
        penelitianPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio penelitian")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioPenelitian() {
        assertThat("data is different with expected", penelitianPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getJudul())));
    }

    @Dan("pengguna harus melihat data dengan judul yang mengandung {string} pada halaman portofolio penelitian")
    public void penggunaHarusMelihatDataDenganJudulYangMengandungPadaHalamanPortofolioPenelitian(String data) {
        assertThat("data is different with expected", penelitianPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio penelitian")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioPenelitian() {
        portofolioData.setJudul(penelitianPage.getFirstLinkColumnAttribute());
        penelitianPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat judul penelitian pada halaman detail portofolio penelitian")
    public void penggunaHarusMelihatJudulPenelitianPadaHalamanDetailPortofolioPenelitian() {
        assertThat("judul is different with expected", penelitianPage.getJudulPenelitian(),
                (equalTo(portofolioData.getJudul())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio penelitian")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioPenelitian() {
        penelitianPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio penelitian")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioPenelitian() {
        penelitianPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit judul dengan {string} pada halaman portofolio penelitian")
    public void penggunaMengeditJudulDenganPadaHalamanPortofolioPenelitian(String title) {
        switch (title) {
            case "randomTitle":
                title = "Research " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(title);
        penelitianPage.fillJudulForm(title);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio penelitian")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioPenelitian() {
        assertThat("data is different with expected", penelitianPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getEditData())));
    }
}
