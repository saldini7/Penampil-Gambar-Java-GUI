/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Acer
 */
public class PenampilGambar extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambar
     */
    public PenampilGambar() {
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

        buttonPanel = new javax.swing.JPanel();
        btnHello = new javax.swing.JButton();
        btnPascal = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnJava = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        tampilanPanel = new javax.swing.JPanel();
        panelHello = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelPascal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelC = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelJava = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penampil Gambar");

        buttonPanel.setBackground(new java.awt.Color(255, 153, 204));

        btnHello.setBackground(new java.awt.Color(51, 255, 153));
        btnHello.setText("Hello World");
        btnHello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelloActionPerformed(evt);
            }
        });
        buttonPanel.add(btnHello);

        btnPascal.setBackground(new java.awt.Color(51, 255, 153));
        btnPascal.setText("Pascal");
        btnPascal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPascalActionPerformed(evt);
            }
        });
        buttonPanel.add(btnPascal);

        btnC.setBackground(new java.awt.Color(51, 255, 153));
        btnC.setText("C++");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        buttonPanel.add(btnC);

        btnJava.setBackground(new java.awt.Color(51, 255, 153));
        btnJava.setText("Java");
        btnJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaActionPerformed(evt);
            }
        });
        buttonPanel.add(btnJava);

        btnKeluar.setBackground(new java.awt.Color(51, 255, 153));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        buttonPanel.add(btnKeluar);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        tampilanPanel.setBackground(new java.awt.Color(51, 255, 153));
        tampilanPanel.setLayout(new java.awt.CardLayout());

        panelHello.setBackground(new java.awt.Color(51, 255, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("HELLO WORLD !");

        javax.swing.GroupLayout panelHelloLayout = new javax.swing.GroupLayout(panelHello);
        panelHello.setLayout(panelHelloLayout);
        panelHelloLayout.setHorizontalGroup(
            panelHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHelloLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(212, 212, 212))
        );
        panelHelloLayout.setVerticalGroup(
            panelHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHelloLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        tampilanPanel.add(panelHello, "card2");

        panelPascal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Pascal.jpeg"))); // NOI18N

        javax.swing.GroupLayout panelPascalLayout = new javax.swing.GroupLayout(panelPascal);
        panelPascal.setLayout(panelPascalLayout);
        panelPascalLayout.setHorizontalGroup(
            panelPascalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPascalLayout.setVerticalGroup(
            panelPascalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        tampilanPanel.add(panelPascal, "card3");

        panelC.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/C++.PNG"))); // NOI18N

        javax.swing.GroupLayout panelCLayout = new javax.swing.GroupLayout(panelC);
        panelC.setLayout(panelCLayout);
        panelCLayout.setHorizontalGroup(
            panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        panelCLayout.setVerticalGroup(
            panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        tampilanPanel.add(panelC, "card4");

        panelJava.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Thumbnail Hello World.jpg"))); // NOI18N

        javax.swing.GroupLayout panelJavaLayout = new javax.swing.GroupLayout(panelJava);
        panelJava.setLayout(panelJavaLayout);
        panelJavaLayout.setHorizontalGroup(
            panelJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        panelJavaLayout.setVerticalGroup(
            panelJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        tampilanPanel.add(panelJava, "card5");

        getContentPane().add(tampilanPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHelloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelloActionPerformed
        // remove panel
        tampilanPanel.removeAll();
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
        
        // add panel
        tampilanPanel.add(panelHello);
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
    }//GEN-LAST:event_btnHelloActionPerformed

    private void btnPascalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPascalActionPerformed
        // remove panel
        tampilanPanel.removeAll();
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
        
        // add panel
        tampilanPanel.add(panelPascal);
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
    }//GEN-LAST:event_btnPascalActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // remove panel
        tampilanPanel.removeAll();
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
        
        // add panel
        tampilanPanel.add(panelC);
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
    }//GEN-LAST:event_btnCActionPerformed

    private void btnJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaActionPerformed
        // remove panel
        tampilanPanel.removeAll();
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
        
        // add panel
        tampilanPanel.add(panelJava);
        tampilanPanel.repaint();
        tampilanPanel.revalidate();
    }//GEN-LAST:event_btnJavaActionPerformed

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
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenampilGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnHello;
    private javax.swing.JButton btnJava;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPascal;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelC;
    private javax.swing.JPanel panelHello;
    private javax.swing.JPanel panelJava;
    private javax.swing.JPanel panelPascal;
    private javax.swing.JPanel tampilanPanel;
    // End of variables declaration//GEN-END:variables
}
