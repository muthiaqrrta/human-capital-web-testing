package org.example.app.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Component("org.example.app.data.PortofolioData")
public class PortofolioData {
    private String namaFitur;
    private String nama;
    private String judul;
    private String nomorSkPenugasan;
    private String aktivitasLitabmas;
    private String editData;
}
