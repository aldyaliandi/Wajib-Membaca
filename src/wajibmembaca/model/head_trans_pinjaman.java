package wajibmembaca.model;
/**
 *
 * @author Aldy
 */
public class head_trans_pinjaman {
    private String id_peminjaman;
    private String tanggal_peminjaman;
    private String tanggal_kembali;
    private int id_anggota;
    private int jumlah_buku;
    private int total_harga;
    private int status;
    
    public head_trans_pinjaman (String id_peminjaman,String tanggal_peminjaman,String tanggal_kembali,
                                    int id_anggota, int jumlah_buku,int total_harga,int status){
        this.id_peminjaman = id_peminjaman;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.tanggal_kembali = tanggal_kembali;
        this.id_anggota = id_anggota;
        this.jumlah_buku = jumlah_buku;
        this.total_harga = total_harga;
        this.status = status;
    }

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public String getTanggal_peminjaman() {
        return tanggal_peminjaman;
    }

    public void setTanggal_peminjaman(String tanggal_peminjaman) {
        this.tanggal_peminjaman = tanggal_peminjaman;
    }

    public String getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(String tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public int getJumlah_buku() {
        return jumlah_buku;
    }

    public void setJumlah_buku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
