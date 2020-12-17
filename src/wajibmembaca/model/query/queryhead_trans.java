
package wajibmembaca.model.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wajibmembaca.SQLConnection.SQLConnection;
import wajibmembaca.model.detail_trans_pinjaman;
import wajibmembaca.model.head_trans_pinjaman;
import wajibmembaca.model.interfaces.interfaces_head_trans_pinjaman;
import wajibmembaca.model.master_anggota;
import wajibmembaca.model.master_buku;

/**
 *
 * @author Aldy
 */
public class queryhead_trans implements interfaces_head_trans_pinjaman{
    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(head_trans_pinjaman p) {
        String sql = "INSERT INTO head_trans_pinjaman values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, p.getId_peminjaman());
            statement.setString(2, p.getTanggal_peminjaman());
            statement.setInt(3, p.getId_anggota());
            statement.setInt(4, p.getJumlah_buku());
            statement.setInt(5, p.getTotal_harga());
            statement.setString(6, p.getTanggal_kembali());
            statement.setInt (7, p.getStatus());
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(head_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(head_trans_pinjaman p) {
        String sql = "UPDATE head_trans_pinjaman "
                + "SET tanggal_peminjaman=?, tanggal_kembali=? jumlah_buku=?, total_harga=? "
                + "WHERE id_peminjaman=? AND id_anggota=? AND status=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, p.getTanggal_peminjaman());
            statement.setString(2, p.getTanggal_kembali());
            statement.setInt(3, p.getJumlah_buku());
            statement.setInt(4, p.getTotal_harga());
            statement.setString(5, p.getId_peminjaman());
            statement.setInt(6, p.getId_anggota());
            statement.setInt(7, p.getStatus());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean delete(String id_peminjaman) {
        String sql = "DELETE FROM head_trans_pinjaman "
                + "where id_peminjaman=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, id_peminjaman);
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public String generateID() {
        String id_peminjaman = "";
        String sql = "EXEC genIDPeminjaman";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_peminjaman = rs.getString(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_peminjaman;
    }

    @Override
    public List<head_trans_pinjaman> getAllhead_trans_pinjaman() {
        List<head_trans_pinjaman> listHead_trans_pinjaman = new ArrayList<>();
        String sql = "Select * from head_trans_pinjaman";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    head_trans_pinjaman p = new head_trans_pinjaman(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getInt(6),
                            rs.getInt(7)
                    );
                    listHead_trans_pinjaman.add(p);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(head_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHead_trans_pinjaman;
        }

    @Override
    public head_trans_pinjaman getOnehead_trans_pinjamanByID(String id_peminjaman) {
        head_trans_pinjaman output = null;
        String sql = "Select * from head_trans_pinjaman where id_peminjaman=?";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, id_peminjaman);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new head_trans_pinjaman(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getInt(6),
                            rs.getInt(7)
                    );
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(head_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
        }

    @Override
    public List<head_trans_pinjaman> getAllhead_trans_pinjamanbyName(int status) {
        List<head_trans_pinjaman> listhead_trans_pinjaman = new ArrayList<>();
        String sql = "Select a.*,b.status "
                + "from head_trans_pinjaman a "
                + "JOIN pinjaman b "
                + "ON a.id_peminjaman = b.isbn "
                + "WHERE b.status like %?%";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, status);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    head_trans_pinjaman p = new head_trans_pinjaman(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getInt(6),
                            rs.getInt(7)
                    );
                    listhead_trans_pinjaman.add(p);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(head_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listhead_trans_pinjaman;
    }
    }
    