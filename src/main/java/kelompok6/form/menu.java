/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kelompok6.form;

/**
 *
 * @author LOQ
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        loading();
    }

    public void loading() {
        Content.removeAll();
        Loading loading = new Loading();
        Content.add(loading.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        menubar = new javax.swing.JMenuBar();
        Home = new javax.swing.JMenu();
        Login = new javax.swing.JMenu();
        Daftar = new javax.swing.JMenu();
        menuUtama = new javax.swing.JMenu();
        Pemesanan = new javax.swing.JMenu();
        Tagihan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Content.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        menubar.add(Home);

        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        menubar.add(Login);

        Daftar.setText("Daftar");
        Daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DaftarMouseClicked(evt);
            }
        });
        menubar.add(Daftar);

        menuUtama.setText("Menu Utama");
        menuUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUtamaMouseClicked(evt);
            }
        });
        menubar.add(menuUtama);

        Pemesanan.setText("Pemesanan");
        Pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananMouseClicked(evt);
            }
        });
        menubar.add(Pemesanan);

        Tagihan.setText("Tagihan");
        Tagihan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TagihanMouseClicked(evt);
            }
        });
        menubar.add(Tagihan);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Content.removeAll();
        Loading loading = new Loading();
        Content.add(loading.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_HomeMouseClicked

    private void menuUtamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUtamaMouseClicked
        // TODO add your handling code here:
        Content.removeAll();
        halaman_utama halamanUtama = new halaman_utama();
        Content.add(halamanUtama.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_menuUtamaMouseClicked

    private void PemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananMouseClicked
        // TODO add your handling code here:
        Content.removeAll();
        paket_data pemesanan = new paket_data();
        Content.add(pemesanan.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_PemesananMouseClicked

    private void TagihanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TagihanMouseClicked
        // TODO add your handling code here:
        Content.removeAll();
        Tagihan tagihan = new Tagihan();
        Content.add(tagihan.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_TagihanMouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
        Content.removeAll();
        Login login = new Login();
        Content.add(login.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_LoginMouseClicked

    private void DaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaftarMouseClicked
        // TODO add your handling code here:
        Content.removeAll();
        Daftar daftar = new Daftar();
        Content.add(daftar.getContentPane(), java.awt.BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_DaftarMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JMenu Daftar;
    private javax.swing.JMenu Home;
    private javax.swing.JMenu Login;
    private javax.swing.JMenu Pemesanan;
    private javax.swing.JMenu Tagihan;
    private javax.swing.JMenu menuUtama;
    private javax.swing.JMenuBar menubar;
    // End of variables declaration//GEN-END:variables
}
