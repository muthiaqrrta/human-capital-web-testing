package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.KaryaIlmiahPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class KaryaIlmiahSteps {

    @Autowired
    KaryaIlmiahPage karyaIlmiahPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul pada halaman portofolio karya ilmiah")
    public void penggunaHarusMelihatJudulPadaHalamanPortofolioKaryaIlmiah() {
        assertThat("judul karya ilmiah is not visible", karyaIlmiahPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Maka("pengguna harus melihat data dengan judul yang mengandung {string} pada halaman portofolio karya ilmiah")
    public void penggunaHarusMelihatDataDenganJudulYangMengandungPadaHalamanPortofolioKaryaIlmiah(String data) {
        assertThat("data is different with expected", karyaIlmiahPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Dan("pengguna mengatur filter untuk jenis karya ilmiah menjadi {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturFilterUntukJenisKaryaIlmiahMenjadiPadaHalamanPortofolioKaryaIlmiah(String filter) {
        karyaIlmiahPage.setJenisKaryaIlmiahFilter(filter);
        karyaIlmiahPage.clickShowButton();
    }

    @Maka("pengguna harus melihat jenis karya ilmiah {string} pada halaman portofolio karya ilmiah")
    public void penggunaHarusMelihatJenisKaryaIlmiahPadaHalamanPortofolioKaryaIlmiah(String data) {
        assertThat("data is different with expected", karyaIlmiahPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Dan("pengguna mencari judul karya ilmiah {string} pada halaman portofolio karya ilmiah")
    public void penggunaMencariJudulKaryaIlmiahPadaHalamanPortofolioKaryaIlmiah(String judul) {
        portofolioData.setJudul(judul);
        karyaIlmiahPage.mencariJudulKaryaIlmiah(judul);
    }

    @Dan("pengguna mengeklik tombol selanjutnya pada halaman portofolio karya ilmiah")
    public void penggunaMengeklikTombolSelanjutnyaPadaHalamanPortofolioKaryaIlmiah() {
        karyaIlmiahPage.clickSelanjutnyaButton();
    }

    @Dan("pengguna mengeklik icon tambah penulis pada halaman portofolio karya ilmiah")
    public void penggunaMengeklikIconTambahPenulisPadaHalamanPortofolioKaryaIlmiah() {
        karyaIlmiahPage.clickTambahPenulisIcon();
    }

    @Dan("pengguna mengatur jenis penulis menjadi {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturJenisPenulisMenjadiPadaHalamanPortofolioKaryaIlmiah(String jenis) {
        karyaIlmiahPage.setJenisPenulis(jenis);
    }

    @Dan("pengguna mengatur peran menjadi {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturPeranMenjadiPadaHalamanPortofolioKaryaIlmiah(String peran) {
        karyaIlmiahPage.setPeran(peran);
    }

    @Dan("pengguna mengatur nama penulis menjad {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturNamaPenulisMenjadPadaHalamanPortofolioKaryaIlmiah(String nama) {
        karyaIlmiahPage.setNamaPenulis(nama);
    }

    @Dan("pengguna mengatur corresponding author menjadi {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturCorrespondingAuthorMenjadiPadaHalamanPortofolioKaryaIlmiah(String data) {
        karyaIlmiahPage.setCorrespondingAuthor(data);
    }

    @Dan("pengguna mengeklik tombol tambah pada halaman portofolio karya ilmiah")
    public void penggunaMengeklikTombolTambahPadaHalamanPortofolioKaryaIlmiah() {
        karyaIlmiahPage.clickTambahButton();
    }

    @Dan("pengguna mengeklik tombol selesai pada halaman portofolio karya ilmiah")
    public void penggunaMengeklikTombolSelesaiPadaHalamanPortofolioKaryaIlmiah() {
        karyaIlmiahPage.clickSelesaiButton();
    }

    @Dan("pengguna mencentang checkbox judul baru pada halaman portofolio karya ilmiah")
    public void penggunaMencentangCheckboxJudulBaruPadaHalamanPortofolioKaryaIlmiah() {
        karyaIlmiahPage.mencentangCheckbox();
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioKaryaIlmiah(String kategori) {
        karyaIlmiahPage.setKategoriKegiatan(kategori);
    }

    @Dan("pengguna mengatur jenis karya ilmiah menjadi {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengaturJenisKaryaIlmiahMenjadiPadaHalamanPortofolioKaryaIlmiah(String jenis) {
        karyaIlmiahPage.setJenisKaryaIlmiah(jenis);
    }

    @Dan("pengguna mengisi judul dengan {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengisiJudulDenganPadaHalamanPortofolioKaryaIlmiah(String judul) {
        switch (judul) {
            case "randomJudul":
                judul = "Karya Ilmiah " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setJudul(judul);
        karyaIlmiahPage.fillJudulForm(judul);
    }

    @Dan("pengguna mengisi abstrak dengan {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengisiAbstrakDenganPadaHalamanPortofolioKaryaIlmiah(String data) {
        switch (data) {
            case "randomAbstrak":
                data = "Lorem ipsum " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        karyaIlmiahPage.fillAbstrakForm(data);
    }

    @Dan("pengguna mengisi tanggal terbit dengan {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengisiTanggalTerbitDenganPadaHalamanPortofolioKaryaIlmiah(String tanggal) {
        karyaIlmiahPage.setTanggalTerbit(tanggal);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio karya ilmiah")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioKaryaIlmiah() {
        assertThat("data is different with expected", karyaIlmiahPage.getSecondColumnAttribute(),
                everyItem(containsString(portofolioData.getJudul())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio karya ilmiah")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioKaryaIlmiah(String data) {
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
        karyaIlmiahPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman portofolio karya ilmiah")
    public void penggunaMengeklikDataTeratasPadaHalamanPortofolioKaryaIlmiah() {
        portofolioData.setJudul(karyaIlmiahPage.getFirstLinkColumnAttribute());
        karyaIlmiahPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat judul karya ilmiah pada halaman detail portofolio karya ilmiah")
    public void penggunaHarusMelihatJudulKaryaIlmiahPadaHalamanDetailPortofolioKaryaIlmiah() {
        assertThat("judul is different with expected", portofolioData.getJudul(),
                (containsString(karyaIlmiahPage.getJudulKaryaIlmiah())));
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail portofolio karya ilmiah")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailPortofolioKaryaIlmiah() {
        karyaIlmiahPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail portofolio karya ilmiah")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailPortofolioKaryaIlmiah() {
        karyaIlmiahPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit judul dengan {string} pada halaman portofolio karya ilmiah")
    public void penggunaMengeditJudulDenganPadaHalamanPortofolioKaryaIlmiah(String judul) {
        switch (judul) {
            case "randomJudul":
                judul = "Karya Ilmiah " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        portofolioData.setEditData(judul);
        karyaIlmiahPage.fillJudulForm(judul);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman portofolio karya ilmiah")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanPortofolioKaryaIlmiah() {
        assertThat("data is different with expected", karyaIlmiahPage.getSecondColumnAttribute(),
                everyItem(containsString(portofolioData.getEditData())));
    }
}
