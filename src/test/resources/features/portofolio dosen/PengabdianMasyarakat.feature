# language: id

@FiturPengabdianMasyarakat @PortofolioDosen
Fitur: Fitur Pengabdian Masyarakat

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Pengabdian Masyarakat" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur pengabdian masyarakat pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul pada halaman portofolio pengabdian masyarakat
    Dan pengguna harus melihat tahun pelaksanaan pada halaman portofolio pengabdian masyarakat
    Dan pengguna harus melihat tanggal sk penugasan pada halaman portofolio pengabdian masyarakat
    Dan pengguna harus melihat lokasi kegiatan pada halaman portofolio pengabdian masyarakat
    Dan pengguna harus melihat lama kegiatan pada halaman portofolio pengabdian masyarakat

  @Positif
  Skenario: menambahkan data pengabdian masyarakat pada halaman portofolio pengabdian masyarakat
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "berdasarkan bidang keahlian" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengisi judul dengan "randomTitle" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengisi lama kegiatan dengan "20" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengisi tahun usulan dengan "2020" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengisi tahun kegiatan dengan "2020" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengisi tahun pelaksanaan dengan "2020" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengisi tahun pelaksanaan ke dengan "2" pada halaman portofolio pengabdian masyarakat
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio pengabdian masyarakat
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pengabdian masyarakat

  @Positif
  Skenario: mencari judul pengabdian masyarakat pada halaman portofolio pengabdian masyarakat
    Ketika pengguna mencari "Pengmas" dan menekan enter pada halaman portofolio pengabdian masyarakat
    Maka pengguna harus melihat data dengan judul yang mengandung "Pengmas" pada halaman portofolio pengabdian masyarakat

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio pengabdian masyarakat
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio pengabdian masyarakat
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                                       |
      | judul pengabdian masyarakat yang tidak ada |