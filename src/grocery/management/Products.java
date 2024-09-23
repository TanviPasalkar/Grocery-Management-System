/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static org.apache.derby.impl.sql.compile.SQLParserConstants.RS;

/**
 *
 * @author Dell
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        SelectProduct();
        GetCat();
    }
Connection Con= null;
Statement St =  null;
ResultSet Rs = null; 
public void SelectProduct()
{
    try{
     Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
     St = Con.createStatement();
     Rs = St.executeQuery("Select * from User1.PRODUCTTBL");
     ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
    private void GetCat()
    {
        try{
     Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
     St = Con.createStatement();
     String query = "Select * from User1.CATEGORYTBL";
     Rs = St.executeQuery(query);
     while(Rs.next())
     {
         String Mycat= Rs.getString("CATNAME");
         CatCb.addItem(Mycat);
     }
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CatCb = new javax.swing.JComboBox();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        CrossBtn = new javax.swing.JLabel();
        SellerBtn = new javax.swing.JLabel();
        CategoryBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        UpdateAdminBtn = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(155, 155, 253));
        jLabel11.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(155, 155, 253));
        jLabel4.setText("UID");

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(155, 155, 253));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(155, 155, 253));
        jLabel7.setText("NAME");

        jTextField5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(155, 155, 253));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(155, 155, 253));
        jLabel9.setText("QUANTITY");

        jTextField7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(155, 155, 253));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(155, 155, 253));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(155, 155, 253));
        jLabel12.setText("MANAGE PRODUCTS");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(155, 155, 253));
        jLabel5.setText("PROD ID");

        ProdId.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ProdId.setForeground(new java.awt.Color(155, 155, 253));
        ProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(155, 155, 253));
        jLabel6.setText("NAME");

        ProdName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ProdName.setForeground(new java.awt.Color(155, 155, 253));
        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(155, 155, 253));
        jLabel8.setText("QUANTITY");

        ProdQty.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(155, 155, 253));
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(155, 155, 253));
        jLabel10.setText("PRICE");

        ProdPrice.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(155, 155, 253));
        ProdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdPriceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(155, 155, 253));
        jLabel13.setText("CATEGORY");

        CatCb.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CatCb.setForeground(new java.awt.Color(155, 155, 253));

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

        ProductTable.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(30);
        ProductTable.setSelectionBackground(new java.awt.Color(155, 155, 253));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ProdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProdId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(ProdId, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdQty, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        SellerBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SellerBtn.setForeground(new java.awt.Color(255, 255, 255));
        SellerBtn.setText("SELLER");
        SellerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerBtnMouseClicked(evt);
            }
        });

        CategoryBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CategoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        CategoryBtn.setText("CATEGORY");
        CategoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryBtnMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CrossBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SellerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UpdateAdminBtn))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CrossBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(SellerBtn)
                        .addGap(18, 18, 18)
                        .addComponent(CategoryBtn)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdIdActionPerformed

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void ProdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdPriceActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdId.getText().isEmpty()|| ProdName.getText().isEmpty()|| ProdPrice.getText().isEmpty()|| ProdQty.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information!");
       }
       else{
        try {
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
    PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(ProdId.getText()));
            add.setString(2, ProdName.getText());
            add.setInt(3, Integer.valueOf(ProdQty.getText()));
            add.setInt(4, Integer.valueOf(ProdPrice.getText()));
            add.setString(5, CatCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Added Successfully!");
            Con.close();
            SelectProduct();
                    } catch (Exception e) {
                        e.printStackTrace();
        }
       }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        ProdId.setText("");
        ProdName.setText("");
        ProdQty.setText("");
        ProdPrice.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ProdId.getText().isEmpty())
        {
              JOptionPane.showMessageDialog(this, "Enter The Product To be Deleted!");
        }
        else{
            try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
         String PId = ProdId.getText();
         String Query = "Delete from User1.PRODUCTTBL where PRODID="+PId;
         Statement Add = Con.createStatement();
         Add.executeUpdate(Query);
         SelectProduct();
         JOptionPane.showMessageDialog(this, "Product Deleted Successfully!");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(Myindex, 0).toString());
        ProdName.setText(model.getValueAt(Myindex, 1).toString());
        ProdQty.setText(model.getValueAt(Myindex, 2).toString());
        ProdPrice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(ProdId.getText().isEmpty() ||ProdName.getText().isEmpty()||ProdQty.getText().isEmpty()||ProdPrice.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information!");
       }
       else
       {
           try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
                String Query = "Update User1.PRODUCTTBL set PRODNAME='" + ProdName.getText() + "', PRODQTY=" + Integer.parseInt(ProdQty.getText()) + ", PRODPRICE=" + Float.parseFloat(ProdPrice.getText()) + ", PRODCAT='" + CatCb.getSelectedItem().toString() + "' where PRODID=" + Integer.parseInt(ProdId.getText());
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Product Updated Successfully!");
                SelectProduct();
           }catch(SQLException e)
           {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void CrossBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CrossBtnMouseClicked

    private void SellerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerBtnMouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellerBtnMouseClicked

    private void CategoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryBtnMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void UpdateAdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateAdminBtnMouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateAdminBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox CatCb;
    private javax.swing.JLabel CategoryBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CrossBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel SellerBtn;
    private javax.swing.JLabel UpdateAdminBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
