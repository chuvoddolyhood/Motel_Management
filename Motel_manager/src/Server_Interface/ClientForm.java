/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClientForm extends javax.swing.JFrame {

    /**
     * Creates new form ClientForm
     */
    public ClientForm() {
        initComponents();
        
        //Set form in center
        this.setLocationRelativeTo(null);
        
        //Load du lieu len bang
        loadInfoClient();
        
        //Set ID auto
        setID();
    }
    String dbURL="jdbc:sqlserver://MSI\\SQLEXPRESS:1433; databaseName=Motel; user=test; password=1234567890"; 
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        txtIDClient = new javax.swing.JTextField();
        cmbSex = new javax.swing.JComboBox<>();
        dcsDOB = new com.toedter.calendar.JDateChooser();
        txtNameClient = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtHomeTown = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, -1, -1));

        jLabel3.setText("H??? v?? t??n");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, -1));

        jLabel4.setText("CMND");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, -1, -1));

        jLabel5.setText("S??? ??i???n tho???i");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabel6.setText("Gi???i t??nh");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel7.setText("Qu?? qu??n");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jLabel8.setText("Ng??y sinh");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
        jPanel1.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 149, -1));
        jPanel1.add(txtIDClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 149, -1));

        cmbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu", "Khac" }));
        jPanel1.add(cmbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 150, -1));
        jPanel1.add(dcsDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 150, -1));
        jPanel1.add(txtNameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 149, -1));
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 150, -1));
        jPanel1.add(txtHomeTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 150, -1));

        btnAdd.setText("Th??m");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnModify.setText("S???a");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDel.setText("X??a");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnClear.setText("T???o m???i");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnModify)
                .addGap(18, 18, 18)
                .addComponent(btnDel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClient);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("????ng K?? Ng?????i Thu??");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadInfoClient(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String query="SELECT * FROM Client;";
            Connection con=DriverManager.getConnection(dbURL);
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel m=new DefaultTableModel(new Object[]{"ID","H??? v?? t??n", "CMND", "Gi???i t??nh", "Ng??y sinh","Qu?? qu??n","S??? ??i???n tho???i"}, 0);
               tblClient.setModel(m);
            while (rs.next()) {
                ((DefaultTableModel)tblClient.getModel()).addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4), 
                    rs.getDate(5),
                    rs.getString(6),
                    rs.getString(7),
                });
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    private void setID(){
        String id=null;
        String ancestors; //Tien to C
        int numberID; //so duoi 00x || 0xx
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String query="SELECT MAX(ID_Client) AS MAX_ID FROM Client;";
            Connection connector=DriverManager.getConnection(dbURL);
            PreparedStatement ps=connector.prepareStatement(query);
            ResultSet rs_STT=ps.executeQuery();
            while(rs_STT.next()){
                id=rs_STT.getString("MAX_ID");
            }
        }catch(Exception ex){
            numberID=0;
        }
        
        ancestors=id.substring(0, 1); //C
        numberID=Integer.valueOf(id.substring(1, 5)); //number
        
        if(numberID<9) txtIDClient.setText(ancestors +"000"+ String.valueOf(numberID+1));
        else if(numberID<99) txtIDClient.setText(ancestors +"00"+ String.valueOf(numberID+1));
        else if(numberID<999) txtIDClient.setText(ancestors +"0"+ String.valueOf(numberID+1));
        else txtIDClient.setText(ancestors + String.valueOf(numberID+1));
    }
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    Calendar cal=Calendar.getInstance();
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setID();
        txtNameClient.setText("");
        txtCMND.setText("");
        cmbSex.setSelectedIndex(0);
        dcsDOB.setDate(cal.getTime());
        txtHomeTown.setText("");
        txtPhoneNumber.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private boolean confirmInfoClient(){
        boolean check=true;
        if(txtNameClient.getText().equals("")==true || txtPhoneNumber.getText().equals("")==true 
                || txtCMND.getText().equals("")==true){
            JOptionPane.showMessageDialog(rootPane, "Phai nhap day du cac thong tin co ban nhu: Ten, So dien thoai va CMND");
            check=false;
        }
        return check;
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(confirmInfoClient()==true){
            String query="INSERT INTO Client VALUES(?,?,?,?,?,?,?);";
            String id=txtIDClient.getText();
            String name=txtNameClient.getText();
            String cmnd=txtCMND.getText();
            String sex=cmbSex.getItemAt(cmbSex.getSelectedIndex());
            String dob=new SimpleDateFormat("yyyy-MM-dd").format(dcsDOB.getDate());
            String homeTown=txtHomeTown.getText();
            String phoneNumber=txtPhoneNumber.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con=DriverManager.getConnection(dbURL);
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, cmnd);
                ps.setString(4, sex);
                ps.setString(5, dob);
                ps.setString(6, homeTown);
                ps.setString(7, phoneNumber);

                ps.executeUpdate();
            }catch(Exception ex){
                System.out.println(ex);
            }
            btnClearActionPerformed(evt);
            loadInfoClient();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        String id=txtIDClient.getText();
        String name=txtNameClient.getText();
        String cmnd=txtCMND.getText();
        String sex=cmbSex.getItemAt(cmbSex.getSelectedIndex());
        String dob=new SimpleDateFormat("yyyy-MM-dd").format(dcsDOB.getDate());
        String homeTown=txtHomeTown.getText();
        String phoneNumber=txtPhoneNumber.getText();

        int confirm=JOptionPane.showConfirmDialog(rootPane, "Ban co chac muon chinh sua thong tin khong?","",JOptionPane.YES_NO_OPTION);
        if(confirm== JOptionPane.YES_OPTION){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String query="UPDATE Client SET Name_Client=?, CMND=?, Sex=?, DOB=?, Home_Town=?,Phone_Number=? WHERE ID_Client=?; ";
                Connection con=DriverManager.getConnection(dbURL);
                PreparedStatement ps=con.prepareStatement(query);

                ps.setString(1, name);
                ps.setString(2, cmnd);
                ps.setString(3, sex);
                ps.setString(4, dob);
                ps.setString(5, homeTown);
                ps.setString(6, phoneNumber);
                ps.setString(7, id);

                ps.executeUpdate();
            }catch(Exception ex){
                System.out.println(ex);
            }
            btnClearActionPerformed(evt);
            loadInfoClient();
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        String id=txtIDClient.getText();
        String name=txtNameClient.getText();
        int confirm=JOptionPane.showConfirmDialog(rootPane, "Ban co chac muon xoa "+name+" khoi danh sach khong?","",JOptionPane.YES_NO_OPTION);
        if(confirm== JOptionPane.YES_OPTION){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String query="DELETE Client WHERE ID_Client=? AND Name_Client=?;";
                Connection con=DriverManager.getConnection(dbURL);
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1, id);
                ps.setString(2, name);

                ps.executeUpdate();
            }catch(Exception ex){
                System.out.println(ex);
            }
            btnClearActionPerformed(evt);
            loadInfoClient();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    //B???m v??o 1 d??ng trong b???ng -> xu???t th??ng tin ra c??c textview
    private void tblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientMouseClicked
        int selectedIndex=tblClient.getSelectedRow();
        txtIDClient.setText(tblClient.getValueAt(selectedIndex, 0)+"");
        txtNameClient.setText(tblClient.getValueAt(selectedIndex, 1)+"");
        txtCMND.setText(tblClient.getValueAt(selectedIndex, 2)+"");
        cmbSex.setSelectedItem(tblClient.getValueAt(selectedIndex, 3)+"");
        
        String getDate=tblClient.getValueAt(selectedIndex, 4).toString();
        java.util.Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(getDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        dcsDOB.setDate(date);
        
        txtHomeTown.setText(tblClient.getValueAt(selectedIndex, 5)+"");
        txtPhoneNumber.setText(tblClient.getValueAt(selectedIndex, 6)+"");
    }//GEN-LAST:event_tblClientMouseClicked

    
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
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JComboBox<String> cmbSex;
    private com.toedter.calendar.JDateChooser dcsDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClient;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtHomeTown;
    private javax.swing.JTextField txtIDClient;
    private javax.swing.JTextField txtNameClient;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
