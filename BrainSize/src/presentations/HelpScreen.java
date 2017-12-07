package presentations;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import services.OtherService;

public class HelpScreen extends javax.swing.JFrame {

    private OtherService otherService = new OtherService();
    public HelpScreen() {
        initComponents();
        
        taHelp.setText(otherService.helpText("lib/huongdan.txt"));
        taHelp.setEditable(false);
        
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Brainsize");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHelp = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/library/images/background.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        logo = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/library/images/logo.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        taHelp = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnBackHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));

        pnHelp.setMaximumSize(new java.awt.Dimension(600, 600));
        pnHelp.setMinimumSize(new java.awt.Dimension(600, 600));
        pnHelp.setPreferredSize(new java.awt.Dimension(600, 600));

        logo.setPreferredSize(new java.awt.Dimension(160, 180));

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        taHelp.setColumns(20);
        taHelp.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        taHelp.setRows(5);
        jScrollPane1.setViewportView(taHelp);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("LUẬT CHƠI :");

        btnBackHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/back.png"))); // NOI18N
        btnBackHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackHelpMouseExited(evt);
            }
        });
        btnBackHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnHelpLayout = new javax.swing.GroupLayout(pnHelp);
        pnHelp.setLayout(pnHelpLayout);
        pnHelpLayout.setHorizontalGroup(
            pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHelpLayout.createSequentialGroup()
                .addGroup(pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnHelpLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnHelpLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBackHelp)))
                    .addGroup(pnHelpLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnHelpLayout.setVerticalGroup(
            pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBackHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHelpActionPerformed
        // TODO add your handling code here:
        StartGame st = new StartGame();
        st.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBackHelpActionPerformed

    private void btnBackHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackHelpMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnBackHelpMouseExited

    private void btnBackHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackHelpMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnBackHelpMouseEntered

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
            java.util.logging.Logger.getLogger(HelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel pnHelp;
    private javax.swing.JTextArea taHelp;
    // End of variables declaration//GEN-END:variables
}
