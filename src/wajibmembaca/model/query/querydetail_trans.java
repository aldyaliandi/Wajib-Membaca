
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
import wajibmembaca.model.interfaces.interfaces_detail_trans_pinjaman;

public class querydetail_trans implements interfaces_detail_trans_pinjaman {
    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(detail_trans_pinjaman p) {
         String sql = "INSERT INTO detail_trans_pinjaman values (?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, p.getId_reg_detail());
            statement.setString(2, p.getId_peminjaman());
            statement.setString(3, p.getIsbn());
            statement.setInt(4, p.getTotal_hari());
            statement.setInt(5, p.getTotal_beli());
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
    public boolean update(detail_trans_pinjaman p) {
        String sql = "UPDATE detail_trans_penjualan "
                + "SET total_beli=?, total_beli=?, id_reg_detail=? "
                + "WHERE id_peminjaman=? AND isbn=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, p.getTotal_hari());
            statement.setInt(2, p.getTotal_beli());
            statement.setString(3, p.getId_peminjaman());
            statement.setString(4, p.getIsbn());
            statement.setInt (5, p.getId_reg_detail());
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
    public boolean delete(String id_peminjaman, String isbn) {
        String sql = "DELETE FROM detail_trans_pinjaman "
                + "where id_peminjaman=? AND isbn=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, id_peminjaman);
            statement.setString(2, isbn);
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
    public int generateID() {
         int id_detail = 0;
        String sql = "EXEC genIDDetail";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_detail = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_detail;
    }
    
@Override
    public int generateIDReg() {
        int id_reg_detail = 0;
        String sql = "EXEC genIDReg";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_reg_detail = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_reg_detail;
    }
        @Override
    public List<detail_trans_pinjaman> getAlldetail_trans_pinjaman() {
        List<detail_trans_pinjaman> listdetail_trans_pinjaman = new ArrayList<>();
        String sql = "Select * from detail_trans_pinjaman";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    detail_trans_pinjaman p = new detail_trans_pinjaman(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5)
                    );
                    listdetail_trans_pinjaman.add(p);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listdetail_trans_pinjaman;
    }
        @Override
    public detail_trans_pinjaman getOnedetail_trans_pinjamanByID(String id_peminjaman) {
        detail_trans_pinjaman output = null;
        String sql = "Select * from detail_trans_pinjaman where id_peminjaman=?";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, id_peminjaman);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new detail_trans_pinjaman(rs.getInt(1),rs.getInt(2),
                            rs.getString(3),rs.getString(4),rs.getInt(5));
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }
    @Override
    public List<detail_trans_pinjaman> getAlldetail_trans_pinjamanByID(String id_peminjaman) {
        List<detail_trans_pinjaman> listdetail_trans_pinjaman = new ArrayList<>();
        String sql = "SELECT * FROM detail_trans_pinjaman "
                + "WHERE id_peminjaman like %?%";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, id_peminjaman);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    detail_trans_pinjaman p = new detail_trans_pinjaman(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5)
                    );
                    listdetail_trans_pinjaman.add(p);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(detail_trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listdetail_trans_pinjaman;
    }
    }
   