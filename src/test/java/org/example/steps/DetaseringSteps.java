package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.data.PortofolioData;
import org.example.app.pages.DetaseringPage;
import org.example.app.properties.PropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;

public class DetaseringSteps {

    @Autowired
    DetaseringPage detaseringPage;

    PortofolioData portofolioData = new PortofolioData();

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dan("pengguna harus melihat nomor sk penugasan pada halaman portofolio detasering")
    public void penggunaHarusMelihatNomorSkPenugasanPadaHalamanPortofolioDetasering() {
        assertThat("assignment certificate number is not visible", detaseringPage.isFirstColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat jenis detasering pada halaman portofolio detasering")
    public void penggunaHarusMelihatJenisDetaseringPadaHalamanPortofolioDetasering() {
        assertThat("detasering type is not visible", detaseringPage.isSecondColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat afiliasi pada halaman portofolio detasering")
    public void penggunaHarusMelihatAfiliasiPadaHalamanPortofolioDetasering() {
        assertThat("afiliasi is not visible", detaseringPage.isThirdColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat tanggal mulai pada halaman portofolio detasering")
    public void penggunaHarusMelihatTanggalMulaiPadaHalamanPortofolioDetasering() {
        assertThat("start date is not visible", detaseringPage.isFourthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna harus melihat bidang tugas pada halaman portofolio detasering")
    public void penggunaHarusMelihatBidangTugasPadaHalamanPortofolioDetasering() {
        assertThat("task field is not visible", detaseringPage.isFifthColumnAttributeVisible(),
                equalTo(true));
    }

    @Dan("pengguna mengatur kategori kegiatan menjadi {string} pada halaman portofolio detasering")
    public void penggunaMengaturKategoriKegiatanMenjadiPadaHalamanPortofolioDetasering(String activityCategory) {
        detaseringPage.setKategoriKegiatan(activityCategory);
    }

    @Dan("pengguna mengatur jenis detasering menjadi {string} pada halaman portofolio detasering")
    public void penggunaMengaturJenisDetaseringMenjadiPadaHalamanPortofolioDetasering(String type) {
        detaseringPage.setJenis(type);
    }

    @Dan("pengguna mengatur afiliasi menjadi {string} pada halaman portofolio detasering")
    public void penggunaMengaturAfiliasiMenjadiPadaHalamanPortofolioDetasering(String afiliasi) {
        detaseringPage.setAfiliasi(afiliasi);
    }

    @Dan("pengguna mengisi nomor sk penugasan dengan {string} pada halaman portofolio detasering")
    public void penggunaMengisiNomorSkPenugasanDenganPadaHalamanPortofolioDetasering(String data) {
        switch (data) {
            case "nomorAcak":
                data = String.valueOf(System.currentTimeMillis());
                break;
            default:
                break;
        }
        portofolioData.setNomorSkPenugasan(data);
        detaseringPage.fillNomorSKPenugasanForm(data);
    }

    @Dan("pengguna mengatur tanggal sk penugasan menjadi {string} pada halaman portofolio detasering")
    public void penggunaMengaturTanggalSkPenugasanMenjadiPadaHalamanPortofolioDetasering(String date) {
        detaseringPage.setTanggalSKPenugasanForm(date);
    }

    @Dan("pengguna harus melihat data dengan nomor sk penugasan yang mengandung {string} pada halaman portofolio detasering")
    public void penggunaHarusMelihatDataDenganNomorSkPenugasanYangMengandungPadaHalamanPortofolioDetasering(String data) {
        assertThat("data is different with expected", detaseringPage.getFirstColumnAttribute(),
                everyItem(containsString(data)));
    }

    @Ketika("pengguna mencari {string} dan menekan enter pada halaman portofolio detasering")
    public void penggunaMencariDanMenekanEnterPadaHalamanPortofolioDetasering(String data) {
        switch (data) {
            case "dataYangBaruDitambahkan":
                data = portofolioData.getNomorSkPenugasan();
                break;
            default:
                break;
        }
        detaseringPage.fillSearchFormAndHitEnter(data);
    }

    @Maka("pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio detasering")
    public void penggunaHarusMelihatDataYangBaruSajaDitambahkanPadaHalamanPortofolioDetasering() {
        assertThat("data is different with expected", detaseringPage.getFirstColumnAttribute(),
                everyItem(equalTo(portofolioData.getNomorSkPenugasan())));
    }

    @Dan("pengguna mengatur filter untuk organisasi sasaran menjadi {string} pada halaman portofolio detasering")
    public void penggunaMengaturFilterUntukOrganisasiSasaranMenjadiPadaHalamanPortofolioDetasering(String filter) {
        detaseringPage.setOrganisasiSasaranFilter(filter);
        detaseringPage.clickShowButton();
    }

    @Maka("pengguna harus melihat data dengan organisasi sasaran {string} pada halaman portofolio detasering")
    public void penggunaHarusMelihatDataDenganOrganisasiSasaranPadaHalamanPortofolioDetasering(String data) {
        assertThat("data is different with expected", detaseringPage.getThirdColumnAttribute(),
                everyItem(containsString(data)));
    }
}
