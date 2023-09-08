# language: id

@FiturProfil @Profil @RegressionTest
Fitur: Fitur Profil

  Dasar: arahkan pengguna ke halaman profil
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Profil"

  @Positif
  Skenario: memeriksa data pengguna pada halaman profil
    Maka pengguna harus melihat namanya pada halaman profil
    Dan pengguna harus melihat pekerjaan pada halaman profil

  @Positif
  Skenario: memeriksa fitur pada halaman profil
    Maka pengguna harus melihat nama halaman pada halaman profil
    Dan pengguna harus melihat fitur ini pada halaman profil:
      | Biodata             |
      | Anggota Keluarga    |
      | Riwayat Pendidikan  |