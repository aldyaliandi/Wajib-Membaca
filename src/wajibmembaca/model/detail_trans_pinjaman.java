/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wajibmembaca.model;

/**
 *
 * @author Aldy
 */
public class detail_trans_pinjaman {
    private int total_beli;
    private int total_hari;
    private String isbn;
    private String id_peminjaman;
    private int id_reg_detail;
    
    public detail_trans_pinjaman(int total_beli, int total_hari,String isbn,String id_peminjaman,int id_reg_detail){
        this.isbn = isbn;
        this.total_beli = total_beli;
        this.id_peminjaman= id_peminjaman;
        this.id_reg_detail = id_reg_detail;
        this.total_hari = total_hari;
    }

    public int getTotal_beli() {
        return total_beli;
    }

    public void setTotal_beli(int total_beli) {
        this.total_beli = total_beli;
    }

    public int getTotal_hari() {
        return total_hari;
    }

    public void setTotal_hari(int total_hari) {
        this.total_hari = total_hari;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public int getId_reg_detail() {
        return id_reg_detail;
    }

    public void setId_reg_detail(int id_reg_detail) {
        this.id_reg_detail = id_reg_detail;
    }
}
