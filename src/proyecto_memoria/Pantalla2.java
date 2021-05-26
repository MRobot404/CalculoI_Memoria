package proyecto_memoria;
// @author MRobot404

import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static proyecto_memoria.Main.jugadores;
import static proyecto_memoria.Main.p1;
import static proyecto_memoria.Main.p2;
import static proyecto_memoria.Main.p3;
import static proyecto_memoria.Main.p4;
import static proyecto_memoria.Main.p5;
import static proyecto_memoria.Main.p6;
import static proyecto_memoria.Main.p7;
import static proyecto_memoria.Main.p8;
import static proyecto_memoria.Main.puntosacumulativos1;

public class Pantalla2 extends javax.swing.JFrame {

    public Usuarios modificar;
    public String nombreobtenido2;
    public int id, punteo;
    public static int p1, p2, p3, p4, p5, p6, p7, p8, puntosacumulativos;
    public static String descripcion1 = null, descripcion2 = null;

    public Pantalla2() {
        initComponents();
        setLocationRelativeTo(null);
        for (int i = 0; i < Main.jugadores.size(); i++) {
            System.out.println(" " + Main.jugadores.get(i).getNombre() + " " + Main.jugadores.get(i).getPunteo());
        }
        start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JToggleButton();
        Boton2 = new javax.swing.JToggleButton();
        Boton3 = new javax.swing.JToggleButton();
        Boton4 = new javax.swing.JToggleButton();
        Boton5 = new javax.swing.JToggleButton();
        Boton6 = new javax.swing.JToggleButton();
        Boton7 = new javax.swing.JToggleButton();
        Boton8 = new javax.swing.JToggleButton();
        Boton16 = new javax.swing.JToggleButton();
        Boton15 = new javax.swing.JToggleButton();
        Boton9 = new javax.swing.JToggleButton();
        Boton14 = new javax.swing.JToggleButton();
        Boton13 = new javax.swing.JToggleButton();
        Boton12 = new javax.swing.JToggleButton();
        Boton11 = new javax.swing.JToggleButton();
        Boton10 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 730));
        setMinimumSize(new java.awt.Dimension(1280, 730));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Mortal Kombat Mythologies", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tiempo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1115, 30, 90, 30);

        jLabel2.setFont(new java.awt.Font("Mortal Kombat Mythologies", 0, 24)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1210, 30, 60, 30);
        getContentPane().add(jLabel20);
        jLabel20.setBounds(650, 540, 150, 150);
        getContentPane().add(jLabel19);
        jLabel19.setBounds(460, 540, 150, 150);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(260, 540, 150, 150);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 540, 150, 150);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 540, 150, 150);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(650, 370, 150, 150);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(460, 370, 150, 150);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 370, 150, 150);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 370, 150, 150);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(650, 200, 150, 150);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 200, 150, 150);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 200, 150, 150);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 200, 150, 150);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 30, 150, 150);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 30, 150, 150);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 30, 150, 150);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 30, 150, 150);

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton1.setBorder(null);
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1);
        Boton1.setBounds(50, 30, 150, 150);

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton2.setBorder(null);
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2);
        Boton2.setBounds(260, 30, 150, 150);

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton3.setBorder(null);
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3);
        Boton3.setBounds(460, 30, 150, 150);

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton4.setBorder(null);
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4);
        Boton4.setBounds(650, 30, 150, 150);

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton5.setBorder(null);
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5);
        Boton5.setBounds(50, 200, 150, 150);

        Boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton6.setBorder(null);
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton6);
        Boton6.setBounds(260, 200, 150, 150);

        Boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton7.setBorder(null);
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton7);
        Boton7.setBounds(460, 200, 150, 150);

        Boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton8.setBorder(null);
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton8);
        Boton8.setBounds(650, 200, 150, 150);

        Boton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton16.setBorder(null);
        Boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton16ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton16);
        Boton16.setBounds(650, 540, 150, 150);

        Boton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton15.setBorder(null);
        Boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton15ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton15);
        Boton15.setBounds(460, 540, 150, 150);

        Boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton9.setBorder(null);
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9);
        Boton9.setBounds(50, 370, 150, 150);

        Boton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton14.setBorder(null);
        Boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton14ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton14);
        Boton14.setBounds(260, 540, 150, 150);

        Boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton13.setBorder(null);
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton13);
        Boton13.setBounds(50, 540, 150, 150);

        Boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton12.setBorder(null);
        Boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton12ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton12);
        Boton12.setBounds(650, 370, 150, 150);

        Boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton11.setBorder(null);
        Boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton11ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton11);
        Boton11.setBounds(460, 370, 150, 150);

        Boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        Boton10.setBorder(null);
        Boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton10ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton10);
        Boton10.setBounds(260, 370, 150, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_HvoiD5f1fUE1DjkS7NR9vA.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1281, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
        if (Boton1.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/9p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
            jLabel4.setIcon(icono);
            p1 = p1 + 1;
        } else {
            jLabel4.setIcon(null);
            p1 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton1ActionPerformed
    public void BuscarDatos() {
        modificar = null;
        for (Usuarios v : jugadores) {
            if (v.getId() == 1) {
                modificar = v;
                break;
            }
        }
        if (modificar != null) {
            id = modificar.getId();
            nombreobtenido2 = modificar.getNombre();
            punteo = modificar.getPunteo();
            System.out.println(id + " " + nombreobtenido2 + " " + punteo);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Vendedor no encontrado");
        }

    }

    public void Modificardatos() {
        if (modificar != null) {
            modificar.setNombre(nombreobtenido2);
            modificar.setId(id);
            modificar.setPunteo(puntosacumulativos);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe buscar un producto por nombre");
        }
    }
    Timer timer = new Timer();
    public int secondspassed = 0;
    public Timer myTimer = new Timer();
    public TimerTask task = new TimerTask() {
        public void run() {
            secondspassed++;

            jLabel2.setText(String.valueOf(secondspassed));
            if (secondspassed >= 45) {
                salir();
                secondspassed = 0;
            }
        }
    };

    public void start() {
        myTimer.scheduleAtFixedRate(task, 1000, 1000);

    }

    public void salir() {
        this.dispose();
        modificar = null;
        BuscarDatos();
        Modificardatos();
        BuscarDatos();
        detener();
        verificaresultado();
        
    }

    public void detener() {
        secondspassed--;
    }

    public void verificaresultado() {
        if (puntosacumulativos > puntosacumulativos1) {
            JOptionPane.showMessageDialog(rootPane, "El ganador es " + nombreobtenido2);
        } else if (puntosacumulativos == puntosacumulativos1) {
            JOptionPane.showMessageDialog(rootPane, "HAY UN EMPATE :0");
        } else if (puntosacumulativos1 > puntosacumulativos) {
            JOptionPane.showMessageDialog(rootPane, "El ganador es " + Main.nombreobtenido);
        }
    }

    public void verificar() {
        if (p1 >= 2) {
            jLabel4.setIcon(null);
            Boton1.setEnabled(false);
            jLabel20.setIcon(null);
            Boton16.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p1 = 0;
        } else if (p2 >= 2) {
            jLabel7.setIcon(null);
            Boton4.setEnabled(false);
            jLabel17.setIcon(null);
            Boton13.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p2 = 0;
        } else if (p3 >= 2) {
            jLabel5.setIcon(null);
            Boton2.setEnabled(false);
            jLabel18.setIcon(null);
            Boton14.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p3 = 0;
        } else if (p4 >= 2) {
            jLabel6.setIcon(null);
            Boton3.setEnabled(false);
            jLabel19.setIcon(null);
            Boton15.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p4 = 0;
        } else if (p5 >= 2) {
            jLabel8.setIcon(null);
            Boton5.setEnabled(false);
            jLabel15.setIcon(null);
            Boton12.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p5 = 0;
        } else if (p6 >= 2) {
            jLabel11.setIcon(null);
            Boton8.setEnabled(false);
            jLabel12.setIcon(null);
            Boton9.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p6 = 0;
        } else if (p7 >= 2) {
            jLabel14.setIcon(null);
            Boton11.setEnabled(false);
            jLabel9.setIcon(null);
            Boton6.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p7 = 0;
        } else if (p8 >= 2) {
            jLabel10.setIcon(null);
            Boton7.setEnabled(false);
            jLabel13.setIcon(null);
            Boton10.setEnabled(false);
            puntosacumulativos = puntosacumulativos + 10;
            p8 = 0;
        }
        if (puntosacumulativos >= 80) {
            salir();
            detener();
            verificaresultado();
        }
    }

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
        if (Boton2.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/11r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
            jLabel5.setIcon(icono);
            p3 = p3 + 1;
        } else {
            jLabel5.setIcon(null);
            p3 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
        if (Boton3.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/12p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
            jLabel6.setIcon(icono);
            p4 = p4 + 1;
        } else {
            jLabel6.setIcon(null);
            p4 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        // TODO add your handling code here:
        if (Boton4.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/10p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
            jLabel7.setIcon(icono);
            p2 = p2 + 1;
        } else {
            jLabel7.setIcon(null);
            p2 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        // TODO add your handling code here:
        if (Boton5.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/13p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
            jLabel8.setIcon(icono);
            p5 = p5 + 1;
        } else {
            jLabel8.setIcon(null);
            p5 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        // TODO add your handling code here:
        if (Boton6.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/15p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
            jLabel9.setIcon(icono);
            p7 = p7 + 1;
        } else {
            jLabel9.setIcon(null);
            p7 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        // TODO add your handling code here:
        if (Boton7.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/16p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
            jLabel10.setIcon(icono);
            p8 = p8 + 1;
        } else {
            jLabel10.setIcon(null);
            p8 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        // TODO add your handling code here:
        if (Boton8.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/14p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_DEFAULT));
            jLabel11.setIcon(icono);
            p6 = p6 + 1;
        } else {
            jLabel11.setIcon(null);
            p6 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        // TODO add your handling code here:
        if (Boton9.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/14r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_DEFAULT));
            jLabel12.setIcon(icono);
            p6 = p6 + 1;
        } else {
            jLabel12.setIcon(null);
            p6 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
        // TODO add your handling code here:
        if (Boton10.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/16r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT));
            jLabel13.setIcon(icono);
            p8 = p8 + 1;
        } else {
            jLabel13.setIcon(null);
            p8 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton10ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        // TODO add your handling code here:
        if (Boton11.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/15r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT));
            jLabel14.setIcon(icono);
            p7 = p7 + 1;
        } else {
            jLabel14.setIcon(null);
            p7 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        // TODO add your handling code here:
        if (Boton12.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/13r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_DEFAULT));
            jLabel15.setIcon(icono);
            p5 = p5 + 1;
        } else {
            jLabel15.setIcon(null);
            p5 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        // TODO add your handling code here:
        if (Boton13.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/10r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT));
            jLabel17.setIcon(icono);
            p2 = p2 + 1;
        } else {
            jLabel17.setIcon(null);
            p2 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton14ActionPerformed
        // TODO add your handling code here:
        if (Boton14.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/11p.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_DEFAULT));
            jLabel18.setIcon(icono);
            p3 = p3 + 1;
        } else {
            jLabel18.setIcon(null);
            p3 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton14ActionPerformed

    private void Boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton15ActionPerformed
        // TODO add your handling code here:
        if (Boton15.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/12r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_DEFAULT));
            jLabel19.setIcon(icono);
            p4 = p4 + 1;
        } else {
            jLabel19.setIcon(null);
            p4 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton15ActionPerformed

    private void Boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton16ActionPerformed
        // TODO add your handling code here:
        if (Boton16.isSelected()) {
            ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/9r.png"));
            ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_DEFAULT));
            jLabel20.setIcon(icono);
            p1 = p1 + 1;
        } else {
            jLabel20.setIcon(null);
            p1 = 0;
        }
        verificar();
    }//GEN-LAST:event_Boton16ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Boton1;
    private javax.swing.JToggleButton Boton10;
    private javax.swing.JToggleButton Boton11;
    private javax.swing.JToggleButton Boton12;
    private javax.swing.JToggleButton Boton13;
    private javax.swing.JToggleButton Boton14;
    private javax.swing.JToggleButton Boton15;
    private javax.swing.JToggleButton Boton16;
    private javax.swing.JToggleButton Boton2;
    private javax.swing.JToggleButton Boton3;
    private javax.swing.JToggleButton Boton4;
    private javax.swing.JToggleButton Boton5;
    private javax.swing.JToggleButton Boton6;
    private javax.swing.JToggleButton Boton7;
    private javax.swing.JToggleButton Boton8;
    private javax.swing.JToggleButton Boton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
