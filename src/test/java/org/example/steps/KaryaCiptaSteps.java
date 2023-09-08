package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.KaryaCiptaPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class KaryaCiptaSteps {

    @Autowired
    KaryaCiptaPage karyaCiptaPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatJudulPadaHalamanPortofolioKaryaCipta() {
        assertThat("copyright work title is not visible", karyaCiptaPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis karya cipta pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatJenisKaryaCiptaPadaHalamanPortofolioKaryaCipta() {
        assertThat("copyright work type is not visible", karyaCiptaPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat kategori karya cipta pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatKategoriKaryaCiptaPadaHalamanPortofolioKaryaCipta() {
        assertThat("copyright work category is not visible", karyaCiptaPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal rilis pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatTanggalRilisPadaHalamanPortofolioKaryaCipta() {
        assertThat("publication date is not visible", karyaCiptaPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat penyelenggara pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatPenyelenggaraPadaHalamanPortofolioKaryaCipta() {
        assertThat("organizer is not visible", karyaCiptaPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio karya cipta")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioKaryaCipta(String category) {
        karyaCiptaPage.setKategoriKegiatan(category);
    }

    @Dan("pengguna mengatur kategori karya cipta menjadi {string} pada halaman portofolio karya cipta")
    public void penggunaMengaturKategoriKaryaCiptaMenjadiPadaHalamanPortofolioKaryaCipta(String category) {
        karyaCiptaPage.setKategoriKaryaCipta(category);
    }

    @Dan("pengguna mengatur tingkat karyca cipta menjadi {string} pada halaman portofolio karya cipta")
    public void penggunaMengaturTingkatKaryaCiptaMenjadiPadaHalamanPortofolioKaryaCipta(String level) {
        karyaCiptaPage.setTingkat(level);
    }

    @Dan("pengguna mengisi judul dengan {string} pada halaman portofolio karya cipta")
    public void penggunaMengisiJudulDenganPadaHalamanPortofolioKaryaCipta(String title) {
        switch (title) {
            case "namaAcak":
                title = "Karya Cipta " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(title);
        karyaCiptaPage.fillJudulForm(title);
    }

    @Dan("pengguna mengatur tanggal rilis menjadi {string} pada halaman portofolio karya cipta")
    public void penggunaMengaturTanggalRilisMenjadiPadaHalamanPortofolioKaryaCipta(String date) {
        karyaCiptaPage.setTanggalRilis(date);
    }

    @Dan("pengguna mengatur filter untuk kategori karya cipta menjadi {string} pada halaman portofolio karya cipta")
    public void penggunaMengaturFilterUntukKategoriKaryaCiptaMenjadiPadaHalamanPortofolioKaryaCipta(String filter) {
        karyaCiptaPage.setKategoriKaryaCiptaFilter(filter);
        karyaCiptaPage.clickShowButton();
    }

    @Maka("pengguna harus melihat jenis karya cipta {string} pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatJenisKaryaCiptaPadaHalamanPortofolioKaryaCipta(String data) {
        assertThat("data is different with expected", karyaCiptaPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Dan("pengguna harus melihat data dengan judul yang mengandung {string} pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatDataDenganJudulYangMengandungPadaHalamanPortofolioKaryaCipta(String data) {
        assertThat("data is different with expected", karyaCiptaPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioKaryaCipta() {
        assertThat("data is different with expected", karyaCiptaPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getJudul())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio karya cipta")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioKaryaCipta(String data) {
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
        karyaCiptaPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio karya cipta")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioKaryaCipta() {
        portofolioData.setJudul(karyaCiptaPage.getFirstLinkColumnAttribute());
        karyaCiptaPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat judul karya cipta pada halaman detail portofolio karya cipta")
    public void penggunaHarusMelihatJudulKaryaCiptaPadaHalamanDetailPortofolioKaryaCipta() {
        assertThat("judul is different with expected", karyaCiptaPage.getJudulKaryaCipta(),
                (equalTo(portofolioData.getJudul())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio karya cipta")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioKaryaCipta() {
        karyaCiptaPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio karya cipta")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioKaryaCipta() {
        karyaCiptaPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit judul dengan {string} pada halaman portofolio karya cipta")
    public void penggunaMengeditJudulDenganPadaHalamanPortofolioKaryaCipta(String title) {
        switch (title) {
            case "namaAcak":
                title = "Karya Cipta " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(title);
        karyaCiptaPage.fillJudulForm(title);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio karya cipta")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioKaryaCipta() {
        assertThat("data is different with expected", karyaCiptaPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getEditData())));
    }

    @Dan("pengguna mengatur tanggal permohonan menjadi {string} pada halaman portofolio karya cipta")
    public void penggunaMengaturTanggalPermohonanMenjadiPadaHalamanPortofolioKaryaCipta(String tanggal) {
        karyaCiptaPage.setTanggalPermohonan(tanggal);
    }
}
