
package wajibmembaca.model;
/**
 *
 * @author Aldy
 */
public class master_buku {
    private String isbn;
    private String judul;
    private String penulis;
    private String publisher;
    private String tahun_terbit;
    private int jumlah_halaman;
    
    public master_buku(String isbn, String judul, String penulis, String publisher, String tahun_terbit, int jumlah_halaman) {
        this.isbn = isbn;
        this.jumlah_halaman = jumlah_halaman;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun_terbit = tahun_terbit;
        this.publisher = publisher;
    }

   

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }
}
    

 