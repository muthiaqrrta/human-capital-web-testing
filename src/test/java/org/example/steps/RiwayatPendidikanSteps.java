package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.ProfilData;
import org.example.app.pages.RiwayatPendidikanPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class RiwayatPendidikanSteps {

    @Autowired
    RiwayatPendidikanPage riwayatPendidikanPage;

    ProfilData profilData = new ProfilData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nama institusi pendidikan pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatNamaInstitusiPendidikanPadaHalamanProfilRiwayatPendidikan() {
        assertThat("educational institution is not visible", riwayatPendidikanPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat satuan pendidikan pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatSatuanPendidikanPadaHalamanProfilRiwayatPendidikan() {
        assertThat("education units is not visible", riwayatPendidikanPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat bidang studi pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatBidangStudiPadaHalamanProfilRiwayatPendidikan() {
        assertThat("bidang studi is not visible", riwayatPendidikanPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenjang pendidikan pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatJenjangPendidikanPadaHalamanProfilRiwayatPendidikan() {
        assertThat("educational stage is not visible", riwayatPendidikanPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal ijazah pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatTanggalIjazahPadaHalamanProfilRiwayatPendidikan() {
        assertThat("diploma date is not visible", riwayatPendidikanPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat gelar akademik pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatGelarAkademikPadaHalamanProfilRiwayatPendidikan() {
        assertThat("academic degree is not visible", riwayatPendidikanPage.isSixthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat status verifikasi pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatStatusVerifikasiPadaHalamanProfilRiwayatPendidikan() {
        assertThat("verification status is not visible", riwayatPendidikanPage.isSeventhColumnAttributeVisible(),
                equalTo(true));
    }

    @Maka("pengguna harus melihat data dengan satuan pendidikan yang mengandung {string} pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatDataDenganSatuanPendidikanYangMengandungPadaHalamanProfilRiwayatPendidikan(String data) {
        switch (data) {
            case "existingEducationUnits":
                data = "Institut";
                break;
            default:
                break;
        }
        assertThat("data is different with expected", riwayatPendidikanPage.getSecondColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan nama institusi pendidikan yang mengandung {string} pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatDataDenganNamaInstitusiPendidikanYangMengandungPadaHalamanProfilRiwayatPendidikan(String data) {
        switch (data) {
            case "existingInstitutionName":
                data = "SMASA";
                break;
            default:
                break;
        }
        assertThat("data is different with expected", riwayatPendidikanPage.getLinkColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Maka("pengguna harus melihat data dengan jenjang pendidikan {string} pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatDataDenganJenjangPendidikanPadaHalamanProfilRiwayatPendidikan(String data) {
        assertThat("data is different with expected", riwayatPendidikanPage.getFourthColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Dan("pengguna mengisi nama institusi pendidikan dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiNamInstitusiPendidikanDenganPadaHalamanProfilRiwayatPendidikan(String institutionName) {
        switch (institutionName) {
            case "namaAcak":
                institutionName = "Institut " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        profilData.setNamaInstitusi(institutionName);
        riwayatPendidikanPage.fillNamaInstitusiForm(institutionName);
    }

    @Dan("pengguna mengatur jenjang pendidikan menjadi {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengaturJenjangPendidikanMenjadiPadaHalamanProfilRiwayatPendidikan(String educationalStage) {
        riwayatPendidikanPage.setJenjangPendidikan(educationalStage);
    }

    @Dan("pengguna mengisi satuan pendidikan dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiSatuanpendidikanDenganPadaHalamanProfilRiwayatPendidikan(String educationUnits) {
//        profilData.setSatuanPendidikan(educationUnits);
        riwayatPendidikanPage.fillSatuanPendidikanForm(educationUnits);
    }

    @Dan("pengguna mengatur bidang studi menjadi {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengaturBidangStudiMenjadiPadaHalamanProfilRiwayatPendidikan(String bidangStudi) {
        riwayatPendidikanPage.setBidangStudi(bidangStudi);
    }

    @Dan("pengguna mengisi program studi dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiProgramStudiDenganPadaHalamanProfilRiwayatPendidikan(String programStudi) {
        riwayatPendidikanPage.setProgramStudi(programStudi);
    }

    @Dan("pengguna mengisi nomor induk dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiNomorIndukDenganPadaHalamanProfilRiwayatPendidikan(String registrationNumber) {
        riwayatPendidikanPage.fillNomorIndukForm(registrationNumber);
    }

    @Dan("pengguna mengisi tahun masuk dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiTahunMasukDenganPadaHalamanProfilRiwayatPendidikan(String entryYear) {
        riwayatPendidikanPage.fillTahunMasukForm(entryYear);
    }

    @Dan("pengguna mengisi tahun lulus dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiTahunLulusDenganPadaHalamanProfilRiwayatPendidikan(String graduationYear) {
        riwayatPendidikanPage.fillTahunLulusForm(graduationYear);
    }

    @Dan("pengguna mengatur tanggal lulus menjadi {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengaturTanggalLulusMenjadiPadaHalamanProfilRiwayatPendidikan(String graduationDate) {
        riwayatPendidikanPage.setTanggalLulus(graduationDate);
    }

    @Dan("pengguna mengisi ipk dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiIpkDenganPadaHalamanProfilRiwayatPendidikan(String score) {
        riwayatPendidikanPage.setSkor(score);
    }

    @Dan("pengguna mengisi sks lulus dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengisiSksLulusDenganPadaHalamanProfilRiwayatPendidikan(String sksLulus) {
        riwayatPendidikanPage.setSksLulus(sksLulus);
    }

    @Dan("pengguna memilih {string} untuk opsi kependidikan pada halaman profil riwayat pendidikan")
    public void penggunaMemilihUntukOpsiKependidikanPadaHalamanProfilRiwayatPendidikan(String option) {
        switch (option) {
            case "ya":
                riwayatPendidikanPage.kependidikan();
                break;
            case "tidak":
                riwayatPendidikanPage.tidakKependidikan();
                break;
        }
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanProfilRiwayatPendidikan() {
        assertThat("data is different with expected", riwayatPendidikanPage.getFirstColumnAttribute(),
                everyItem(equalTo(profilData.getNamaInstitusi())));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman profil riwayat pendidikan")
    public void penggunaMencariDanMenekanEnterPadaHalamanProfilRiwayatPendidikan(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = profilData.getNamaInstitusi();
                break;
            case "dataYangDihapus":
                data = profilData.getNamaInstitusi();
                break;
            case "dataYangDiedit":
                data = profilData.getNamaInstitusi();
                break;
            case "dataHasilEdit":
                data = profilData.getEditData();
                break;
            default:
                break;
        }
        riwayatPendidikanPage.fillSearchFormAndHitEnter(data);
    }

    @Ketika("pengguna mengeklik data teratas pada halaman profil riwayat pendidikan")
    public void penggunaMengeklikDataTeratasPadaHalamanProfilRiwayatPendidikan() {
        profilData.setNamaInstitusi(riwayatPendidikanPage.getFirstLinkColumnAttribute());
        riwayatPendidikanPage.clickFirstListLink();
    }

    @Maka("pengguna harus melihat nama institusi pendidikan pada halaman detail profil riwayat pendidikan")
    public void penggunaHarusMelihatNamaInstitusiPendidikanPadaHalamanDetailProfilRiwayatPendidikan() {
        assertThat("nama is different with expected", riwayatPendidikanPage.getNamaInstitusiPendidikan(),
                (containsString(profilData.getNamaInstitusi())));
    }

    @Ketika("pengguna mengatur filter status verifikasi menjadi {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengaturFilterStatusVerifikasiMenjadiPadaHalamanProfilRiwayatPendidikan(String filter) {
        switch (filter) {
            case "belumDiajukan":
                riwayatPendidikanPage.selectBelumDiajukanFilter();
                break;
            case "approved":
                filter = String.valueOf(System.currentTimeMillis());
                break;
        }
    }

    @Ketika("pengguna mengeklik tombol hapus pada halaman detail profil riwayat pendidikan")
    public void penggunaMengeklikTombolHapusPadaHalamanDetailProfilRiwayatPendidikan() {
        riwayatPendidikanPage.clickHapusButton();
    }

    @Ketika("pengguna mengeklik tombol edit data pada halaman detail profil riwayat pendidikan")
    public void penggunaMengeklikTombolEditDataPadaHalamanDetailProfilRiwayatPendidikan() {
        riwayatPendidikanPage.clickEditDataButton();
    }

    @Dan("pengguna mengedit nama institusi pendidikan dengan {string} pada halaman profil riwayat pendidikan")
    public void penggunaMengeditNamaInstitusiPendidikanDenganPadaHalamanProfilRiwayatPendidikan(String institutionName) {
        switch (institutionName) {
            case "namaAcak":
                institutionName = "Institut " + System.currentTimeMillis();
                break;
            default:
                break;
        }
        profilData.setEditData(institutionName);
        riwayatPendidikanPage.fillNamaInstitusiForm(institutionName);
    }

    @Maka("pengguna harus melihat data hasil edit pada halaman profil riwayat pendidikan")
    public void penggunaHarusMelihatDataHasilEditPadaHalamanProfilRiwayatPendidikan() {
        assertThat("data is different with expected", riwayatPendidikanPage.getFirstColumnAttribute(),
                everyItem(equalTo(profilData.getEditData())));
    }
}
