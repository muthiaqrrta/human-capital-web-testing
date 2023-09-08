package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.RiwayatPekerjaanPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class RiwayatPekerjaanSteps {

    @Autowired
    RiwayatPekerjaanPage riwayatPekerjaanPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama jabatan pekerjaan pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatNamaJabatanPekerjaanPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("job title is not visible", riwayatPekerjaanPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat instansi pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatInstansiPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("instance name is not visible", riwayatPekerjaanPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis pekerjaan pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatJenisPekerjaanPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("job type is not visible", riwayatPekerjaanPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal mulai pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatTanggalMulaiPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("start date is not visible", riwayatPekerjaanPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal selesai pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatTanggalSelesaiPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("end date is not visible", riwayatPekerjaanPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("verification status is not visible", riwayatPekerjaanPage.isSixthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur jenis pekerjaan menjadi {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengaturJenisPekerjaanMenjadiPadaHalamanPortofolioRiwayatPekerjaan(String type) {
        riwayatPekerjaanPage.setJenisPekerjaan(type);
    }

    @Dan("pengguna mengatur jenis instansi menjadi {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengaturJenisInstansiMenjadiPadaHalamanPortofolioRiwayatPekerjaan(String type) {
        riwayatPekerjaanPage.setJenisInstansi(type);
    }

    @Dan("pengguna mengisi nama jabatan pekerjaan dengan {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengisiNamaJabatanPekerjaanDenganPadaHalamanPortofolioRiwayatPekerjaan(String title) {
        switch (title) {
            case "namaAcak":
                title = "Developer " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setNama(title);
        riwayatPekerjaanPage.fillNamaForm(title);
    }

    @Dan("pengguna mengatur nama kbli menjadi {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengaturNamaKbliMenjadiPadaHalamanPortofolioRiwayatPekerjaan(String name) {
        riwayatPekerjaanPage.setKBLIName(name);
    }

    @Dan("pengguna mengisi instansi dengan {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengisiInstansiDenganPadaHalamanPortofolioRiwayatPekerjaan(String data) {
        riwayatPekerjaanPage.fillInstansiForm(data);
    }

    @Dan("pengguna mengisi tanggal mulai dengan {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengisiTanggalMulaiDenganPadaHalamanPortofolioRiwayatPekerjaan(String date) {
        riwayatPekerjaanPage.fillTanggalMulaiBekerjaForm(date);
    }

    @Dan("pengguna memilih {string} untuk opsi luar negeri pada halaman portofolio riwayat pekerjaan")
    public void penggunaMemilihUntukOpsiLuarNegeriPadaHalamanPortofolioRiwayatPekerjaan(String option) {
        switch (option) {
            case "ya":
                riwayatPekerjaanPage.selectYesOption();
                break;
            case "tidak":
                riwayatPekerjaanPage.selectNoOption();
                break;
        }
    }

    @Dan("pengguna memilih {string} untuk opsi pendiri perusahaan pada halaman portofolio riwayat pekerjaan")
    public void penggunaMemilihUntukOpsiPendiriPerusahaanPadaHalamanPortofolioRiwayatPekerjaan(String option) {
        switch (option) {
            case "ya":
                riwayatPekerjaanPage.selectOwnerYesOption();
                break;
            case "tidak":
                riwayatPekerjaanPage.selectOwnerNoOption();
                break;
        }
    }

    @Dan("pengguna harus melihat data dengan nama jabatan pekerjaan yang mengandung {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatDataDenganNamaJabatanPekerjaanYangMengandungPadaHalamanPortofolioRiwayatPekerjaan(String data) {
        assertThat("data is different with expected", riwayatPekerjaanPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang mengandung {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatDataYangMengandungPadaHalamanPortofolioRiwayatPekerjaan(String data) {
        assertThat("data is different with expected", riwayatPekerjaanPage.getThirdColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio riwayat pekerjaan")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioRiwayatPekerjaan(String data) {
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
        riwayatPekerjaanPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("data is different with expected", riwayatPekerjaanPage.getFirstColumnAttribute(),
                everyItem(containsString(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioRiwayatPekerjaan() {
        portofolioData.setNama(riwayatPekerjaanPage.getFirstLinkColumnAttribute());
        riwayatPekerjaanPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama jabatan pekerjaan pada halaman detail portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatNamaJabatanPekerjaanPadaHalamanDetailPortofolioRiwayatPekerjaan() {
        assertThat("judul is different with expected", riwayatPekerjaanPage.getNamaJabatanPekerjaan(),
                (equalTo(portofolioData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio riwayat pekerjaan")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioRiwayatPekerjaan() {
        riwayatPekerjaanPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio riwayat pekerjaan")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioRiwayatPekerjaan() {
        riwayatPekerjaanPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama jabatan pekerjaan dengan {string} pada halaman portofolio riwayat pekerjaan")
    public void penggunaMengeditNamaJabatanPekerjaanDenganPadaHalamanPortofolioRiwayatPekerjaan(String title) {
        switch (title) {
            case "namaAcak":
                title = "Developer " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(title);
        riwayatPekerjaanPage.fillNamaForm(title);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio riwayat pekerjaan")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioRiwayatPekerjaan() {
        assertThat("data is different with expected", riwayatPekerjaanPage.getFirstColumnAttribute(),
                everyItem(containsString(portofolioData.getEditData())));
    }
}
