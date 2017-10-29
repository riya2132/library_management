
public class Librariansection extends javax.swing.JFrame {

    public Librariansection() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        returntf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        issueb = new javax.swing.JButton();
        viewb = new javax.swing.JButton();
        logoutb = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addb = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        viewissuedb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3), "Library Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 24), new java.awt.Color(255, 0, 255))); // NOI18N

        returntf.setBackground(new java.awt.Color(0, 255, 255));
        returntf.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        returntf.setText("Return Books");

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\NetBeansProjects\\Library_management_system\\images\\viewbooks.jpg")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\NetBeansProjects\\Library_management_system\\images\\return book.png")); // NOI18N

        issueb.setBackground(new java.awt.Color(0, 255, 255));
        issueb.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        issueb.setText("Issue Books");
        issueb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebActionPerformed(evt);
            }
        });

        viewb.setBackground(new java.awt.Color(0, 255, 255));
        viewb.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        viewb.setText("View Books");
        viewb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbActionPerformed(evt);
            }
        });

        logoutb.setBackground(new java.awt.Color(0, 255, 255));
        logoutb.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        logoutb.setText("Logout");
        logoutb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\NetBeansProjects\\Library_management_system\\images\\viewissuedbooks.jpg")); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\NetBeansProjects\\Library_management_system\\images\\issuebooks.jpg")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\NetBeansProjects\\Library_management_system\\images\\addbooks2.jpg")); // NOI18N

        addb.setBackground(new java.awt.Color(0, 255, 255));
        addb.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        addb.setText("Add Books");
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\NetBeansProjects\\Library_management_system\\images\\logout.jpg")); // NOI18N

        viewissuedb.setBackground(new java.awt.Color(0, 255, 255));
        viewissuedb.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        viewissuedb.setText("View Issued Books");
        viewissuedb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewissuedbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(issueb))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewb)
                            .addComponent(jLabel2)
                            .addComponent(viewissuedb)
                            .addComponent(jLabel4)))
                    .addComponent(addb))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returntf)
                            .addComponent(jLabel6)
                            .addComponent(logoutb))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addb)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(issueb)
                            .addComponent(viewissuedb))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(returntf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewb))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(logoutb)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(535, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
        Addbooks.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_addbActionPerformed

    private void issuebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebActionPerformed
        Issuebook.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_issuebActionPerformed

    private void logoutbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbActionPerformed
        Homepage.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_logoutbActionPerformed

    private void viewbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbActionPerformed
        ViewBooks.main(new String[]{});
    }//GEN-LAST:event_viewbActionPerformed

    private void viewissuedbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewissuedbActionPerformed
        ViewIssuedBooks.main(new String[]{});
    }//GEN-LAST:event_viewissuedbActionPerformed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Librariansection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librariansection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librariansection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librariansection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librariansection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addb;
    private javax.swing.JButton issueb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutb;
    private javax.swing.JButton returntf;
    private javax.swing.JButton viewb;
    private javax.swing.JButton viewissuedb;
    // End of variables declaration//GEN-END:variables
}
