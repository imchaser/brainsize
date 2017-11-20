package presentations;

import DAOs.CAUHOIdao;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import services.PlayGameService;

public class PlayGameScreen extends javax.swing.JFrame {

    private PlayGameService gameservice = new PlayGameService();
    private int stt = 1;
    private Vector v = new Vector();
    private int id = 0;
    CAUHOIdao ch = new CAUHOIdao();
    private PlayGameService.Timing t = null;
    private RankScreen rank = new RankScreen();
    public PlayGameScreen() {
        initComponents();
        t = gameservice.new Timing(lblCountTime,this,rank);
        id = gameservice.getIDCH(stt, v);
        setText(id);
        this.setSize(600, 600);
        setLocationRelativeTo(null);
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        pnBackground = new javax.swing.JPanel();
        lblCountTime = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnBattieng = new javax.swing.JButton();
        btnTattieng = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btn5050 = new javax.swing.JButton();
        btnDoiCH = new javax.swing.JButton();
        lblSTT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCauHoi = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBackground.setMaximumSize(new java.awt.Dimension(600, 600));
        pnBackground.setMinimumSize(new java.awt.Dimension(600, 600));
        pnBackground.setName(""); // NOI18N

        lblCountTime.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblCountTime.setText("1:00");

        lblScore.setText("Điểm");

        lblLogo.setBackground(new java.awt.Color(0, 51, 51));
        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBattieng.setText("jButton1");

        btnTattieng.setText("jButton2");

        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btn5050.setText("Đổi");

        btnDoiCH.setText("50:50");
        btnDoiCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiCHActionPerformed(evt);
            }
        });

        lblSTT.setText("Câu :");

        taCauHoi.setEditable(false);
        taCauHoi.setColumns(20);
        taCauHoi.setRows(3);
        jScrollPane1.setViewportView(taCauHoi);

        jTextField1.setText("jTextField1");
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblScore))
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBackgroundLayout.createSequentialGroup()
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBackgroundLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblCountTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(175, 175, 175))
                                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblSTT)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                                .addComponent(btnBattieng)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTattieng))
                                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                                .addComponent(btnDoiCH)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn5050, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBackgroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBattieng)
                                    .addComponent(btnTattieng))
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(lblScore))
                                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(lblCountTime))))
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoiCH)
                            .addComponent(btn5050))
                        .addGap(9, 9, 9)))
                .addComponent(lblSTT)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        boolean kq = gameservice.ktKQ(id, btnA.getText());
        if (kq == true) {
            stt++;
            id = gameservice.getIDCH(stt, v);
            setText(id);
            t.reSet();
        }
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        boolean kq = gameservice.ktKQ(id, btnB.getText());
        if (kq == true) {
            stt++;
            id = gameservice.getIDCH(stt, v);
            setText(id);
            t.reSet();
        }
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        boolean kq = gameservice.ktKQ(id, btnC.getText());
        if (kq == true) {
            stt++;
            id = gameservice.getIDCH(stt, v);
            setText(id);
            t.reSet();
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        boolean kq = gameservice.ktKQ(id, btnD.getText());
        if (kq == true) {
            stt++;
            id = gameservice.getIDCH(stt, v);
            setText(id);
            t.reSet();
        }
    }//GEN-LAST:event_btnDActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate

    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnDoiCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiCHActionPerformed
    
    }//GEN-LAST:event_btnDoiCHActionPerformed

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
            java.util.logging.Logger.getLogger(PlayGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGameScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5050;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBattieng;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDoiCH;
    private javax.swing.JButton btnTattieng;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCountTime;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSTT;
    private javax.swing.JLabel lblScore;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTextArea taCauHoi;
    // End of variables declaration//GEN-END:variables
    public void setText(int id) {
        taCauHoi.setText(ch.getCH(id).getCauHoi());
        btnA.setText(ch.getCH(id).getDapAn1());
        btnB.setText(ch.getCH(id).getDapAn2());
        btnC.setText(ch.getCH(id).getDapAn3());
        btnD.setText(ch.getCH(id).getDapAn4());
    }

}
