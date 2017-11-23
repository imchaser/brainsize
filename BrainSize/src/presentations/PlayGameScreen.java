package presentations;

<<<<<<< HEAD
import DAOs.CAUHOIdao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
import DAOs.CauHoiDAO;
>>>>>>> 066f1d467eb93011b9b99efb2ae73d3783c15dcc
import java.util.Random;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import services.PlayGameService;

;

public class PlayGameScreen extends javax.swing.JFrame {

    private PlayGameService gameservice = new PlayGameService();
<<<<<<< HEAD
    private int stt = 1; //số thứ tự của câu hỏi
    private Vector listIDCH = new Vector(); //danh sách ID câu hỏi
    private int idCH = 0; //id câu hỏi
    CAUHOIdao ch = new CAUHOIdao();
=======
    private int stt = 1;
    private Vector v = new Vector();
    private int id = 0;
    CauHoiDAO ch = new CauHoiDAO();
    private PlayGameService.Timing t = null;
>>>>>>> 066f1d467eb93011b9b99efb2ae73d3783c15dcc
    private RankScreen rank = new RankScreen();
    private int time = 60; //thời gian đếm ngược (giây)
    private Timer t = new Timer(1000, countTime());

    public PlayGameScreen() {
        initComponents();
        t.start();
        idCH = gameservice.getIDCH(stt, listIDCH);
        setText(idCH);
        this.setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Brainsize");
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
        btnDoiCH = new javax.swing.JButton();
        btn5050 = new javax.swing.JButton();
        lblSTT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCauHoi = new javax.swing.JTextArea();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        pnBackground.setMaximumSize(new java.awt.Dimension(600, 600));
        pnBackground.setMinimumSize(new java.awt.Dimension(600, 600));
        pnBackground.setName(""); // NOI18N
        pnBackground.setPreferredSize(new java.awt.Dimension(600, 600));

        lblCountTime.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblCountTime.setText("1:00");

        lblScore.setText("Điểm");

        lblLogo.setBackground(new java.awt.Color(0, 51, 51));
        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBattieng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/on.png"))); // NOI18N
        btnBattieng.setPreferredSize(new java.awt.Dimension(30, 30));

        btnTattieng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mute_Icon.svg.png"))); // NOI18N
        btnTattieng.setPreferredSize(new java.awt.Dimension(30, 30));

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

        btnDoiCH.setText("Đổi");
        btnDoiCH.setPreferredSize(new java.awt.Dimension(60, 23));
        btnDoiCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiCHActionPerformed(evt);
            }
        });

        btn5050.setText("50:50");
        btn5050.setPreferredSize(new java.awt.Dimension(60, 30));
        btn5050.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5050ActionPerformed(evt);
            }
        });

        taCauHoi.setEditable(false);
        taCauHoi.setColumns(20);
        taCauHoi.setLineWrap(true);
        taCauHoi.setRows(3);
        jScrollPane1.setViewportView(taCauHoi);

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblScore)
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
                                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                                .addGap(0, 467, Short.MAX_VALUE)
                                                .addComponent(btnBattieng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTattieng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                                .addGap(389, 389, 389)
                                                .addComponent(btn5050, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBackgroundLayout.createSequentialGroup()
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDoiCH, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(btnBattieng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTattieng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(lblScore))
                                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(lblCountTime))))
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5050, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoiCH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        checkAnswer(btnA);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        checkAnswer(btnB);
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        checkAnswer(btnC);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        checkAnswer(btnD);
    }//GEN-LAST:event_btnDActionPerformed

    private void btn5050ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5050ActionPerformed
      int i = 0;
        String kq = ch.getCH(idCH).getKetQua();
        if (!btnA.getText().equals(kq)) {
            btnA.setText("");
            i++;
        }
        if (!btnC.getText().equals(kq) && i < 2) {
            btnC.setText("");
            i++;
        }
        if (!btnB.getText().equals(kq) && i < 2) {
            btnB.setText("");
            i++;
        }
        if (!btnD.getText().equals(kq) && i < 2) {
            btnD.setText("");
            i++;
        }
        btn5050.setEnabled(false);
    }//GEN-LAST:event_btn5050ActionPerformed

    private void btnDoiCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiCHActionPerformed
        idCH = gameservice.getIDCH(stt, listIDCH);
        setText(idCH);
        btnDoiCH.setEnabled(false);
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
    private javax.swing.JLabel lblCountTime;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSTT;
    private javax.swing.JLabel lblScore;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTextArea taCauHoi;
    // End of variables declaration//GEN-END:variables
    private void setText(int id) {
        int da = 0;
        Vector listDA = new Vector();
        Random rd = new Random();
        for (int i = 1; i <= 4;) {
            da = rd.ints(1, 5).limit(1).findFirst().getAsInt();
            if (!listDA.contains(da)) {
                listDA.add(da);
                i++;
            }
        }
        lblSTT.setText("Câu hỏi " + stt + " :");
        taCauHoi.setText(ch.getCH(id).getCauHoi());
        btnA.setText(gameservice.getDA(id, (int) listDA.get(0)));
        btnB.setText(gameservice.getDA(id, (int) listDA.get(1)));
        btnC.setText(gameservice.getDA(id, (int) listDA.get(2)));
        btnD.setText(gameservice.getDA(id, (int) listDA.get(3)));
    }

    //kiểm tra đáp án, đúng reset thời gian và đổi câu hỏi/sai dừng thời gian và hiện bảng điểm
    public void checkAnswer(JButton btn) {
        boolean kq = gameservice.ktKQ(idCH, btn.getText());
        if (kq == true) {
            JOptionPane.showMessageDialog(null, "Bạn đã trả lời đúng!", "Chúc mừng!", 1);
            if (stt == 15) {
                JOptionPane.showMessageDialog(null, "Bạn đã chiến thắng trò chơi!", "Chúc mừng!", 1);
                rank.setVisible(true);
            } else {
                stt++;
                idCH = gameservice.getIDCH(stt, listIDCH);
                time = 60;
                setText(idCH);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã trả lời sai!", "GG!", 2);
            JOptionPane.showInputDialog(null, "Tên người chơi:", gameservice.score(stt), 1);
            rank.setVisible(true);
            t.stop();
            dispose();
        }
    }
//đếm ngược thời gian

    private ActionListener countTime() {
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCountTime.setText(gameservice.displayTime(time));
                time--;
                if (time < 0) {
                    JOptionPane.showMessageDialog(null, "Game over!");
                    t.stop();
                    dispose();
                    rank.setVisible(true);
                }
            }

        };
        return act;

    }
}
