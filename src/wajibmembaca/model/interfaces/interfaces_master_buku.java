package wajibmembaca.model.interfaces;

import java.util.List;
import wajibmembaca.model.master_buku;
/**
 *
 * @author Aldy
 */
public interface interfaces_master_buku {
    public boolean insert (master_buku data);
    public boolean update (master_buku data);
    public boolean delete (String isbn);
    public String generateID();
    
    public List<master_buku> getAllmaster_buku();
    
    public master_buku getOnemaster_bukuByID(String isbn);
    
    public List<master_buku> getAllmaster_bukubyName(String judul);

}

