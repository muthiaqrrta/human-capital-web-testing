package org.example.steps;

import io.cucumber.java.id.Ketika;
import org.example.app.pages.SidebarPage;
import org.springframework.beans.factory.annotation.Autowired;

public class NavigationSteps {

    @Autowired
    SidebarPage sidebarPage;

    @Ketika("pengguna diarahkan ke halaman {string}")
    public void penggunaDiarahkanKeHalaman(String pageName) {
        switch (pageName) {
            case "Portofolio":
                sidebarPage.navigateToPortofolio();
                break;
            case "Profil":
                sidebarPage.navigateToProfil();
                break;
        }
    }
}
