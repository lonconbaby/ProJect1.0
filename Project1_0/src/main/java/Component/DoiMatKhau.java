/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.User.User;
import Login.Const;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class DoiMatKhau extends javax.swing.JPanel {

    /**
     * Creates new form DoiMatKau
     */
    public DoiMatKhau() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatkhaucu = new javax.swing.JPasswordField();
        txtnhaplaimatkhau = new javax.swing.JPasswordField();
        txtmatkhaumoi = new javax.swing.JPasswordField();
        cknhienmatkhau = new javax.swing.JCheckBox();
        btnthaydoimatkhau = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mật Khẩu Cũ :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nhập  Mật Khẩu Mới :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nhập Lại Mật Khẩu :");

        txtMatkhaucu.setText("pasowrd");
        txtMatkhaucu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatkhaucuFocusGained(evt);
            }
        });

        txtnhaplaimatkhau.setText("password");
        txtnhaplaimatkhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnhaplaimatkhauFocusGained(evt);
            }
        });

        txtmatkhaumoi.setText("password");
        txtmatkhaumoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmatkhaumoiFocusGained(evt);
            }
        });

        cknhienmatkhau.setText("Hiện Mật Khẩu");
        cknhienmatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cknhienmatkhauActionPerformed(evt);
            }
        });

        btnthaydoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px_1.png"))); // NOI18N
        btnthaydoimatkhau.setText("Thay Đổi Mật Khẩu");
        btnthaydoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthaydoimatkhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnthaydoimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cknhienmatkhau)
                            .addComponent(txtMatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnhaplaimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnhaplaimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cknhienmatkhau)
                .addGap(18, 18, 18)
                .addComponent(btnthaydoimatkhau)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Đổi Mật Khẩu");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_lock_100px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cknhienmatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cknhienmatkhauActionPerformed
        if (cknhienmatkhau.isSelected()) {
            txtmatkhaumoi.setEchoChar((char) 0);
            txtnhaplaimatkhau.setEchoChar((char) 0);
        } else {
            txtmatkhaumoi.setEchoChar('*');
            txtnhaplaimatkhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cknhienmatkhauActionPerformed

    private void btnthaydoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthaydoimatkhauActionPerformed
        ChangePassword();
    }//GEN-LAST:event_btnthaydoimatkhauActionPerformed

    private void txtMatkhaucuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatkhaucuFocusGained
        txtMatkhaucu.setText("");
    }//GEN-LAST:event_txtMatkhaucuFocusGained

    private void txtmatkhaumoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmatkhaumoiFocusGained
        txtmatkhaumoi.setText("");
    }//GEN-LAST:event_txtmatkhaumoiFocusGained

    private void txtnhaplaimatkhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnhaplaimatkhauFocusGained
        txtnhaplaimatkhau.setText("");
    }//GEN-LAST:event_txtnhaplaimatkhauFocusGained
    private void ChangePassword() {
        User user = Const.user;
        if (txtMatkhaucu.getText().isEmpty() || txtmatkhaumoi.getText().isEmpty() || txtnhaplaimatkhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không Được Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("src/main/resources/img/icons8_ask_question_20px_3.png")));

        } else {
            if (txtMatkhaucu.getText().equals(user.getPassword())) {
                if (txtmatkhaumoi.getText().equals(txtnhaplaimatkhau.getText())) {
                    User ChangePassword = Const.session.get(User.class, user.getUserName());
                    ChangePassword.setPassword(txtmatkhaumoi.getText());
                    Const.session.getTransaction().begin();
                    Const.session.save(ChangePassword);
                    Const.session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Thay Đổi Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("src/main/resources/img/icons8_ask_question_20px_3.png")));

                } else {
            JOptionPane.showMessageDialog(null, "Nhập lại Mật Khẩu Không Giống Nhau", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("src/main/resources/img/icons8_ask_question_20px_3.png")));

                }
            } else {
            JOptionPane.showMessageDialog(null, "Mật Khẩu cũ Sai Vui Lòng Nhập Lại", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("src/main/resources/img/icons8_ask_question_20px_3.png")));

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthaydoimatkhau;
    private javax.swing.JCheckBox cknhienmatkhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtMatkhaucu;
    private javax.swing.JPasswordField txtmatkhaumoi;
    private javax.swing.JPasswordField txtnhaplaimatkhau;
    // End of variables declaration//GEN-END:variables
}