/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quitation;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jahed
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        MainPanel = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        ShowPass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        passLabel1 = new javax.swing.JLabel();
        CheckForEmployee = new javax.swing.JCheckBox();
        CheckForAdmin = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        HadingPanal = new javax.swing.JPanel();
        Q1 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        min = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(24, 33, 43));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        MainPanel.setLayout(null);

        UserLabel.setBackground(new java.awt.Color(24, 33, 43));
        UserLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("User name");
        MainPanel.add(UserLabel);
        UserLabel.setBounds(230, 10, 110, 30);

        password.setBackground(new java.awt.Color(44, 53, 63));
        password.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        MainPanel.add(password);
        password.setBounds(342, 50, 180, 30);

        Username.setBackground(new java.awt.Color(44, 53, 63));
        Username.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        MainPanel.add(Username);
        Username.setBounds(340, 10, 200, 30);

        ShowPass.setBackground(new java.awt.Color(44, 53, 63));
        ShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        MainPanel.add(ShowPass);
        ShowPass.setBounds(520, 50, 21, 30);

        jLabel3.setBackground(new java.awt.Color(44, 53, 63));
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        MainPanel.add(jLabel3);
        jLabel3.setBounds(10, 10, 200, 160);

        passLabel1.setBackground(new java.awt.Color(24, 33, 43));
        passLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        passLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passLabel1.setText("Password");
        MainPanel.add(passLabel1);
        passLabel1.setBounds(230, 50, 110, 30);

        CheckForEmployee.setBackground(new java.awt.Color(44, 53, 63));
        CheckForEmployee.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        CheckForEmployee.setForeground(new java.awt.Color(255, 255, 255));
        CheckForEmployee.setText("Employee");
        CheckForEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckForEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckForEmployeeActionPerformed(evt);
            }
        });
        MainPanel.add(CheckForEmployee);
        CheckForEmployee.setBounds(230, 90, 120, 30);

        CheckForAdmin.setBackground(new java.awt.Color(44, 53, 63));
        CheckForAdmin.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        CheckForAdmin.setForeground(new java.awt.Color(255, 255, 255));
        CheckForAdmin.setText("Admin");
        CheckForAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckForAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckForAdminActionPerformed(evt);
            }
        });
        MainPanel.add(CheckForAdmin);
        CheckForAdmin.setBounds(230, 130, 90, 30);

        login.setBackground(new java.awt.Color(44, 53, 63));
        login.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        MainPanel.add(login);
        login.setBounds(340, 160, 100, 30);

        HadingPanal.setBackground(new java.awt.Color(24, 33, 43));
        HadingPanal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 3, true));
        HadingPanal.setLayout(null);

        Q1.setBackground(new java.awt.Color(24, 33, 43));
        Q1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(255, 255, 255));
        Q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Q1.setText("Quotation");
        HadingPanal.add(Q1);
        Q1.setBounds(0, 0, 100, 30);

        Q2.setBackground(new java.awt.Color(24, 33, 43));
        Q2.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        Q2.setForeground(new java.awt.Color(255, 255, 255));
        Q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Q2.setText("     Maker.");
        HadingPanal.add(Q2);
        Q2.setBounds(0, 16, 100, 30);

        LoginLabel.setBackground(new java.awt.Color(24, 33, 43));
        LoginLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("Login");
        HadingPanal.add(LoginLabel);
        LoginLabel.setBounds(190, 0, 180, 50);

        Exit.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        HadingPanal.add(Exit);
        Exit.setBounds(510, 10, 30, 30);

        min.setBackground(new java.awt.Color(24, 33, 43));
        min.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("-");
        min.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 53, 63), 1, true));
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        HadingPanal.add(min);
        min.setBounds(460, 10, 40, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HadingPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HadingPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setForeground(new java.awt.Color(128,0,0));

    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_ExitMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        min.setForeground(new java.awt.Color(128,128,128));
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        min.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_minMouseExited

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if(ShowPass.isSelected()){
            password.setEchoChar((char)0);
        }
        else{
            password.setEchoChar(('*'));
        }
    }//GEN-LAST:event_ShowPassActionPerformed

    private void CheckForEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckForEmployeeActionPerformed
        if(CheckForEmployee.isSelected()){
            CheckForAdmin.setSelected(false);
        }
        
    }//GEN-LAST:event_CheckForEmployeeActionPerformed

    private void CheckForAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckForAdminActionPerformed
        if(CheckForAdmin.isSelected()){
            CheckForEmployee.setSelected(false);
        }
    }//GEN-LAST:event_CheckForAdminActionPerformed
    private boolean varifydata() {
        if (Username.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty user name field");
            return false;
        } else if (password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty password field");
            return false;
        }
        else if (!CheckForAdmin.isSelected() && !CheckForEmployee.isSelected()) {
            JOptionPane.showMessageDialog(null, "Admin/Employee not selected");
            return false;
        } 
       
        else {
            return true;
        }
    }
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if(varifydata()){
            if(CheckForAdmin.isSelected()){
                Admin adminpage = new Admin();
                adminpage.setVisible(true);
                this.dispose();
            }
            
            else if(CheckForEmployee.isSelected()){
                Employee Employeepage = new Employee();
                Employeepage.setVisible(true);
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckForAdmin;
    private javax.swing.JCheckBox CheckForEmployee;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel HadingPanal;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JLabel min;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}