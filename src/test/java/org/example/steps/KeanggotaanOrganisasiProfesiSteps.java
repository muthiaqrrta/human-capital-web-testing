package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.KeanggotaanOrganisasiProfesiPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class KeanggotaanOrganisasiProfesiSteps {

    @Autowired
    KeanggotaanOrganisasiProfesiPage keanggotaanOrganisasiProfesiPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama organisasi pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatNamaOrganisasiPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("organization name is not visible", keanggotaanOrganisasiProfesiPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat peran pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatPeranPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("role is not visible", keanggotaanOrganisasiProfesiPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat masa keanggotaan pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatMasaKeanggotaanPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("membership period is not visible", keanggotaanOrganisasiProfesiPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat instansi profesi pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatInstansiProfesiPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("instance is not visible", keanggotaanOrganisasiProfesiPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String activityCategory) {
        keanggotaanOrganisasiProfesiPage.setKategoriKegiatan(activityCategory);
    }

    @Dan("pengguna mengisi nama organisasi dengan {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengisiNamaOrganisasiDenganPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String name) {
        switch (name) {
            case "namaAcak":
                name = "Organisasi " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(name);
        keanggotaanOrganisasiProfesiPage.fillNamaForm(name);
    }

    @Dan("pengguna mengatur tingkat menjadi {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengaturTingkatMenjadiPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String scale) {
        keanggotaanOrganisasiProfesiPage.setTingkatDropdown(scale);
    }

    @Dan("pengguna mengisi peran dengan {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengisiPeranDenganPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String role) {
        switch (role) {
            case "randomRole":
                role = "Role " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        keanggotaanOrganisasiProfesiPage.fillPeranOrganisasiForm(role);
    }

    @Dan("pengguna mengatur jenis peran menjadi {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengaturJenisPeranMenjadiPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String roleType) {
        keanggotaanOrganisasiProfesiPage.setJenisPeranOrganisasi(roleType);
    }

    @Dan("pengguna mengatur tanggal mulai masa anggota menjadi {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengaturTanggalMulaiMasaAnggotaMenjadiPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String date) {
        keanggotaanOrganisasiProfesiPage.setTanggalMulai(date);
    }

    @Maka("pengguna harus melihat data dengan nama organisasi yang mengandung {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatDataDenganNamaOrganisasiYangMengandungPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String data) {
        assertThat("data is different with expected", keanggotaanOrganisasiProfesiPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String data) {
        assertThat("data is different with expected", keanggotaanOrganisasiProfesiPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Dan("pengguna mencari {string} dan menekan enter pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String data) {
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
        keanggotaanOrganisasiProfesiPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("data is different with expected", keanggotaanOrganisasiProfesiPage.getFirstColumnAttribute(),
                everyItem(containsString(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        portofolioData.setNama(keanggotaanOrganisasiProfesiPage.getFirstLinkColumnAttribute());
        keanggotaanOrganisasiProfesiPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama organisasi pada halaman detail portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatNamaOrganisasiPadaHalamanDetailPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("nama is different with expected", keanggotaanOrganisasiProfesiPage.getNamaOrganisasi(),
                (equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio keanggotaan organisasi profesi")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioKeanggotaanOrganisasiProfesi() {
        keanggotaanOrganisasiProfesiPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio keanggotaan organisasi profesi")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioKeanggotaanOrganisasiProfesi() {
        keanggotaanOrganisasiProfesiPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama organisasi dengan {string} pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaMengeditNamaOrganisasiDenganPadaHalamanPortofolioKeanggotaanOrganisasiProfesi(String name) {
        switch (name) {
            case "namaAcak":
                name = "Organisasi " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(name);
        keanggotaanOrganisasiProfesiPage.fillNamaForm(name);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio keanggotaan organisasi profesi")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioKeanggotaanOrganisasiProfesi() {
        assertThat("data is different with expected", keanggotaanOrganisasiProfesiPage.getFirstColumnAttribute(),
                everyItem(containsString(portofolioData.getEditData())));
    }
}
