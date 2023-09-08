# language: id

@FiturPembicara @PortofolioTendik @RegressionTest
Fitur: Fitur Pembicara

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Pembicara" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur pembicara pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul makalah pada halaman portofolio pembicara
    Dan pengguna harus melihat nama pertemuan ilmiah pada halaman portofolio pembicara
    Dan pengguna harus melihat kategori pembicara pada halaman portofolio pembicara
    Dan pengguna harus melihat tingkat pertemuan pada halaman portofolio pembicara
    Dan pengguna harus melihat tanggal pelaksanaan pada halaman portofolio pembicara

  @Positif
  Skenario: pengguna menambahkan data pembicara pada halaman portofolio pembicara
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur jenis pembicara menjadi "Pidato" pada halaman portofolio pembicara
    Dan pengguna mengatur kategori kegiatan menjadi "menyampaikan orasi ilmiah pada tingkat" pada halaman portofolio pembicara
    Dan pengguna mengisi judul makalah dengan "judulAcak" pada halaman portofolio pembicara
    Dan pengguna mengisi nama pertemuan ilmiah dengan "namaAcak" pada halaman portofolio pembicara
    Dan pengguna mengatur kategori pembicara menjadi "pembicara kunci" pada halaman portofolio pembicara
    Dan pengguna mengisi penyelenggara dengan "namaAcak" pada halaman portofolio pembicara
    Dan pengguna mengatur tanggal pelaksanaan menjadi "01012020" pada halaman portofolio pembicara
    Dan pengguna mengatur tanggal mulai menjadi "01122019" pada halaman portofolio pembicara
    Dan pengguna mengatur tanggal selesai menjadi "10012020" pada halaman portofolio pembicara
    Dan pengguna mengatur tingkat pertemuan menjadi "nasional" pada halaman portofolio pembicara
    Dan pengguna memilih "ya" untuk opsi insidentil pada halaman portofolio pembicara
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio pembicara
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio pembicara

  @Positif
  Skenario: mencari judul makalah pada halaman portofolio pembicara
    Ketika pengguna mencari "Title" dan menekan enter pada halaman portofolio pembicara
    Maka pengguna harus melihat data dengan judul makalah yang mengandung "Title" pada halaman portofolio pembicara

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio pembicara
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio pembicara
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                              |
      | judul makalah yang tidak ada      |

  @Positif
  Skenario konsep: filter berdasarkan tingkat pertemuan pada halaman portofolio pembicara
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter menjadi "<filter>" pada halaman portofolio
    Maka pengguna harus melihat data dengan tingkat pertemuan "<filter>" pada halaman portofolio pembicara
    Contoh:
      | filter   |
      | Nasional |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio pembicara
    Ketika pengguna mengeklik data teratas pada halaman portofolio pembicara
    Maka pengguna harus melihat judul pembicara pada halaman detail portofolio pembicara

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio pembicara
    Ketika pengguna mengeklik data teratas pada halaman portofolio pembicara
    Maka pengguna harus melihat judul pembicara pada halaman detail portofolio pembicara

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio pembicara
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio pembicara
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio pembicara
    Ketika pengguna mengeklik data teratas pada halaman portofolio pembicara
    Maka pengguna harus melihat judul pembicara pada halaman detail portofolio pembicara

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio pembicara
    Dan pengguna mengedit judul makalah dengan "judulAcak" pada halaman portofolio pembicara
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio pembicara
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio pembicara
    Maka pengguna harus melihat data hasil edit pada halaman portofolio pembicara