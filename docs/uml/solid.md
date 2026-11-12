# Prinsip SOLID pada Sistem Aset-Pinjam

Berdasarkan struktur kode pada modul `core`, berikut adalah dua prinsip SOLID yang diterapkan:

## 1. Open/Closed Principle (OCP)
- **Kelas terkait:** `AturanDenda` (`kontrak`), `DendaFlat` (`denda`), `DendaProgresif` (`denda`), serta `Aset` (`model`).
- **Alasan:** Sistem terbuka untuk penambahan aturan denda baru tanpa perlu memodifikasi kode perhitungan denda yang sudah berjalan. Jika kampus ingin menambah aturan perhitungan denda baru (misalnya `DendaAkhirPekan`), cukup membuat kelas baru yang mengimplementasikan interface `AturanDenda` tanpa mengubah kelas `DendaFlat`, `DendaProgresif`, maupun hierarki `Aset`.

## 2. Dependency Inversion Principle (DIP)
- **Kelas terkait:** `LayananDenda` (`denda`) dan interface `AturanDenda` (`kontrak`).
- **Alasan:** Modul tingkat tinggi (`LayananDenda`) tidak bergantung langsung pada kelas konkret seperti `DendaFlat` atau `DendaProgresif`, melainkan bergantung pada abstraksi yaitu interface `AturanDenda` yang disuntikkan melalui konstruktor. Dengan pemisahan ini, perilaku perhitungan denda mudah diganti saat runtime dan mudah diuji secara terisolasi menggunakan implementasi tiruan (mock/lambda).