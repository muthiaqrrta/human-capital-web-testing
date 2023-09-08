# language: id

@FiturSertifikasi @PortofolioTendik @RegressionTest
Fitur: Fitur Sertifikasi

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Sertifikasi" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur sertifikasi pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama sertifikasi pada halaman portofolio sertifikasi
    Dan pengguna harus melihat nomor peserta pada halaman portofolio sertifikasi
    Dan pengguna harus melihat jenis sertifikasi pada halaman portofolio sertifikasi
    Dan pengguna harus melihat bidang studi pada halaman portofolio sertifikasi
    Dan pengguna harus melihat nomor sk sertifikasi pada halaman portofolio sertifikasi
    Dan pengguna harus melihat tahun sertifikasi pada halaman portofolio sertifikasi
    Dan pengguna harus melihat status verifikasi pada halaman portofolio sertifikasi

  @Positif
  Skenario: pengguna menambahkan data sertifikasi pada halaman portofolio sertifikasi
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "mendapatkan sertifikasi bereputasi tingkat nasional" pada halaman portofolio sertifikasi
    Dan pengguna mengatur jenis sertifikasi menjadi "Profesional Profesi" pada halaman portofolio sertifikasi
    Dan pengguna mengisi nama sertifikasi dengan "namaAcak" pada halaman portofolio sertifikasi
    Dan pengguna mengatur bidang studi menjadi "teknik informatika" pada halaman portofolio sertifikasi
    Dan pengguna mengisi tahun sertifikasi dengan "2022" pada halaman portofolio sertifikasi
    Dan pengguna mengisi nomor sk sertifikasi dengan "nomorAcak" pada halaman portofolio sertifikasi
    Dan pengguna mengisi tanggal sk sertifikasi dengan "23122020" pada halaman portofolio sertifikasi
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio sertifikasi
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio sertifikasi

  @Positif
  Skenario: mencari nama sertifikasi pada halaman portofolio sertifikasi
    Ketika pengguna mencari "Sertif" dan menekan enter pada halaman portofolio sertifikasi
    Maka pengguna harus melihat data dengan nama sertifikasi yang mengandung "Sertif" pada halaman portofolio sertifikasi

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio sertifikasi
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio sertifikasi
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                             |
      | nama sertifikasi yang tidak ada  |

  @Positif
  Skenario konsep: filter berdasarkan jenis sertifikasi pada halaman portofolio sertifikasi
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data yang mengandung "<filter>" pada halaman portofolio sertifikasi
    Contoh:
      | filter              |
      | Profesional Profesi |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio sertifikasi
    Ketika pengguna mengeklik data teratas pada halaman portofolio sertifikasi
    Maka pengguna harus melihat nama sertifikasi pada halaman detail portofolio sertifikasi

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio sertifikasi
    Ketika pengguna mengeklik data teratas pada halaman portofolio sertifikasi
    Maka pengguna harus melihat nama sertifikasi pada halaman detail portofolio sertifikasi

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio sertifikasi
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio sertifikasi
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio sertifikasi
    Ketika pengguna mengeklik data teratas pada halaman portofolio sertifikasi
    Maka pengguna harus melihat nama sertifikasi pada halaman detail portofolio sertifikasi

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio sertifikasi
    Dan pengguna mengedit nama sertifikasi dengan "namaAcak" pada halaman portofolio sertifikasi
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio sertifikasi
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio sertifikasi
    Maka pengguna harus melihat data hasil edit pada halaman portofolio sertifikasi