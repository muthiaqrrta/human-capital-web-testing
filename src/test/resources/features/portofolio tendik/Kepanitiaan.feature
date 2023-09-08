# language: id

@FiturKepanitiaan @PortofolioTendik @RegressionTest
Fitur: Fitur Kepanitiaan

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Kepanitiaan" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur kepanitiaan pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama kepanitiaan pada halaman portofolio kepanitiaan
    Dan pengguna harus melihat jenis kepanitiaan pada halaman portofolio kepanitiaan
    Dan pengguna harus melihat nama instansi penyelenggara pada halaman portofolio kepanitiaan
    Dan pengguna harus melihat tmt sk penugasan pada halaman portofolio kepanitiaan
    Dan pengguna harus melihat tst sk penugasan pada halaman portofolio kepanitiaan

  @Positif
  Skenario: pengguna menambahkan data kepanitiaan pada halaman portofolio kepanitiaan
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "keanggotaan dalam tim penilai jabatan akademik dosen" pada halaman portofolio kepanitiaan
    Dan pengguna mengisi nama kepanitiaan dengan "namaAcak" pada halaman portofolio kepanitiaan
    Dan pengguna mengatur jenis kepanitiaan menjadi "Panitia Antar Lembaga" pada halaman portofolio kepanitiaan
    Dan pengguna mengisi nama instansi penyelenggara dengan "namaAcak" pada halaman portofolio kepanitiaan
    Dan pengguna mengatur tingkat kepanitiaan menjadi "Institut" pada halaman portofolio kepanitiaan
    Dan pengguna mengisi nomor sk penugasan dengan "nomorAcak" pada halaman portofolio kepanitiaan
    Dan pengguna mengatur tmt sk penugasan menjadi "01012020" pada halaman portofolio kepanitiaan
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio kepanitiaan

  @Positif
  Skenario: mencari nama kepanitiaan pada halaman portofolio kepanitiaan
    Ketika pengguna mencari "Committee" dan menekan enter pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data dengan nama kepanitiaan yang mengandung "Committee" pada halaman portofolio kepanitiaan

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio kepanitiaan
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                             |
      | nama kepanitiaan yang tidak ada  |

  @Positif
  Skenario konsep: filter berdasarkan jenis kepanitiaan pada halaman portofolio kepanitiaan
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data yang mengandung "<filter>" pada halaman portofolio kepanitiaan
    Contoh:
      | filter                |
      | Panitia Antar Lembaga |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio kepanitiaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat nama kepanitiaan pada halaman detail portofolio kepanitiaan

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio kepanitiaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat nama kepanitiaan pada halaman detail portofolio kepanitiaan

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio kepanitiaan
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio kepanitiaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat nama kepanitiaan pada halaman detail portofolio kepanitiaan

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio kepanitiaan
    Dan pengguna mengedit nama kepanitiaan dengan "namaAcak" pada halaman portofolio kepanitiaan
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio kepanitiaan
    Maka pengguna harus melihat data hasil edit pada halaman portofolio kepanitiaan