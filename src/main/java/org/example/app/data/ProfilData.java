package org.example.app.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Component("org.example.app.data.ProfilData")
public class ProfilData {
    private String namaFitur;
    private String tanggalVerifikasi;
    private String statusVerifikasi;
    private String nama;
    private String namaInstitusi;
    private String satuanPendidikan;
    private String editData;
}