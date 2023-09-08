# language: id

@FiturTes @PortofolioDosen
Fitur: Fitur Tes

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Tes" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur tes pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama tes pada halaman portofolio tes
    Dan pengguna harus melihat jenis tes pada halaman portofolio tes
    Dan pengguna harus melihat penyelenggara pada halaman portofolio tes
    Dan pengguna harus melihat tanggal tes pada halaman portofolio tes

  @Positif
  Skenario: pengguna menambahkan data tes pada halaman portofolio tes
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur jenis tes menjadi "TPA Bappenas, maks : 800.00" pada halaman portofolio tes
    Dan pengguna mengisi nama tes dengan "namaAcak" pada halaman portofolio tes
    Dan pengguna mengisi nama penyelenggara dengan "namaAcak" pada halaman portofolio tes
    Dan pengguna mengisi tanggal tes dengan "02122020" pada halaman portofolio tes
    Dan pengguna mengisi skor dengan "750" pada halaman portofolio tes
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio tes
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio tes

  @Positif
  Skenario: mencari nama tes pada halaman portofolio tes
    Ketika pengguna mencari "TOEFL" dan menekan enter pada halaman portofolio tes
    Maka pengguna harus melihat data dengan nama tes yang mengandung "TOEFL" pada halaman portofolio tes

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio tes
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio tes
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                     |
      | nama tes yang tidak ada  |
      | jenis tes yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis tes pada halaman portofolio tes
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data dengan jenis tes "<filter>" pada halaman portofolio tes
    Contoh:
      | filter                   |
      | TOEFL ITP, maks : 677.00 |