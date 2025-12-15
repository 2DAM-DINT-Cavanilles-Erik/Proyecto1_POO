public class VehiculoFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VehiculoFrame.class.getName());

    public VehiculoFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        labelColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblExtra = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        txtExtra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        labelMarca.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelMarca.setText("Marca");
        getContentPane().add(labelMarca);
        labelMarca.setBounds(60, 70, 70, 20);
        getContentPane().add(txtMarca);
        txtMarca.setBounds(200, 60, 130, 30);

        labelColor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelColor.setText("Color");
        getContentPane().add(labelColor);
        labelColor.setBounds(60, 100, 70, 20);
        getContentPane().add(txtColor);
        txtColor.setBounds(200, 90, 130, 30);

        labelTipo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelTipo.setText("Tipo");
        getContentPane().add(labelTipo);
        labelTipo.setBounds(60, 30, 70, 20);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "Moto" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(200, 30, 130, 22);

        lblExtra.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblExtra.setText("Tipo Combustible");
        getContentPane().add(lblExtra);
        lblExtra.setBounds(60, 140, 140, 30);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(140, 200, 120, 23);

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 240, 330, 140);
        getContentPane().add(txtExtra);
        txtExtra.setBounds(200, 140, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
       String tipo = cmbTipo.getSelectedItem().toString();
        
       if(tipo.equals("Auto")){
            lblExtra.setText("Tipo Combustible:"); // Se pide combustible
        } else {
            lblExtra.setText("Cilindrada:"); // Se pide cilindrada
        } 
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Consigue los distintos datos
        String marca = txtMarca.getText(); 
        String color = txtColor.getText();
        String extra = txtExtra.getText();
        
        // Si el usuario elige "Auto"
        if(cmbTipo.getSelectedItem().toString().equals("Auto")){
            Auto a = new Auto(); // Se crea un nuevo coche
            a.setMarca(marca);
            a.setColor(color);
            a.setTipoCombustible(extra); // Se usa extra como combustible
            txtResultado.append(a.mostrarInfo() + "\n");

            // La otra opción, la de moto
            } else {
            Moto m = new Moto(); // Se crea una moto
            m.setMarca(marca);
            m.setColor(color);
            m.setCilindrada(extra); // Extra ahora es cilindrada
            txtResultado.append(m.mostrarInfo() + "\n");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed


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
        java.awt.EventQueue.invokeLater(() -> new VehiculoFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
