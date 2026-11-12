# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Minggu ini saya mengisi empat method di kelas `JadwalPeminjaman`, yaitu `bentrok()`, `semuaUrutMulai()`, `perAset()`, dan `hapus()`. Saya juga memutuskan bahwa peminjaman yang jam selesainya pas banget sama jam mulai peminjaman berikutnya itu "tidak bentrok". Keputusan ini saya catat di `docs/asumsi.md` dan saya buat tes buktinya di file `mahasiswa/BatasBentrokTest.java`. Terakhir saya mengubah `minggu-aktif.txt` menjadi 7.

## Keputusan desain
Untuk struktur data di dalam `JadwalPeminjaman`, saya memutuskan untuk tetap hanya memakai `List<Peminjaman>` bawaannya (`ArrayList`). Saya tidak membuat `Map` atau `Set` baru sebagai field di atas, karena nanti ribet harus update dua-duanya setiap ada penambahan atau penghapusan jadwal. Jadi untuk method `perAset()`, `Map` barunya langsung dibuat dan diisi di dalam method itu saja pas dipanggil.

## Kendala
Waktu bikin method `bentrok()`, awalnya saya mau ngecek asetnya sama atau tidak pakai `ada.getAset().equals(baru.getAset())`. Tapi ternyata selalu dianggap beda karena kita belum bikin method equals di class Aset. Akhirnya saya sadar kalau ngeceknya harus pakai `getKode()`.

## Penggunaan AI
- Alat yang dipakai: Gemini
- Bagian yang dibantu AI: Penjelasan tugas minggu 7, cara bikin logika irisan waktu di method `bentrok()`, dan cara mengurutkan list pakai `Comparator`.
- Prompt utama: 
  1. "Tolong jelaskan tugas minggu 7 ini disuruh ngapain aja?"
  2. "Gimana cara nulis logika coding buat ngecek dua jadwal itu bentrok atau ngga di Java?"
  3. "Cara ngurutin List berdasarkan waktu mulai pakai Comparator gimana?"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya tidak memasukkan field `Map` baru di dalam class `JadwalPeminjaman` seperti saran awal AI, karena saya mau kodenya simpel pakai 1 List saja biar gak bentrok sama `daftarMutable()`.
- Satu hal yang saya pahami lebih baik sekarang: Saya jadi paham cara kerja `Comparator.comparing` untuk mengurutkan objek berdasarkan salah satu nilai di dalamnya (misal berdasarkan jam mulai).