/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.UsuarioDAO;
import Email.Email;
import Entidades.Usuario;
import static GUI.TelaCadastroServidor.VALID_EMAIL_ADDRESS_REGEX;
import Utilitario.GeradorCodigos;
import Utilitario.JPassWordFieldHint;
import java.awt.Color;
import java.awt.Point;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class TelaEsqueceuSenha extends javax.swing.JFrame {
private Point point = new Point();
public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);





 public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }


    public TelaEsqueceuSenha() {
        initComponents();
        ctLogin.setText(TelaLogin.ctLogin.getText());
        this.setIconImage( new ImageIcon(getClass().getResource("/Imagens/logoSDi.png")).getImage());
        
        
        
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
        ctLogin = new Utilitario.JTextFieldHint(new JTextField(),"user-icon","Login");
 ;
        bRedefinir = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pMinimizar = new javax.swing.JPanel();
        lMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ctEmail = new Utilitario.JTextFieldHint(new JTextField(),"email","Email");
 ;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SDi -  Redefinir Senha");
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ctLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ctLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctLoginActionPerformed(evt);
            }
        });

        bRedefinir.setBackground(new java.awt.Color(58, 65, 84));
        bRedefinir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bRedefinir.setForeground(new java.awt.Color(255, 255, 255));
        bRedefinir.setText("Redefinir");
        bRedefinir.setBorderPainted(false);
        bRedefinir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRedefinir.setFocusCycleRoot(true);
        bRedefinir.setFocusPainted(false);
        bRedefinir.setSelected(true);
        bRedefinir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bRedefinirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRedefinirMouseExited(evt);
            }
        });
        bRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRedefinirActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(235, 81, 51));
        bSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("Sair");
        bSair.setBorderPainted(false);
        bSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSair.setFocusPainted(false);
        bSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSairMouseExited(evt);
            }
        });
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 123));

        pMinimizar.setBackground(new java.awt.Color(0, 51, 255));
        pMinimizar.setPreferredSize(new java.awt.Dimension(20, 20));
        pMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pMinimizarMouseExited(evt);
            }
        });

        lMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Horizontal_Line_20px_4.png"))); // NOI18N

        javax.swing.GroupLayout pMinimizarLayout = new javax.swing.GroupLayout(pMinimizar);
        pMinimizar.setLayout(pMinimizarLayout);
        pMinimizarLayout.setHorizontalGroup(
            pMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMinimizar))
        );
        pMinimizarLayout.setVerticalGroup(
            pMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMinimizar))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Key_64px_1.png"))); // NOI18N
        jLabel5.setText(" Redefinir Senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(166, 166, 166))
                    .addComponent(pMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addComponent(pMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        ctEmail.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ctEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addComponent(ctLogin)
                    .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(ctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ctLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctLoginActionPerformed

    private void bRedefinirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRedefinirMouseEntered
        bRedefinir.setBackground(new Color(235, 235, 235));
        bRedefinir.setForeground(new Color(58, 65, 85));
    }//GEN-LAST:event_bRedefinirMouseEntered

    private void bRedefinirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRedefinirMouseExited
        bRedefinir.setBackground(new Color(58, 65, 85));
        bRedefinir.setForeground(Color.WHITE);
    }//GEN-LAST:event_bRedefinirMouseExited

    private void bRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRedefinirActionPerformed
        Usuario buscado = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        Email email = new Email();

        if ((ctLogin.getText().isEmpty()) || (ctEmail.getText().isEmpty())) {

            JOptionPane.showMessageDialog(null, " Preencha todos os campos! ");
        } else {
             if(validate(ctEmail.getText())) {
        buscado = udao.verificarLogin(ctLogin.getText());
        
        if (buscado.getLogin().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Login inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            
        } else {
            if (buscado.getEmail().equals(ctEmail.getText())) {
                GeradorCodigos geradorST = new GeradorCodigos();
                String senhaTemp = geradorST.gerarCodigo("s");
                TelaLogin.senhaAtual = senhaTemp;
                TelaLogin.loginAtual = ctLogin.getText();
                buscado.setSenha(senhaTemp);
                udao.alterarUsuario(buscado);
                this.dispose();
                try {
                    
                    email.enviarEmail("SENHA TEMPORÁRIA", "Sua senha temporária é : " +senhaTemp, ctEmail.getText());
                    JOptionPane.showMessageDialog(null, "Pronto,uma senha temporária foi eviada para seu email, atualize agora", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    TelaAlterarSenha obj = new TelaAlterarSenha();
                obj.setVisible(true);
                TelaAlterarSenha.abrirTelaLogin = true;
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
            } else {
                
                JOptionPane.showMessageDialog(null, "      Email inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                
            }
        }
        }else{
          JOptionPane.showMessageDialog(null, "Formato do email informado é inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
           
        }
             
             
             
        }
    }//GEN-LAST:event_bRedefinirActionPerformed

    private void bSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseEntered
        bSair.setBackground(new Color(235, 235, 235));
        bSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_bSairMouseEntered

    private void bSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseExited
        bSair.setBackground(new Color(217, 81, 51));
        bSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_bSairMouseExited

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void pMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizarMouseClicked
        this.setState(TelaDiretor.ICONIFIED);
    }//GEN-LAST:event_pMinimizarMouseClicked

    private void pMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizarMouseEntered
        pMinimizar.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_pMinimizarMouseEntered

    private void pMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizarMouseExited
        pMinimizar.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_pMinimizarMouseExited

    private void ctEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEmailActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
                                   
        point.x = evt.getX();
        point.y = evt.getY();
      
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaEsqueceuSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRedefinir;
    private javax.swing.JButton bSair;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctLogin;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lMinimizar;
    private javax.swing.JPanel pMinimizar;
    // End of variables declaration//GEN-END:variables
}
