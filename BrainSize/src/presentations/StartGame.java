package presentations;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class StartGame extends javax.swing.JFrame {

   private PlayGameScreen pl ;

    public PlayGameScreen getPl() {
        return pl;
    }

    public StartGame() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Brainsize");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnStartGame = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("images/background.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnPlayGame = new javax.swing.JButton();
        btnRank = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        logo = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("images/logo.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnStartGame.setMaximumSize(new java.awt.Dimension(600, 600));
        pnStartGame.setMinimumSize(new java.awt.Dimension(600, 600));
        pnStartGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlayGame.setText("CHƠI GAME");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });
        pnStartGame.add(btnPlayGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 265, 230, -1));

        btnRank.setText("BẢNG ĐIỂM");
        btnRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankActionPerformed(evt);
            }
        });
        pnStartGame.add(btnRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 328, 230, -1));

        btnHelp.setText("HƯỚNG DẪN");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        pnStartGame.add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 386, 230, -1));

        btnQuit.setText("THOÁT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        pnStartGame.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 445, 230, -1));

        logo.setPreferredSize(new java.awt.Dimension(160, 180));

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

        pnStartGame.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 47, -1, -1));

        getContentPane().add(pnStartGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed
        pl = new PlayGameScreen();
        pl.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnPlayGameActionPerformed

    private void btnRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankActionPerformed
        // TODO add your handling code here:
        RankScreen rs = new RankScreen();
        rs.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnRankActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        HelpScreen hs = new HelpScreen();
        hs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRank;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel pnStartGame;
    // End of variables declaration//GEN-END:variables
}
