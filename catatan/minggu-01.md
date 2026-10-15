# Catatan Minggu 1: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Saya mengisi tiga program Java (HelloProsedural, HelloOOP, HelloFungsional)
yang menghasilkan teks sapaan sama: memuat "Aset-Pinjam", nama, dan NIM.
Saya juga mengisi mahasiswa.properties dengan nama dan NIM saya, lalu
menjalankan tes dengan scripts/uji.ps1.

## Keputusan desain
Format sapaan saya seragam di ketiga gaya:
"Aset-Pinjam <nama> (NIM: <nim>)", supaya hasilnya sama persis.
Nama dan NIM dibaca lewat Varian.aktif() dari mahasiswa.properties, tidak
ditulis langsung di kode.

## Kendala
Saya sempat mengubah main dengan menulis nama dan NIM langsung dan salah menulis "string" huruf kecil, padahal seharusnya memakai Varian.aktif(). Saya kembalikan ke bentuk aslinya.

## Penggunaan AI
- Alat yang dipakai: CLAUDE
- Bagian yang dibantu AI: mahami instruksi minggu-01.md; memeriksa method sapa() di HelloProsedural dan HelloOOP, pembuatSapaan() di HelloFungsional; membaca error kompilasi di HelloOOP
- Prompt utama:  
 1. "suruh ngapain sih sebenere? saya bingung" dengan screenshot minggu-01.md
 2. "apa perbedaan dari fungsional oop dan prosedural"
 3. Screenshot kode dan hasil tes yang gagal, untuk mencari penyebab error
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
- Satu hal yang saya pahami lebih baik sekarang:perbedaan tiga gaya.
  Prosedural memisahkan data dan fungsi, OOP membungkus keduanya dalam
  class, fungsional mengembalikan fungsi (lambda) sebagai hasil.
