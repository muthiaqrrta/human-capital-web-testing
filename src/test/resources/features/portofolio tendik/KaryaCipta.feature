# language: id

@FiturKaryaCipta @PortofolioTendik @RegressionTest
Fitur: Fitur Karya Cipta

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Karya Cipta" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur karya cipta pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul pada halaman portofolio karya cipta
    Dan pengguna harus melihat jenis karya cipta pada halaman portofolio karya cipta
    Dan pengguna harus melihat kategori karya cipta pada halaman portofolio karya cipta
    Dan pengguna harus melihat tanggal rilis pada halaman portofolio karya cipta
    Dan pengguna harus melihat penyelenggara pada halaman portofolio karya cipta

  @Positif
  Skenario: pengguna menambahkan data karya cipta pada halaman portofolio karya cipta
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "membuat rancangan dan karya seni sebagai penulis buku kumpulan puisi tingkat nasional" pada halaman portofolio karya cipta
    Dan pengguna mengatur kategori karya cipta menjadi "Seni" pada halaman portofolio karya cipta
    Dan pengguna mengatur tingkat karyca cipta menjadi "Nasional" pada halaman portofolio karya cipta
    Dan pengguna mengisi judul dengan "namaAcak" pada halaman portofolio karya cipta
    Dan pengguna mengatur tanggal permohonan menjadi "06232023" pada halaman portofolio karya cipta
    Dan pengguna mengatur tanggal rilis menjadi "08232023" pada halaman portofolio karya cipta
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio karya cipta
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio karya cipta

  @Positif
  Skenario: mencari judul karya cipta pada halaman portofolio karya cipta
    Ketika pengguna mencari "Karya Cipta" dan menekan enter pada halaman portofolio karya cipta
    Maka pengguna harus melihat data dengan judul yang mengandung "Karya Cipta" pada halaman portofolio karya cipta

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio karya cipta
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio karya cipta
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                             |
      | judul karya cipta yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan kategori karya cipta pada halaman portofolio karya cipta
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter untuk kategori karya cipta menjadi "<filter>" pada halaman portofolio karya cipta
    Maka pengguna harus melihat jenis karya cipta "<filter>" pada halaman portofolio karya cipta
    Contoh:
      | filter |
      | Seni   |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio karya cipta
    Ketika pengguna mengeklik data teratas pada halaman portofolio karya cipta
    Maka pengguna harus melihat judul karya cipta pada halaman detail portofolio karya cipta

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio karya cipta
    Ketika pengguna mengeklik data teratas pada halaman portofolio karya cipta
    Maka pengguna harus melihat judul karya cipta pada halaman detail portofolio karya cipta

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio karya cipta
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio karya cipta
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio karya cipta
    Ketika pengguna mengeklik data teratas pada halaman portofolio karya cipta
    Maka pengguna harus melihat judul karya cipta pada halaman detail portofolio karya cipta

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio karya cipta
    Dan pengguna mengedit judul dengan "namaAcak" pada halaman portofolio karya cipta
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio karya cipta
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio karya cipta
    Maka pengguna harus melihat data hasil edit pada halaman portofolio karya cipta