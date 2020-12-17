/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wajibmembaca.controller;

import java.util.List;
import wajibmembaca.model.head_trans_pinjaman;
import wajibmembaca.model.query.queryhead_trans;

/**
 *
 * @author Aldy
 */
public class controller_head_trans {
    private queryhead_trans queryhead_trans = new   queryhead_trans();
    
    public List<head_trans_pinjaman> getAllData() {
        return queryhead_trans.getAllhead_trans_pinjaman();
    }
    
    public boolean inserthead_trans_pinjaman(head_trans_pinjaman data){
        return queryhead_trans.insert(data);
    }
    
    public boolean updatehead_trans_pinjaman(head_trans_pinjaman data){
        return queryhead_trans.update(data);
    }
    
    public boolean deletehead_trans_pinjaman(String id_peminjaman){
        return queryhead_trans.delete(id_peminjaman);
    }
    
    public String generateID(){
        return queryhead_trans.generateID();
    }
}


