# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Minggu ini saya mengubah kelas Aset menjadi abstract class dan mengisi method bisaDipinjam(). Method hitungDenda() saya jadikan abstract supaya setiap jenis aset wajib punya aturan dendanya sendiri. Lalu saya mengisi dua kelas denda, yaitu DendaFlat dan DendaProgresif, yang sama-sama mengimplementasikan interface AturanDenda. Terakhir saya mengubah minggu-aktif.txt menjadi 5 dan menjalankan tes sampai lolos semua.

## Keputusan desain
Rumus denda progresif saya tentukan sendiri. Sampai 7 hari terlambat, dendanya sama dengan DendaFlat. Mulai hari ke-8, setiap hari tambahan menambah 10% dari denda dasar. Saya memilih rumus ini karena memenuhi tiga syarat tes: hari ke-0 hasilnya 0, tidak pernah lebih murah dari flat, dan tidak pernah turun saat hari bertambah. Pada hari ke-30 dendanya juga lebih mahal dari flat. Rumus lengkapnya saya catat di docs/asumsi.md.

## Kendala
Awalnya uji.ps1 hanya menjalankan tes minggu 1 sampai 3, jadi tes minggu 4 dan 5 tidak ikut jalan. Ternyata penyebabnya isi minggu-aktif.txt masih lama. Setelah saya ubah menjadi 5, tes minggu 1 sampai 5 berjalan dan semuanya lolos (32 tes, 0 gagal). Saya juga sempat bingung dengan tulisan "Tests run: 0" di bagian bawah, tapi ternyata itu dari modul API yang memang belum punya tes.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: Aset.java (bisaDipinjam dan hitungDenda abstract), DendaFlat.hitung, DendaProgresif.hitung
- Prompt utama:
  1. "Jelaskan tugas minggu 5 Abstraction ini, apa saja yang harus dikerjakan dan di bagian mana saja"
  2. "uji.ps1 masih menjalankan minggu 1 sampai 3, bagaimana cara mengubahnya langsung ke minggu 5"
- Yang saya ubah atau tolak dari saran AI: Kode awal dari AI memakai nama yang masih tebakan, jadi saya cek ke file asli lewat screenshot lalu menyesuaikannya: import AturanDenda ternyata dari package kontrak, dan nama enum yang dipakai StatusAset. AI juga awalnya menyuruh menulis rumus progresif di catatan minggu 5, tetapi setelah membaca komentar di DendaProgresif.java, rumus harus dicatat di docs/asumsi.md, jadi saya ikuti petunjuk itu. Untuk menjalankan tes, AI sempat menyarankan perintah Maven langsung, tetapi saya tetap memakai uji.ps1 karena itu cara resmi dari tugas, lalu mengubah minggu-aktif.txt menjadi 5 supaya tes minggu 4 dan 5 ikut jalan.
- Satu hal yang saya pahami lebih baik sekarang: Abstract class boleh punya method yang sudah berisi (seperti bisaDipinjam) sekaligus method abstract (hitungDenda) yang wajib diisi subclass. Jadi aturan yang sama untuk semua aset ditaruh di kelas induk, sedangkan yang berbeda-beda diserahkan ke subclass.