/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wajibmembaca.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import wajibmembaca.controller.controller_detail_trans;
import wajibmembaca.controller.controller_head_trans;
import wajibmembaca.controller.controllermaster_anggota;
import wajibmembaca.controller.controllermaster_buku;
import wajibmembaca.model.detail_trans_pinjaman;
import wajibmembaca.model.head_trans_pinjaman;
import wajibmembaca.model.master_anggota;
import wajibmembaca.model.master_buku;

/**
 *
 * @author Aldy
 */
public class FormTransaksiPeminjaman extends javax.swing.JFrame {
    controllermaster_anggota controllermaster_anggota = new controllermaster_anggota();
    controllermaster_buku controllermaster_buku = new controllermaster_buku();
    controller_detail_trans controller_detail_trans = new controller_detail_trans();
    controller_head_trans controller_head_trans = new controller_head_trans();
        List<detail_trans_pinjaman> collection = new ArrayList<>();
    int totalrental =0;
    float ppn = 0;
    float grandtotal =0;
    
    /**
     * Creates new form FormTransaksiPeminjaman
     */
    public FormTransaksiPeminjaman() {
        initComponents();
        initData();
    }

     public void initData(){
        Calendar c = Calendar.getInstance();
        String date = c.get(Calendar.YEAR) +"/"+ (c.get(Calendar.MONTH)+1) +"/"+c.get(Calendar.DATE);
        lbltanggal.setText(date);
        lbltransaksi.setText(controller_head_trans.generateID()+"");
        setTabledetail_trans_pinjaman(collection);
    }
 private void setTablemaster_anggota(List<master_anggota> listmaster_anggota) {
        if (listmaster_anggota==null){
            JOptionPane.showMessageDialog(this, "Data "
                    + "master_anggota gagal diambil dari database","DATABASE FAILED", JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                    new String[] {
                        "Id Anggota",
                        "Nama Anggota",
                        "Alamat Anggota",
                        "Email Anggota",
                        "No Tlp Anggota"
                    }
            );
            
            for (master_anggota g : listmaster_anggota) {
                Object[] o = new Object[5];
                o[0] = g.getId_anggota();
                o[1] = g.getNama_anggota();
                o[2] = g.getAlamat_anggota();
                o[3] = g.getEmail_anggota();
                o[4] = g.getNo_tlp_anggota();
                tableModel.addRow(o);
            }
            tblresult.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblresult.setModel(tableModel);
            }
        }
 private void setTablemaster_buku(List<master_buku> listmaster_buku) {
        if (listmaster_buku==null){
            JOptionPane.showMessageDialog(this, "Data "
                    + "master_buku gagal diambil dari database","DATABASE FAILED", JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                    new String[] {
                        "isbn",
                        "judul",
                        "penulis",
                        "publisher",
                        "tahun_terbit",
                        "jumlah_halaman"
                    }
            );
            
            for (master_buku s : listmaster_buku) {
                Object[] o = new Object[6];
                o[0] = s.getIsbn();
                o[1] = s.getJudul();
                o[2] = s.getPenulis();
                o[3] = s.getPublisher();
                o[4] = s.getTahun_terbit();
                o[5] = s.getJumlah_halaman();
                tableModel.addRow(o);
            }
            tblresult.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblresult.setModel(tableModel);
            }
        }
     private void setTabledetail_trans_pinjaman(List<detail_trans_pinjaman> listdetail_trans_pinjaman) {
        if (listdetail_trans_pinjaman==null){
            JOptionPane.showMessageDialog(this, "Data "
                    + "master_buku gagal diambil dari database","DATABASE FAILED", JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                    new String[] {
                        "Id reg detail",
                        "Id peminjaman",
                        "Isbn",
                        "Total hari",
                        "total beli"
                    }
            );
            
            for (detail_trans_pinjaman g : listdetail_trans_pinjaman) {
                Object[] o = new Object[4];
                o[0] = g.getId_peminjaman();
                o[1] = g.getIsbn();
                o[2] = g.getTotal_hari();
                o[3] = g.getTotal_beli();
                tableModel.addRow(o);
            }
            tbldetail.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tbldetail.setModel(tableModel);
            //tbl result dan detail teh yang mana ?
            }
        }
    private void setClear(){
       Calendar c = Calendar.getInstance();
       String date = c.get(Calendar.YEAR) +"/"+ c.get(Calendar.MONTH) +"/"+ c.get(Calendar.DATE);
       lbltanggal.setText(date);
       lbltransaksi.setText(controller_head_trans.generateID()+"");
       lblid_peminjaman.setText("id_anggota");
       lblnama_peminjaman.setText("nama_anggota");
      
       
       //membersihakn data detail transaksi
       collection.clear();
       setTabledetail_trans_pinjaman(collection);
       
       
       //membersihkan data perhitungan
       lbltotal.setText("0");
       lblppn.setText("0");
       lblgrand.setText("0");
       txtjumlah.setText("0");
       txtkembali.setText("0");
      
 }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        searchdata = new javax.swing.JButton();
        tctpencarian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblresult = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltanggal = new javax.swing.JLabel();
        lbltransaksi = new javax.swing.JLabel();
        lblid_peminjaman = new javax.swing.JLabel();
        lblnama_peminjaman = new javax.swing.JLabel();
        btnsearch_peminjaman = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetail = new javax.swing.JTable();
        btntambah = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbltanggal_kembali = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblppn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblgrand = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtjumlah = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtkembali = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        searchdata.setBackground(new java.awt.Color(0, 102, 204));
        searchdata.setForeground(new java.awt.Color(255, 255, 255));
        searchdata.setText("Cari");
        searchdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdataActionPerformed(evt);
            }
        });

        tctpencarian.setBackground(new java.awt.Color(0, 102, 204));
        tctpencarian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tctpencarian.setForeground(new java.awt.Color(255, 255, 255));
        tctpencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tctpencarianKeyTyped(evt);
            }
        });

        jLabel4.setText("Nama");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hasil Pencarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 204)))); // NOI18N

        tblresult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblresult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblresultMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblresult);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tctpencarian)
                        .addGap(18, 18, 18)
                        .addComponent(searchdata)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchdata)
                    .addComponent(tctpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Head Transaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel1.setText("Tanggal");

        jLabel2.setText("ID Transaksi");

        jLabel3.setText("Peminjam");

        lbltanggal.setText("hmm");

        lbltransaksi.setText("hmm");

        lblid_peminjaman.setText("hmm");

        lblnama_peminjaman.setText("hmm");

        btnsearch_peminjaman.setBackground(new java.awt.Color(0, 102, 204));
        btnsearch_peminjaman.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnsearch_peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch_peminjaman.setText("Search Peminjaman");
        btnsearch_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch_peminjamanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblid_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblnama_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsearch_peminjaman))
                    .addComponent(lbltanggal)
                    .addComponent(lbltransaksi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbltanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbltransaksi))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblid_peminjaman)
                    .addComponent(lblnama_peminjaman)
                    .addComponent(btnsearch_peminjaman))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Transaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        tbldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbldetail);

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btntambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnkurang)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnkurang))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Pembayaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel8.setText("Tanggal Kembali");

        lbltanggal_kembali.setText("hmm");

        jLabel10.setText("Total Rental");

        lbltotal.setText("0");

        jLabel12.setText("PPN 10%");

        lblppn.setText("0");

        jLabel14.setText("Grand Total");

        lblgrand.setText("0");

        jLabel16.setText("Jumlah Bayar");

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });
        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahKeyTyped(evt);
            }
        });

        jLabel17.setText("Kembali");

        txtkembali.setText("0");

        btnsimpan.setBackground(new java.awt.Color(0, 102, 204));
        btnsimpan.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(0, 102, 204));
        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(0, 102, 204));
        btnclose.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltotal)
                    .addComponent(txtkembali)
                    .addComponent(lblgrand)
                    .addComponent(lblppn)
                    .addComponent(lbltanggal_kembali)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbltanggal_kembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbltotal)
                    .addComponent(btnsimpan))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblppn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblgrand)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnclear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtkembali)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void searchdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchdataActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        setTablemaster_buku(controllermaster_buku.getAllData());
        jDialog1.setVisible(true);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnsearch_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch_peminjamanActionPerformed
        setTablemaster_anggota(controllermaster_anggota.getAllData());
        jDialog1.requestFocusInWindow();
        jDialog1.setVisible(true);
    }//GEN-LAST:event_btnsearch_peminjamanActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        if(collection.size()>= 0){
            totalrental -= collection.get(0).getTotal_beli();
            lbltotal.setText(totalrental+"");
            ppn = totalrental * 0.1f;
            grandtotal = totalrental + ppn;
            lblppn.setText(ppn + "");
            lblgrand.setText(grandtotal + "");
            collection.remove(0);
            setTabledetail_trans_pinjaman(collection);
        }
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        head_trans_pinjaman head = new head_trans_pinjaman(
                lbltanggal.getText(),lblnama_peminjaman.getText(),
                lbltransaksi.getText(), 
                Integer.parseInt(lblid_peminjaman.getText()),
                Integer.parseInt(txtjumlah.getText()),
                Integer.parseInt(lbltotal.getText()),
                Integer.parseInt(lbltanggal_kembali.getText())
        );
        controller_head_trans.inserthead_trans_pinjaman(head);
        
        for(detail_trans_pinjaman data : collection){
            detail_trans_pinjaman detail = new detail_trans_pinjaman(
            controller_detail_trans.generateID(), Integer.parseInt(lblid_peminjaman.getText()),
            data.getIsbn(),lbltotal.getText(), data.getTotal_hari()
         );
         controller_detail_trans.insertdetail_trans(detail);
        }
        setClear();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
         setClear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
         this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtjumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahKeyTyped
        if(evt.getKeyCode() == 0){
            if(!txtjumlah.getText().equals("")){
                int money = Integer.parseInt(txtjumlah.getText());
                float change = money - grandtotal;
                txtkembali.setText((change < 0 ? 0+"" : change+""));
            
        }
    }//GEN-LAST:event_txtjumlahKeyTyped
    }
    
    private void tctpencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tctpencarianKeyTyped
        String colName = tblresult.getColumnModel().getColumn(0).getHeaderValue().toString();
        if(colName.equals("id_anggota")){
            setTablemaster_anggota(controllermaster_anggota.getAllmaster_anggotaByName(tctpencarian.getText()));
        } else {
            setTablemaster_buku(controllermaster_buku.getAllmaster_bukuByName(tctpencarian.getText()));
        }
    
    }//GEN-LAST:event_tctpencarianKeyTyped

    private void tblresultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblresultMousePressed
         if(evt.getClickCount() == 2){
            String colName = tblresult.getColumnModel().getColumn(0).getHeaderValue().toString();
            int idxrow = tblresult.getSelectedRow();
            if(colName.equals("id_anggota")){
                lblid_peminjaman.setText(tblresult.getModel().getValueAt(idxrow, 0).toString());
                lblnama_peminjaman.setText(tblresult.getModel().getValueAt(idxrow, 2).toString());
            }else{
                int id_reg_detail = 0;
                String id_peminjaman = lblid_peminjaman.getText();
                String isbn = tblresult.getModel().getValueAt(idxrow, 0).toString();
                int total_hari = 0;
                int stotal_beli = Integer.parseInt(tblresult.getModel().getValueAt(idxrow,2).toString());
                int total_beli = total_hari * stotal_beli;
                
                detail_trans_pinjaman data = new detail_trans_pinjaman
                        ( total_hari,
                        total_beli,
                              id_peminjaman, isbn,  id_reg_detail
                         );
                totalrental += total_beli;
                lbltotal.setText(totalrental+"");
                ppn = totalrental * 0.1f;
                grandtotal = totalrental + ppn;
                lblppn.setText(ppn + "");
                lblgrand.setText(grandtotal + "");
                collection.add(data);
                
                
            }
            jDialog1.dispose();
            setTabledetail_trans_pinjaman(collection);
         }
    }//GEN-LAST:event_tblresultMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksiPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnsearch_peminjaman;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblgrand;
    private javax.swing.JLabel lblid_peminjaman;
    private javax.swing.JLabel lblnama_peminjaman;
    private javax.swing.JLabel lblppn;
    private javax.swing.JLabel lbltanggal;
    private javax.swing.JLabel lbltanggal_kembali;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltransaksi;
    private javax.swing.JButton searchdata;
    private javax.swing.JTable tbldetail;
    private javax.swing.JTable tblresult;
    private javax.swing.JTextField tctpencarian;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JLabel txtkembali;
    // End of variables declaration//GEN-END:variables

    
}
