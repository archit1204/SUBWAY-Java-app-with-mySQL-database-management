/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kartiks.ip.project;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author KARTIK NIGHANIA
 */
public class edit_owners_profile extends javax.swing.JFrame {

    /**
     * Creates new form edit_profile
     */
    public edit_owners_profile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        EDIT = new javax.swing.JButton();
        GENDER = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        GENDER2 = new javax.swing.JLabel();
        GENDER1 = new javax.swing.JLabel();
        i = new javax.swing.JPasswordField();
        h = new javax.swing.JPasswordField();
        g = new javax.swing.JButton();
        d = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        c = new javax.swing.JTextArea();
        b = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        e = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        j = new javax.swing.JLabel();
        l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EDIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/EDIT SIMILAR TO DONE.jpg"))); // NOI18N
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });
        getContentPane().add(EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, 50));

        GENDER.setBackground(new java.awt.Color(0, 0, 0));
        GENDER.setForeground(new java.awt.Color(51, 255, 51));
        GENDER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GENDER.setText("PASSWORD");
        GENDER.setOpaque(true);
        getContentPane().add(GENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 70, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cancel button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, 60));

        GENDER2.setBackground(new java.awt.Color(0, 0, 0));
        GENDER2.setForeground(new java.awt.Color(51, 255, 51));
        GENDER2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GENDER2.setText("RE-ENTER PASSWORD");
        GENDER2.setOpaque(true);
        getContentPane().add(GENDER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 30));

        GENDER1.setBackground(new java.awt.Color(0, 0, 0));
        GENDER1.setForeground(new java.awt.Color(51, 255, 51));
        GENDER1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GENDER1.setText("GENDER");
        GENDER1.setOpaque(true);
        getContentPane().add(GENDER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 70, 30));
        getContentPane().add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 130, -1));
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, -1));

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/done button.jpg"))); // NOI18N
        g.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 100, 40));

        d.setToolTipText("");
        d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dFocusLost(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 30));

        c.setColumns(20);
        c.setRows(5);
        c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(c);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 150, 80));

        b.setToolTipText("THIS WILL BE NEEDED IF YOU FORGOT YOUR USERNAME");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bFocusLost(evt);
            }
        });
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bKeyTyped(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, 30));

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aFocusLost(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 30));

        e.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(e);
        e.setForeground(new java.awt.Color(255, 255, 0));
        e.setText("MALE");
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 60, -1));

        f.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(f);
        f.setForeground(new java.awt.Color(255, 255, 0));
        f.setText("FEMALE");
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SIGN UP FORM BACKGROUND-001.jpg"))); // NOI18N
        j.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/steampunk_gears_by_tearful_oblivion~3.jpg"))); // NOI18N
        l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 440, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed

        String name=a.getText().trim().toLowerCase();
        
        String gender="";
if(e.isSelected())
  gender="M";
else
    gender="F";

        String address=c.getText().trim().toLowerCase();
        String email_id = d.getText().trim().toLowerCase();
        String password="";
        String password1=new String(h.getPassword());
        String password2=new String(i.getPassword());
        if(password1.equals(password2)){
            password=password1;
        }
        else{
            JOptionPane.showMessageDialog(null, "the password you entered didnt matched, please try again");
            g.doClick();
        }
        if(name.equals("")|| password.equals("")||email_id.equals("")||address.equals(""))
        JOptionPane.showMessageDialog(null, "All fields are mandatory.");
        else{
            try {
                long mobile=Long.parseLong(b.getText());
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
                Statement stmt=con.createStatement();
                Statement stmt1=con.createStatement();
                Statement stmt2=con.createStatement();
                String update_members= "update members set name='"+ name +"' , gender='"+gender+"' , password='"+password+"' where ID=101 ;";
                    String update_contact_info= "update contact_info  set name='"+ name +"' , mobile_no="+mobile+" , email='"+email_id+"' , address='"+address+"' where ID=101 ;";
                   String update_orders= "update orders set name='"+ name +"' where ID=101 ;";
               stmt.executeUpdate(update_members);
              stmt1.executeUpdate(update_contact_info);
                   stmt2.executeUpdate(update_orders);
                stmt.close();
                con.close();
               JOptionPane.showMessageDialog(null, "changes saved successfully!");
               new owners_dashboard().setVisible(true);
                dispose();
                
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(this,e.getMessage());
             
                dispose();

            }

        }
    }//GEN-LAST:event_gActionPerformed

    private void dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dFocusLost

    }//GEN-LAST:event_dFocusLost

    private void cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cFocusLost

    }//GEN-LAST:event_cFocusLost

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bFocusLost
        String mobile=b.getText().trim();
        if(mobile.equals("")){
            JOptionPane.showMessageDialog(null, "this field is mandatory."); 
        }
        else{
            int initial_digit=Integer.parseInt(mobile.substring(0, 1));
            int length=mobile.length();
            if(length==10){
                if(initial_digit==8|| initial_digit==9 || initial_digit==7){
                    String duplicate_check="select mobile_no from contact_info where mobile_no="+mobile+" and status='offline' and ID>101 ;";
                    try{
                       Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery(duplicate_check);
                        while(rs.next()){
                            String mysql_mobno=(rs.getString("mobile_no")).toLowerCase().trim();
                            if(mobile.equals(mysql_mobno)){
                                JOptionPane.showMessageDialog(null, "Sorry! this number has already been taken by our existing user. please try a different mobile number.");
                                
                                b.setText("");
                            }
                        }
                    }

                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "This kind of mobile number does not exist in India. Please enter a VALID number.");
                    b.setText("");
                }

            }

            else{
                JOptionPane.showMessageDialog(null, "Please enter a 10 digit number ONLY");
                b.setText("");
            }

        }
    }//GEN-LAST:event_bFocusLost

    private void bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyTyped
        char ch= evt.getKeyChar();
        if(! ((ch>='0') && (ch<='9')) ){
            evt.consume();
        }

    }//GEN-LAST:event_bKeyTyped

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void aFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aFocusLost

    }//GEN-LAST:event_aFocusLost

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped

         char ch= evt.getKeyChar();
   if(ch==' '){
   }
   else{
           if(! ((ch>='a') && (ch<='z')))
        evt.consume();
   }
    }//GEN-LAST:event_aKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
 a.setEnabled(false);
 b.setEnabled(false);
 c.setEnabled(false);
 d.setEnabled(false);
 e.setEnabled(false);
 f.setEnabled(false);
 g.setEnabled(false);
 h.setEnabled(false);
 i.setEnabled(false);


 
 
 e.setSelected(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new owners_dashboard().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
      a.setEnabled(true);
 b.setEnabled(true);
 c.setEnabled(true);
 d.setEnabled(true);
 e.setEnabled(true);
 f.setEnabled(true);
 g.setEnabled(true);
 h.setEnabled(true);
 i.setEnabled(true);
 

    }//GEN-LAST:event_EDITActionPerformed

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
            java.util.logging.Logger.getLogger(edit_owners_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_owners_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_owners_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_owners_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_owners_profile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDIT;
    private javax.swing.JLabel GENDER;
    private javax.swing.JLabel GENDER1;
    private javax.swing.JLabel GENDER2;
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea c;
    private javax.swing.JTextField d;
    private javax.swing.JRadioButton e;
    private javax.swing.JRadioButton f;
    private javax.swing.JButton g;
    private javax.swing.JPasswordField h;
    private javax.swing.JPasswordField i;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l;
    // End of variables declaration//GEN-END:variables
}
