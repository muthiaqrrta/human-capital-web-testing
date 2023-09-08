package org.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.id.Dengan;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import org.example.app.pages.HeaderPage;
import org.example.app.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.app.properties.PropertiesReader;
import static org.example.app.properties.PropertiesReader.properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    @Autowired
    LoginPage loginPage;

    @Autowired
    HeaderPage headerPage;

    @Before
    public void background(){
        PropertiesReader.initializePropertyFile();
    }

    @Dengan("pengguna masuk menggunakan myits id: {string} dan kata sandi: {string}")
    public void penggunaMasukMenggunakanMyitsIdDanKataSandi(String id, String kataSandi) {
        loginPage.openAt(properties.getProperty("mihcUrl"));
        switch (id) {
            case "id":
                id = properties.getProperty("id");
                break;
            default:
                break;
        }
        switch (kataSandi) {
            case "kataSandi":
                kataSandi = properties.getProperty("kataSandi");
                break;
            default:
                break;
        }
        loginPage.fillMyitsId(id);
        loginPage.fillKataSandi(kataSandi);
        loginPage.submit();
    }

    @Maka("pengguna harus melihat pesan peringatan")
    public void penggunaHarusMelihatPesanPeringatan() {
        assertThat("alert message is not visible", loginPage.isAlertMessageVisible(), equalTo(true));
    }

    @Ketika("pengguna mengeklik ikon pengguna pada halaman header")
    public void penggunaMengeklikIkonPenggunaPadaHalamanHeader() {
        headerPage.clickUserIcon();
    }

    @Maka("pengguna harus melihat nama pengguna pada halaman header")
    public void penggunaHarusMelihatNamaPenggunaPadaHalamanHeader() {
        assertThat("name is not visible",
                headerPage.getNameAttribute().toLowerCase(), equalTo(properties.getProperty("namaUser")));
    }

    @Maka("pengguna harus melihat nama aplikasi web pada halaman header")
    public void penggunaHarusMelihatNamaAplikasiWebPadaHalamanHeader() {
        assertThat("app name is not visible",
                headerPage.getWebNameAttribute().toLowerCase(), equalTo(properties.getProperty("namaAplikasi")));
    }
}