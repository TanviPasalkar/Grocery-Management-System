/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.management;

import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class Seller extends javax.swing.JFrame {
    private Object sellId;
    private Object SellerId;

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        SelectSeller();
    }
Connection Con= null;
Statement St =  null;
ResultSet Rs = null; 
public void SelectSeller()
{
    try{
     Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
     St = Con.createStatement();
     Rs = St.executeQuery("Select * from User1.SELLERTBL");
     SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CategoryBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SellId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SellName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SellPass = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        CrossBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        CategoryBtn1 = new javax.swing.JLabel();
        ProductBtn = new javax.swing.JLabel();
        UpdateAdminBtn = new javax.swing.JLabel();

        CategoryBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CategoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        CategoryBtn.setText("CATEGORY");
        CategoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryBtnMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(155, 155, 253));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(155, 155, 253));
        jLabel12.setText("MANAGE SELLERS");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(155, 155, 253));
        jLabel5.setText("SELLER ID");

        SellId.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        SellId.setForeground(new java.awt.Color(155, 155, 253));
        SellId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(155, 155, 253));
        jLabel6.setText("NAME");

        SellName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        SellName.setForeground(new java.awt.Color(155, 155, 253));
        SellName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(155, 155, 253));
        jLabel8.setText("PASSWORD");

        SellPass.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        SellPass.setForeground(new java.awt.Color(155, 155, 253));
        SellPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellPassActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(155, 155, 253));
        jLabel13.setText("GENDER");

        GenderCb.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(155, 155, 253));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE", " " }));

        AddBtn.setBackground(new java.awt.Color(155, 155, 253));
        AddBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.setToolTipText("");
        AddBtn.setBorder(null);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(155, 155, 253));
        DeleteBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.setToolTipText("");
        DeleteBtn.setBorder(null);
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(155, 155, 253));
        ClearBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("CLEAR");
        ClearBtn.setToolTipText("");
        ClearBtn.setBorder(null);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(155, 155, 253));
        EditBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("EDIT");
        EditBtn.setToolTipText("");
        EditBtn.setBorder(null);
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        SellerTable.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        SellerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SellerTable.setRowHeight(30);
        SellerTable.setSelectionBackground(new java.awt.Color(155, 155, 253));
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SellPass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SellName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SellId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellId, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SellName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SellPass, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        CrossBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CrossBtn.setForeground(new java.awt.Color(255, 255, 255));
        CrossBtn.setText("x");
        CrossBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossBtnMouseClicked(evt);
            }
        });

        LogoutBtn.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setText("LOGOUT");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        CategoryBtn1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CategoryBtn1.setForeground(new java.awt.Color(255, 255, 255));
        CategoryBtn1.setText("CATEGORY");
        CategoryBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryBtn1MouseClicked(evt);
            }
        });

        ProductBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ProductBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProductBtn.setText("PRODUCTS");
        ProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductBtnMouseClicked(evt);
            }
        });

        UpdateAdminBtn.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        UpdateAdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateAdminBtn.setText("UPDATE ADMIN");
        UpdateAdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateAdminBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LogoutBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoryBtn1)
                            .addComponent(ProductBtn)))
                    .addComponent(UpdateAdminBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CrossBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CrossBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(CategoryBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(ProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateAdminBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoutBtn)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SellIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellIdActionPerformed

    private void SellNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellNameActionPerformed

    private void SellPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellPassActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
       if(SellId.getText().isEmpty()|| SellName.getText().isEmpty()|| SellPass.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information!");
       }
       else{
        try {
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
    PreparedStatement add = Con.prepareStatement("insert into SELLERTBL values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(SellId.getText()));
            add.setString(2, SellName.getText());
            add.setString(3, SellPass.getText());
            add.setString(4, GenderCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller Added Successfully!");
            Con.close();
            SelectSeller();
                    } catch (Exception e) {
                        e.printStackTrace();
        }
       }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)SellerTable.getModel();
        int Myindex = SellerTable.getSelectedRow();
        SellId.setText(model.getValueAt(Myindex, 0).toString());
        SellName.setText(model.getValueAt(Myindex, 1).toString());
        SellPass.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_SellerTableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        SellId.setText("");
        SellName.setText("");
        SellPass.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(SellId.getText().isEmpty())
        {
              JOptionPane.showMessageDialog(this, "Enter The Seller To be Deleted!");
        }
        else{
            try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
         String SId = SellId.getText();
         String Query = "Delete from User1.SELLERTBL where SELLID="+SId;
         Statement Add = Con.createStatement();
         Add.executeUpdate(Query);
         SelectSeller();
         JOptionPane.showMessageDialog(this, "Seller Deleted Successfully!");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }                                      
    
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
       if(SellId.getText().isEmpty() ||SellName.getText().isEmpty()||SellPass.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information!");
       }
       else
       {
           try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
                String Query = "Update User1.SELLERTBL set SELLNAME='"+SellName.getText()+"'"+",SELLPASS='"+SellPass.getText()+"'"+",SELLGENDER='"+GenderCb.getSelectedItem().toString()+"'"+"where SELLID="+SellId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Seller Updated Successfully!");
                SelectSeller();
           }catch(SQLException e)
           {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void CrossBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CrossBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void CategoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryBtnMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryBtnMouseClicked

    private void CategoryBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryBtn1MouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryBtn1MouseClicked

    private void ProductBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductBtnMouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductBtnMouseClicked

    private void UpdateAdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateAdminBtnMouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateAdminBtnMouseClicked

   
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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel CategoryBtn;
    private javax.swing.JLabel CategoryBtn1;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CrossBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox GenderCb;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel ProductBtn;
    private javax.swing.JTextField SellId;
    private javax.swing.JTextField SellName;
    private javax.swing.JTextField SellPass;
    private javax.swing.JTable SellerTable;
    private javax.swing.JLabel UpdateAdminBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
