# language: id

@FiturPenelitian @PortofolioTendik @RegressionTest
Fitur: FiturPenelitian

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Penelitian" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur penelitian pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul pada halaman portofolio penelitian
    Dan pengguna harus melihat tahun pelaksanaan pada halaman portofolio penelitian
    Dan pengguna harus melihat tanggal sk penugasan pada halaman portofolio penelitian
    Dan pengguna harus melihat lokasi kegiatan pada halaman portofolio penelitian
    Dan pengguna harus melihat lama kegiatan pada halaman portofolio penelitian

  @Positif
  Skenario: pengguna menambahkan data penelitian pada halaman portofolio penelitian
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengisi judul dengan "randomTitle" pada halaman portofolio penelitian
    Dan pengguna mengisi lama kegiatan dengan "20" pada halaman portofolio penelitian
    Dan pengguna mengisi tahun usulan dengan "2020" pada halaman portofolio penelitian
    Dan pengguna mengisi tahun kegiatan dengan "2020" pada halaman portofolio penelitian
    Dan pengguna mengisi tahun pelaksanaan dengan "2020" pada halaman portofolio penelitian
    Dan pengguna mengisi tahun pelaksanaan ke dengan "2" pada halaman portofolio penelitian
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio penelitian
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio penelitian

  @Positif
  Skenario: mencari judul penelitian pada halaman portofolio penelitian
    Ketika pengguna mencari "Research" dan menekan enter pada halaman portofolio penelitian
    Maka pengguna harus melihat data dengan judul yang mengandung "Research" pada halaman portofolio penelitian

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio penelitian
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio penelitian
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                 |
      | judul yang tidak ada |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio penelitian
    Ketika pengguna mengeklik data teratas pada halaman portofolio penelitian
    Maka pengguna harus melihat judul penelitian pada halaman detail portofolio penelitian

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio penelitian
    Ketika pengguna mengeklik data teratas pada halaman portofolio penelitian
    Maka pengguna harus melihat judul penelitian pada halaman detail portofolio penelitian

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio penelitian
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio penelitian
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio penelitian
    Ketika pengguna mengeklik data teratas pada halaman portofolio penelitian
    Maka pengguna harus melihat judul penelitian pada halaman detail portofolio penelitian

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio penelitian
    Dan pengguna mengedit judul dengan "randomTitle" pada halaman portofolio penelitian
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio penelitian
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio penelitian
    Maka pengguna harus melihat data hasil edit pada halaman portofolio penelitian