# language: id

@FiturPengelolaJurnal @PortofolioDosen
Fitur: Fitur Pengelola Jurnal

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Pengelola Jurnal" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur pengelola jurnal pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama jurnal pada halaman portofolio pengelola jurnal
    Dan pengguna harus melihat tingkat pada halaman portofolio pengelola jurnal
    Dan pengguna harus melihat media publikasi pada halaman portofolio pengelola jurnal
    Dan pengguna harus melihat tmt tst sk penugasan pada halaman portofolio pengelola jurnal
    Dan pengguna harus melihat status aktif pada halaman portofolio pengelola jurnal

  @Positif
  Skenario: menambahkan data pengelola jurnal pada halaman portofolio pengelola jurnal
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "berperan serta aktif dalam pengelolaan jurnal" pada halaman portofolio pengelola jurnal
    Dan pengguna mengisi nama jurnal dengan "namaAcak" pada halaman portofolio pengelola jurnal
    Dan pengguna mengatur media publikasi menjadi "cepalo" pada halaman portofolio pengelola jurnal
    Dan pengguna mengatur tingkat menjadi "Institut" pada halaman portofolio pengelola jurnal
    Dan pengguna mengatur peran menjadi "Dewan Redaksi" pada halaman portofolio pengelola jurnal
    Dan pengguna mengisi nomor sk penugasan dengan "nomorAcak" pada halaman portofolio pengelola jurnal
    Dan pengguna mengatur tmt sk penugasan menjadi "10122022" pada halaman portofolio pengelola jurnal
    Dan pengguna memilih "ya" untuk opsi status aktif pada halaman portofolio pengelola jurnal
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio pengelola jurnal
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pengelola jurnal

  @Positif
  Skenario: mencari nama jurnal pada halaman portofolio pengelola jurnal
    Ketika pengguna mencari "Jurnal" dan menekan enter pada halaman portofolio pengelola jurnal
    Maka pengguna harus melihat data dengan nama jurnal yang mengandung "Jurnal" pada halaman portofolio pengelola jurnal

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio pengelola jurnal
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio pengelola jurnal
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                       |
      | nama jurnal yang tidak ada |
      | tingkat yang tidak ada     |

  @Positif
  Skenario konsep: filter berdasarkan peran pada halaman portofolio pengelola jurnal
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data dengan peran "<filter>" pada halaman portofolio pengelola jurnal
    Contoh:
      | filter |
      | Editor |