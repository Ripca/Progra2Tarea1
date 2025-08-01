/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import modelo.Cliente;


/**
 *
 * @author VELA
 */
public class frm_personas extends javax.swing.JFrame {
    DefaultTableModel tbl_model;
    Cliente cliente;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frm_personas.class.getName());

    /**
     * Creates new form frm_personas
     */
    public frm_personas() {
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

        jPanel1 = new javax.swing.JPanel();
        tjp_principal = new javax.swing.JTabbedPane();
        pa_empleados = new javax.swing.JPanel();
        lbl_titulo_empleados = new javax.swing.JLabel();
        lbl_codigo_e = new javax.swing.JLabel();
        txt_codigo_e = new javax.swing.JTextField();
        lbl_nombres_e = new javax.swing.JLabel();
        txt_nombres_e = new javax.swing.JTextField();
        lbl_apellidos_e = new javax.swing.JLabel();
        txt_apellidos_e = new javax.swing.JTextField();
        lbl_direccion_e = new javax.swing.JLabel();
        txt_direccion_e = new javax.swing.JTextField();
        lbl_telefono_e = new javax.swing.JLabel();
        txt_telefono_e = new javax.swing.JTextField();
        txt_fn_e = new javax.swing.JTextField();
        lbl_fn_e = new javax.swing.JLabel();
        lbl_mensaje = new javax.swing.JLabel();
        btn_guardar_e = new javax.swing.JButton();
        pa_clientes = new javax.swing.JPanel();
        lbl_titulo_clientes = new javax.swing.JLabel();
        lbl_nit_c = new javax.swing.JLabel();
        txt_nit_c = new javax.swing.JTextField();
        lbl_nombres_c = new javax.swing.JLabel();
        txt_nombres_c = new javax.swing.JTextField();
        lbl_apellidos_c = new javax.swing.JLabel();
        txt_apellidos_c = new javax.swing.JTextField();
        lbl_direccion_c = new javax.swing.JLabel();
        txt_direccion_c = new javax.swing.JTextField();
        lbl_telefono_c = new javax.swing.JLabel();
        txt_telefono_c = new javax.swing.JTextField();
        txt_fn_c = new javax.swing.JTextField();
        lbl_fn_c = new javax.swing.JLabel();
        lbl_mensaje_c = new javax.swing.JLabel();
        btn_guardar_c = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo_empleados.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_titulo_empleados.setText("Formulario Empleado");

        lbl_codigo_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_codigo_e.setText("Código:");

        txt_codigo_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_eActionPerformed(evt);
            }
        });

        lbl_nombres_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nombres_e.setText("Nombres:");

        txt_nombres_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres_eActionPerformed(evt);
            }
        });

        lbl_apellidos_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_apellidos_e.setText("Apellidos:");

        txt_apellidos_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos_eActionPerformed(evt);
            }
        });

        lbl_direccion_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_direccion_e.setText("Dirección:");

        txt_direccion_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_eActionPerformed(evt);
            }
        });

        lbl_telefono_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_telefono_e.setText("Teléfono");

        txt_telefono_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_eActionPerformed(evt);
            }
        });

        txt_fn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fn_eActionPerformed(evt);
            }
        });

        lbl_fn_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_fn_e.setText("Nacimiento");

        lbl_mensaje.setText("0");

        btn_guardar_e.setText("Guardar");
        btn_guardar_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_eActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_empleadosLayout = new javax.swing.GroupLayout(pa_empleados);
        pa_empleados.setLayout(pa_empleadosLayout);
        pa_empleadosLayout.setHorizontalGroup(
            pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_empleadosLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(lbl_titulo_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pa_empleadosLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pa_empleadosLayout.createSequentialGroup()
                            .addComponent(lbl_apellidos_e, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_apellidos_e))
                        .addGroup(pa_empleadosLayout.createSequentialGroup()
                            .addComponent(lbl_direccion_e, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_direccion_e))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pa_empleadosLayout.createSequentialGroup()
                            .addComponent(lbl_telefono_e, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_telefono_e))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pa_empleadosLayout.createSequentialGroup()
                            .addComponent(lbl_fn_e, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_guardar_e)
                                .addComponent(lbl_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_fn_e)))
                        .addGroup(pa_empleadosLayout.createSequentialGroup()
                            .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_nombres_e, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_codigo_e, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nombres_e, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_codigo_e, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(459, Short.MAX_VALUE)))
        );
        pa_empleadosLayout.setVerticalGroup(
            pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_empleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo_empleados)
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pa_empleadosLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_codigo_e)
                        .addComponent(txt_codigo_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nombres_e)
                        .addComponent(txt_nombres_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_apellidos_e)
                        .addComponent(txt_apellidos_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_direccion_e)
                        .addComponent(txt_direccion_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_telefono_e)
                        .addComponent(txt_telefono_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pa_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_fn_e)
                        .addComponent(txt_fn_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_mensaje)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_guardar_e)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        tjp_principal.addTab("Empleados", pa_empleados);

        lbl_titulo_clientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_titulo_clientes.setText("Formulario Clientes");

        lbl_nit_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nit_c.setText("Nit:");

        txt_nit_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nit_cActionPerformed(evt);
            }
        });

        lbl_nombres_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nombres_c.setText("Nombres:");

        txt_nombres_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres_cActionPerformed(evt);
            }
        });

        lbl_apellidos_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_apellidos_c.setText("Apellidos:");

        txt_apellidos_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos_cActionPerformed(evt);
            }
        });

        lbl_direccion_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_direccion_c.setText("Dirección:");

        txt_direccion_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_cActionPerformed(evt);
            }
        });

        lbl_telefono_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_telefono_c.setText("Teléfono");

        txt_telefono_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_cActionPerformed(evt);
            }
        });

        txt_fn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fn_cActionPerformed(evt);
            }
        });

        lbl_fn_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_fn_c.setText("Nacimiento");

        lbl_mensaje_c.setText("0");

        btn_guardar_c.setText("Guardar");
        btn_guardar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_clientesLayout = new javax.swing.GroupLayout(pa_clientes);
        pa_clientes.setLayout(pa_clientesLayout);
        pa_clientesLayout.setHorizontalGroup(
            pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_clientesLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(lbl_titulo_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(pa_clientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pa_clientesLayout.createSequentialGroup()
                        .addComponent(lbl_apellidos_c, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellidos_c))
                    .addGroup(pa_clientesLayout.createSequentialGroup()
                        .addComponent(lbl_direccion_c, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_direccion_c))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pa_clientesLayout.createSequentialGroup()
                        .addComponent(lbl_telefono_c, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefono_c))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pa_clientesLayout.createSequentialGroup()
                        .addComponent(lbl_fn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guardar_c)
                            .addComponent(lbl_mensaje_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_fn_c)))
                    .addGroup(pa_clientesLayout.createSequentialGroup()
                        .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nombres_c, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(pa_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nit_c, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombres_c, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nit_c, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa_clientesLayout.setVerticalGroup(
            pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo_clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit_c)
                    .addComponent(txt_nit_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres_c)
                    .addComponent(txt_nombres_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos_c)
                    .addComponent(txt_apellidos_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion_c)
                    .addComponent(txt_direccion_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono_c)
                    .addComponent(txt_telefono_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fn_c)
                    .addComponent(txt_fn_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_mensaje_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar_c)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        tjp_principal.addTab("CLientes", pa_clientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tjp_principal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tjp_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_cActionPerformed
        // TODO add your handling code here:
      
        JOptionPane.showMessageDialog(null, "MENSAJE", "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btn_guardar_cActionPerformed

    private void txt_fn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fn_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fn_cActionPerformed

    private void txt_telefono_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_cActionPerformed

    private void txt_direccion_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_cActionPerformed

    private void txt_apellidos_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidos_cActionPerformed

    private void txt_nombres_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres_cActionPerformed

    private void txt_nit_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nit_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nit_cActionPerformed

    private void txt_codigo_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_eActionPerformed

    private void txt_nombres_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres_eActionPerformed

    private void txt_apellidos_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidos_eActionPerformed

    private void txt_direccion_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_eActionPerformed

    private void txt_telefono_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_eActionPerformed

    private void txt_fn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fn_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fn_eActionPerformed

    private void btn_guardar_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_eActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frm_personas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar_c;
    private javax.swing.JButton btn_guardar_e;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellidos_c;
    private javax.swing.JLabel lbl_apellidos_e;
    private javax.swing.JLabel lbl_codigo_e;
    private javax.swing.JLabel lbl_direccion_c;
    private javax.swing.JLabel lbl_direccion_e;
    private javax.swing.JLabel lbl_fn_c;
    private javax.swing.JLabel lbl_fn_e;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JLabel lbl_mensaje_c;
    private javax.swing.JLabel lbl_nit_c;
    private javax.swing.JLabel lbl_nombres_c;
    private javax.swing.JLabel lbl_nombres_e;
    private javax.swing.JLabel lbl_telefono_c;
    private javax.swing.JLabel lbl_telefono_e;
    private javax.swing.JLabel lbl_titulo_clientes;
    private javax.swing.JLabel lbl_titulo_empleados;
    private javax.swing.JPanel pa_clientes;
    private javax.swing.JPanel pa_empleados;
    private javax.swing.JTabbedPane tjp_principal;
    private javax.swing.JTextField txt_apellidos_c;
    private javax.swing.JTextField txt_apellidos_e;
    private javax.swing.JTextField txt_codigo_e;
    private javax.swing.JTextField txt_direccion_c;
    private javax.swing.JTextField txt_direccion_e;
    private javax.swing.JTextField txt_fn_c;
    private javax.swing.JTextField txt_fn_e;
    private javax.swing.JTextField txt_nit_c;
    private javax.swing.JTextField txt_nombres_c;
    private javax.swing.JTextField txt_nombres_e;
    private javax.swing.JTextField txt_telefono_c;
    private javax.swing.JTextField txt_telefono_e;
    // End of variables declaration//GEN-END:variables
}
