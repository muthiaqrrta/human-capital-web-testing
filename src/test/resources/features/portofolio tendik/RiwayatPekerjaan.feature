# language: id

@FiturRiwayatPekerjaan @PortofolioTendik @RegressionTest
Fitur: Fitur Riwayat Pekerjaan

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Riwayat Pekerjaan" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur riwayat pekerjaan pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nama jabatan pekerjaan pada halaman portofolio riwayat pekerjaan
    Dan pengguna harus melihat instansi pada halaman portofolio riwayat pekerjaan
    Dan pengguna harus melihat jenis pekerjaan pada halaman portofolio riwayat pekerjaan
    Dan pengguna harus melihat tanggal mulai pada halaman portofolio riwayat pekerjaan
    Dan pengguna harus melihat tanggal selesai pada halaman portofolio riwayat pekerjaan
    Dan pengguna harus melihat status verifikasi pada halaman portofolio riwayat pekerjaan

  @Positif
  Skenario: pengguna menambahkan data riwayat pekerjaan pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur jenis pekerjaan menjadi "wirausaha" pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengatur jenis instansi menjadi "bumn" pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengisi nama jabatan pekerjaan dengan "namaAcak" pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengatur nama kbli menjadi "Pertanian Jagung" pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengisi instansi dengan "ITS" pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengisi tanggal mulai dengan "23012021" pada halaman portofolio riwayat pekerjaan
    Dan pengguna memilih "ya" untuk opsi luar negeri pada halaman portofolio riwayat pekerjaan
    Dan pengguna memilih "ya" untuk opsi pendiri perusahaan pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio riwayat pekerjaan

  @Positif
  Skenario: mencari nama jabatan pekerjaan pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mencari "Dev" dan menekan enter pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat data dengan nama jabatan pekerjaan yang mengandung "Dev" pada halaman portofolio riwayat pekerjaan

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                                  |
      | nama jabatan pekerjaan yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis pekerjaan pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data yang mengandung "<filter>" pada halaman portofolio riwayat pekerjaan
    Contoh:
      | filter    |
      | Wirausaha |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat nama jabatan pekerjaan pada halaman detail portofolio riwayat pekerjaan

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat nama jabatan pekerjaan pada halaman detail portofolio riwayat pekerjaan

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio riwayat pekerjaan
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio riwayat pekerjaan
    Ketika pengguna mengeklik data teratas pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat nama jabatan pekerjaan pada halaman detail portofolio riwayat pekerjaan

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio riwayat pekerjaan
    Dan pengguna mengedit nama jabatan pekerjaan dengan "namaAcak" pada halaman portofolio riwayat pekerjaan
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio riwayat pekerjaan
    Maka pengguna harus melihat data hasil edit pada halaman portofolio riwayat pekerjaan