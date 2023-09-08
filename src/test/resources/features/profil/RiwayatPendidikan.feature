# language: id

@FiturRiwayatPendidikan @Profil @RegressionTest
Fitur: Fitur Riwayat Pendidikan

  Dasar: arahkan pengguna ke halaman profil
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Profil"
    Dan pengguna mengeklik tombol "Riwayat Pendidikan" selengkapnya pada halaman profil

  @Positif
  Skenario: memeriksa fitur riwayat pendidikan pada halaman profil
    Maka pengguna harus melihat judul fitur pada halaman profil
    Dan pengguna harus melihat nama institusi pendidikan pada halaman profil riwayat pendidikan
    Dan pengguna harus melihat satuan pendidikan pada halaman profil riwayat pendidikan
    Dan pengguna harus melihat bidang studi pada halaman profil riwayat pendidikan
    Dan pengguna harus melihat jenjang pendidikan pada halaman profil riwayat pendidikan
    Dan pengguna harus melihat tanggal ijazah pada halaman profil riwayat pendidikan
    Dan pengguna harus melihat gelar akademik pada halaman profil riwayat pendidikan
    Dan pengguna harus melihat status verifikasi pada halaman profil riwayat pendidikan

  @Positif
  Skenario: pengguna menambahkan data riwayat pendidikan pada halaman profil riwayat pendidikan
    Ketika pengguna mengeklik tombol tambah data pada halaman profil
    Dan pengguna mengisi nama institusi pendidikan dengan "namaAcak" pada halaman profil riwayat pendidikan
    Dan pengguna mengatur jenjang pendidikan menjadi "S2" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi satuan pendidikan dengan "Institut" pada halaman profil riwayat pendidikan
    Dan pengguna mengatur bidang studi menjadi "Teknik Informatika" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi program studi dengan "S2" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi nomor induk dengan "nomorAcak" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi tahun masuk dengan "2019" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi tahun lulus dengan "2023" pada halaman profil riwayat pendidikan
    Dan pengguna mengatur tanggal lulus menjadi "20072023" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi ipk dengan "4.00" pada halaman profil riwayat pendidikan
    Dan pengguna mengisi sks lulus dengan "144" pada halaman profil riwayat pendidikan
    Dan pengguna memilih "ya" untuk opsi kependidikan pada halaman profil riwayat pendidikan
    Dan pengguna mengeklik tombol simpan pada halaman profil
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mengeklik tombol kembali pada halaman profil
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman profil riwayat pendidikan

  @Positif
  Skenario: mencari nama institusi pendidikan pada halaman profil riwayat pendidikan
    Ketika pengguna mencari "Institut" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data dengan nama institusi pendidikan yang mengandung "Institut" pada halaman profil riwayat pendidikan

  @Positif
  Skenario: mencari satuan pendidikan pada halaman profil riwayat pendidikan
    Ketika pengguna mencari "Institut" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data dengan satuan pendidikan yang mengandung "Institut" pada halaman profil riwayat pendidikan

  @Negatif
  Skenario konsep: mencari <data> pada halaman profil riwayat pendidikan
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data kosong pada halaman profil
    Contoh:
      | data                                     |
      | nama institusi pendidikan yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenjang pendidikan pada halaman profil riwayat pendidikan
    Ketika pengguna mengeklik tombol filter pada halaman profil
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman profil
    Maka pengguna harus melihat data dengan jenjang pendidikan "<filter>" pada halaman profil riwayat pendidikan
    Contoh:
      | filter        |
      | S2            |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman profil riwayat pendidikan
    Ketika pengguna mengeklik data teratas pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat nama institusi pendidikan pada halaman detail profil riwayat pendidikan

  @Positif
  Skenario: pengguna menghapus data anggota keluarga dengan status belum diajukan pada halaman profil riwayat pendidikan
    Ketika pengguna mengatur filter status verifikasi menjadi "belumDiajukan" pada halaman profil riwayat pendidikan
    Dan pengguna mengeklik data teratas pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat nama institusi pendidikan pada halaman detail profil riwayat pendidikan

    Ketika pengguna mengeklik tombol hapus pada halaman detail profil riwayat pendidikan
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat data kosong pada halaman profil

  @Positif
  Skenario: pengguna mengedit data pada halaman profil riwayat pendidikan
    Ketika pengguna mengatur filter status verifikasi menjadi "belumDiajukan" pada halaman profil riwayat pendidikan
    Dan pengguna mengeklik data teratas pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat nama institusi pendidikan pada halaman detail profil riwayat pendidikan

    Ketika pengguna mengeklik tombol edit data pada halaman detail profil riwayat pendidikan
    Dan pengguna mengedit nama institusi pendidikan dengan "namaAcak" pada halaman profil riwayat pendidikan
    Dan pengguna mengeklik tombol simpan pada halaman profil
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mengeklik tombol kembali pada halaman profil
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat data kosong pada halaman profil

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman profil riwayat pendidikan
    Maka pengguna harus melihat data hasil edit pada halaman profil riwayat pendidikan