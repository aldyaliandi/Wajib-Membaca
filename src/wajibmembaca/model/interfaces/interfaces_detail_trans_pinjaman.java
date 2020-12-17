package wajibmembaca.model.interfaces;

import java.util.List;
import wajibmembaca.model.detail_trans_pinjaman;

/**
 *
 * @author Aldy
 */
public interface interfaces_detail_trans_pinjaman {
    public boolean insert(detail_trans_pinjaman data);
    public boolean update(detail_trans_pinjaman data);
    public boolean delete(String id_peminjaman, String isbn);
    
    public int generateID();
    
    public int generateIDReg();
    
    public List<detail_trans_pinjaman> getAlldetail_trans_pinjaman();
    
    public detail_trans_pinjaman getOnedetail_trans_pinjamanByID(String id_peminjaman);
    
    public List<detail_trans_pinjaman> getAlldetail_trans_pinjamanByID(String id_peminjaman);
}

