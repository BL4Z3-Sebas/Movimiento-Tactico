package vista;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelo.Circulo;
import static modelo.Formaciones.s433;

/**
 *
 * @author Alfonso
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    ImageIcon cesped = new ImageIcon("imagenes/cesped_p.jpg");
    ImageIcon lineas = new ImageIcon("imagenes/lineas_blancas.png");
    ArrayList<Circulo> jugadores;
    pnlJugadores cancha;

    public Main() {
        initComponents();
        cancha = new pnlJugadores();
        cancha.setSize(516, 688);
        cancha.setLocation(776, 40);
        cancha.setBackground(new Color(0, 0, 0, 0));

        pnlCampo.setSize(1366, 768);
        pnlCampo.setLocation(0, 0);
        jPanel2.add(cancha);
        jPanel2.add(pnlCampo);
        jugadores = new ArrayList<>();
        revalidate();
        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampo = new javax.swing.JPanel();
        pnlSombra = new javax.swing.JPanel();
        lblCancha = new javax.swing.JLabel();
        pnlCesped = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        pnlCampo.setLayout(null);

        pnlSombra.setBackground(new Color(0, 0, 0, 70));
        pnlSombra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlSombra.setLayout(null);

        lblCancha.setIcon(new ImageIcon(lineas.getImage().getScaledInstance(576, 768, Image.SCALE_DEFAULT)));
        lblCancha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanchaMouseClicked(evt);
            }
        });
        pnlSombra.add(lblCancha);
        lblCancha.setBounds(0, 0, 0, 0);

        pnlCampo.add(pnlSombra);
        pnlSombra.setBounds(776, 40, 516, 688);

        pnlCesped.setIcon(new ImageIcon(cesped.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH)));
        pnlCampo.add(pnlCesped);
        pnlCesped.setBounds(0, 0, 1366, 768);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCanchaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanchaMouseClicked
        // TODO add your handling code here:
        System.out.println(evt.getX() + ", " + evt.getY());
    }//GEN-LAST:event_lblCanchaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCancha;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JLabel pnlCesped;
    private javax.swing.JPanel pnlSombra;
    // End of variables declaration//GEN-END:variables

}
