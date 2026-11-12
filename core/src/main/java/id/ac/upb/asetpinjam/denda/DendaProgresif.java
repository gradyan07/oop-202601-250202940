package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Sampai 7 hari sama dengan DendaFlat. Setelah itu, tiap hari tambahan
 * menambah 10% dari denda dasar (rumus dicatat di docs/asumsi.md).
 */
public class DendaProgresif implements AturanDenda {

    private static final int HARI_TANPA_TAMBAHAN = 7;

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        long dasar = aset.hitungDenda(hariTerlambat);
        if (hariTerlambat <= HARI_TANPA_TAMBAHAN) {
            return dasar;
        }
        long hariLebih = hariTerlambat - HARI_TANPA_TAMBAHAN;
        return dasar + (dasar * hariLebih) / 10;
    }
}