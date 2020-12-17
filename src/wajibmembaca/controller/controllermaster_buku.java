
package wajibmembaca.controller;

import java.util.List;
import wajibmembaca.model.master_buku;
import wajibmembaca.model.query.querymasterbuku;
import wajibmembaca.model.query.querymasterbuku;

/**
 *
 * @author Aldy
 */
public class controllermaster_buku {
    private querymasterbuku querymasterbuku = new querymasterbuku ();
   
    public List<master_buku> getAllData(){
        return querymasterbuku.getAllmaster_buku();
    }
    
    public boolean insertmaster_buku(String isbn, String judul, String penulis, String publisher, String tahun_terbit,
                                        int jumlah_halaman){
        if(isbn=="0" && judul.isEmpty()){
            return false;
        }else{
            master_buku spa = new master_buku (isbn, judul, penulis, publisher, tahun_terbit, jumlah_halaman);
            return querymasterbuku.insert(spa);
        }
    }
    
    public boolean updatemaster_buku(String isbn, String judul, String penulis, String publisher, String tahun_terbit,
                                        int jumlah_halaman){
        if(isbn=="0" && judul.isEmpty()){
            return false;
        }else{
            master_buku spa = new master_buku (isbn, judul, penulis, publisher, tahun_terbit, jumlah_halaman);
            return querymasterbuku.update(spa);
        }
    }
    
    public boolean deletemaster_buku(String isbn){
        return querymasterbuku.delete(isbn);
    }
    public String generateID(){
        return querymasterbuku.generateID();
    }
    
    
    public List<master_buku> getAllmaster_bukuByName(String judul) {
        return querymasterbuku.getAllmaster_bukubyName(judul); 
    }

    

}
