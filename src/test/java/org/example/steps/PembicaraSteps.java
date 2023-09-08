package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.PembicaraPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class PembicaraSteps {

    @Autowired
    PembicaraPage pembicaraPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul makalah pada halaman portofolio pembicara")
    public void penggunaHarusMelihatJudulMakalahPadaHalamanPortofolioPembicara() {
        assertThat("paper title is not visible", pembicaraPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat nama pertemuan ilmiah pada halaman portofolio pembicara")
    public void penggunaHarusMelihatNamaPertemuanIlmiahPadaHalamanPortofolioPembicara() {
        assertThat("meeting name is not visible", pembicaraPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat kategori pembicara pada halaman portofolio pembicara")
    public void penggunaHarusMelihatKategoriPembicaraPadaHalamanPortofolioPembicara() {
        assertThat("speaker category is not visible", pembicaraPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tingkat pertemuan pada halaman portofolio pembicara")
    public void penggunaHarusMelihatTingkatPertemuanPadaHalamanPortofolioPembicara() {
        assertThat("meeting level is not visible", pembicaraPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal pelaksanaan pada halaman portofolio pembicara")
    public void penggunaHarusMelihatTanggalPelaksanaanPadaHalamanPortofolioPembicara() {
        assertThat("date is not visible", pembicaraPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioPembicara(String category) {
        pembicaraPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengisi judul makalah dengan {string} pada halaman portofolio pembicara")
    public void penggunaMengisiJudulMakalahDenganPadaHalamanPortofolioPembicara(String title) {
        switch (title) {
            case "judulAcak":
                title = "Title " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(title);
        pembicaraPage.fillJudulForm(title);
    }

    @Dan("pengguna mengisi nama pertemuan ilmiah dengan {string} pada halaman portofolio pembicara")
    public void penggunaMengisiNamaPertemuanIlmiahDenganPadaHalamanPortofolioPembicara(String name) {
        switch (name) {
            case "namaAcak":
                name = "Meeting " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        pembicaraPage.fillNamaForm(name);
    }

    @Dan("pengguna mengatur kategori pembicara menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturKategoriPembicaraMenjadiPadaHalamanPortofolioPembicara(String category) {
        pembicaraPage.setKategori(category);
    }

    @Dan("pengguna mengatur jenis pembicara menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturJenisPembicaraMenjadiPadaHalamanPortofolioPembicara(String type) {
        pembicaraPage.setJenis(type);
    }

    @Dan("pengguna mengisi penyelenggara dengan {string} pada halaman portofolio pembicara")
    public void penggunaMengisiPenyelenggaraDenganPadaHalamanPortofolioPembicara(String name) {
        pembicaraPage.fillNamaPenyelenggaraForm(name);
    }

    @Dan("pengguna mengatur tanggal pelaksanaan menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturTanggalPelaksanaanMenjadiPadaHalamanPortofolioPembicara(String date) {
        pembicaraPage.setTanggalPelaksanaan(date);
    }

    @Dan("pengguna mengatur tanggal mulai menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturTanggalMulaiMenjadiPadaHalamanPortofolioPembicara(String date) {
        pembicaraPage.setTanggalMulai(date);
    }

    @Dan("pengguna mengatur tanggal selesai menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturTanggalSelesaiPadaHalamanPortofolioPembicara(String date) {
        pembicaraPage.setTanggalSelesai(date);
    }

    @Dan("pengguna mengatur tingkat pertemuan menjadi {string} pada halaman portofolio pembicara")
    public void penggunaMengaturTingkatPertemuanMenjadiPadaHalamanPortofolioPembicara(String level) {
        pembicaraPage.setTingkatPertemuan(level);
    }

    @Dan("pengguna memilih {string} untuk opsi insidentil pada halaman portofolio pembicara")
    public void penggunaMemilihUntukOpsiInsidentilPadaHalamanPortofolioPembicara(String option) {
        switch (option) {
            case "ya":
                pembicaraPage.selectYesOption();
                break;
            case "tidak":
                pembicaraPage.selectNoOption();
                break;
        }
    }

    @Maka("pengguna harus melihat data dengan judul makalah yang mengandung {string} pada halaman portofolio pembicara")
    public void penggunaHarusMelihatDataDenganJudulMakalahYangMengandungPadaHalamanPortofolioPembicara(String data) {
        assertThat("data is different with expected", pembicaraPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan tingkat pertemuan {string} pada halaman portofolio pembicara")
    public void penggunaHarusMelihatDataDenganTingkatPertemuanPadaHalamanPortofolioPembicara(String filter) {
        assertThat("data is different with expected", pembicaraPage.getFourthColumnAttribute(),
                everyItem(containsString(filter)));
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pembicara")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioPembicara() {
        assertThat("data is different with expected", pembicaraPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getJudul())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio pembicara")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioPembicara(String data) {
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
        pembicaraPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio pembicara")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioPembicara() {
        portofolioData.setJudul(pembicaraPage.getFirstLinkColumnAttribute());
        pembicaraPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat judul pembicara pada halaman detail portofolio pembicara")
    public void penggunaHarusMelihatJudulPembicaraPadaHalamanDetailPortofolioPembicara() {
        assertThat("judul is different with expected", pembicaraPage.getJudulPembicara(),
                (equalTo(portofolioData.getJudul())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio pembicara")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioPembicara() {
        pembicaraPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio pembicara")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioPembicara() {
        pembicaraPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit judul makalah dengan {string} pada halaman portofolio pembicara")
    public void penggunaMengeditJudulMakalahDenganPadaHalamanPortofolioPembicara(String title) {
        switch (title) {
            case "judulAcak":
                title = "Title " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(title);
        pembicaraPage.fillJudulForm(title);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio pembicara")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioPembicara() {
        assertThat("data is different with expected", pembicaraPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getEditData())));
    }
}
