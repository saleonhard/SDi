/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utilitario.JPassWordFieldHint;
import ConexaoDB.ConectarBD;
import DAO.UsuarioDAO;
import Entidades.Usuario;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Point;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author LSA
 */
public class TelaLogin extends javax.swing.JFrame {
    
    private Point point = new Point();    
    public static String senhaAtual;
    public static String loginAtual;
    
    
    void erro(){
        Point p = this.getLocation();
        TelaLogin login = this;
        
        new Thread() {
            @Override
            public void run() {
                
                try {
                    for (int i = 0; i < 6; i++) {
                        login.setLocation(p.x + 10, p.y);
                        sleep(20);
                        login.setLocation(p.x - 10, p.y);
                        sleep(20);
                        
                    }
                    login.setLocation(p.x, p.y);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }.start();
    }
    
    private void acessarSistema() {
        
        senhaAtual = ctSenha.getText().trim();
        loginAtual = ctLogin.getText();
        
        UsuarioDAO udao = new UsuarioDAO();
        Usuario buscado = new Usuario();
        
        if (ctSenha.getText().toString().isEmpty() || ctLogin.getText().isEmpty()) {
             erro();
            JOptionPane.showMessageDialog(null, " Preencha todos os campos! ");
           
        } else {
            buscado = udao.verificarLogin(ctLogin.getText().trim());
            
            if (buscado.getLogin().equals("")) {
                 erro();
                JOptionPane.showMessageDialog(null, "Usuário inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                
            } else {
                if (buscado.getSenha().equals(ctSenha.getText().toString())) {
                    JOptionPane.showMessageDialog(null, "Seja bem vindo usuário", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
                    
                    if (buscado.getTipo().equals("Diretor")) {
                        TelaDiretor td = new TelaDiretor();
                        td.setVisible(true);
                    } else {
                        TelaEditor te = new TelaEditor();
                        te.setVisible(true);
                    }
                    this.dispose();
                    
                } else {
                     erro();
                    JOptionPane.showMessageDialog(null, "Senha inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }
    
    public TelaLogin() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pMinimizar5 = new javax.swing.JPanel();
        lMinimizar5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ctLogin = new Utilitario.JTextFieldHint(new JTextField(),"user-icon","Login");
 ;
        ctSenha =  new JPassWordFieldHint( new JPasswordField(),"padlock","Senha")
  ;
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        btVer = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        btEsqueceu = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SDi - Login");
        setUndecorated(true);
        setResizable(false);
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

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(174, 123));

        pMinimizar5.setBackground(new java.awt.Color(0, 51, 255));
        pMinimizar5.setPreferredSize(new java.awt.Dimension(20, 20));
        pMinimizar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMinimizar5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pMinimizar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pMinimizar5MouseExited(evt);
            }
        });

        lMinimizar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Horizontal_Line_20px_4.png"))); // NOI18N

        javax.swing.GroupLayout pMinimizar5Layout = new javax.swing.GroupLayout(pMinimizar5);
        pMinimizar5.setLayout(pMinimizar5Layout);
        pMinimizar5Layout.setHorizontalGroup(
            pMinimizar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMinimizar5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMinimizar5))
        );
        pMinimizar5Layout.setVerticalGroup(
            pMinimizar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMinimizar5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMinimizar5))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pMinimizar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pMinimizar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ctLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ctLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctLoginActionPerformed(evt);
            }
        });

        ctSenha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ctSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSenhaActionPerformed(evt);
            }
        });

        bEntrar.setBackground(new java.awt.Color(51, 204, 0));
        bEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bEntrar.setText("Entrar");
        bEntrar.setBorderPainted(false);
        bEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEntrar.setFocusCycleRoot(true);
        bEntrar.setFocusPainted(false);
        bEntrar.setSelected(true);
        bEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEntrarMouseExited(evt);
            }
        });
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
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

        btVer.setBackground(new java.awt.Color(255, 255, 255));
        btVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ver.png"))); // NOI18N
        btVer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Login_64px_2.png"))); // NOI18N
        jLabel5.setText(" Login");

        btEsqueceu.setBackground(new java.awt.Color(58, 65, 85));
        btEsqueceu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEsqueceu.setForeground(new java.awt.Color(255, 255, 255));
        btEsqueceu.setText("Esqueceu sua senha");
        btEsqueceu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEsqueceu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEsqueceuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEsqueceuMouseExited(evt);
            }
        });
        btEsqueceu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEsqueceuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEsqueceu, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btVer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(ctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEsqueceu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ctLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctLoginActionPerformed

    private void ctSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSenhaActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        
        acessarSistema();
        

    }//GEN-LAST:event_bEntrarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseEntered
        bEntrar.setBackground(new Color(235, 235, 235));
        bEntrar.setForeground(new Color(51,204,0));
    }//GEN-LAST:event_bEntrarMouseEntered

    private void bSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseEntered
        bSair.setBackground(new Color(235, 235, 235));
        bSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_bSairMouseEntered

    private void bEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseExited
        bEntrar.setBackground(new Color(51,204,0));
        bEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_bEntrarMouseExited

    private void bSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseExited
        bSair.setBackground(new Color(217, 81, 51));
        bSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_bSairMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
        

    }//GEN-LAST:event_formMouseDragged

    private void pMinimizar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizar5MouseClicked
        this.setState(TelaDiretor.ICONIFIED);
    }//GEN-LAST:event_pMinimizar5MouseClicked

    private void pMinimizar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizar5MouseEntered
        pMinimizar5.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_pMinimizar5MouseEntered

    private void pMinimizar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizar5MouseExited
        pMinimizar5.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_pMinimizar5MouseExited

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        
        if (ctSenha.echoCharIsSet()) {
            btVer.setIcon(new ImageIcon(getClass().getResource("/Imagens/nver.png")));
            ctSenha.setEchoChar('\u0000');
        } else {
            btVer.setIcon(new ImageIcon(getClass().getResource("/Imagens/ver.png")));
            ctSenha.setEchoChar('\u25cf');
            
        }
    }//GEN-LAST:event_btVerActionPerformed

    private void btEsqueceuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEsqueceuActionPerformed
       TelaEsqueceuSenha obj=new TelaEsqueceuSenha();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btEsqueceuActionPerformed

    private void btEsqueceuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEsqueceuMouseExited
       btEsqueceu.setBackground(new Color(58, 65, 85));
       btEsqueceu.setForeground(Color.WHITE);
    }//GEN-LAST:event_btEsqueceuMouseExited

    private void btEsqueceuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEsqueceuMouseEntered
       btEsqueceu.setBackground(new Color(235, 235, 235));
       btEsqueceu.setForeground(new Color(58, 65, 85));
    }//GEN-LAST:event_btEsqueceuMouseEntered

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JButton btEsqueceu;
    private javax.swing.JToggleButton btVer;
    public static javax.swing.JTextField ctLogin;
    private javax.swing.JPasswordField ctSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lMinimizar5;
    private javax.swing.JPanel pMinimizar5;
    // End of variables declaration//GEN-END:variables
}
