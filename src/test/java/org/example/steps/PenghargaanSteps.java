package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PenghargaanPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class PenghargaanSteps {

    @Autowired
    PenghargaanPage penghargaanPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama penghargaan pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatNamaPenghargaanPadaHalamanPortofolioPenghargaan() {
        assertThat("award name is not visible", penghargaanPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis penghargaan pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatJenisPenghargaanPadaHalamanPortofolioPenghargaan() {
        assertThat("award type is not visible", penghargaanPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tingkat penghargaan pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatTingkatPenghargaanPadaHalamanPortofolioPenghargaan() {
        assertThat("award scale is not visible", penghargaanPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal sk penghargaan pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatTanggalSkPenghargaanPadaHalamanPortofolioPenghargaan() {
        assertThat("award certificate date is not visible", penghargaanPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanPortofolioPenghargaan() {
        assertThat("verification status is not visible", penghargaanPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio penghargaan")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioPenghargaan(String category) {
        penghargaanPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengatur jenis penghargaan menjadi {string} pada halaman portofolio penghargaan")
    public void penggunaMengaturJenisPenghargaanMenjadiPadaHalamanPortofolioPenghargaan(String type) {
        penghargaanPage.setJenisPenghargaan(type);
    }

    @Dan("pengguna mengatur tingkat penghargaan menjadi {string} pada halaman portofolio penghargaan")
    public void penggunaMengaturTingkatPenghargaanMenjadiPadaHalamanPortofolioPenghargaan(String scale) {
        penghargaanPage.setTingkat(scale);
    }

    @Dan("pengguna mengisi nama penghargaan dengan {string} pada halaman portofolio penghargaan")
    public void penggunaMengisiNamaPenghargaanDenganPadaHalamanPortofolioPenghargaan(String nama) {
        switch (nama) {
            case "namaAcak":
                nama = "Penghargaan " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(nama);
        penghargaanPage.fillNamaForm(nama);
    }

    @Dan("pengguna mengisi tahun penghargaan dengan {string} pada halaman portofolio penghargaan")
    public void penggunaMengisiTahunPenghargaanDenganPadaHalamanPortofolioPenghargaan(String year) {
        penghargaanPage.fillTahunPenghargaanForm(year);
    }

    @Dan("pengguna mengisi instansi pemberi dengan {string} pada halaman portofolio penghargaan")
    public void penggunaMengisiInstansiPemberiDenganPadaHalamanPortofolioPenghargaan(String data) {
        penghargaanPage.fillInstansiPemberiForm(data);
    }

    @Maka("pengguna harus melihat data dengan nama penghargaan yang mengandung {string} pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatDataDenganNamaPenghargaanYangMengandungPadaHalamanPortofolioPenghargaan(String data) {
        assertThat("data is different with expected", penghargaanPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioPenghargaan(String data) {
        assertThat("data is different with expected", penghargaanPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioPenghargaanr() {
        assertThat("data is different with expected", penghargaanPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio penghargaan")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioPenghargaan(String data) {
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
        penghargaanPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio penghargaan")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioPenghargaan() {
        portofolioData.setNama(penghargaanPage.getFirstLinkColumnAttribute());
        penghargaanPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama penghargaan pada halaman detail portofolio penghargaan")
    public void penggunaHarusMelihatNamaPenghargaanPadaHalamanDetailPortofolioPenghargaan() {
        assertThat("judul is different with expected", penghargaanPage.getNamaPenghargaan(),
                (equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio penghargaan")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioPenghargaan() {
        penghargaanPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio penghargaan")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioPenghargaan() {
        penghargaanPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama penghargaan dengan {string} pada halaman portofolio penghargaan")
    public void penggunaMengeditNamaPenghargaanDenganPadaHalamanPortofolioPenghargaan(String nama) {
        switch (nama) {
            case "namaAcak":
                nama = "Penghargaan " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(nama);
        penghargaanPage.fillNamaForm(nama);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio penghargaan")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioPenghargaan() {
        assertThat("data is different with expected", penghargaanPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getEditData())));
    }
}
