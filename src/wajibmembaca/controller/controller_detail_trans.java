/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wajibmembaca.controller;

import java.util.List;
import wajibmembaca.model.detail_trans_pinjaman;
import wajibmembaca.model.query.querydetail_trans;

/**
 *
 * @author Aldy
 */
public class controller_detail_trans {
    private querydetail_trans querydetail_trans = new  querydetail_trans();
    
    public List<detail_trans_pinjaman> getAllData() {
        return querydetail_trans.getAlldetail_trans_pinjaman();
    }
    
    public boolean insertdetail_trans(detail_trans_pinjaman data){
        return querydetail_trans.insert(data);
    }
    
    public boolean updatedetail_trans(detail_trans_pinjaman data){
        return querydetail_trans.update(data);
    }
    
    public boolean deletedetail_trans(String id_peminjaman, String isbn){
        return querydetail_trans.delete(id_peminjaman, isbn);
    }
    
    public int generateID(){
        return querydetail_trans.generateID();
    }
    
    public int generateIDReg(){
        return querydetail_trans.generateID();
    }
}

