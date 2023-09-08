package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.SertifikasiPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class SertifikasiSteps {

    @Autowired
    SertifikasiPage sertifikasiPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama sertifikasi pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatNamaSertifikasiPadaHalamanPortofolioSertifikasi() {
        assertThat("certification name is not visible", sertifikasiPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat nomor peserta pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatNomorPesertaPadaHalamanPortofolioSertifikasi() {
        assertThat("data is not visible", sertifikasiPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis sertifikasi pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatJenisSertifikasiPadaHalamanPortofolioSertifikasi() {
        assertThat("certification type is not visible", sertifikasiPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat bidang studi pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatBidangStudiPadaHalamanPortofolioSertifikasi() {
        assertThat("data is not visible", sertifikasiPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat nomor sk sertifikasi pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatNomorSkSertifikasiPadaHalamanPortofolioSertifikasi() {
        assertThat("data is not visible", sertifikasiPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tahun sertifikasi pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatTahunSertifikasiPadaHalamanPortofolioSertifikasi() {
        assertThat("certification year is not visible", sertifikasiPage.isSixthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanPortofolioSertifikasi() {
        assertThat("verification status is not visible", sertifikasiPage.isSeventhColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio sertifikasi")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioSertifikasi(String category) {
        sertifikasiPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengatur jenis sertifikasi menjadi {string} pada halaman portofolio sertifikasi")
    public void penggunaMengaturJenisSertifikasiMenjadiPadaHalamanPortofolioSertifikasi(String type) {
        sertifikasiPage.setJenisSertifikasi(type);
    }

    @Dan("pengguna mengisi nama sertifikasi dengan {string} pada halaman portofolio sertifikasi")
    public void penggunaMengisiNamaSertifikasiDenganPadaHalamanPortofolioSertifikasi(String name) {
        switch (name) {
            case "namaAcak":
                name = "Sertif " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(name);
        sertifikasiPage.fillNamaForm(name);
    }

    @Dan("pengguna mengatur bidang studi menjadi {string} pada halaman portofolio sertifikasi")
    public void penggunaMengaturBidangStudiMenjadiPadaHalamanPortofolioSertifikasi(String data) {
        sertifikasiPage.setBidangStudi(data);
    }

    @Dan("pengguna mengisi tahun sertifikasi dengan {string} pada halaman portofolio sertifikasi")
    public void penggunaMengisiTahunSertifikasiDenganPadaHalamanPortofolioSertifikasi(String data) {
        sertifikasiPage.fillTahunSertifikasiForm(data);
    }

    @Dan("pengguna mengisi nomor sk sertifikasi dengan {string} pada halaman portofolio sertifikasi")
    public void penggunaMengisiNomorSkSertifikasiDenganPadaHalamanPortofolioSertifikasi(String data) {
        sertifikasiPage.fillNomorSKSertifikasiForm(data);
    }

    @Dan("pengguna mengisi tanggal sk sertifikasi dengan {string} pada halaman portofolio sertifikasi")
    public void penggunaMengisiTanggalSkSertifikasiDenganPadaHalamanPortofolioSertifikasi(String data) {
        sertifikasiPage.fillTanggalSKSertifikasiForm(data);
    }

    @Dan("pengguna harus melihat data dengan nama sertifikasi yang mengandung {string} pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatDataDenganNamaSertifikasiYangMengandungPadaHalamanPortofolioSertifikasi(String data) {
        assertThat("data is different with expected", sertifikasiPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioSertifikasi(String data) {
        assertThat("data is different with expected", sertifikasiPage.getThirdColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioSertifikasi() {
        assertThat("data is different with expected", sertifikasiPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio sertifikasi")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioSertifikasi(String data) {
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
        sertifikasiPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio sertifikasi")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioSertifikasi() {
        portofolioData.setNama(sertifikasiPage.getFirstLinkColumnAttribute());
        sertifikasiPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama sertifikasi pada halaman detail portofolio sertifikasi")
    public void penggunaHarusMelihatNamaSertifikasiPadaHalamanDetailPortofolioSertifikasi() {
        assertThat("judul is different with expected", sertifikasiPage.getNamaSertifikasi(),
                (equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio sertifikasi")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioSertifikasi() {
        sertifikasiPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio sertifikasi")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioSertifikasi() {
        sertifikasiPage.clickEditDataButton();
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio sertifikasi")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioSertifikasi() {
        assertThat("data is different with expected", sertifikasiPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getEditData())));
    }

    @Dan("pengguna mengedit nama sertifikasi dengan {string} pada halaman portofolio sertifikasi")
    public void penggunaMengeditNamaSertifikasiDenganPadaHalamanPortofolioSertifikasi(String name) {
        switch (name) {
            case "namaAcak":
                name = "Sertif " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(name);
        sertifikasiPage.fillNamaForm(name);
    }
}
