# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Minggu ini saya membuat Class Diagram dan Sequence Diagram menggunakan format Mermaid (`.mmd`) dan menyimpannya di folder `docs/uml/`. Saya juga membuat file `solid.md` untuk menjelaskan prinsip OCP dan DIP yang sebenarnya sudah diterapkan pada kode di minggu sebelumnya. Terakhir, saya mengubah angka di `minggu-aktif.txt` menjadi 6 dan menjalankan skrip pengujian sampai semua tes untuk dokumen minggu ini lulus.

## Keputusan desain
Saya memilih pakai format teks `.mmd` (Mermaid) daripada menggambar manual supaya lebih praktis dan gambarnya bisa otomatis muncul (dirender) di GitHub atau VS Code. Untuk Class Diagram, relasi `JadwalPeminjaman` ke daftar peminjaman saya jadikan agregasi. Sedangkan relasi dari `Peminjaman` ke `Aset` dan `Peminjam` saya jadikan asosiasi biasa, alasannya karena objek aset dan data peminjam akan tetap ada di sistem walaupun data peminjamannya dihapus. Saya juga memutuskan untuk tidak merombak kode Java lagi karena struktur kelas denda (interface `AturanDenda` dan turunannya) sudah sangat pas untuk menunjukkan prinsip OCP dan DIP.

## Kendala
Saya sempat mengalami error saat membuat diagram Mermaid, terutama saat menuliskan tipe data *generics* seperti `List<Aset>` atau `Map`. Ternyata sintaks Mermaid tidak menggunakan kurung siku, melainkan harus menggunakan tanda tilde (`~`). Setelah saya ubah formatnya menjadi seperti `List~Aset~`, diagramnya baru bisa terbaca dan muncul tanpa error.

## Penggunaan AI
- Alat yang dipakai: Gemini
- Bagian yang dibantu AI: Kerangka awal sintaks Mermaid untuk class diagram dan sequence diagram, serta ide penyusunan kalimat penjelasan prinsip SOLID.
- Prompt utama: 
  1. "Tolong jelaskan tugas minggu 6 ini, dan bantu buatkan contoh sintaks class diagram dan sequence diagramnya menggunakan format mermaid berdasarkan kode yang sudah saya buat."
  2. "Bantu susunkan draf penjelasan prinsip OCP dan DIP yang ada di modul denda untuk file solid.md."
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Kode diagram awal dari AI ada yang menyarankan relasi komposisi, tapi saya tolak dan ubah menjadi asosiasi biasa karena menurut saya lebih cocok dengan *lifecycle* objeknya. Saya juga mencocokkan ulang nama-nama atribut, method, dan *package* di diagram agar benar-benar sama persis dengan file Java aslinya supaya lulus tes konsistensi.
- Satu hal yang saya pahami lebih baik sekarang: Saya jadi lebih paham cara membedakan kapan harus pakai garis asosiasi, agregasi, atau komposisi di Class Diagram. Saya juga baru sadar kalau memisahkan aturan denda ke interface tersendiri di minggu kemarin itu adalah contoh langsung penerapan *Open/Closed Principle* (OCP).