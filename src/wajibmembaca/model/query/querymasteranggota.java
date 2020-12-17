
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
import wajibmembaca.model.interfaces.interfaces_master_anggota;
import wajibmembaca.model.master_anggota;

/**
 *
 * @author Aldy
 */
public class querymasteranggota implements interfaces_master_anggota {
    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(master_anggota a) {
        String sql = "INSERT INTO master_anggota values (?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, a.getId_anggota());       
            statement.setString(2, a.getNama_anggota());
            statement.setString(3, a.getAlamat_anggota());
            statement.setString(4, a.getEmail_anggota());
            statement.setString(5, a.getNo_tlp_anggota());
            
                        
           
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
        }

    @Override
    public boolean update(master_anggota a) {
        String sql = "UPDATE master_anggota SET nama_anggota=?, alamat_anggota=?, email_anggota=?, no_tlp_anggota=? WHERE id_anggota=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            
            statement.setString(1, a.getNama_anggota());
            statement.setString(2, a.getAlamat_anggota());
            statement.setString(3, a.getEmail_anggota());
            statement.setString(4, a.getNo_tlp_anggota());
            statement.setInt(5, a.getId_anggota());
            
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
        }

    @Override
    public boolean delete(int id_anggota) {
        String sql = "DELETE FROM master_anggota where id_anggota=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_anggota);
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
        }

    @Override
    public int generateID() {
        return 0;
    }

    @Override
    public List<master_anggota> getAllmaster_anggota() {
        List<master_anggota> listmaster_anggota = new ArrayList<>();
        String sql = "Select * from master_anggota";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    master_anggota p = new master_anggota (
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5)
                    );
                    listmaster_anggota.add(p);
                }
                statement.close();
            }
        }catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex); 
    }
    return listmaster_anggota;
    }

    @Override
    public master_anggota getOnemaster_anggotaByID(int id_anggota) {
        master_anggota output = null;
        String sql = "Select * from master_anggota where id_anggota=?";
        try{
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id_anggota);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new master_anggota(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));        
            }
            statement.close();
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex);    
    }
    return output;
        }

    @Override
    public List<master_anggota> getAllmaster_anggotabyName(String nama_anggota) {
         List<master_anggota> listmaster_anggota = new ArrayList<>();
        String sql = "Select * from master_anggota WHERE nama_pelanggan like '%"+nama_anggota+"%'";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    master_anggota p = new master_anggota (
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5)
                    );
                    listmaster_anggota.add(p);
                }
                statement.close();
            }
        }catch (SQLException ex) {
            Logger.getLogger(master_anggota.class.getName()).log(Level.SEVERE, null, ex); 
    }
    return listmaster_anggota;
}
    }
    

