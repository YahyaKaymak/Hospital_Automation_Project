/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author monster
 */
public class Hastaİşlemleri extends javax.swing.JFrame {

    /**
     * Creates new form Hastaİşlemleri
     */
    public Hastaİşlemleri() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        HastaRandevuAlma = new javax.swing.JButton();
        HastaBorçlarım = new javax.swing.JButton();
        HastaAmeliyathaneİşlemlerim = new javax.swing.JButton();
        HastaRandevuİptalEtme = new javax.swing.JButton();
        HastaHastalıklarım = new javax.swing.JButton();
        HastaŞifreDeğiştirme = new javax.swing.JButton();
        HastaİşlemleriÇıkış = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hoşgeldiniz");

        HastaRandevuAlma.setText("Randevu Alma");
        HastaRandevuAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaRandevuAlmaActionPerformed(evt);
            }
        });

        HastaBorçlarım.setText("Borçlarım");
        HastaBorçlarım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaBorçlarımActionPerformed(evt);
            }
        });

        HastaAmeliyathaneİşlemlerim.setText("Ameliyathane İşlemlerim");
        HastaAmeliyathaneİşlemlerim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaAmeliyathaneİşlemlerimActionPerformed(evt);
            }
        });

        HastaRandevuİptalEtme.setText("Raporlarım");
        HastaRandevuİptalEtme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaRandevuİptalEtmeActionPerformed(evt);
            }
        });

        HastaHastalıklarım.setText("Hastalıklarım");
        HastaHastalıklarım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaHastalıklarımActionPerformed(evt);
            }
        });

        HastaŞifreDeğiştirme.setText("Şifre Değiştirme");

        HastaİşlemleriÇıkış.setText("Çıkış Yap");
        HastaİşlemleriÇıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaİşlemleriÇıkışActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HastaRandevuAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HastaAmeliyathaneİşlemlerim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HastaBorçlarım, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastaHastalıklarım, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaŞifreDeğiştirme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaRandevuİptalEtme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HastaİşlemleriÇıkış)
                .addGap(319, 319, 319))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HastaRandevuİptalEtme, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaRandevuAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastaHastalıklarım, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaBorçlarım, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HastaŞifreDeğiştirme, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaAmeliyathaneİşlemlerim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(HastaİşlemleriÇıkış)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HastaİşlemleriÇıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaİşlemleriÇıkışActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_HastaİşlemleriÇıkışActionPerformed

    private void HastaRandevuAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaRandevuAlmaActionPerformed
        // TODO add your handling code here:
        RandevuAlma Randevual = new RandevuAlma();
        Randevual.setVisible(true);
        dispose();
    }//GEN-LAST:event_HastaRandevuAlmaActionPerformed

    private void HastaRandevuİptalEtmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaRandevuİptalEtmeActionPerformed
        // TODO add your handling code here:
        İşlemler Hastaişlem = new İşlemler();
        Hastaişlem.setVisible(true);
        dispose();
    }//GEN-LAST:event_HastaRandevuİptalEtmeActionPerformed

    private void HastaBorçlarımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaBorçlarımActionPerformed
        // TODO add your handling code here:
        İşlemler Hastaişlem = new İşlemler();
        Hastaişlem.setVisible(true);
        dispose();
    }//GEN-LAST:event_HastaBorçlarımActionPerformed

    private void HastaHastalıklarımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaHastalıklarımActionPerformed
        // TODO add your handling code here:  
        İşlemler Hastaişlem = new İşlemler();
        Hastaişlem.setVisible(true);
        dispose();
    }//GEN-LAST:event_HastaHastalıklarımActionPerformed

    private void HastaAmeliyathaneİşlemlerimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaAmeliyathaneİşlemlerimActionPerformed
        // TODO add your handling code here:
        İşlemler Hastaişlem = new İşlemler();
        Hastaişlem.setVisible(true);
        dispose();
    }//GEN-LAST:event_HastaAmeliyathaneİşlemlerimActionPerformed

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
            java.util.logging.Logger.getLogger(Hastaİşlemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hastaİşlemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hastaİşlemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hastaİşlemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hastaİşlemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HastaAmeliyathaneİşlemlerim;
    private javax.swing.JButton HastaBorçlarım;
    private javax.swing.JButton HastaHastalıklarım;
    private javax.swing.JButton HastaRandevuAlma;
    private javax.swing.JButton HastaRandevuİptalEtme;
    private javax.swing.JButton HastaİşlemleriÇıkış;
    private javax.swing.JButton HastaŞifreDeğiştirme;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
