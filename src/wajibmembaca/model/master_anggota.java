
package wajibmembaca.model;
/**
 *
 * @author Aldy
 */
public class master_anggota {
    private int id_anggota;
    private String nama_anggota;
    private String alamat_anggota;
    private String email_anggota;
    private String no_tlp_anggota;
    
    public master_anggota(int id_anggota,String nama_anggota, String alamat_anggota, String email_anggota,
                                             String no_tlp_anggota){
        this.id_anggota = id_anggota;
        this.nama_anggota = nama_anggota;
        this.alamat_anggota= alamat_anggota;
        this.email_anggota = email_anggota;
        this.no_tlp_anggota = no_tlp_anggota;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getNama_anggota() {
        return nama_anggota;
    }

    public void setNama_anggota(String nama_anggota) {
        this.nama_anggota = nama_anggota;
    }

    public String getAlamat_anggota() {
        return alamat_anggota;
    }

    public void setAlamat_anggota(String alamat_anggota) {
        this.alamat_anggota = alamat_anggota;
    }

    public String getEmail_anggota() {
        return email_anggota;
    }

    public void setEmail_anggota(String email_anggota) {
        this.email_anggota = email_anggota;
    }

    public String getNo_tlp_anggota() {
        return no_tlp_anggota;
    }

    public void setNo_tlp_anggota(String no_tlp_anggota) {
        this.no_tlp_anggota = no_tlp_anggota;
    }
}
