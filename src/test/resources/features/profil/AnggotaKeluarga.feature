# language: id

@FiturAnggotaKeluarga @Profil @RegressionTest
Fitur: Fitur Anggota Keluarga

  Dasar: arahkan pengguna ke halaman profil
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Profil"
    Dan pengguna mengeklik tombol "Anggota Keluarga" selengkapnya pada halaman profil

  @Positif
  Skenario: memeriksa fitur anggota keluarga pada halaman profil
    Maka pengguna harus melihat judul fitur pada halaman profil
    Dan pengguna harus melihat nama lengkap pada halaman profil anggota keluarga
    Dan pengguna harus melihat hubungan keluarga pada halaman profil anggota keluarga
    Dan pengguna harus melihat tanggal ajuan pada halaman profil anggota keluarga
    Dan pengguna harus melihat tanggal verifikasi pada halaman profil anggota keluarga
    Dan pengguna harus melihat status verifikasi pada halaman profil anggota keluarga

  @Positif
  Skenario: pengguna secara otomatis menambahkan data anggota keluarga yang pegawai its pada halaman profil anggota keluarga
    Ketika pengguna mengeklik tombol tambah data pada halaman profil
    Dan pengguna memilih "ya" untuk opsi pegawai its pada halaman profil anggota keluarga
    Dan pengguna memilih "Vicky Mahfudy" untuk pegawai its pada halaman profil anggota keluarga
    Dan pengguna mengisi nomor kk dengan "nomorAcak" pada halaman profil anggota keluarga
    Dan pengguna mengatur tanggal lahir menjadi "7" "Aug" "2000" pada halaman profil anggota keluarga
    Dan pengguna mengatur hubungan keluarga menjadi "Saudara" pada halaman profil anggota keluarga
    Dan pengguna mengatur alamat menjadi "Jawa Timur" "Surabaya" "Sukolilo" pada halaman profil anggota keluarga
    Dan pengguna memilih "ya" untuk opsi pns pada halaman profil anggota keluarga
    Dan pengguna mengeklik tombol simpan pada halaman profil
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mengeklik tombol kembali pada halaman profil
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman profil anggota keluarga
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman profil anggota keluarga

    Ketika pengguna mengeklik data teratas pada halaman profil anggota keluarga
    Maka pengguna harus melihat nama lengkap pada halaman detail profil anggota keluarga

    Ketika pengguna mengeklik tombol hapus pada halaman detail profil anggota keluarga
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman profil anggota keluarga
    Maka pengguna harus melihat data kosong pada halaman profil

  @Positif
  Skenario: pengguna menambahkan data anggota keluarga yang bukan pegawai its pada halaman profil anggota keluarga
    Ketika pengguna mengeklik tombol tambah data pada halaman profil
    Dan pengguna memilih "tidak" untuk opsi pegawai its pada halaman profil anggota keluarga
    Dan pengguna mengisi nama lengkap dengan "namaAcak" pada halaman profil anggota keluarga
    Dan pengguna mengisi nik dengan "nomorAcak" pada halaman profil anggota keluarga
    Dan pengguna mengisi nomor kk dengan "nomorAcak" pada halaman profil anggota keluarga
    Dan pengguna mengatur jenis kelamin menjadi "Perempuan" pada halaman profil anggota keluarga
    Dan pengguna mengatur tanggal lahir menjadi "7" "Aug" "2000" pada halaman profil anggota keluarga
    Dan pengguna mengatur hubungan keluarga menjadi "Anak Kandung" pada halaman profil anggota keluarga
    Dan pengguna mengatur alamat menjadi "Jawa Timur" "Surabaya" "Sukolilo" pada halaman profil anggota keluarga
    Dan pengguna memilih "ya" untuk opsi pns pada halaman profil anggota keluarga
    Dan pengguna mengeklik tombol simpan pada halaman profil
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mengeklik tombol kembali pada halaman profil
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman profil anggota keluarga
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman profil anggota keluarga

  @Positif
  Skenario: mencari nama lengkap pada halaman profil anggota keluarga
    Ketika pengguna mencari "Muthia" dan menekan enter pada halaman profil
    Dan pengguna harus melihat data dengan nama yang mengandung "Muthia" pada halaman profil anggota keluarga

  @Negatif
  Skenario konsep: mencari <data> pada halaman profil anggota keluarga
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman profil
    Maka pengguna harus melihat data kosong pada halaman profil
    Contoh:
      | data                |
      | nama yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis kelamin pada halaman profil anggota keluarga
    Ketika pengguna mengeklik tombol filter pada halaman profil
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman profil
    Maka pengguna harus melihat data dengan jenis kelamin "<filter>" pada halaman profil anggota keluarga
    Contoh:
      | filter    |
      | Perempuan |

  @Positif
  Skenario konsep: filter berdasarkan status hubungan keluarga pada halaman profil anggota keluarga
    Ketika pengguna mengeklik tombol filter pada halaman profil
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman profil
    Maka pengguna harus melihat data dengan status hubungan keluarga "<filter>" pada halaman profil anggota keluarga
    Contoh:
      | filter       |
      | Anak Kandung |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman profil anggota keluarga
    Ketika pengguna mengeklik data teratas pada halaman profil anggota keluarga
    Maka pengguna harus melihat nama lengkap pada halaman detail profil anggota keluarga

  @Positif
  Skenario: pengguna menghapus data anggota keluarga dengan status belum diajukan pada halaman profil anggota keluarga
    Ketika pengguna mengatur filter status verifikasi menjadi "belumDiajukan" pada halaman profil anggota keluarga
    Dan pengguna mengeklik data teratas pada halaman profil anggota keluarga
    Maka pengguna harus melihat nama lengkap pada halaman detail profil anggota keluarga

    Ketika pengguna mengeklik tombol hapus pada halaman detail profil anggota keluarga
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman profil anggota keluarga
    Maka pengguna harus melihat data kosong pada halaman profil

  @Positif
  Skenario: pengguna mengedit data pada halaman profil anggota keluarga
    Ketika pengguna mengatur filter status verifikasi menjadi "belumDiajukan" pada halaman profil anggota keluarga
    Dan pengguna mengeklik data teratas pada halaman profil anggota keluarga
    Maka pengguna harus melihat nama lengkap pada halaman detail profil anggota keluarga

    Ketika pengguna mengeklik tombol edit data pada halaman detail profil anggota keluarga
    Dan pengguna mengedit nama lengkap dengan "namaAcak" pada halaman profil anggota keluarga
    Dan pengguna mengeklik tombol simpan pada halaman profil
    Maka pengguna harus melihat notifikasi berhasil pada halaman profil

    Ketika pengguna mengeklik tombol kembali pada halaman profil
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman profil anggota keluarga
    Maka pengguna harus melihat data kosong pada halaman profil

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman profil anggota keluarga
    Maka pengguna harus melihat data hasil edit pada halaman profil anggota keluarga