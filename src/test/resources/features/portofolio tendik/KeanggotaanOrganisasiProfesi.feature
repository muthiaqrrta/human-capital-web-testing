# language: id

@FiturKeanggotaanOrganisasiProfesi @PortofolioTendik @RegressionTest
Fitur: Fitur Keanggotaan Organisasi Profesi

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Keanggotaan Organisasi Profesi" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur keanggotaan organisasi profesi pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama organisasi pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna harus melihat peran pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna harus melihat masa keanggotaan pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna harus melihat instansi profesi pada halaman portofolio keanggotaan organisasi profesi

  @Positif
  Skenario: pengguna menambahkan data organisasi pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "Menjadi anggota organisasi profesi sebagai pengurus" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengisi nama organisasi dengan "namaAcak" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengatur tingkat menjadi "Internasional" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengisi peran dengan "randomRole" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengatur jenis peran menjadi "Pengurus aktif" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengatur tanggal mulai masa anggota menjadi "08232022" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio keanggotaan organisasi profesi

  @Positif
  Skenario: mencari nama organisasi pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mencari "Organisasi" dan menekan enter pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat data dengan nama organisasi yang mengandung "Organisasi" pada halaman portofolio keanggotaan organisasi profesi

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                           |
      | nama organisasi yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis peran pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data yang mengandung "<filter>" pada halaman portofolio keanggotaan organisasi profesi
    Contoh:
      | filter         |
      | Pengurus aktif |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mengeklik data teratas pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat nama organisasi pada halaman detail portofolio keanggotaan organisasi profesi

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mengeklik data teratas pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat nama organisasi pada halaman detail portofolio keanggotaan organisasi profesi

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio keanggotaan organisasi profesi
    Ketika pengguna mengeklik data teratas pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat nama organisasi pada halaman detail portofolio keanggotaan organisasi profesi

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio keanggotaan organisasi profesi
    Dan pengguna mengedit nama organisasi dengan "namaAcak" pada halaman portofolio keanggotaan organisasi profesi
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio keanggotaan organisasi profesi
    Maka pengguna harus melihat data hasil edit pada halaman portofolio keanggotaan organisasi profesi