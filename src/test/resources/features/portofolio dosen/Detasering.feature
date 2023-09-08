# language: id

@FiturDetasering @PortofolioDosen
Fitur: Fitur Detasering

  Dasar: arahkan pengguna ke halaman portofolio
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Portofolio"
    Dan pengguna mengeklik fitur "Detasering" pada halaman portofolio

  @Positif
  Skenario: memeriksa fitur detasering pada halaman portofolio
    Maka pengguna harus melihat judul fitur pada halaman portofolio
    Dan pengguna harus melihat nomor sk penugasan pada halaman portofolio detasering
    Dan pengguna harus melihat jenis detasering pada halaman portofolio detasering
    Dan pengguna harus melihat afiliasi pada halaman portofolio detasering
    Dan pengguna harus melihat tanggal mulai pada halaman portofolio detasering
    Dan pengguna harus melihat bidang tugas pada halaman portofolio detasering

  @Positif
  Skenario: pengguna menambahkan data detasering pada halaman portofolio detasering
    Ketika pengguna mengeklik tombol tambah data pada halaman portofolio
    Dan pengguna mengatur kategori kegiatan menjadi "melaksanakan kegiatan datasering" pada halaman portofolio detasering
    Dan pengguna mengatur jenis detasering menjadi "Detasering" pada halaman portofolio detasering
    Dan pengguna mengatur afiliasi menjadi "institut teknologi sepuluh nopember" pada halaman portofolio detasering
    Dan pengguna mengisi nomor sk penugasan dengan "nomorAcak" pada halaman portofolio detasering
    Dan pengguna mengatur tanggal sk penugasan menjadi "08232022" pada halaman portofolio detasering
    Dan pengguna mengeklik tombol simpan pada halaman portofolio
    Maka pengguna harus melihat notifikasi berhasil pada halaman portofolio

    Ketika pengguna mengeklik tombol kembali pada halaman portofolio
    Dan pengguna mencari "dataYangBaruDitambahkan" dan menekan enter pada halaman portofolio detasering
    Maka pengguna harus melihat data yang baru saja ditambahkan pada halaman portofolio detasering

  @Positif
  Skenario: mencari nomor sk penugasan pada halaman portofolio detasering
    Ketika pengguna mencari "123456" dan menekan enter pada halaman portofolio detasering
    Maka pengguna harus melihat data dengan nomor sk penugasan yang mengandung "123456" pada halaman portofolio detasering

  @Negatif
  Skenario konsep: mencari <data> pada halaman portofolio detasering
    Ketika pengguna mencari "<data>" dan menekan enter pada halaman portofolio detasering
    Maka pengguna harus melihat data kosong pada halaman portofolio
    Contoh:
      | data                              |
      | nomor sk penugasan yang tidak ada |
      | jenis detasering yang tidak ada   |

  @Positif
  Skenario konsep: filter berdasarkan organisasi sasaran pada halaman portofolio detasering
    Ketika pengguna mengeklik tombol filter pada halaman portofolio
    Dan pengguna mengatur filter untuk organisasi sasaran menjadi "<filter>" pada halaman portofolio detasering
    Maka pengguna harus melihat data dengan organisasi sasaran "<filter>" pada halaman portofolio detasering
    Contoh:
      | filter                              |
      | Institut Teknologi Sepuluh Nopember |
