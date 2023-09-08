package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PengembanganDiriPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class PengembanganDiriSteps {

    @Autowired
    PengembanganDiriPage pengembanganDiriPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama pengembangan diri pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatNamaPengembanganDiriPadaHalamanPortofolioPengembanganDiri() {
        assertThat("self development name is not visible", pengembanganDiriPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis pengembangan diri pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatJenisPengembanganDiriPadaHalamanPortofolioPengembanganDiri() {
        assertThat("self development type is not visible", pengembanganDiriPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat nama penyelenggara pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatNamaPenyelenggaraPadaHalamanPortofolioPengembanganDiri() {
        assertThat("organizer name is not visible", pengembanganDiriPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal pelaksanaan pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatTanggalPelaksanaanPadaHalamanPortofolioPengembanganDiri() {
        assertThat("date is not visible", pengembanganDiriPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanPortofolioPengembanganDiri() {
        assertThat("verification status is not visible", pengembanganDiriPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioPengembanganDiri(String caegory) {
        pengembanganDiriPage.setKategoriKegiatan(caegory);
    }

    @Dan("pengguna mengatur jenis pengembangan diri menjadi {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengaturJenisPengembanganDiriMenjadiPadaHalamanPortofolioPengembanganDiri(String type) {
        pengembanganDiriPage.setJenis(type);
    }

    @Dan("pengguna mengisi nama pengembangan diri dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengisiNamaPengembanganDiriDenganPadaHalamanPortofolioPengembanganDiri(String name) {
        switch (name) {
            case "namaAcak":
                name = "Pengembangan diri " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(name);
        pengembanganDiriPage.fillNamaForm(name);
    }

    @Dan("pengguna mengisi nama penyelenggara dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengisiNamaPenyelenggaraDenganPadaHalamanPortofolioPengembanganDiri(String name) {
        switch (name) {
            case "namaAcak":
                name = "Organizer " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        pengembanganDiriPage.fillNamaPenyelenggaraForm(name);
    }

    @Dan("pengguna mengatur tingkat menjadi {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengaturTingkatMenjadiPadaHalamanPortofolioPengembanganDiri(String scale) {
        pengembanganDiriPage.setTingkatDropdown(scale);
    }

    @Dan("pengguna mengisi tahun dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengisiTahunDenganPadaHalamanPortofolioPengembanganDiri(String year) {
        pengembanganDiriPage.fillTahunForm(year);
    }

    @Dan("pengguna mengisi tanggal mulai dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengisiTanggalMulaiDenganPadaHalamanPortofolioPengembanganDiri(String date) {
        pengembanganDiriPage.setTanggalMulai(date);
    }

    @Dan("pengguna mengisi tanggal selesai dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengisiTanggalSelesaiDenganPadaHalamanPortofolioPengembanganDiri(String date) {
        pengembanganDiriPage.setTanggalSelesai(date);
    }

    @Dan("pengguna mengisi durasi jam dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengisiDurasiJamDenganPadaHalamanPortofolioPengembanganDiri(String duration) {
        pengembanganDiriPage.fillDurasiJamForm(duration);
    }

    @Dan("pengguna harus melihat data dengan nama pengembangan diri yang mengandung {string} pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatDataDenganNamaPengembanganDiriYangMengandungPadaHalamanPortofolioPengembanganDiri(String data) {
        assertThat("data is different with expected", pengembanganDiriPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioPengembanganDiri(String data) {
        assertThat("data is different with expected", pengembanganDiriPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioPengembanganDiri() {
        assertThat("data is different with expected", pengembanganDiriPage.getFirstColumnAttribute(),
                everyItem(containsString(portofolioData.getNama())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio pengembangan diri")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioPengembanganDiri(String data) {
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
        pengembanganDiriPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio pengembangan diri")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioPengembanganDiri() {
        portofolioData.setNama(pengembanganDiriPage.getFirstLinkColumnAttribute());
        pengembanganDiriPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama pengembangan diri pada halaman detail portofolio pengembangan diri")
    public void penggunaHarusMelihatNamaPengembanganDiriPadaHalamanDetailPortofolioPengembanganDiri() {
        assertThat("judul is different with expected", pengembanganDiriPage.getJudulPengembanganDiri(),
                (equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio pengembangan diri")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioPengembanganDiri() {
        pengembanganDiriPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio pengembangan diri")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioPengembanganDiri() {
        pengembanganDiriPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama pengembangan diri dengan {string} pada halaman portofolio pengembangan diri")
    public void penggunaMengeditNamaPengembanganDiriDenganPadaHalamanPortofolioPengembanganDiri(String name) {
        switch (name) {
            case "namaAcak":
                name = "Pengembangan diri " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(name);
        pengembanganDiriPage.fillNamaForm(name);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio pengembangan diri")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioPengembanganDiri() {
        assertThat("data is different with expected", pengembanganDiriPage.getFirstColumnAttribute(),
                everyItem(containsString(portofolioData.getEditData())));
    }
}
