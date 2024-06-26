/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package marianorolong.Ventanas.Usuarios;

import java.awt.Color;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import marianorolong.base.Persona;

/**
 *
 * @author maria
 */
public class VentanaLogin extends javax.swing.JDialog {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoIdentificacionInicioSesion = new javax.swing.JTextField();
        campoPasswordInicioSesion = new javax.swing.JPasswordField();
        textMensaje = new javax.swing.JLabel();
        botonCancelarInicioSesion = new javax.swing.JButton();
        botonAceptarInicioSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/candadoInicioSesion.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("INICIO SESION");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("IDENTIFICACION");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("PASSWORD");

        campoIdentificacionInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdentificacionInicioSesionActionPerformed(evt);
            }
        });
        campoIdentificacionInicioSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoIdentificacionInicioSesionKeyPressed(evt);
            }
        });

        campoPasswordInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPasswordInicioSesionActionPerformed(evt);
            }
        });

        textMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textMensaje.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPasswordInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(campoIdentificacionInicioSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(textMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoIdentificacionInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoPasswordInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(textMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        botonCancelarInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelarInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCancelarInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelarInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/cancelmageButton.png"))); // NOI18N
        botonCancelarInicioSesion.setText("CANCELAR");
        botonCancelarInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarInicioSesionActionPerformed(evt);
            }
        });

        botonAceptarInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonAceptarInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonAceptarInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        botonAceptarInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/aceptarIcono.png"))); // NOI18N
        botonAceptarInicioSesion.setText("ACEPTAR");
        botonAceptarInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarInicioSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonCancelarInicioSesion)
                        .addGap(18, 18, 18)
                        .addComponent(botonAceptarInicioSesion)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptarInicioSesion)
                    .addComponent(botonCancelarInicioSesion))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarInicioSesionActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(this,"¿desea cerrar la app?",
                "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == JOptionPane.YES_OPTION){
        System.exit(0);
        }
        
        
    }//GEN-LAST:event_botonCancelarInicioSesionActionPerformed

    private void botonAceptarInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarInicioSesionActionPerformed

    //recuperamso datos formulario

    String  identificacion = campoIdentificacionInicioSesion.getText();
    char clave[] = campoPasswordInicioSesion.getPassword();
    String password = String.copyValueOf(clave);
    //buscar identificacion  entre las claves del diccionario.
    Persona user = null;
    Map usuariosBD = Persona.usuariosBD;
    if(usuariosBD == null){
        textMensaje.setForeground(Color.red);
        JOptionPane.showMessageDialog(this, "Base de datos vacia registrese");
        campoIdentificacionInicioSesion.setText("");
        campoPasswordInicioSesion.setText("");
        
    } else if (usuariosBD.containsKey(identificacion)){
       user = Persona.usuariosBD.get(identificacion);
    
    if(user.clave.equals(password)){
        textMensaje.setForeground(Color.green);
        JOptionPane.showMessageDialog(this, "Saludos"+ user.nombre);
        dispose();
            
    
    }else{
        textMensaje.setForeground(Color.red);
       JOptionPane.showMessageDialog(this, "Acceso denegado");
        campoIdentificacionInicioSesion.setText("");
        campoPasswordInicioSesion.setText("");
    }
    
    }else{
            textMensaje.setForeground(Color.red);
       JOptionPane.showMessageDialog(this, "Usuario inexistente");
        campoIdentificacionInicioSesion.setText("");
        campoPasswordInicioSesion.setText("");
            }
    
    
    
   

       
    }//GEN-LAST:event_botonAceptarInicioSesionActionPerformed

    private void campoIdentificacionInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdentificacionInicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdentificacionInicioSesionActionPerformed

    private void campoPasswordInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPasswordInicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPasswordInicioSesionActionPerformed

    private void campoIdentificacionInicioSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdentificacionInicioSesionKeyPressed
        
        
        
        
    }//GEN-LAST:event_campoIdentificacionInicioSesionKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaLogin dialog = new VentanaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarInicioSesion;
    private javax.swing.JButton botonCancelarInicioSesion;
    private javax.swing.JTextField campoIdentificacionInicioSesion;
    private javax.swing.JPasswordField campoPasswordInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textMensaje;
    // End of variables declaration//GEN-END:variables
}
