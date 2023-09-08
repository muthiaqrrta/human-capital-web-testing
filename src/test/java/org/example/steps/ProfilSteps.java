package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.ProfilData;
import org.example.app.pages.ProfilPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.example.app.properties.PropertiesReader.properties;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class ProfilSteps {

    @Autowired
    ProfilPage profilPage;

    ProfilData profilData = new ProfilData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Maka("pengguna harus melihat namanya pada halaman profil")
    public void penggunHarusMelihatNamanyaPadaHalamanProfil() {
        assertThat("name is not visible",
                profilPage.getNamaAttribute().toLowerCase(), equalTo(properties.getProperty("namaUser")));
    }

    @Dan("pengguna harus melihat pekerjaan pada halaman profil")
    public void penggunaHarusMelihatPekerjaanPadaHalamanProfil() {
        assertThat("job is not visible",
                profilPage.getPekerjaanAttribute().toLowerCase(), equalTo(properties.getProperty("pekerjaanUser")));
    }

    @Dan("pengguna mengeklik tombol {string} selengkapnya pada halaman profil")
    public void penggunaMengeklikTombolSelengkapnyaPadaHalamanProfil(String feature) {
        switch (feature) {
            case "Biodata":
                profilData.setNamaFitur(feature);
                profilPage.clickBiodataDetailButton();
                break;
            case "Anggota Keluarga":
                profilData.setNamaFitur(feature);
                profilPage.clickFamilyMemberDetailButton();
                break;
            case "Riwayat Pendidikan":
                profilData.setNamaFitur(feature);
                profilPage.clickEducationalBackgroundDetailButton();
                break;
        }
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman profil")
    public void penggunaMencariDanMenekanEnterPadaHalamanProfil(String data) {
        switch (data) {
            case "tanggalAjuanYangTersedia":
                data = properties.getProperty("tanggalAjuanYangTersedia");
                break;
            case "tanggalVerifikasiYangTersedia":
                data = properties.getProperty("tanggalVerifikasiYangTersedia");
                break;
            case "statusVerifikasiYangTersedia":
                data = properties.getProperty("statusVerifikasiYangTersedia");
                break;
            default:
                break;
        }
        profilPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data kosong pada halaman profil")
    public void penggunaHarusMelihatDataKosongPadaHalamanProfil() {
        assertThat("empty list is not visible", profilPage.isEmptyListVisible(), equalTo(true));
    }

    @Maka("pengguna harus melihat judul fitur pada halaman profil")
    public void penggunaHarusMelihatJudulFiturPadaHalamanProfil() {
        assertThat("tab title is different with expected", profilPage.getNamaFitur(),
                containsString(profilData.getNamaFitur()));
    }

    @Dan("pengguna harus melihat fitur ini pada halaman profil:")
    public void penggunaHarusMelihatFiturIniPadaHalamanProfil(List<String> features) {
        List<String> profileFeatures = new ArrayList<>(features);
        assertThat("feature is not visible",
                profilPage.getFeatureTitleAttribute(), equalTo(profileFeatures));
    }

    @Ketika("pengguna mengeklik tombol tambah data pada halaman profil")
    public void penggunaMengeklikTombolTambahDataPadaHalamanProfil() {
        profilPage.clickTambahDataButton();
    }

    @Dan("pengguna mengeklik tombol simpan pada halaman profil")
    public void penggunaMengeklikTombolSimpanPadaHalamanProfil() {
        profilPage.clickSimpanButton();
    }

    @Ketika("pengguna mengeklik tombol filter pada halaman profil")
    public void penggunaMengeklikTombolFilterPadaHalamanProfil() {
        profilPage.clickFilterButton();
    }

    @Dan("pengguna mengatur filter menjadi {string} pada halaman profil")
    public void penggunaMengaturFilterMenjadiPadaHalamanProfil(String filter) {
        profilPage.setFilter(filter);
    }

    @Maka("pengguna harus melihat notifikasi berhasil pada halaman profil")
    public void penggunaHarusMelihatNotifikasiBerhasilPadaHalamanProfil() {
        assertThat("success notification is not visible", profilPage.isSuccessNotificationVisible(),
                equalTo(true));
    }

    @Ketika("pengguna mengeklik tombol kembali pada halaman profil")
    public void penggunaMengeklikTombolKembaliPadaHalamanProfil() {
        profilPage.clickKembaliButton();
    }

    @Maka("pengguna harus melihat nama halaman pada halaman profil")
    public void penggunaHarusMelihatNamaHalamanPadaHalamanProfil() {
        assertThat("nama halaman is not visible", profilPage.getNamaFitur().toLowerCase(),
                equalTo("profil pegawai"));
    }
}