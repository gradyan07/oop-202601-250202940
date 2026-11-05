# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya mengisi method hitungDenda di Ruang, Laptop, dan AlatLab. Dendanya dihitung dari hari terlambat dikali pengali dikali tarif per hari. Pengali Ruang 1, Laptop 2, AlatLab 4. Kalau harinya negatif, program melempar error. Kalau harinya 0, dendanya otomatis 0.
Saya juga mengisi dua method cari() di KatalogAset. Yang pertama mencari aset berdasarkan kata di namanya, tidak peduli huruf besar atau kecil. Yang kedua sama, tapi hanya untuk jenis aset tertentu.
Setelah dijalankan dengan .\scripts\uji.ps1 -Minggu 4, hasilnya BUILD SUCCESS dan 27 tes lulus.

## Keputusan desain
Tidak ada keputusan khusus minggu ini karena aturannya sudah pasti. Saya menulis hitungDenda di tiap subclass dengan @Override karena tugasnya memang meminta begitu. Di method cari() saya pakai for biasa supaya mudah dipahami.

## Kendala
File KatalogAset.java yang saya salin masuk ke folder yang salah (config), sehingga muncul error dan Varian.java ikut hilang. Saya cek dengan git status, mengembalikan Varian.java dengan git restore, lalu menghapus file yang salah tempat. Setelah itu saya isi KatalogAset.java di folder katalog yang benar.
Kendala kedua, tes yang jalan hanya sampai minggu 3. Saya atasi dengan menjalankan uji.ps1 memakai -Minggu 4.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: menjelaskan tugas dan membantu membaca error.
- Prompt utama: suruh ngapain yaaa; urutan pengerjaannya; class Varian dimana kok merah semua; kok baru menjalankan tes week 1 sampai 3
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Supaya tes minggu 4 jalan, saya memakai opsi -Minggu 4 di uji.ps1 dan tidak mengubah file bawaan.
- Satu hal yang saya pahami lebih baik sekarang: overriding berarti subclass menimpa method milik parent, dan yang dipakai dipilih saat program berjalan. Overloading berarti nama method sama tapi parameternya beda, dan dipilih saat kompilasi.