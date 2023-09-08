package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.ProfilData;
import org.example.app.pages.BiodataPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.example.app.properties.PropertiesReader.properties;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class BiodataSteps {

    @Autowired
    BiodataPage biodataPage;

    ProfilData profilData = new ProfilData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat judul riwayat perubahan personal pada halaman profil biodata")
    public void penggunaHarusMelihatJudulRiwayatPerubahanPersonalPadaHalamanProfilBiodata() {
        assertThat("title is different with expected",
                biodataPage.getBiodataCardTitle().get(0).toLowerCase(), equalTo("riwayat perubahan personal"));
    }

    @Dan("pengguna harus melihat judul personal pada halaman profil biodata")
    public void penggunaHarusMelihatJudulPersonalPadaHalamanProfilBiodata() {
        assertThat("title is different with expected",
                biodataPage.getBiodataCardTitle().get(1).toLowerCase(), containsString("personal"));
    }

    @Dan("pengguna harus melihat judul kepegawaian pada halaman profil biodata")
    public void penggunaHarusMelihatJudulKepegawaianPadaHalamanProfilBiodata() {
        assertThat("title is different with expected",
                biodataPage.getBiodataCardTitle().get(2).toLowerCase(), equalTo("kepegawaian"));
    }

    @Dan("pengguna harus melihat judul riset pada halaman profil biodata")
    public void penggunaHarusMelihatJudulRisetPadaHalamanProfilBiodata() {
        assertThat("title is different with expected",
                biodataPage.getBiodataCardTitle().get(3).toLowerCase(), containsString("riset"));
    }

    @Dan("pengguna harus melihat judul berkas pada halaman profil biodata")
    public void penggunaHarusMelihatJudulBerkasPadaHalamanProfilBiodata() {
        assertThat("title is different with expected",
                biodataPage.getBiodataCardTitle().get(4).toLowerCase(), containsString("berkas"));
    }

    @Dan("pengguna harus melihat tanggal ajuan pada halaman profil biodata")
    public void penggunaHarusMelihatTanggalAjuanPadaHalamanProfilBiodata() {
        assertThat("submission date is not visible", biodataPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal verifikasi pada halaman profil biodata")
    public void penggunaHarusMelihatTanggalVerifikasiPadaHalamanProfilBiodata() {
        assertThat("verification date is not visible", biodataPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman profil biodata")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanProfilBiodata() {
        assertThat("submission status is not visible", biodataPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Maka("pengguna harus melihat data dengan tanggal ajuan yang mengandung {string} pada halaman profil biodata")
    public void penggunaHarusMelihatDataDenganTanggalAjuanYangMengandungPadaHalamanProfilBiodata(String data) {
        switch (data) {
            case "tanggalAjuanYangTersedia":
                data = properties.getProperty("tanggalAjuanYangTersedia");
                break;
            default:
                break;
        }
        assertThat("data is different with expected", biodataPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan tanggal verifikasi yang mengandung {string} pada halaman profil biodata")
    public void penggunaHarusMelihatDataDenganTanggalVerifikasiYangMengandungPadaHalamanProfilBiodata(String data) {
        switch (data) {
            case "tanggalVerifikasiYangTersedia":
                data = properties.getProperty("tanggalVerifikasiYangTersedia");
                break;
            default:
                break;
        }
        assertThat("data is different with expected", biodataPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan status verifikasi yang mengandung {string} pada halaman profil biodata")
    public void penggunaHarusMelihatDataDenganStatusVerifikasiYangMengandungPadaHalamanProfilBiodata(String data) {
        switch (data) {
            case "statusVerifikasiYangTersedia":
                data = properties.getProperty("statusVerifikasiYangTersedia");
                break;
            default:
                break;
        }
        assertThat("data is different with expected", biodataPage.getThirdColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mengeklik tombol edit riset pada halaman profil biodata")
    public void penggunaMengeklikTombolEditRisetPadaHalamanProfilBiodata() {
        biodataPage.clickRisetEditButton();
    }

    @Dan("pengguna mengisi id google scholar dengan {string} pada halaman profil biodata")
    public void penggunaMengisiIdGoogleScholarDenganPadaHalamanProfilBiodata(String data) {
        switch (data) {
            case "nomorAcak":
                data = String.valueOf(System.currentTimeMillis());
                break;
            default:
                break;
        }
        biodataPage.fillIDGoogleScholar(data);
    }

    @Ketika("pengguna mengeklik tanggal ajuan pada halaman profil biodata")
    public void penggunaMengeklikTanggalAjuanPadaHalamanProfilBiodata() {
        biodataPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat tanggal verifikasi pada halaman profil biodata detail")
    public void penggunaHarusMelihatTanggalVerifikasiPadaHalamanProfilBiodataDetail() {
        assertThat("verification date is different with expected", profilData.getTanggalVerifikasi(),
                containsString(biodataPage.getTanggalVerifikasiDetailAttribute()));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman profil biodata detail")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanProfilBiodataDetail() {
        assertThat("verification status is different with expected", profilData.getStatusVerifikasi(),
                containsString(biodataPage.getStatusVerifikasiDetailAttribute()));
    }
}
