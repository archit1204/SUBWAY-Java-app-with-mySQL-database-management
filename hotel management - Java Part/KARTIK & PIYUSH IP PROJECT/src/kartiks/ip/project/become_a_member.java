/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kartiks.ip.project;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KARTIK NIGHANIA
 */
public class become_a_member extends javax.swing.JFrame {
   

    /**
     * Creates new form become_a_member
     */
    public become_a_member() {
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

        jTextField2 = new javax.swing.JTextField();
        congratsMsg = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernameLb = new javax.swing.JLabel();
        pwdLb = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        emailTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        mobnoTf = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTa = new javax.swing.JTextArea();
        idLb = new javax.swing.JTextField();
        maleRb = new javax.swing.JRadioButton();
        femaleRb = new javax.swing.JRadioButton();
        backgroundLb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pwdTf = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        congratsMsg.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        congratsMsg.setLocationByPlatform(true);
        congratsMsg.setMinimumSize(new java.awt.Dimension(650, 500));
        congratsMsg.setModal(true);
        congratsMsg.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                congratsMsgWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        congratsMsg.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 18));
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("USERNAME");
        congratsMsg.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 130, 20));

        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 1, 18));
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("PASSWORD");
        congratsMsg.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 120, 20));

        usernameLb.setBackground(new java.awt.Color(255, 255, 255));
        usernameLb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        congratsMsg.getContentPane().add(usernameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 30));

        pwdLb.setBackground(new java.awt.Color(255, 255, 255));
        pwdLb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        congratsMsg.getContentPane().add(pwdLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 30));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/next button.jpg"))); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        congratsMsg.getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 100, 40));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36));
        jLabel1.setText("your login credentials are-");
        congratsMsg.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 380, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/thankyou background.jpg"))); // NOI18N
        congratsMsg.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cancel-button-similar to done.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 80, 40));

        emailTf.setToolTipText("");
        emailTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTfFocusLost(evt);
            }
        });
        getContentPane().add(emailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 30));

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });
        nameTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTfFocusLost(evt);
            }
        });
        nameTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTfKeyTyped(evt);
            }
        });
        getContentPane().add(nameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 30));

        mobnoTf.setToolTipText("THIS WILL BE NEEDED IF YOU FORGOT YOUR USERNAME");
        mobnoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnoTfActionPerformed(evt);
            }
        });
        mobnoTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobnoTfFocusLost(evt);
            }
        });
        mobnoTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobnoTfKeyTyped(evt);
            }
        });
        getContentPane().add(mobnoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 30));

        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SIGNUP BUTTON.JPG"))); // NOI18N
        signupBtn.setBorder(null);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, 40));

        addressTa.setColumns(20);
        addressTa.setRows(5);
        addressTa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressTaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(addressTa);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 230, 80));

        idLb.setBackground(new java.awt.Color(0, 0, 0));
        idLb.setEditable(false);
        idLb.setForeground(new java.awt.Color(102, 255, 102));
        idLb.setText(" GENDER");
        getContentPane().add(idLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 40));

        maleRb.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup.add(maleRb);
        maleRb.setForeground(new java.awt.Color(255, 255, 0));
        maleRb.setText("MALE");
        getContentPane().add(maleRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 60, -1));

        femaleRb.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup.add(femaleRb);
        femaleRb.setForeground(new java.awt.Color(255, 255, 0));
        femaleRb.setText("FEMALE");
        getContentPane().add(femaleRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        backgroundLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SIGN UP FORM BACKGROUND-001.jpg"))); // NOI18N
        backgroundLb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(backgroundLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));
        getContentPane().add(pwdTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed

        String name=nameTf.getText().trim().toLowerCase();
      long mobile=Long.parseLong(mobnoTf.getText());
      
      String address=addressTa.getText().trim().toLowerCase();
String email_id = emailTf.getText().trim().toLowerCase();
String password="";
String password1=JOptionPane.showInputDialog("please select a password for your account");
String password2=JOptionPane.showInputDialog("re-enter password to confirm");
if(password1.equals(password2)){
    password=password1;
}
else{
    JOptionPane.showMessageDialog(null, "the password you entered didnt matched, please try again");
    signupBtn.doClick();
}
if(name.equals("")||mobnoTf.getText().equals("")||password.equals("")||email_id.equals("")||address.equals(""))
    JOptionPane.showMessageDialog(null, "All fields are mandatory.");
else{
      try {
            Class.forName("java.sql.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
Statement stmt=con.createStatement();
String id="select ID from members order by ID;";
ResultSet rs=stmt.executeQuery(id);
while(rs.next()){
int new_id=Integer.parseInt(rs.getString("ID"))+1;
idLb.setText(""+new_id);
usernameLb.setText(""+new_id); 
pwdLb.setText(""+password);
}

String gender="";
if(maleRb.isSelected())
  gender="M";
else
    gender="F";

Calendar c=Calendar.getInstance();

String add_member="insert into members values("+idLb.getText().trim()+",'offline','"+name+"','"+gender+"','"+password+"','"+(c.get(Calendar.YEAR))+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.DATE))+"','"+(c.get(Calendar.YEAR))+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.DATE))+"');" ;

String update_contact_info="insert into contact_info values("+idLb.getText().trim()+",'"+name+"','offline',"+mobile+",'"+email_id+"','"+address+"');";
stmt.executeUpdate(add_member);
stmt.executeUpdate(update_contact_info);
rs.close();
stmt.close();
con.close();
congratsMsg.setVisible(true);
dispose();
}
catch(Exception e){
 
JOptionPane.showMessageDialog(this,e.getMessage());
new become_a_member().setVisible(true);
dispose();

}
     
  }

    }//GEN-LAST:event_signupBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void mobnoTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobnoTfFocusLost
String mobile=mobnoTf.getText().trim();
if(mobile.equals("")){
    }
else{
    int initial_digit=Integer.parseInt(mobile.substring(0, 1));
int length=mobile.length();
   if(length==10){
       if(initial_digit==8|| initial_digit==9 || initial_digit==7){
   String duplicate_check="select mobile_no from contact_info where mobile_no="+mobile+";";
    try{
    Statement stmt=connect();
    ResultSet rs=stmt.executeQuery(duplicate_check);
    while(rs.next()){
        String mysql_mobno=(rs.getString("mobile_no")).toLowerCase().trim();
        if(mobile.equals(mysql_mobno)){
            JOptionPane.showMessageDialog(null, "Sorry! this number has already been taken by our existing user. please try a different mobile number.");
            mobnoTf.setText("");
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
            mobnoTf.setText("");
   }
   
   }

else{
           JOptionPane.showMessageDialog(null, "Please enter a 10 digit number ONLY");
       mobnoTf.setText("");
   }

}
    }//GEN-LAST:event_mobnoTfFocusLost

    private void congratsMsgWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_congratsMsgWindowGainedFocus

    }//GEN-LAST:event_congratsMsgWindowGainedFocus

    private void nameTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTfFocusLost

    }//GEN-LAST:event_nameTfFocusLost

    private void nameTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTfKeyTyped

           char ch= evt.getKeyChar();
   if(ch==' '){
   }
   else{
           if(! ((ch>='a') && (ch<='z')))
        evt.consume();
   }
    }//GEN-LAST:event_nameTfKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
maleRb.setSelected(true);  
    }//GEN-LAST:event_formWindowGainedFocus

    private void emailTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTfFocusLost
   
    }//GEN-LAST:event_emailTfFocusLost

    private void mobnoTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobnoTfKeyTyped
     char ch= evt.getKeyChar();
   if(! ((ch>='0') && (ch<='9')) ){
        evt.consume();
   }
    
    }//GEN-LAST:event_mobnoTfKeyTyped

    private void addressTaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTaFocusLost

    }//GEN-LAST:event_addressTaFocusLost

    private void mobnoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnoTfActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
new LOGIN_FORM().setVisible(true);
congratsMsg.setVisible(false);
dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  new LOGIN_FORM().setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
     public Statement connect() throws Exception
                                 {
   
        Class.forName("java.sql.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subway","root","123");
Statement stmt=con.createStatement();
return stmt;
     
}
            

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
            java.util.logging.Logger.getLogger(become_a_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(become_a_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(become_a_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(become_a_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new become_a_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTa;
    private javax.swing.JLabel backgroundLb;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JDialog congratsMsg;
    private javax.swing.JTextField emailTf;
    private javax.swing.JRadioButton femaleRb;
    private javax.swing.JTextField idLb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton maleRb;
    private javax.swing.JTextField mobnoTf;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel pwdLb;
    private javax.swing.JLabel pwdTf;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel usernameLb;
    // End of variables declaration//GEN-END:variables
}
