package gui;
import logica.*;
import logica.GestorDeClases;
import javax.swing.JOptionPane;

public class VentanaMecanico extends javax.swing.JFrame {

    private GestorDeClases gc;

    public VentanaMecanico(GestorDeClases gc) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.gc = gc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dniTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        añosExperienciaTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        agregarMecanico = new javax.swing.JButton();
        eliminarMecanico = new javax.swing.JButton();
        buscarMecanico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana De Mecanicos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESA LOS DATOS DE LOS MECANICOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 700, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 25));
        getContentPane().add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 25));
        getContentPane().add(dniTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, 25));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "DNI", "ESPECIALIDAD", "AÑOS EXPERIENCIA", "ESCUDERIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 390));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ESPECIALIDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 25));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELECTRONICA" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 130, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("AÑOS EXPERIENCIA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 25));
        getContentPane().add(añosExperienciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ESCUDERIAS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 100, 25));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BORRAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 100, 25));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("VER LISTA");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 100, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("AGREGAR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 100, 25));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 800, 390));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION MECANICOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 140));

        agregarMecanico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarMecanico.setText("AGREGAR");
        agregarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMecanicoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 25));

        eliminarMecanico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarMecanico.setText("ELIMINAR");
        eliminarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMecanicoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 25));

        buscarMecanico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarMecanico.setText("BUSCAR");
        buscarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMecanicoActionPerformed(evt);
            }
        });
        getContentPane().add(buscarMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMecanicoActionPerformed
        Mecanico  m = new Mecanico();

        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String dni = dniTxt.getText();
        String añosExp = añosExperienciaTxt.getText();
        int añosExperiencia = Integer.parseInt(añosExp);
        
        m.setNombre(nombre);
        m.setApellido(apellido);
        m.setDni(dni);
        m.setAñosExperiencia(añosExperiencia);
        
        gc.agregarMecanico(m);
       
    }//GEN-LAST:event_agregarMecanicoActionPerformed

    private void eliminarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMecanicoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del Mecanico:");
        Mecanico m = gc.buscarMecanico(dni);
        gc.eliminarMecanico(m);
    }//GEN-LAST:event_eliminarMecanicoActionPerformed

    private void buscarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMecanicoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del Mecanico:");
        Piloto m = gc.buscarPiloto(dni);

        if (m != null) {
            JOptionPane.showMessageDialog(null, "Mecanico buscado: \n" + m.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El Mecanico con el DNI ingresado no existe.");
        }
    }//GEN-LAST:event_buscarMecanicoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMecanico;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JTextField añosExperienciaTxt;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarMecanico;
    private javax.swing.JTextField dniTxt;
    private javax.swing.JButton eliminarMecanico;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreTxt;
    // End of variables declaration//GEN-END:variables
}
