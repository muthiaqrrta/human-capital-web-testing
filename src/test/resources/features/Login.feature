# language: id

@FiturLogin @RegressionTest
Fitur: Fitur Login

  @Positif
  Skenario: pengguna masuk mengguna myits id dan kata sandi yang valid
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Maka pengguna harus melihat nama aplikasi web pada halaman header
    Ketika pengguna mengeklik ikon pengguna pada halaman header
    Maka pengguna harus melihat nama pengguna pada halaman header

  @Negatif
  Skenario: pengguna masuk mengguna myits id dan kata sandi yang tidak valid
    Dengan pengguna masuk menggunakan myits id: "tidakValid" dan kata sandi: "tidakValid"
    Maka pengguna harus melihat pesan peringatan