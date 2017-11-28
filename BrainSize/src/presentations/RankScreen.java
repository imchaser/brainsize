package presentations;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
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

        pnRank = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("images/background.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
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

        pnRank.setMaximumSize(new java.awt.Dimension(600, 600));
        pnRank.setMinimumSize(new java.awt.Dimension(600, 600));

        lblRank.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRank.setForeground(new java.awt.Color(255, 153, 51));
        lblRank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank.setText("BẢNG ĐIỂM");

        lblTop1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTop1.setForeground(new java.awt.Color(255, 255, 255));

        lblTop2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTop2.setForeground(new java.awt.Color(255, 255, 255));

        lblTop3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTop3.setForeground(new java.awt.Color(255, 255, 255));

        lblTop4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTop4.setForeground(new java.awt.Color(255, 255, 255));

        lblTop5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTop5.setForeground(new java.awt.Color(255, 255, 255));

        btnBackRank.setText("Back");
        btnBackRank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackRankMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackRankMouseExited(evt);
            }
        });
        btnBackRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRankLayout = new javax.swing.GroupLayout(pnRank);
        pnRank.setLayout(pnRankLayout);
        pnRankLayout.setHorizontalGroup(
            pnRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnRankLayout.createSequentialGroup()
                .addGroup(pnRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRankLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnBackRank))
                    .addGroup(pnRankLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(pnRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTop2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTop4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTop5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        pnRankLayout.setVerticalGroup(
            pnRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRankLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblRank)
                .addGap(41, 41, 41)
                .addComponent(lblTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblTop2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTop4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTop5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnBackRank, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRankActionPerformed
        // TODO add your handling code here:
        StartGame st = new StartGame();
        st.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackRankActionPerformed

    private void btnBackRankMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackRankMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnBackRankMouseEntered

    private void btnBackRankMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackRankMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnBackRankMouseExited

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
