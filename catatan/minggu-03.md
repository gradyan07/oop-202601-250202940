# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Minggu ini saya mengisi tiga class turunan dari Aset, yaitu Ruang, Laptop, dan AlatLab. Tiap class saya beri field sendiri, konstruktor yang memanggil super, validasi, getter, dan getJenis. Setelah itu saya jalankan uji.ps1 dengan minggu-aktif.txt diubah ke 3. Hasilnya 19 tes di modul Core lulus, termasuk 8 tes Minggu03HierarkiTest, tanpa gagal dan tanpa error.

## Keputusan desain
Kode dan nama saya biarkan di Aset karena semua jenis aset punya dua field itu. Field yang hanya dipakai satu jenis saya taruh di class turunannya. Kapasitas ada di Ruang, spesifikasi dan nomor inventaris ada di Laptop, laboratorium dan tingkat risiko ada di AlatLab. Validasi tiap class saya tulis setelah pemanggilan super, jadi validasi bawaan Aset tetap jalan.

Contoh inheritance yang kurang cocok dibanding komposisi adalah aturan denda. Kalau aturan denda ditentukan oleh jenis class, setiap ada aturan baru saya harus bikin subclass baru, dan aturannya tidak bisa diganti ketika program sedang berjalan. Kalau pakai komposisi, Aset cukup menyimpan satu objek kebijakan denda yang bisa diganti tanpa menambah hierarki class.

## Kendala
Awalnya hasil tes muncul Tests run: 0 padahal BUILD SUCCESS, jadi saya sempat bingung. Ternyata angka 0 itu dari modul API yang memang belum punya tes, sedangkan tes minggu 3 ada di modul Core dan sudah tergulung ke atas di terminal. Selain itu minggu-aktif.txt masih berisi 2, sehingga tes minggu 3 belum ikut jalan, dan saya sempat menjalankan perintah di PowerShell yang salah folder. Saya atasi dengan mengubah minggu-aktif.txt jadi 3, menjalankan ulang di terminal VS Code, lalu memfilter output pakai Select-String supaya hasil per tes kelihatan.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: kerangka kode Ruang, Laptop, dan AlatLab, penjelasan instruksi tugas, cara menjalankan tes dan membaca hasilnya.
- Prompt utama: coba bantu jelaskan ini disuruh ngapain; langkah pengerjaannya; cara ubah week aktifnya ke week 3 gimana
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya tidak langsung percaya BUILD SUCCESS karena jumlah tesnya masih 0, jadi saya cek lagi sampai Minggu03HierarkiTest terlihat jalan. Kode dari AI juga saya cocokkan dengan file tes, mulai dari urutan parameter, nama getter, sampai jenis exception.
- Satu hal yang saya pahami lebih baik sekarang: class turunan harus memanggil super lebih dulu supaya validasi class induk tetap jalan, dan BUILD SUCCESS saja belum cukup, jumlah tes yang dijalankan juga harus dicek.