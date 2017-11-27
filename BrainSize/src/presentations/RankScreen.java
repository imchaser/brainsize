package presentations;

import services.OtherService;

public class RankScreen extends javax.swing.JFrame {

    private OtherService otherService = new OtherService();
    
    public RankScreen() {
        initComponents();
        
        lblTop1.setText(otherService.rank(1));
        lblTop2.setText(otherService.rank(2));
        lblTop3.setText(otherService.rank(3));
        lblTop4.setText(otherService.rank(4));
        lblTop5.setText(otherService.rank(5));
        
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Brainsize");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnRank = new javax.swing.JPanel();
        lblRank = new javax.swing.JLabel();
        lblTop1 = new javax.swing.JLabel();
        lblTop2 = new javax.swing.JLabel();
        lblTop3 = new javax.swing.JLabel();
        lblTop4 = new javax.swing.JLabel();
        lblTop5 = new javax.swing.JLabel();
        btnBackRank = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRank.setMaximumSize(new java.awt.Dimension(600, 600));
        pnRank.setMinimumSize(new java.awt.Dimension(600, 600));
        pnRank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRank.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRank.setForeground(new java.awt.Color(153, 0, 0));
        lblRank.setText("BẢNG ĐIỂM");
        pnRank.add(lblRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));
        pnRank.add(lblTop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 20));
        pnRank.add(lblTop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, 20));
        pnRank.add(lblTop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, 20));
        pnRank.add(lblTop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 200, 20));
        pnRank.add(lblTop5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 200, 20));

        btnBackRank.setText("Back");
        btnBackRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRankActionPerformed(evt);
            }
        });
        pnRank.add(btnBackRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, 26));

        getContentPane().add(pnRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRankActionPerformed
        // TODO add your handling code here:
        StartGame st = new StartGame();
        st.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackRankActionPerformed

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
            java.util.logging.Logger.getLogger(RankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackRank;
    private javax.swing.JLabel lblRank;
    private javax.swing.JLabel lblTop1;
    private javax.swing.JLabel lblTop2;
    private javax.swing.JLabel lblTop3;
    private javax.swing.JLabel lblTop4;
    private javax.swing.JLabel lblTop5;
    private javax.swing.JPanel pnRank;
    // End of variables declaration//GEN-END:variables
}
