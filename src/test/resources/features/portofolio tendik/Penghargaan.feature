# language: id

@FiturPenghargaan @PortofolioTendik @RegressionTest
Fitur: Fitur Penghargaan

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Penghargaan" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur penghargaan pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama penghargaan pada halaman portofolio penghargaan
    Dan pengguna harus melihat jenis penghargaan pada halaman portofolio penghargaan
    Dan pengguna harus melihat tingkat penghargaan pada halaman portofolio penghargaan
    Dan pengguna harus melihat tanggal sk penghargaan pada halaman portofolio penghargaan
    Dan pengguna harus melihat status verifikasi pada halaman portofolio penghargaan

  @Positif
  Skenario: pengguna menambahkan data penghargaan pada halaman portofolio penghargaan
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "mendapat tanda jasa/penghargaan tingkat nasional" pada halaman portofolio penghargaan
    Dan pengguna mengatur jenis penghargaan menjadi "akademik" pada halaman portofolio penghargaan
    Dan pengguna mengatur tingkat penghargaan menjadi "institut" pada halaman portofolio penghargaan
    Dan pengguna mengisi nama penghargaan dengan "namaAcak" pada halaman portofolio penghargaan
    Dan pengguna mengisi tahun penghargaan dengan "2020" pada halaman portofolio penghargaan
    Dan pengguna mengisi instansi pemberi dengan "ITS" pada halaman portofolio penghargaan
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio penghargaan
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio penghargaan

  @Positif
  Skenario: mencari nama penghargaan pada halaman portofolio penghargaan
    Ketika pengguna mencari "Penghargaan" dan menekan enter pada halaman portofolio penghargaan
    Maka pengguna harus melihat data dengan nama penghargaan yang mengandung "Penghargaan" pada halaman portofolio penghargaan

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio penghargaan
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio penghargaan
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                             |
      | nama penghargaan yang tidak ada  |

  @Positif
  Skenario konsep: filter berdasarkan jenis bahan ajar pada halaman portofolio penghargaan
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data yang mengandung "<filter>" pada halaman portofolio penghargaan
    Contoh:
      | filter   |
      | Akademik |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio penghargaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio penghargaan
    Maka pengguna harus melihat nama penghargaan pada halaman detail portofolio penghargaan

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio penghargaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio penghargaan
    Maka pengguna harus melihat nama penghargaan pada halaman detail portofolio penghargaan

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio penghargaan
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio penghargaan
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio penghargaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio penghargaan
    Maka pengguna harus melihat nama penghargaan pada halaman detail portofolio penghargaan

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio penghargaan
    Dan pengguna mengedit nama penghargaan dengan "namaAcak" pada halaman portofolio penghargaan
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio penghargaan
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio penghargaan
    Maka pengguna harus melihat data hasil edit pada halaman portofolio penghargaan