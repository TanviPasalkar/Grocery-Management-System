/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Selling extends javax.swing.JFrame {
    private Object ProdId;
    private Object ProdPrice;

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectProduct();
        GetCat();
    }

Connection Con= null;
Statement St =  null;
ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        FilterBtn = new javax.swing.JButton();
        GrdTotBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        PrintBtn2 = new javax.swing.JButton();
        ClearBtn1 = new javax.swing.JButton();
        RefreshBtn1 = new javax.swing.JButton();
        CatCb = new javax.swing.JComboBox();
        CrossBtn = new javax.swing.JLabel();
        LogoutBtn1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(155, 155, 253));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(155, 155, 253));
        jLabel12.setText("BILLING POINT");

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

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(155, 155, 253));
        jLabel13.setText("Filter By");

        AddBtn.setBackground(new java.awt.Color(155, 155, 253));
        AddBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add To Bill");
        AddBtn.setToolTipText("");
        AddBtn.setBorder(null);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        FilterBtn.setBackground(new java.awt.Color(155, 155, 253));
        FilterBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(255, 255, 255));
        FilterBtn.setText("Filter");
        FilterBtn.setToolTipText("");
        FilterBtn.setBorder(null);
        FilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterBtnMouseClicked(evt);
            }
        });
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });

        GrdTotBtn.setBackground(new java.awt.Color(155, 155, 253));
        GrdTotBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        GrdTotBtn.setForeground(new java.awt.Color(255, 255, 255));
        GrdTotBtn.setText("RS");
        GrdTotBtn.setToolTipText("");
        GrdTotBtn.setBorder(null);
        GrdTotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrdTotBtnMouseClicked(evt);
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

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        PrintBtn2.setBackground(new java.awt.Color(155, 155, 253));
        PrintBtn2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        PrintBtn2.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn2.setText("PRINT");
        PrintBtn2.setToolTipText("");
        PrintBtn2.setBorder(null);
        PrintBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtn2MouseClicked(evt);
            }
        });

        ClearBtn1.setBackground(new java.awt.Color(155, 155, 253));
        ClearBtn1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ClearBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn1.setText("Clear");
        ClearBtn1.setToolTipText("");
        ClearBtn1.setBorder(null);
        ClearBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtn1MouseClicked(evt);
            }
        });
        ClearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtn1ActionPerformed(evt);
            }
        });

        RefreshBtn1.setBackground(new java.awt.Color(155, 155, 253));
        RefreshBtn1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        RefreshBtn1.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn1.setText("Refresh");
        RefreshBtn1.setToolTipText("");
        RefreshBtn1.setBorder(null);
        RefreshBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshBtn1MouseClicked(evt);
            }
        });
        RefreshBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtn1ActionPerformed(evt);
            }
        });

        CatCb.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CatCb.setForeground(new java.awt.Color(155, 155, 253));
        CatCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CatCbItemStateChanged(evt);
            }
        });
        CatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatCbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(121, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(ClearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RefreshBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GrdTotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(PrintBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RefreshBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdName)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdQty)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(245, 245, 245))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrintBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(GrdTotBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );

        CrossBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CrossBtn.setForeground(new java.awt.Color(255, 255, 255));
        CrossBtn.setText("x");
        CrossBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossBtnMouseClicked(evt);
            }
        });

        LogoutBtn1.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        LogoutBtn1.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn1.setText("LOGOUT");
        LogoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CrossBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LogoutBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LogoutBtn1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CrossBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
int Prid, newQty;
public void update()
{
    newQty = AvailQty - Integer.valueOf(ProdQty.getText());
    try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
                String Query = "Update User1.PRODUCTTBL set PRODQty=" + newQty +""+ " where PRODID=" + Prid;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                //JOptionPane.showMessageDialog(this, "Product Updated Successfully!");
                SelectProduct();
           }catch(SQLException e)
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
int i = 0;
Double Uprice,ProdTot=0.0,GrdTotal=0.0;
int AvailQty;

    private void CrossBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CrossBtnMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        Prid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        AvailQty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        ProdName.setText(model.getValueAt(Myindex, 1).toString());
        Uprice = Double.valueOf(model.getValueAt(Myindex, 3).toString());

        //ProdQty.setText(model.getValueAt(Myindex, 2).toString());
        //ProdPrice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void GrdTotBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrdTotBtnMouseClicked
        
    }//GEN-LAST:event_GrdTotBtnMouseClicked

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked
        try{
     Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunshineGrocersdb","User1","SchoolFriends");
     St = Con.createStatement();
     Rs = St.executeQuery("Select * from User1.CATEGORYTBL where CATNAME='"+CatCb.getSelectedItem().toString()+"'");
     ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    }//GEN-LAST:event_FilterBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdQty.getText().isEmpty()||ProdName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing information!");
        }
        else if(AvailQty <= Integer.valueOf(ProdQty.getText()))
        {
            JOptionPane.showMessageDialog(this, "Not Enough in Stock!");
        }
        else{
            ProdTot = Uprice * Integer.valueOf(ProdQty.getText());
            GrdTotal = GrdTotal+ProdTot;
            i++;
            if(i==1)
            {
                BillTxt.setText(BillTxt.getText()+"========== SUNSHINE GROCERS ==========\n"+"NUM     PRODUCT     PRICE     QUANTITY     TOTAL\n"+i+"                 "+ProdName.getText()+"             "+Uprice+"              "+ProdQty.getText()+"           "+ProdTot+"\n");
            }
            else{
                BillTxt.setText(BillTxt.getText()+i+"                 "+ProdName.getText()+"              "+Uprice+"             "+ProdQty.getText()+"         "+ProdTot+"\n");
            }
            GrdTotBtn.setText("RS "+GrdTotal);
            update();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBtnActionPerformed

    private void PrintBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtn2MouseClicked
        try{
            BillTxt.print();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_PrintBtn2MouseClicked

    private void ClearBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtn1MouseClicked
        ProdName.setText("");
        ProdQty.setText("");
    }//GEN-LAST:event_ClearBtn1MouseClicked

    private void ClearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtn1ActionPerformed

    private void RefreshBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshBtn1MouseClicked
        SelectProduct();
    }//GEN-LAST:event_RefreshBtn1MouseClicked

    private void RefreshBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshBtn1ActionPerformed

    private void CatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatCbMouseClicked
        
    }//GEN-LAST:event_CatCbMouseClicked

    private void CatCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CatCbItemStateChanged
        
    }//GEN-LAST:event_CatCbItemStateChanged

    private void LogoutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtn1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JComboBox CatCb;
    private javax.swing.JButton ClearBtn1;
    private javax.swing.JLabel CrossBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JButton GrdTotBtn;
    private javax.swing.JLabel LogoutBtn1;
    private javax.swing.JButton PrintBtn2;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton RefreshBtn1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
