package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Alfonso
 */
public class AcercaDeFrame extends javax.swing.JFrame {

    ImageIcon fondo = new ImageIcon("imagenes/pelota.png");

    /**
     * Creates new form AcercaDeFrame
     */
    public AcercaDeFrame() {
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

        pnlBackground = new javax.swing.JPanel();
        lblIntro = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        lblGerente = new javax.swing.JLabel();
        lblAlfonso = new javax.swing.JLabel();
        lblUI = new javax.swing.JLabel();
        lblSebastian = new javax.swing.JLabel();
        lblCreativo = new javax.swing.JLabel();
        lblDavid = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblSombra = new javax.swing.JLabel();
        lblBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(720, 480));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        pnlBackground.setLayout(null);

        lblIntro.setBackground(new java.awt.Color(255, 255, 255));
        lblIntro.setFont(new java.awt.Font("Footlight MT Light", 0, 60)); // NOI18N
        lblIntro.setForeground(new java.awt.Color(255, 255, 255));
        lblIntro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntro.setText("Movimiento Táctico");
        pnlBackground.add(lblIntro);
        lblIntro.setBounds(90, 110, 540, 80);

        lblTeam.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        lblTeam.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeam.setText("Time Treep Team");
        pnlBackground.add(lblTeam);
        lblTeam.setBounds(160, 165, 440, 30);

        lblGerente.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        lblGerente.setForeground(new java.awt.Color(255, 255, 255));
        lblGerente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGerente.setText("Director de Diseño");
        pnlBackground.add(lblGerente);
        lblGerente.setBounds(120, 220, 230, 30);

        lblAlfonso.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        lblAlfonso.setForeground(new java.awt.Color(255, 255, 255));
        lblAlfonso.setText("Alfonso Cohen");
        pnlBackground.add(lblAlfonso);
        lblAlfonso.setBounds(370, 220, 220, 30);

        lblUI.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        lblUI.setForeground(new java.awt.Color(255, 255, 255));
        lblUI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUI.setText("Director UI/UX");
        pnlBackground.add(lblUI);
        lblUI.setBounds(120, 260, 230, 30);

        lblSebastian.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        lblSebastian.setForeground(new java.awt.Color(255, 255, 255));
        lblSebastian.setText("Sebastian Cotes");
        pnlBackground.add(lblSebastian);
        lblSebastian.setBounds(370, 260, 220, 30);

        lblCreativo.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        lblCreativo.setForeground(new java.awt.Color(255, 255, 255));
        lblCreativo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCreativo.setText("Director Creativo");
        pnlBackground.add(lblCreativo);
        lblCreativo.setBounds(120, 300, 230, 30);

        lblDavid.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        lblDavid.setForeground(new java.awt.Color(255, 255, 255));
        lblDavid.setText("Andres Forero");
        pnlBackground.add(lblDavid);
        lblDavid.setBounds(370, 300, 220, 30);

        lblCerrar.setBackground(new java.awt.Color(204, 0, 0));
        lblCerrar.setFont(new java.awt.Font("Papyrus", 0, 30)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("×");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCerrarMouseReleased(evt);
            }
        });
        pnlBackground.add(lblCerrar);
        lblCerrar.setBounds(680, 0, 40, 25);

        lblSombra.setBackground(new Color(125, 125, 125, 70));
        lblSombra.setOpaque(true);
        pnlBackground.add(lblSombra);
        lblSombra.setBounds(60, 100, 600, 280);

        lblBG.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(720, 480, Image.SCALE_SMOOTH)));
        pnlBackground.add(lblBG);
        lblBG.setBounds(0, 0, 720, 480);

        getContentPane().add(pnlBackground);
        pnlBackground.setBounds(0, 0, 720, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void lblCerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseReleased
        // TODO add your handling code here:
        if (lblCerrar.contains(evt.getX(), evt.getY())) {
            lblCerrarMouseClicked(evt);
        }
    }//GEN-LAST:event_lblCerrarMouseReleased

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        // TODO add your handling code here:
        lblCerrar.setOpaque(false);
        lblCerrar.repaint();
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        // TODO add your handling code here:
        lblCerrar.setOpaque(true);
        lblCerrar.repaint();
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(AcercaDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcercaDeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAlfonso;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCreativo;
    private javax.swing.JLabel lblDavid;
    private javax.swing.JLabel lblGerente;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JLabel lblSebastian;
    private javax.swing.JLabel lblSombra;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblUI;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}