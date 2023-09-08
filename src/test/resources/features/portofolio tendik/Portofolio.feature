# language: id

@FiturPortofolio @PortofolioTendik @RegressionTest
Fitur: Fitur Portofolio

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"

  @Positif
  Skenario: verifikasi fitur pada halaman portofolio
    Maka pengguna harus melihat nama halaman pada halaman portofolio
    Dan pengguna harus melihat fitur ini pada halaman portofolio:
      | Hak Kekayaan Intelektual        |
      | Karya Cipta                     |
      | Penelitian                      |
      | Pembicara                       |
      | Keanggotaan Organisasi Profesi  |
      | Kepanitiaan                     |
      | Penghargaan                     |
      | Pengembangan Diri               |
      | Riwayat Pekerjaan               |
      | Sertifikasi                     |

