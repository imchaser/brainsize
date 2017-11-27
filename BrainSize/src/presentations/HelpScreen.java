package presentations;

import services.OtherService;

public class HelpScreen extends javax.swing.JFrame {

    private OtherService otherService = new OtherService();
    public HelpScreen() {
        initComponents();
        
        taHelp.setText(otherService.helpText("huongdan.txt"));
        taHelp.setEditable(false);
        
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Brainsize");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHelp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taHelp = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnBackHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnHelp.setMaximumSize(new java.awt.Dimension(600, 600));
        pnHelp.setMinimumSize(new java.awt.Dimension(600, 600));
        pnHelp.setPreferredSize(new java.awt.Dimension(600, 600));
        pnHelp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taHelp.setColumns(20);
        taHelp.setLineWrap(true);
        taHelp.setRows(5);
        jScrollPane1.setViewportView(taHelp);

        pnHelp.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 154, 409, 294));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("LUẬT CHƠI :");
        pnHelp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 82, -1, -1));

        btnBackHelp.setText("Back");
        btnBackHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHelpActionPerformed(evt);
            }
        });
        pnHelp.add(btnBackHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 477, -1, 28));

        getContentPane().add(pnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHelpActionPerformed
        // TODO add your handling code here:
        StartGame st = new StartGame();
        st.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnBackHelpActionPerformed

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
    private javax.swing.JPanel pnHelp;
    private javax.swing.JTextArea taHelp;
    // End of variables declaration//GEN-END:variables
}
