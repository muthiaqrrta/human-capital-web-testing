# language: id

@FiturBahanAjar @PortofolioDosen
Fitur: Fitur Bahan Ajar

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Bahan Ajar" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur bahan ajar pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul bahan ajar pada halaman portofolio bahan ajar

  @Positif
  Skenario: pengguna menambahkan data bahan ajar pada halaman portofolio bahan ajar
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "mengembangkan program kuliah" pada halaman portofolio bahan ajar
    Dan pengguna mengatur jenis bahan ajar menjadi "Diktat" pada halaman portofolio bahan ajar
    Dan pengguna mengisi judul bahan ajar dengan "judulAcak" pada halaman portofolio bahan ajar
    Dan pengguna mengisi nama penerbit dengan "namaAcak" pada halaman portofolio bahan ajar
    Dan pengguna mengatur peran menjadi "Editor" pada halaman portofolio bahan ajar
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio bahan ajar
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio bahan ajar

  @Positif
  Skenario konsep: mencari <data> pada halaman portofolio bahan ajar
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio bahan ajar
    Maka pengguna harus melihat data yang mengandung "<data>" pada halaman portofolio bahan ajar
    Contoh:
      | data         |
      | Buku         |
      | Audio visual |

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio bahan ajar
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio bahan ajar
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                            |
      | judul bahan ajar yang tidak ada |
      | jenis bahan ajar yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis bahan ajar pada halaman portofolio bahan ajar
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data dengan jenis bahan ajar "<filter>" pada halaman portofolio bahan ajar
    Contoh:
      | filter    |
      | Buku ajar |