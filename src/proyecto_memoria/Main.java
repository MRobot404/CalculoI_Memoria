package proyecto_memoria;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
// @author MRobot404
public class Main extends javax.swing.JFrame {
public static ArrayList<Usuarios>jugadores=new ArrayList<>();
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        for (int i = 0; i <jugadores.size(); i++) {
            System.out.println(" "+jugadores.get(i).getNombre()+" "+jugadores.get(i).getPunteo());
        }
        
       start();
        
    }
    Timer timer=new Timer();
 public  int secondspassed=0;
public Timer myTimer=new Timer();
public TimerTask task=new TimerTask(){
public void run(){
    secondspassed++;
    
    
    jLabel2.setText(String.valueOf(secondspassed));
    if (secondspassed>=45) {
     salir();
        }
}};

public void start(){
    myTimer.scheduleAtFixedRate(task,1000, 1000);
    
}
public static int p1,p2,p3,p4,p5,p6,p7,p8;
public static String descripcion1=null,descripcion2=null;
public void salir(){
    this.dispose();
}
  public void verificar(){
      if (p1>=2) {
         jLabel4.setIcon(null);
         Boton1.setEnabled(false);
       jLabel5.setIcon(null);
         Boton2.setEnabled(false);
     
      }
  }
  
 
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Boton5 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        Boton4 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        Boton3 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        Boton2 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Mortal Kombat Mythologies", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1115, 30, 90, 30);

        jLabel2.setFont(new java.awt.Font("Mortal Kombat Mythologies", 0, 24)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1210, 30, 60, 30);

        jLabel8.setMaximumSize(new java.awt.Dimension(150, 150));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(740, 20, 150, 150);

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton5.setBorder(null);
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5);
        Boton5.setBounds(200, 210, 150, 150);

        jLabel7.setMaximumSize(new java.awt.Dimension(150, 150));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(740, 20, 150, 150);

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton4.setBorder(null);
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4);
        Boton4.setBounds(740, 20, 150, 150);

        jLabel6.setMaximumSize(new java.awt.Dimension(150, 150));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 20, 150, 150);

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton3.setBorder(null);
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3);
        Boton3.setBounds(560, 20, 150, 150);

        jLabel5.setMaximumSize(new java.awt.Dimension(150, 150));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 20, 150, 150);

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton2.setBorder(null);
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2);
        Boton2.setBounds(380, 20, 150, 150);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 20, 150, 150);

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton1.setBorder(null);
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1);
        Boton1.setBounds(200, 20, 150, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_HvoiD5f1fUE1DjkS7NR9vA.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1281, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
        if (Boton1.isSelected()) {
          ImageIcon sonic= new ImageIcon (getClass().getResource("/Imagenes/1.jpg"));
            ImageIcon icono= new ImageIcon (sonic.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),Image.SCALE_DEFAULT ));
            jLabel4.setIcon(icono); 
          p1=p1+1;
        }else{
            jLabel4.setIcon(null);
            p1=0;
        }
        verificar();
                
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
          if (Boton2.isSelected()) {
          ImageIcon sonic= new ImageIcon (getClass().getResource("/Imagenes/1.png"));
            ImageIcon icono= new ImageIcon (sonic.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(),Image.SCALE_DEFAULT ));
            jLabel5.setIcon(icono); 
          p1=p1+1;
        }else{
            jLabel5.setIcon(null);
            p1=0;
        }
          verificar();
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
        if (Boton3.isSelected()) {
          ImageIcon sonic= new ImageIcon (getClass().getResource("/Imagenes/2p.jpg"));
            ImageIcon icono= new ImageIcon (sonic.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(),Image.SCALE_DEFAULT ));
            jLabel6.setIcon(icono); 
       
        }else{
            jLabel6.setIcon(null);
            p1=0;
        }
          verificar();
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Boton1;
    private javax.swing.JToggleButton Boton2;
    private javax.swing.JToggleButton Boton3;
    private javax.swing.JToggleButton Boton4;
    private javax.swing.JToggleButton Boton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
