
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

import wajibmembaca.model.master_buku;
import wajibmembaca.model.interfaces.interfaces_master_buku;
/**
 *
 * @author Aldy
 */
public class querymasterbuku implements interfaces_master_buku {
    private Connection conn = SQLConnection.getConnection();

    @Override
    public boolean insert(master_buku b) {
        String sql = "INSERT INTO master_buku values (?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, b.getIsbn());
            statement.setString(2, b.getJudul());
            statement.setString(3, b.getPenulis());
            statement.setString(4, b.getPublisher());
            statement.setString(5, b.getTahun_terbit());
            statement.setInt(6, b.getJumlah_halaman());
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
    }

    @Override
    public boolean update(master_buku b) {
        String sql = "UPDATE master_buku SET judul=?, penulis=?, publisher=?, tahun_terbit=?,"
                + "jumlah_halaman=? WHERE isbn=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, b.getJudul());
            statement.setString(2, b.getPenulis());
            statement.setString(3, b.getPublisher());
            statement.setString(4, b.getTahun_terbit());
            statement.setInt(5, b.getJumlah_halaman());
            statement.setString(6, b.getIsbn());
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
    }

    @Override
    public boolean delete(String isbn) {
        String sql = "DELETE FROM master_buku where isbn=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, isbn);
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
    }

    @Override
    public String generateID() {
      String isbn = "0";
        String sql ="EXEC genIDMaster_Buku";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                isbn = rs.getString(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return isbn;
        }

    @Override
    public List<master_buku> getAllmaster_buku() {
        List<master_buku> listmaster_buku = new ArrayList<>();
        String sql = "Select * from master_buku";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    master_buku s = new master_buku (
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6)
                    );
                    listmaster_buku.add(s);
                }
                statement.close();
            }
        }catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex); 
    }
    return listmaster_buku;
    }

    @Override
    public master_buku getOnemaster_bukuByID(String isbn) {
         master_buku output = null;
        String sql = "Select * from master_buku where isbn=?";
        try{
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, isbn);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new master_buku(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
                                                , rs.getInt(6));        
            }
            statement.close();
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex);    
    }
    return output;
    }
   
    @Override
    public List<master_buku> getAllmaster_bukubyName(String judul) {
         List<master_buku> listmaster_buku = new ArrayList<>();
        String sql = "Select * from master_buku WHERE judul like ?";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, judul);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    master_buku s = new master_buku (
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6)
                    );
                    listmaster_buku.add(s);
                }
                statement.close();
            }
        }catch (SQLException ex) {
            Logger.getLogger(master_buku.class.getName()).log(Level.SEVERE, null, ex); 
    }
    return listmaster_buku;
}
    }
    
