package proyecto_memoria;
// @author MRobot404

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Ingreso extends javax.swing.JFrame {

    public int conteoDeIngreso;

    public Ingreso() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(480, 270));
        setMinimumSize(new java.awt.Dimension(480, 270));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Mortal Kombat 2", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jugadores");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 100, 22);

        jLabel2.setFont(new java.awt.Font("Mortal Kombat 1", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Escriba el nombre de los jugadores");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 20, 300, 30);

        Jugador1.setForeground(new java.awt.Color(0, 0, 0));
        Jugador1.setBorder(null);
        Jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jugador1);
        Jugador1.setBounds(140, 90, 170, 30);

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Jugar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 160, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_HvoiD5f1fUE1DjkS7NR9vA.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String jugador1 = Jugador1.getText();
        int puntos = 0;
        Usuarios u = new Usuarios();
        if (Jugador1.getText().isEmpty()) {
JOptionPane.showMessageDialog(rootPane,"Por favor escriba un nombre");
        } else {
            u.setNombre(jugador1);
            u.setPunteo(puntos);
            Jugador1.setText("");
            Main.jugadores.add(u);
            conteoDeIngreso = conteoDeIngreso + 1;
        }

        if (conteoDeIngreso >= 2) {
            System.out.println("Guardado");
            Main ver = new Main();
            ver.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButton2ActionPerformed


    private void Jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jugador1ActionPerformed

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jugador1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
