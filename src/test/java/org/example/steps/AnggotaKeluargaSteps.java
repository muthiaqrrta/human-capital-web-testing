package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.ProfilData;
import org.example.app.pages.AnggotaKeluargaPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class AnggotaKeluargaSteps {

    @Autowired
    AnggotaKeluargaPage anggotaKeluargaPage;

    ProfilData profilData = new ProfilData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama lengkap pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatNamaLengkapPadaHalamanProfilAnggotaKeluarga() {
        assertThat("full name is not visible", anggotaKeluargaPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat hubungan keluarga pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatHubunganKeluargaPadaHalamanProfilAnggotaKeluarga() {
        assertThat("family relationship is not visible", anggotaKeluargaPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal ajuan pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatTanggalAjuanPadaHalamanProfilAnggotaKeluarga() {
        assertThat("submission date is not visible", anggotaKeluargaPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal verifikasi pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatTanggalVerifikasiPadaHalamanProfilAnggotaKeluarga() {
        assertThat("verification date is not visible", anggotaKeluargaPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanProfilAnggotaKeluarga() {
        assertThat("verification status is not visible", anggotaKeluargaPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna memilih {string} untuk opsi pegawai its pada halaman profil anggota keluarga")
    public void penggunaMemilihUntukOpsiPegawaiItsPadaHalamanProfilAnggotaKeluarga(String option) {
        switch (option) {
            case "ya":
                anggotaKeluargaPage.pegawaiITS();
                break;
            case "tidak":
                anggotaKeluargaPage.bukanPegawaiITS();
                break;
        }
    }

    @Dan("pengguna mengisi nama lengkap dengan {string} pada halaman profil anggota keluarga")
    public void penggunaMengisiNamaLengkapDenganPadaHalamanProfilAnggotaKeluarga(String name) {
        switch (name) {
            case "namaAcak":
                name = "Muthia " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        profilData.setNama(name);
        anggotaKeluargaPage.fillNamaLengkapForm(name);
    }

    @Dan("pengguna mengisi nik dengan {string} pada halaman profil anggota keluarga")
    public void penggunaMengisiNikDenganPadaHalamanProfilAnggotaKeluarga(String nik) {
        switch (nik) {
            case "nomorAcak":
                nik = "355" + System.currentTimeMillis();
                break;
            default:
                break;
        }
        anggotaKeluargaPage.fillNIKForm(nik);
    }

    @Dan("pengguna mengisi nomor kk dengan {string} pada halaman profil anggota keluarga")
    public void penggunaMengisiNomorKkDenganPadaHalamanProfilAnggotaKeluarga(String number) {
        switch (number) {
            case "nomorAcak":
                number = "123" + System.currentTimeMillis();
                break;
            default:
                break;
        }
        anggotaKeluargaPage.fillNoKKForm(number);
    }

    @Dan("pengguna mengatur jenis kelamin menjadi {string} pada halaman profil anggota keluarga")
    public void penggunaMengaturJenisKelaminMenjadiPadaHalamanProfilAnggotaKeluarga(String gender) {
        anggotaKeluargaPage.setJenisKelamin(gender);
    }

    @Dan("pengguna mengatur tanggal lahir menjadi {string} {string} {string} pada halaman profil anggota keluarga")
    public void penggunaMengaturTanggalLahirMenjadiPadaHalamanProfilAnggotaKeluarga(String date, String month, String year) {
        anggotaKeluargaPage.clickTanggalLahir();
        anggotaKeluargaPage.setMonth(month);
        anggotaKeluargaPage.setYear(year);
        anggotaKeluargaPage.setDate(date);
    }

    @Dan("pengguna mengatur hubungan keluarga menjadi {string} pada halaman profil anggota keluarga")
    public void penggunaMengaturHubunganKeluargaMenjadiPadaHalamanProfilAnggotaKeluarga(String familyRelationship) {
        anggotaKeluargaPage.setHubunganKeluarga(familyRelationship);
    }

    @Dan("pengguna mengatur alamat menjadi {string} {string} {string} pada halaman profil anggota keluarga")
    public void penggunaMengaturAlamatMenjadiPadaHalamanProfilAnggotaKeluarga(String province, String city, String kecamatan) {
        anggotaKeluargaPage.setProvinsi(province);
        anggotaKeluargaPage.setKota(city);
        anggotaKeluargaPage.setKecamatan(kecamatan);
    }

    @Dan("pengguna memilih {string} untuk opsi pns pada halaman profil anggota keluarga")
    public void penggunaMemilihUntukOpsiPnsPadaHalamanProfilAnggotaKeluarga(String option) {
        switch (option) {
            case "ya":
                anggotaKeluargaPage.pnsEmployee();
                break;
            case "tidak":
                anggotaKeluargaPage.notPNSEmployee();
                break;
        }
    }

    @Dan("pengguna memilih {string} untuk pegawai its pada halaman profil anggota keluarga")
    public void penggunaMemilihUntukPegawaiItsPadaHalamanProfilAnggotaKeluarga(String employee) {
        profilData.setNama(employee);
        anggotaKeluargaPage.selectPegawaiITS(employee);
    }

    @Dan("pengguna harus melihat data dengan nama yang mengandung {string} pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatDataDenganNamaYangMengandungPadaHalamanProfilAnggotaKeluarga(String data) {
        switch (data) {
            case "existingName":
                data = "Nadia";
                break;
            default:
                break;
        }
        assertThat("data is different with expected", anggotaKeluargaPage.getLinkColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan jenis kelamin {string} pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatDataDenganJenisKelaminPadaHalamanProfilAnggotaKeluarga(String data) {
        assertThat("data is different with expected", anggotaKeluargaPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan status hubungan keluarga {string} pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatDataDenganStatusHubunganKeluargaPadaHalamanProfilAnggotaKeluarga(String data) {
        assertThat("data is different with expected", anggotaKeluargaPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mengatur filter status verifikasi menjadi {string} pada halaman profil anggota keluarga")
    public void penggunaMengaturFilterStatusVerifikasiMenjadiPadaHalamanProfilAnggotaKeluarga(String filter) {
        switch (filter) {
            case "belumDiajukan":
                anggotaKeluargaPage.selectBelumDiajukanFilter();
                break;
            case "approved":
                filter = String.valueOf(System.currentTimeMillis());
                break;
        }
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail profil anggota keluarga")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailProfilAnggotaKeluarga() {
        anggotaKeluargaPage.clickHapusButton();
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanProfilAnggotaKeluarga() {
        assertThat("data is different with expected", anggotaKeluargaPage.getFirstColumnAttribute(),
                everyItem(containsString(profilData.getNama())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman profil anggota keluarga")
    public void penggunaMencariDanMenekanEnterPadaHalamanProfilAnggotaKeluarga(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = profilData.getNama();
                break;
            case "dataYangDihapus":
                data = profilData.getNama();
                break;
            case "dataYangDiedit":
                data = profilData.getNama();
                break;
            case "dataHasilEdit":
                data = profilData.getEditData();
                break;
            default:
                break;
        }
        anggotaKeluargaPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman profil anggota keluarga")
    public void penggunaMengeklikDataTeratasPadaHalamanProfilAnggotaKeluarga() {
        profilData.setNama(anggotaKeluargaPage.getFirstLinkColumnAttribute());
        anggotaKeluargaPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama lengkap pada halaman detail profil anggota keluarga")
    public void penggunaHarusMelihatNamaLengkapPadaHalamanDetailProfilAnggotaKeluarga() {
        assertThat("nama is different with expected", anggotaKeluargaPage.getNamaAnggotaKeluarga(),
                (equalTo(profilData.getNama())));
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail profil anggota keluarga")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailProfilAnggotaKeluarga() {
        anggotaKeluargaPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama lengkap dengan {string} pada halaman profil anggota keluarga")
    public void penggunaMengeditNamaLengkapDenganPadaHalamanProfilAnggotaKeluarga(String name) {
        switch (name) {
            case "namaAcak":
                name = "Muthia " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        profilData.setEditData(name);
        anggotaKeluargaPage.fillNamaLengkapEditForm(name);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman profil anggota keluarga")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanProfilAnggotaKeluarga() {
        assertThat("data is different with expected", anggotaKeluargaPage.getFirstColumnAttribute(),
                everyItem(containsString(profilData.getEditData())));
    }
}
