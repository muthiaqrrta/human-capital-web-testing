# language: id

@FiturHakKekayaanIntelektual @PortofolioTendik @RegressionTest
Fitur: Fitur Hak Kekayaan Intelektual

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Hak Kekayaan Intelektual" pada halaman portofolio

  @Positif
  Skenario: memeriksan fitur hak kekayaan intelektual pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul pada halaman portofolio hak kekayaan intelektual

  @Positif
  Skenario: pengguna menambahkan data hak kekayaan intelektual pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "membuat rancangan dan karya seni sebagai penulis buku kumpulan puisi tingkat lokal" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengisi judul dengan "namaAcak" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengatur peran menjadi "Editor" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengatur jenis hki menjadi "bahan pengajaran yang bersertifikat" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengatur tanggal pendaftaran menjadi "08232023" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengatur tingkat menjadi "Institut" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio hak kekayaan intelektual

  @Positif
  Skenario konsep: mencari <data> pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat data yang mengandung "<data>" pada halaman portofolio hak kekayaan intelektual
    Contoh:
      | data  |
      | Title |

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                 |
      | judul yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis hki pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data dengan jenis hki "<filter>" pada halaman portofolio hak kekayaan intelektual
    Contoh:
      | filter                              |
      | Bahan pengajaran yang bersertifikat |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mengeklik data teratas pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat judul pada halaman detail portofolio hak kekayaan intelektual

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mengeklik data teratas pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat judul pada halaman detail portofolio hak kekayaan intelektual

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio hak kekayaan intelektual
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio hak kekayaan intelektual
    Ketika pengguna mengeklik data teratas pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat judul pada halaman detail portofolio hak kekayaan intelektual

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio hak kekayaan intelektual
    Dan pengguna mengedit judul dengan "namaAcak" pada halaman portofolio hak kekayaan intelektual
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio hak kekayaan intelektual
    Maka pengguna harus melihat data hasil edit pada halaman portofolio hak kekayaan intelektual