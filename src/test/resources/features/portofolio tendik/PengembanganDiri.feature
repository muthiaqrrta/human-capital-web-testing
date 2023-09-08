# language: id

@FiturPengembanganDiri @PortofolioTendik @RegressionTest
Fitur: Fitur Pengembangan Diri

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Pengembangan Diri" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur pengembangan diri pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama pengembangan diri pada halaman portofolio pengembangan diri
    Dan pengguna harus melihat jenis pengembangan diri pada halaman portofolio pengembangan diri
    Dan pengguna harus melihat nama penyelenggara pada halaman portofolio pengembangan diri
    Dan pengguna harus melihat tanggal pelaksanaan pada halaman portofolio pengembangan diri
    Dan pengguna harus melihat status verifikasi pada halaman portofolio pengembangan diri

  @Positif
  Skenario: pengguna menambahkan data pengembangan diri pada halaman portofolio pengembangan diri
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "diklat prajabatan" pada halaman portofolio pengembangan diri
    Dan pengguna mengatur jenis pengembangan diri menjadi "Pelatihan" pada halaman portofolio pengembangan diri
    Dan pengguna mengisi nama pengembangan diri dengan "namaAcak" pada halaman portofolio pengembangan diri
    Dan pengguna mengisi nama penyelenggara dengan "namaAcak" pada halaman portofolio pengembangan diri
    Dan pengguna mengatur tingkat menjadi "Regional/provinsi" pada halaman portofolio pengembangan diri
    Dan pengguna mengisi tahun dengan "2021" pada halaman portofolio pengembangan diri
    Dan pengguna mengisi tanggal mulai dengan "08122020" pada halaman portofolio pengembangan diri
    Dan pengguna mengisi tanggal selesai dengan "08232020" pada halaman portofolio pengembangan diri
    Dan pengguna mengisi durasi jam dengan "12" pada halaman portofolio pengembangan diri
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pengembangan diri

  @Positif
  Skenario: mencari nama pengembangan diri pada halaman portofolio pengembangan diri
    Ketika pengguna mencari "Pengembangan" dan menekan enter pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat data dengan nama pengembangan diri yang mengandung "Pengembangan" pada halaman portofolio pengembangan diri

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio pengembangan diri
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                                   |
      | nama pengembangan diri yang tidak ada  |

  @Positif
  Skenario konsep: filter berdasarkan jenis pengembangan diri pada halaman portofolio pengembangan diri
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data yang mengandung "<filter>" pada halaman portofolio pengembangan diri
    Contoh:
      | filter    |
      | Pelatihan |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio pengembangan diri
    Ketika pengguna mengeklik data teratas pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat nama pengembangan diri pada halaman detail portofolio pengembangan diri

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio pengembangan diri
    Ketika pengguna mengeklik data teratas pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat nama pengembangan diri pada halaman detail portofolio pengembangan diri

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio pengembangan diri
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio pengembangan diri
    Ketika pengguna mengeklik data teratas pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat nama pengembangan diri pada halaman detail portofolio pengembangan diri

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio pengembangan diri
    Dan pengguna mengedit nama pengembangan diri dengan "namaAcak" pada halaman portofolio pengembangan diri
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio pengembangan diri
    Maka pengguna harus melihat data hasil edit pada halaman portofolio pengembangan diri