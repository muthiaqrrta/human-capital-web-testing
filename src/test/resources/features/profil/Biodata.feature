# language: id

@FiturBiodata @Profil @RegressionTest
Fitur: Fitur Biodata

  Dasar: arahkan pengguna ke halaman profil
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Profil"
    Dan pengguna mengeklik tombol "Biodata" selengkapnya pada halaman profil

  @Positif
  Skenario: memeriksa fitur biodata pada halaman profil
    Maka pengguna harus melihat judul fitur pada halaman profil
    Dan pengguna harus melihat judul personal pada halaman profil biodata
    Dan pengguna harus melihat judul kepegawaian pada halaman profil biodata
    Dan pengguna harus melihat judul riset pada halaman profil biodata
    Dan pengguna harus melihat judul berkas pada halaman profil biodata

  @Positif
  Skenario: mencari tanggal ajuan pada halaman profil biodata
    Ketika pengguna mencari "tanggalAjuanYangTersedia" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data dengan tanggal ajuan yang mengandung "tanggalAjuanYangTersedia" pada halaman profil biodata

  @Positif
  Skenario: mencari tanggal verifikasi pada halaman profil biodata
    Ketika pengguna mencari "tanggalVerifikasiYangTersedia" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data dengan tanggal verifikasi yang mengandung "tanggalVerifikasiYangTersedia" pada halaman profil biodata

  @Positif
  Skenario: mencari status verifikasi pada halaman profil biodata
    Ketika pengguna mencari "statusVerifikasiYangTersedia" dan menekan enter pada halaman profil
    Dan pengguna harus melihat data dengan status verifikasi yang mengandung "statusVerifikasiYangTersedia" pada halaman profil biodata

  @Negatif
  Skenario konsep: mencari <data> pada halaman profil biodata
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data kosong pada halaman profil
    Contoh:
      | data                              |
      | tanggal ajuan yang tidak ada      |

  @Positif
  Skenario: mengedit riset pada halaman profil biodata
    Ketika pengguna mengeklik tombol edit riset pada halaman profil biodata
    Dan pengguna mengisi id google scholar dengan "nomorAcak" pada halaman profil biodata
    Dan pengguna mengeklik tombol simpan pada halaman profil
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil