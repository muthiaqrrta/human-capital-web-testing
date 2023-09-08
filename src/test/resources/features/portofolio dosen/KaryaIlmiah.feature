# language: id

@FiturKaryaIlmiah @PortofolioDosen
Fitur: Fitur Karya Ilmiah

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Karya Ilmiah" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur karya ilmiah pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat judul pada halaman portofolio karya ilmiah

  @Positif
  Skenario: pengguna menambahkan data dengan judul karya ilmiah yang ada pada halaman portofolio karya ilmiah
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mencari judul karya ilmiah "Desain Kontroller untuk Kestabilan DInamik Sistem Tenaga Listrik" pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik tombol selanjutnya pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik icon tambah penulis pada halaman portofolio karya ilmiah
    Dan pengguna mengatur jenis penulis menjadi "SDM" pada halaman portofolio karya ilmiah
    Dan pengguna mengatur peran menjadi "Editor" pada halaman portofolio karya ilmiah
    Dan pengguna mengatur nama penulis menjad "Dewantina" pada halaman portofolio karya ilmiah
    Dan pengguna mengatur corresponding author menjadi "tidak" pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik tombol tambah pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik tombol selesai pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio karya ilmiah

  @Positif
  Skenario: pengguna menambahkan data dengan judul karya ilmiah yang tidak ada pada halaman portofolio karya ilmiah
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mencentang checkbox judul baru pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik tombol selanjutnya pada halaman portofolio karya ilmiah
    Dan pengguna mengatur kategori kegiatan menjadi "mengedit atau menyunting karya ilmiah yang diterbitkan dan diedarkan secara nasional" pada halaman portofolio karya ilmiah
    Dan pengguna mengatur jenis karya ilmiah menjadi "Monograf" pada halaman portofolio karya ilmiah
    Dan pengguna mengatur peran menjadi "Penulis" pada halaman portofolio karya ilmiah
    Dan pengguna mengisi judul dengan "randomJudul" pada halaman portofolio karya ilmiah
    Dan pengguna mengisi abstrak dengan "lorem ipsum" pada halaman portofolio karya ilmiah
    Dan pengguna mengisi tanggal terbit dengan "02022022" pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik tombol selesai pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio karya ilmiah

  @Positif
  Skenario: mencari judul karya ilmiah pada halaman portofolio karya ilmiah
    Ketika pengguna mencari "Karya" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data dengan judul yang mengandung "Karya" pada halaman portofolio karya ilmiah

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio karya ilmiah
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                 |
      | judul yang tidak ada |

  @Positif
  Skenario konsep: filter berdasarkan jenis karya ilmiah pada halaman portofolio karya ilmiah
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter untuk jenis karya ilmiah menjadi "<filter>" pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat jenis karya ilmiah "<filter>" pada halaman portofolio karya ilmiah
    Contoh:
      | filter   |
      | Monograf |

  @Positif
  Skenario: pengguna memeriksa detail data pada halaman portofolio karya ilmiah
    Ketika pengguna mengeklik data teratas pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat judul karya ilmiah pada halaman detail portofolio karya ilmiah

  @Positif
  Skenario: pengguna menghapus data pada halaman portofolio karya ilmiah
    Ketika pengguna mengeklik data teratas pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat judul karya ilmiah pada halaman detail portofolio karya ilmiah

    Ketika pengguna mengeklik tombol hapus pada halaman detail portofolio karya ilmiah
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mencari "dataYangDihapus" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data kosong pada halaman portofolio

  @Positif
  Skenario: pengguna mengedit data pada halaman portofolio karya ilmiah
    Ketika pengguna mengeklik data teratas pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat judul karya ilmiah pada halaman detail portofolio karya ilmiah

    Ketika pengguna mengeklik tombol edit data pada halaman detail portofolio karya ilmiah
    Dan pengguna mengedit judul dengan "randomJudul" pada halaman portofolio karya ilmiah
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangDiedit" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data kosong pada halaman portofolio

    Ketika pengguna mencari "dataHasilEdit" dan menekan enter pada halaman portofolio karya ilmiah
    Maka pengguna harus melihat data hasil edit pada halaman portofolio karya ilmiah