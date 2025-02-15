/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lbms.Dbconnect;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class UpdateMember extends javax.swing.JInternalFrame {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs = null;

    /**
     * Creates new form UpdateMember
     */
    public UpdateMember() {
        initComponents();
        con=Dbconnect.connect();
        tableload();
    }
    
     public void tableload() 
    {
        try{
            String sql="Select SID,Name,Email,Address,Phone,Age,Gender,Year,Semester,UserName,Password from member";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            updateT.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Address = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Semi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Year = new javax.swing.JComboBox<>();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateT = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        PasswordF = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        jLabel7.setText("Age");

        Semi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Semester 1", "Semester 2" }));

        jLabel10.setText("Semester");

        jLabel1.setText("Name");

        jLabel6.setText("Year");

        jLabel2.setText("Email Address");

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Year 1", "Year 2", "Year 3", "Year 4" }));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        jLabel4.setText("Phone Number");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailKeyPressed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        updateT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SID", "Name", "Email", "Address", "Phone", "Age", "Gender", "Year", "Semester", "UserName", "Password"
            }
        ));
        updateT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(updateT);

        jLabel5.setText("SID");

        ID.setText("ID");

        PasswordF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFKeyPressed(evt);
            }
        });

        jLabel11.setText("User Name");

        jLabel12.setText("Password");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Male", "Female" }));

        jLabel8.setText("Gender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Semi, 0, 192, Short.MAX_VALUE)
                            .addComponent(UserName)
                            .addComponent(PasswordF))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ID))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Semi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(PasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_EmailKeyPressed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int x=JOptionPane.showConfirmDialog(null,"Do you really want to update ");
        
        if(x==0)
        {
            String id = ID.getText();
            String name = Name.getText();
            String email=Email.getText();
            String address=Address.getText();
            String phone=Phone.getText();
            String age=Age.getText();
            String gender=Gender.getSelectedItem().toString();
            String year=Year.getSelectedItem().toString();
            String semi=Semi.getSelectedItem().toString();
            String User=UserName.getText();
            String PW=PasswordF.getText();
            
            String sql ="Update member SET Name = '"+name+"',Email ='"+email+"',Address ='"+address+"',Phone ='"+phone+"',Age ='"+age+"',Year ='"+year+"',Semester='"+semi+"' where SID = '"+id+"'";
            
            try {
                pst=con.prepareStatement(sql);
                pst.execute();
                tableload();
            } catch (SQLException ex) {
                //Logger.getLogger(UpdateMember.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_updateActionPerformed

    private void updateTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateTMouseClicked
       int r =updateT.getSelectedRow();
       
       String id = updateT.getValueAt(r, 0).toString();
       String name = updateT.getValueAt(r, 1).toString();
       String email = updateT.getValueAt(r, 2).toString();
       String address = updateT.getValueAt(r, 3).toString();
       String phone = updateT.getValueAt(r, 4).toString();
       String age = updateT.getValueAt(r, 5).toString();
       String gender = updateT.getValueAt(r, 6).toString();
       String year = updateT.getValueAt(r, 7).toString();
       String semi = updateT.getValueAt(r, 8).toString();
       String user = updateT.getValueAt(r, 9).toString();
       String pw = updateT.getValueAt(r, 10).toString();
       
       
      Name.setText(name);
      Email.setText(email);
      Address.setText(address);
      Phone.setText(phone);
      Age.setText(age);
      Gender.setSelectedItem(gender);
      Year.setSelectedItem(year);
      Semi.setSelectedItem(semi);
      UserName.setText(user);
      PasswordF.setText(pw);
      
      ID.setText(id);
    }//GEN-LAST:event_updateTMouseClicked

    private void PasswordFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFKeyPressed
        //            String pass = PasswordF.getText();
        //            boolean alphanumeric = true;
        //            for(int i =0;i<pass.length();i++)
        //            {
            //                if(!Character.isLetter(pass.charAt(i) && !Character.isDigit(i)))
            //
            //                    alphanumeric = false;
            //            }
        //                if(pass.length() > =5&&alphanumeric)
        //
    }//GEN-LAST:event_PasswordFKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField NameT;
    private javax.swing.JTextField NameT1;
    private javax.swing.JPasswordField PasswordF;
    private javax.swing.JTextField Phone;
    private javax.swing.JComboBox<String> Semi;
    private javax.swing.JTextField UserName;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update;
    private javax.swing.JTable updateT;
    // End of variables declaration//GEN-END:variables
}
