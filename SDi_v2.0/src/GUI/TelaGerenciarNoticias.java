/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NoticiaDAO;
import Entidades.Noticia;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LSA
 */
public class TelaGerenciarNoticias extends javax.swing.JFrame {
    private Point point = new Point();
    
    public static String noticiaEnviadaNot;
    public static String noticiaEnviadaAss;
    public static String noticiaEnviadaCod;
    public static String destinatarios;
    public static String codDestino;
    
    public void resetCampos() {
        ctCodigo.setText("");
        ctAssunto.setText("");
        txNoticia.setText("");

    }

    public static void atualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jtNoticias.getModel();
        modelo.setNumRows(0);
        NoticiaDAO udao = new NoticiaDAO();
        for (Noticia noticias : udao.listarNoticias()) {
            modelo.addRow(new Object[]{
                noticias.getCod(),
                noticias.getAssunto(), noticias.getNoticia(), noticias.getStatus()

            });

        }
    }

    public TelaGerenciarNoticias() {
        initComponents();
        this.setIconImage( new ImageIcon(getClass().getResource("/Imagens/logoSDi.png")).getImage());
        txNoticia.setLineWrap(true);
        txNoticia.setWrapStyleWord(true);
        atualizarTabela();
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
        jPanel3 = new javax.swing.JPanel();
        pMinimizar = new javax.swing.JPanel();
        lMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JLabel();
        ctAssunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txNoticia = new javax.swing.JTextArea();
        btVisualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtNoticias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        ctBuscar = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        ctCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btVisualizarD = new javax.swing.JButton();
        btUndo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SDi - Gerir Notícias");
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

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1030, 123));

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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_News_64px_2.png"))); // NOI18N
        jLabel5.setText("Gerir Notícias");

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Back_Arrow_40px.png"))); // NOI18N
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btVoltarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btVoltar)
                        .addGap(360, 360, 360)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btVoltar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        ctAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAssuntoActionPerformed(evt);
            }
        });

        txNoticia.setColumns(20);
        txNoticia.setRows(5);
        jScrollPane1.setViewportView(txNoticia);

        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Eye_16px_7.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setFocusCycleRoot(true);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        jtNoticias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Assunto", "Notícia", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtNoticias);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Assunto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Notícia:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Notícias:");

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Search_16px_5.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setPreferredSize(new java.awt.Dimension(85, 30));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Available_Updates_16px_2.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        ctBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctBuscarActionPerformed(evt);
            }
        });

        btEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Services_16px.png"))); // NOI18N
        btEnviar.setText("Configurar  Envio");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Trash_16px_2.png"))); // NOI18N
        btExcluir.setText(" Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        ctCodigo.setEditable(false);
        ctCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCodigoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Código:");

        btVisualizarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Eye_16px_7.png"))); // NOI18N
        btVisualizarD.setText("Visualizar Destinatários");
        btVisualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarDActionPerformed(evt);
            }
        });

        btUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Undo_16px_3.png"))); // NOI18N
        btUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUndoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Erase_16px_1.png"))); // NOI18N
        jButton1.setText("Limpar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVisualizarD, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(171, 171, 171))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(ctAssunto, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addComponent(ctBuscar)
                                .addGap(10, 10, 10)
                                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ctAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btVisualizarD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizarMouseClicked
        this.setState(TelaDiretor.ICONIFIED);
    }//GEN-LAST:event_pMinimizarMouseClicked

    private void pMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizarMouseEntered
        pMinimizar.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_pMinimizarMouseEntered

    private void pMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMinimizarMouseExited
        pMinimizar.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_pMinimizarMouseExited

    private void ctAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAssuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctAssuntoActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        if (jtNoticias.getSelectedRow() != -1) {
            int index = jtNoticias.getSelectedRow();
            String cod = (String) jtNoticias.getValueAt(index, 0);
            String ass = (String) jtNoticias.getValueAt(index, 1);
            String not = (String) jtNoticias.getValueAt(index, 2);

            ctCodigo.setText(cod);
            ctAssunto.setText(ass);
            txNoticia.setText(not);

            
        } else {
            JOptionPane.showMessageDialog(null, "  Selecione um notícia", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void ctBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctBuscarActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        if (jtNoticias.getSelectedRow() != -1) {
            int index = jtNoticias.getSelectedRow();
            noticiaEnviadaCod  =(String) jtNoticias.getValueAt(index, 0);
            noticiaEnviadaAss = (String) jtNoticias.getValueAt(index, 1);
            noticiaEnviadaNot = (String) jtNoticias.getValueAt(index, 2);
//            noticiaEnviadaSts = (String) jtNoticias.getValueAt(index, 3);
            
           

            if (jtNoticias.getValueAt(index, 3).equals("Enviada")) {
                if (JOptionPane.showConfirmDialog(null, "Esta notícia já foi enviada, deseja reenviar a notícia? " + (String) jtNoticias.getValueAt(index, 1), "Confirmação de reenvio", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    btEnviar.setEnabled(false);
                    TelaEnviarNoticia obj = new TelaEnviarNoticia();
                    obj.setVisible(true);
                    this.dispose();
                }
            } else {
                if (JOptionPane.showConfirmDialog(null, "Deseja enviar a notícia : " + (String) jtNoticias.getValueAt(index, 1), "Confirmação de Envio", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    btEnviar.setEnabled(false);
                    TelaEnviarNoticia obj = new TelaEnviarNoticia();
                    obj.setVisible(true);
                    this.dispose();

                }
            }

            resetCampos();
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "   Selecione uma notícia", "Erro", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btEnviarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (jtNoticias.getSelectedRow() != -1) {

            Noticia noticia = new Noticia();
            NoticiaDAO n = new NoticiaDAO();

            int index = jtNoticias.getSelectedRow();

            noticia.setCod((String) jtNoticias.getValueAt(index, 0));
            noticia.setAssunto((String) jtNoticias.getValueAt(index, 1));
            noticia.setNoticia((String) jtNoticias.getValueAt(index, 2));

            n.deletarNoticia(noticia);
            JOptionPane.showMessageDialog(null, "Notícia excluída com Sucessso!", "Confirmação de Exclusão", JOptionPane.INFORMATION_MESSAGE);
            resetCampos();

            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "   Selecione uma notícia", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if ((ctAssunto.getText().isEmpty()) || (txNoticia.getText().isEmpty())) {

            JOptionPane.showMessageDialog(null, " Preencha todos os campos! ");
        } else {

            Noticia noticia = new Noticia();
            NoticiaDAO n = new NoticiaDAO();

            List<Noticia> buscado = n.buscarNoticia(codDestino);

            noticia.setCod(ctCodigo.getText());
            noticia.setAssunto(ctAssunto.getText());
            noticia.setNoticia(txNoticia.getText());
            noticia.setStatus("Atualizada");
            for (Noticia noticiab : buscado) {

                noticia.setDestinatario(noticiab.getDestinatario()+"\n                          ********************************* APÓS A ATUALIZAÇÃO DA NOTÍCIA **********************************\n");
                destinatarios = noticiab.getDestinatario()+"\n                          ********************************* APÓS A ATUALIZAÇÃO DA NOTÍCIA **********************************\n";
            }

            if (!n.buscarNoticia(ctCodigo.getText()).isEmpty()) {
                n.alterarNoticia(noticia);

                JOptionPane.showMessageDialog(null, "Notícia atualizada com Sucessso!", "Confirmação de Atualização", JOptionPane.INFORMATION_MESSAGE);
                resetCampos();

                atualizarTabela();
            } else {

                JOptionPane.showMessageDialog(null, " Atualização não realizada, Notícia não existe!");

            }

        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if (ctBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "     Campo de busca vazio! ");
        } else {

            DefaultTableModel modelo = (DefaultTableModel) jtNoticias.getModel();
            modelo.setNumRows(0);
            NoticiaDAO ndao = new NoticiaDAO();
            List<Noticia> buscado = new ArrayList();
            buscado = ndao.buscarNoticia2(ctBuscar.getText());

            if (buscado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "   Notícia não existe!");
                atualizarTabela();
            } else {
                for (Noticia noticia : buscado) {
                    modelo.addRow(new Object[]{
                        noticia.getCod(), noticia.getAssunto(), noticia.getNoticia(), noticia.getStatus()

                    });

                }
            }

        }

    }//GEN-LAST:event_btBuscarActionPerformed

    private void ctCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCodigoActionPerformed

    private void btVisualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarDActionPerformed
         if (jtNoticias.getSelectedRow() != -1) {
            int index = jtNoticias.getSelectedRow();
            codDestino = (String) jtNoticias.getValueAt(index, 0);
            
            
            NoticiaDAO ndao = new NoticiaDAO();
            List<Noticia> buscado = new ArrayList();
            buscado = ndao.buscarNoticia(codDestino);
            
             for (Noticia noticia : buscado) {
                   
                        destinatarios = noticia.getDestinatario();

                   
             }
            TelaVisualizarDestinatario obj =new TelaVisualizarDestinatario(this, true);
            obj.setVisible(true);

            
        } else {
            JOptionPane.showMessageDialog(null, "  Selecione um notícia", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btVisualizarDActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         point.x = evt.getX();
       point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        TelaDiretor obj = new TelaDiretor();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseEntered
        btVoltar.setIcon(new ImageIcon(getClass().getResource("/Imagens/icons8_Back_Arrow_40px_1.png")));
    }//GEN-LAST:event_btVoltarMouseEntered

    private void btVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseExited
        btVoltar.setIcon(new ImageIcon(getClass().getResource("/Imagens/icons8_Back_Arrow_40px.png")));
    }//GEN-LAST:event_btVoltarMouseExited

    private void btUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUndoActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btUndoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetCampos();
        btEnviar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciarNoticias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarNoticias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarNoticias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarNoticias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarNoticias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    public static javax.swing.JButton btEnviar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btUndo;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JButton btVisualizarD;
    private javax.swing.JLabel btVoltar;
    private javax.swing.JTextField ctAssunto;
    private javax.swing.JTextField ctBuscar;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jtNoticias;
    private javax.swing.JLabel lMinimizar;
    private javax.swing.JPanel pMinimizar;
    private javax.swing.JTextArea txNoticia;
    // End of variables declaration//GEN-END:variables

}
