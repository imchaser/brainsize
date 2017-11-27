package presentations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAOs.CauHoiDAO;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import services.PlayGameService;

;

public class PlayGameScreen extends javax.swing.JFrame {

    private PlayGameService gameservice = new PlayGameService();
    private int stt = 1; //số thứ tự của câu hỏi
    private Vector listIDCH = new Vector(); //danh sách ID câu hỏi
    private int idCH = 0; //id câu hỏi
    CauHoiDAO ch = new CauHoiDAO();
    private Vector v = new Vector();
    private int id = 0;
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
        pnPlayGame = new javax.swing.JPanel();
        lblCountTime = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
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
        logo = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("images/logo.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPlayGame.setMaximumSize(new java.awt.Dimension(600, 600));
        pnPlayGame.setMinimumSize(new java.awt.Dimension(600, 600));
        pnPlayGame.setName(""); // NOI18N
        pnPlayGame.setPreferredSize(new java.awt.Dimension(600, 600));
        pnPlayGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCountTime.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblCountTime.setText("1:00");
        pnPlayGame.add(lblCountTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 126, -1, -1));

        lblScore.setText("Điểm");
        pnPlayGame.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 142, -1, -1));

        btnBattieng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/on.png"))); // NOI18N
        btnBattieng.setPreferredSize(new java.awt.Dimension(30, 30));
        pnPlayGame.add(btnBattieng, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 11, -1, -1));

        btnTattieng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mute_Icon.svg.png"))); // NOI18N
        btnTattieng.setPreferredSize(new java.awt.Dimension(30, 30));
        pnPlayGame.add(btnTattieng, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 11, -1, -1));

        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        pnPlayGame.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 434, 255, 32));

        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        pnPlayGame.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 484, 255, 33));

        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        pnPlayGame.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 484, 255, 32));

        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        pnPlayGame.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 434, 255, 32));

        btnDoiCH.setText("Đổi");
        btnDoiCH.setPreferredSize(new java.awt.Dimension(60, 23));
        btnDoiCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiCHActionPerformed(evt);
            }
        });
        pnPlayGame.add(btnDoiCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 299, 69, 30));

        btn5050.setText("50:50");
        btn5050.setPreferredSize(new java.awt.Dimension(60, 30));
        btn5050.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5050ActionPerformed(evt);
            }
        });
        pnPlayGame.add(btn5050, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 299, 69, -1));
        pnPlayGame.add(lblSTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 338, -1, -1));

        taCauHoi.setEditable(false);
        taCauHoi.setColumns(20);
        taCauHoi.setLineWrap(true);
        taCauHoi.setRows(3);
        jScrollPane1.setViewportView(taCauHoi);

        pnPlayGame.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 356, 553, -1));

        logo.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        pnPlayGame.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 86, -1, 180));

        getContentPane().add(pnPlayGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JLabel lblSTT;
    private javax.swing.JLabel lblScore;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel pnPlayGame;
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
                String name = JOptionPane.showInputDialog(null, "Tên người chơi:", "Bạn ghi được " + gameservice.score(stt) + " điểm!", 1);
                gameservice.saveScore(name, gameservice.score(stt));
                RankScreen rank = new RankScreen();
                rank.setVisible(true);
            } else {
                stt++;
                idCH = gameservice.getIDCH(stt, listIDCH);
                time = 60;
                setText(idCH);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rất tiếc, bạn đã trả lời sai!", "GG!", 2);
            String name = JOptionPane.showInputDialog(null, "Tên người chơi:", "Bạn ghi được " + gameservice.score(stt) + " điểm!", 1);
            gameservice.saveScore(name, gameservice.score(stt));
            RankScreen rank = new RankScreen();
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
                    RankScreen rank = new RankScreen();
                    rank.setVisible(true);
                }
            }

        };
        return act;

    }
}
