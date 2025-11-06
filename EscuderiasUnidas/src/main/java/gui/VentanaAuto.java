package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Auto;
import servicie.GestorDeClases;

public class VentanaAuto extends javax.swing.JFrame {

    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaAuto(GestorDeClases gc) {
        this.gc = gc;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarTabla();
    }

    private void cargarTabla() {
        if (!gc.getAutos().isEmpty()) {
            modelo = new DefaultTableModel();
            String[] columnas = {"MODELO", "MOTOR"};
            modelo.setColumnIdentifiers(columnas);
            Object[] fila = new Object[modelo.getColumnCount()];

            modelo.setRowCount(0);
            for (Auto a : gc.getAutos()) {
                fila[0] = a.getModelo();
                fila[1] = a.getMotor();
                modelo.addRow(fila);
            }

            autosTabla.setModel(modelo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        agregarAutoBtn = new javax.swing.JButton();
        eliminarAutoBtn = new javax.swing.JButton();
        buscarAutoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        autosTabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        motorTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Autos");
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
        jLabel2.setText("INGRESA LOS DATOS DE LOS AUTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 700, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION AUTOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 140));

        agregarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarAutoBtn.setText("AGREGAR");
        agregarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 25));

        eliminarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarAutoBtn.setText("ELIMINAR");
        eliminarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 25));

        buscarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarAutoBtn.setText("BUSCAR");
        buscarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 25));

        autosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MODELO", "MOTOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(autosTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 390));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("ID:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 25));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("MOTOR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 25));
        getContentPane().add(motorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ESCUDERIAS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 100, 25));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("VER LISTA");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 100, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("AGREGAR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 100, 25));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BORRAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 100, 25));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PILOTOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 100, 25));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("VER LISTA");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 100, 25));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("AGREGAR");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, 25));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("BORRAR");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 100, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("MODELO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 25));
        getContentPane().add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAutoBtnActionPerformed
        Auto a = new Auto();

        String modelo = modeloTxt.getText();
        String motor = motorTxt.getText();

        a.setModelo(modelo);
        a.setMotor(motor);

        gc.agregarAuto(a);
        cargarTabla();
    }//GEN-LAST:event_agregarAutoBtnActionPerformed

    private void eliminarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAutoBtnActionPerformed
        String variable = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
        Auto a = gc.buscarAuto(variable);

        if (a != null) {
            gc.eliminarAuto(a);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "El auto con el modelo ingresado no existe.");
        }
    }//GEN-LAST:event_eliminarAutoBtnActionPerformed

    private void buscarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAutoBtnActionPerformed
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
        Auto a = gc.buscarAuto(modelo);

        if (a != null) {
            JOptionPane.showMessageDialog(null, "Auto buscado: \n" + a.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El auto con el modelo ingresado no existe.");
        }
    }//GEN-LAST:event_buscarAutoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAutoBtn;
    private javax.swing.JTable autosTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarAutoBtn;
    private javax.swing.JButton eliminarAutoBtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JTextField motorTxt;
    // End of variables declaration//GEN-END:variables
}
