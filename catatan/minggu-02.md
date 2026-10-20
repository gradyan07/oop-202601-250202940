# Catatan Minggu 02: Class, Object, Encapsulation

## Yang saya kerjakan
Saya melengkapi class Aset: field private (kode, nama, status, kondisi), konstruktor dengan validasi, getter, serta setter untuk nama, status, dan kondisi. Kode dibuat final tanpa setter. Semua tes minggu 1 dan 2 lulus.

## Keputusan desain
Kode dan nama tidak dinormalisasi (tanpa trim atau huruf besar) dan disimpan apa adanya, karena aturan hanya mewajibkan tidak null atau kosong. Alasan lengkap ada di docs/asumsi.md (A-02). Field kode saya buat final supaya tidak bisa berubah setelah objek dibuat.

## Kendala
Awalnya saya bingung membaca hasil tes: BUILD FAILURE muncul karena Aset.java masih error, lalu setelah diperbaiki output menampilkan "Tests run: 0" dari modul API yang membuat saya mengira tes tidak jalan. Saya mengatasinya dengan menjalankan ulang `.\scripts\uji.ps1 -Minggu 2 | Select-String "Tests run"` sampai terlihat hasil tiap modul (Minggu01Test 5 tes dan Minggu02AsetTest 6 tes, semuanya lulus). Saya juga sempat bingung format docs/asumsi.md sehingga entri pertama masuk ke bagian template dan menimpa contoh A-01, lalu saya pindahkan ke bagian bawah dan kembalikan contohnya. Terakhir, saya memilih menambahkan file satu per satu ke git supaya hanya file minggu 2 yang ikut commit.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: penjelasan maksud soal minggu 2, draf kode Aset.java (konstruktor, getter, setter, validasi), penjelasan soal, dan cara menjalankan tes.
- Prompt utama: "suruh ngapain, dan harus mencoding bagian mana, dan apa maksudnya"
- Yang saya ubah atau tolak dari saran AI: saya menolak menambah normalisasi (trim/huruf besar) karena tidak diwajibkan dan bisa mengubah input pengguna diam-diam. Saya juga memeriksa sendiri hasil tes dan hanya memasukkan file minggu 2 ke commit.
- Satu hal yang saya pahami lebih baik sekarang: encapsulation, yaitu field dibuat private dan hanya diubah lewat setter yang memvalidasi, supaya objek tidak pernah berada dalam keadaan tidak valid.