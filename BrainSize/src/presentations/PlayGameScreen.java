package presentations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAOs.CauHoiDAO;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
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
    private int time = 60; //thời gian đếm ngược (giây)
    private Timer t = new Timer(1000, countTime());
    private boolean nn = false;
    private boolean dch = false;

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
        pnPlayGame = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("images/background.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        lblCountTime = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
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

        pnPlayGame.setMaximumSize(new java.awt.Dimension(600, 600));
        pnPlayGame.setMinimumSize(new java.awt.Dimension(600, 600));
        pnPlayGame.setName(""); // NOI18N
        pnPlayGame.setPreferredSize(new java.awt.Dimension(600, 600));

        lblCountTime.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblCountTime.setForeground(new java.awt.Color(255, 255, 255));
        lblCountTime.setText("1:00");

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setText("Điểm");

        btnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBMouseExited(evt);
            }
        });
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCMouseExited(evt);
            }
        });
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDMouseExited(evt);
            }
        });
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAMouseExited(evt);
            }
        });
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnDoiCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Switch.png"))); // NOI18N
        btnDoiCH.setFocusPainted(false);
        btnDoiCH.setMaximumSize(new java.awt.Dimension(50, 30));
        btnDoiCH.setMinimumSize(new java.awt.Dimension(50, 30));
        btnDoiCH.setPreferredSize(new java.awt.Dimension(50, 30));
        btnDoiCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDoiCHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDoiCHMouseExited(evt);
            }
        });
        btnDoiCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiCHActionPerformed(evt);
            }
        });

        btn5050.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5050.png"))); // NOI18N
        btn5050.setFocusPainted(false);
        btn5050.setMaximumSize(new java.awt.Dimension(50, 30));
        btn5050.setMinimumSize(new java.awt.Dimension(50, 30));
        btn5050.setPreferredSize(new java.awt.Dimension(50, 30));
        btn5050.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5050MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5050MouseExited(evt);
            }
        });
        btn5050.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5050ActionPerformed(evt);
            }
        });

        lblSTT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSTT.setForeground(new java.awt.Color(255, 255, 255));

        taCauHoi.setEditable(false);
        taCauHoi.setColumns(20);
        taCauHoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taCauHoi.setLineWrap(true);
        taCauHoi.setRows(3);
        jScrollPane1.setViewportView(taCauHoi);

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

        javax.swing.GroupLayout pnPlayGameLayout = new javax.swing.GroupLayout(pnPlayGame);
        pnPlayGame.setLayout(pnPlayGameLayout);
        pnPlayGameLayout.setHorizontalGroup(
            pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlayGameLayout.createSequentialGroup()
                .addGroup(pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblCountTime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(btn5050, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnDoiCH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        pnPlayGameLayout.setVerticalGroup(
            pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlayGameLayout.createSequentialGroup()
                .addGroup(pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPlayGameLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lblCountTime))
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnPlayGameLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblScore)))
                .addGap(38, 38, 38)
                .addGroup(pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5050, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoiCH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnPlayGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        btn5050.getAccessibleContext().setAccessibleName("5050");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPlayGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPlayGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn5050ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5050ActionPerformed
        btnA.setText(gameservice.sp5050(idCH, btnA.getText()));
        btnD.setText(gameservice.sp5050(idCH, btnD.getText()));
        btnB.setText(gameservice.sp5050(idCH, btnB.getText()));
        btnC.setText(gameservice.sp5050(idCH, btnC.getText()));
        btn5050.setEnabled(false);
        nn = true;
        lblScore.setText(gameservice.score(stt, nn, dch) + " Điểm");
    }//GEN-LAST:event_btn5050ActionPerformed

    private void btnDoiCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiCHActionPerformed
        idCH = gameservice.getIDCH(stt, listIDCH);
        setText(idCH);
        btnDoiCH.setEnabled(false);
        dch = true;
        lblScore.setText(gameservice.score(stt, nn, dch) + " Điểm");
    }//GEN-LAST:event_btnDoiCHActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        checkAnswer(btnA);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        checkAnswer(btnD);
    }//GEN-LAST:event_btnDActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        checkAnswer(btnC);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        checkAnswer(btnB);
    }//GEN-LAST:event_btnBActionPerformed

    private void btn5050MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5050MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn5050MouseEntered

    private void btn5050MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5050MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn5050MouseExited

    private void btnDoiCHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiCHMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnDoiCHMouseEntered

    private void btnDoiCHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiCHMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnDoiCHMouseExited

    private void btnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAMouseEntered

    private void btnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAMouseExited

    private void btnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnBMouseEntered

    private void btnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnBMouseExited

    private void btnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCMouseEntered

    private void btnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnCMouseExited

    private void btnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnDMouseEntered

    private void btnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnDMouseExited

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
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDoiCH;
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
        Vector listDA = gameservice.randomDA();
        lblScore.setText(gameservice.score(stt, nn, dch) + " Điểm");
        lblSTT.setText("Câu hỏi " + stt + " :");
        taCauHoi.setText(gameservice.getNDCH(idCH));
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
                String name = JOptionPane.showInputDialog(null, "Tên người chơi:", "Bạn ghi được " + gameservice.score(stt, nn, dch) + " điểm!", 1);
                gameservice.saveScore(name, gameservice.score(stt, nn, dch));
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
            String name = JOptionPane.showInputDialog(null, "Tên người chơi:", "Bạn ghi được " + gameservice.score(stt, nn, dch) + " điểm!", 1);
            gameservice.saveScore(name, gameservice.score(stt, nn, dch));
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
