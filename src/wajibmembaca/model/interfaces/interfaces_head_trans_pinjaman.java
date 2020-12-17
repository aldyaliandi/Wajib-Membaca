
package wajibmembaca.model.interfaces;

import java.util.List;
import wajibmembaca.model.head_trans_pinjaman;
/**
 *
 * @author Aldy
 */
public interface interfaces_head_trans_pinjaman {
    public boolean insert (head_trans_pinjaman data);
    public boolean update (head_trans_pinjaman data);
    public boolean delete (String id_peminjaman);
    public String generateID();
    
    public List<head_trans_pinjaman> getAllhead_trans_pinjaman();
    
    public head_trans_pinjaman getOnehead_trans_pinjamanByID(String id_peminjaman);
    
    public List<head_trans_pinjaman> getAllhead_trans_pinjamanbyName(int status);

}


