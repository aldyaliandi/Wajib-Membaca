package wajibmembaca.model.interfaces;

import java.util.List;
import wajibmembaca.model.master_anggota;

/**
 *
 * @author Aldy
 */
public interface interfaces_master_anggota {
    public boolean insert (master_anggota data);
    public boolean update (master_anggota data);
    public boolean delete (int id_anggota);
    public int generateID();
    
    public List<master_anggota> getAllmaster_anggota();
    
    public master_anggota getOnemaster_anggotaByID(int id_anggota);
    
    public List<master_anggota> getAllmaster_anggotabyName(String nama_anggota);

}


