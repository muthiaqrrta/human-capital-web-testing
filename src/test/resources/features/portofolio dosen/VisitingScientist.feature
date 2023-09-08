# language: id

@FiturVisitingScientist @PortofolioDosen
Fitur: Fitur Visiting Scientist

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Visiting Scientist" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur visiting scientist pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat aktivitas litabmas pada halaman portofolio visiting scientist
    Dan pengguna harus melihat pt pengundang pada halaman portofolio visiting scientist
    Dan pengguna harus melihat lama kegiatan pada halaman portofolio visiting scientist
    Dan pengguna harus melihat tanggal pelaksanaan pada halaman portofolio visiting scientist
    Dan pengguna harus melihat nomor sk penugasan pada halaman portofolio visiting scientist

  @Positif
  Skenario: pengguna menambahkan data visiting scientist pada halaman portofolio visiting scientist
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "diklat prajabatan" pada halaman portofolio visiting scientist
    Dan pengguna mengatur aktivitas litabmas menjadi "PM1" pada halaman portofolio visiting scientist
    Dan pengguna mengatur pt pengundang menjadi "universitas brawijaya" pada halaman portofolio visiting scientist
    Dan pengguna mengisi lama kegiatan dengan "7" pada halaman portofolio visiting scientist
    Dan pengguna mengisi kegiatan penting dengan "lorem ipsum" pada halaman portofolio visiting scientist
    Dan pengguna mengisi tanggal pelaksanaan dengan "12232020" pada halaman portofolio visiting scientist
    Dan pengguna mengisi nomor sk penugasan dengan "nomorAcak" pada halaman portofolio visiting scientist
    Dan pengguna mengisi tanggal sk penugasan dengan "01012021" pada halaman portofolio visiting scientist
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio visiting scientist
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio visiting scientist

  @Positif
  Skenario: mencari aktivitas litabmas pada halaman portofolio visiting scientist
    Ketika pengguna mencari "Evaluasi" dan menekan enter pada halaman portofolio visiting scientist
    Maka pengguna harus melihat data dengan aktivitas litabmas yang mengandung "Evaluasi" pada halaman portofolio visiting scientist

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio visiting scientist
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio visiting scientist
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                              |
      | aktivitas litabmas yang tidak ada |