/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wajibmembaca.controller;

import java.util.List;
import wajibmembaca.model.master_anggota;
import wajibmembaca.model.query.querymasteranggota;


/**
 *
 * @author Aldy
 */
public class controllermaster_anggota {
    private querymasteranggota querymasteranggota = new querymasteranggota ();
   
    public List<master_anggota> getAllData(){
        return querymasteranggota.getAllmaster_anggota();
    }
    
    public boolean insertmaster_anggota(int id_anggota, String nama_anggota, String alamat_anggota, String email_anggota,
                                        String no_tlp_anggota){
        if(id_anggota==0 && nama_anggota.isEmpty()){
            return false;
        }else{
            master_anggota spa = new master_anggota (id_anggota, nama_anggota, alamat_anggota, email_anggota, no_tlp_anggota);
            return querymasteranggota.insert(spa);
        }
    }
    
    public boolean updatemaster_anggota(int id_anggota, String nama_anggota, String alamat_anggota, String email_anggota,
                                        String no_tlp_anggota){
        if(id_anggota==0 && nama_anggota.isEmpty()){
            return false;
        }else{
            master_anggota spa = new master_anggota(id_anggota, nama_anggota, alamat_anggota, email_anggota, no_tlp_anggota);
            return querymasteranggota.update(spa);
        }
    }
    
    public boolean deletemaster_anggota(int id_anggota){
        return querymasteranggota.delete(id_anggota);
    }
    public int generateID(){
        return querymasteranggota.generateID();
    }
    
    
    public List<master_anggota> getAllmaster_anggotaByName(String nama_anggota) {
        return querymasteranggota.getAllmaster_anggotabyName(nama_anggota); 
    }

    

}
