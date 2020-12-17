package wajibmembaca.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import wajibmembaca.controller.controllermaster_anggota;
import wajibmembaca.model.master_anggota;

/**
 *
 * @author Aldy
 */
public class FormMasterAnggota extends javax.swing.JDialog {
    private final controllermaster_anggota controllermaster_anggota = new controllermaster_anggota();

    public FormMasterAnggota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTablemaster_anggota(controllermaster_anggota.getAllData());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        Delete = new javax.swing.JMenuItem();
        tktid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnsimpan = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        lblout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblanggota = new javax.swing.JTable();

        popup.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                popupAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Delete.setBackground(new java.awt.Color(0, 153, 204));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        popup.add(Delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tktid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Field Anggota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel1.setText("ID Anggota");

        jLabel2.setText("Nama Anggota");

        jLabel3.setText("Alamat Anggota");

        jLabel4.setText("Email Anggota");

        jLabel5.setText("No Tlp");

        txtid.setBackground(new java.awt.Color(0, 102, 204));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtnama.setBackground(new java.awt.Color(0, 102, 204));
        txtnama.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 255));

        txtalamat.setBackground(new java.awt.Color(0, 102, 204));
        txtalamat.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtalamat.setForeground(new java.awt.Color(255, 255, 255));

        txtemail.setBackground(new java.awt.Color(0, 102, 204));
        txtemail.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));

        txtno.setBackground(new java.awt.Color(0, 102, 204));
        txtno.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtno.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tktidLayout = new javax.swing.GroupLayout(tktid);
        tktid.setLayout(tktidLayout);
        tktidLayout.setHorizontalGroup(
            tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tktidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid)
                    .addComponent(txtnama)
                    .addComponent(txtalamat)
                    .addComponent(txtemail)
                    .addComponent(txtno))
                .addContainerGap())
        );
        tktidLayout.setVerticalGroup(
            tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tktidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tktidLayout.createSequentialGroup()
                        .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tktidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14), new java.awt.Color(0, 102, 204))); // NOI18N

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

        lblout.setBackground(new java.awt.Color(0, 102, 204));
        lblout.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lblout.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsimpan)
                .addGap(176, 176, 176)
                .addComponent(btnclear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclose)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnclear)
                    .addComponent(btnclose))
                .addGap(18, 18, 18)
                .addComponent(lblout)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        tblanggota.setModel(new javax.swing.table.DefaultTableModel(
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
        tblanggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblanggotaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblanggotaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblanggota);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tktid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tktid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        int id_anggota = Integer.parseInt(txtid.getText());
        String nama_anggota = txtnama.getText();
        String alamat_anggota = txtalamat.getText();
        String email_anggota = txtemail.getText();
        String no_tlp_anggota = txtno.getText();   
        
               if(btnsimpan.getText().equals("Simpan")){
           
            if(controllermaster_anggota.insertmaster_anggota(id_anggota, nama_anggota, alamat_anggota, email_anggota, no_tlp_anggota)){
                lblout.setText("Insert Berhasil");
            }else{
                lblout.setText("Insert Gagal");
            }
        }else{
            
            if(controllermaster_anggota.updatemaster_anggota(id_anggota, nama_anggota, alamat_anggota, email_anggota, no_tlp_anggota)){
                lblout.setText("Update Berhasil");
            }else{
                lblout.setText("Update Gagal");
            }
        }
        setClear();
    }                                         

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setClear();
    }                                                                               

    private void tblKaryawanMousePressed(java.awt.event.MouseEvent evt) {                                           
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tblanggotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblanggotaMousePressed
         if(evt.getClickCount() == 2){
            int idxrow = tblanggota.getSelectedRow();
            txtid.setText(tblanggota.getModel().getValueAt(idxrow, 0).toString());
            txtnama.setText(tblanggota.getModel().getValueAt(idxrow, 1).toString());
            txtalamat.setText(tblanggota.getModel().getValueAt(idxrow, 2).toString());
            txtemail.setText(tblanggota.getModel().getValueAt(idxrow, 3).toString());
            txtno.setText(tblanggota.getModel().getValueAt(idxrow, 4).toString());
            btnsimpan.setText("Update");
        }
       if(evt.isPopupTrigger()){
           popup.show(tblanggota, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_tblanggotaMousePressed

    private void tblanggotaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblanggotaMouseReleased
        if(evt.getClickCount() == 2){
            int idxrow = tblanggota.getSelectedRow();
            txtid.setText(tblanggota.getModel().getValueAt(idxrow, 0).toString());
            txtnama.setText(tblanggota.getModel().getValueAt(idxrow, 1).toString());
            txtalamat.setText(tblanggota.getModel().getValueAt(idxrow, 2).toString());
            txtemail.setText(tblanggota.getModel().getValueAt(idxrow, 3).toString());
            txtno.setText(tblanggota.getModel().getValueAt(idxrow, 4).toString());
            btnsimpan.setText("Update");
        }
       if(evt.isPopupTrigger()){
           popup.show(tblanggota, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_tblanggotaMouseReleased

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        setClear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void popupAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_popupAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_popupAncestorAdded

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane,
                "Apakah Yakin Untuk Didelete?",
                "Delete Dialog", JOptionPane.YES_NO_OPTION);
         if(result == JOptionPane.YES_OPTION){
             int id_anggota = Integer.parseInt(tblanggota.getModel().getValueAt(tblanggota.getSelectedRow(), 0).toString());
             controllermaster_anggota.deletemaster_anggota(id_anggota);
             setClear(); 
         }
    }//GEN-LAST:event_DeleteActionPerformed
private void setTablemaster_anggota(List<master_anggota> listmaster_anggota) {
        if (listmaster_anggota==null){
            JOptionPane.showMessageDialog(this, "Data master_anggota gagal diambil dari database",
                     "DATABASE FAILED", JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                    new String[] {
                        "Id Anggota",
                        "Nama Anggota",
                        "Alamat Anggota",
                        "Email Anggota",
                        "No tlp Anggota"
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
            tblanggota.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblanggota.setModel(tableModel);
        }
    }
private void setClear(){
        txtid.setText(" ");
        txtnama.setText(" ");
        txtalamat.setText(" ");
        txtemail.setText(" ");
        txtno.setText(" ");
        btnsimpan.setText("Simpan");
        setTablemaster_anggota(controllermaster_anggota.getAllData());
        
    }
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
            java.util.logging.Logger.getLogger(FormMasterAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMasterAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMasterAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMasterAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMasterAnggota dialog = new FormMasterAnggota(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Delete;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblout;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tblanggota;
    private javax.swing.JPanel tktid;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    // End of variables declaration//GEN-END:variables
}
