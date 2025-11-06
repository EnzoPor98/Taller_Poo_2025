package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Pais;
import logica.Circuito;
import servicie.GestorDeClases;

public class VentanaCircuito extends javax.swing.JFrame {

    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaCircuito(GestorDeClases gc) {
        this.gc = gc;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarPaises();
        cargarTabla();
    }

    private void cargarPaises() {
        for (Pais p : gc.getPaises()) {
            paisBox.addItem(p.getNombre());
        }
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE", "LONGITUD", "PAIS"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Circuito c : gc.getCircuitos()) {
            fila[0] = c.getNombre();
            fila[1] = c.getLongitud();
            fila[2] = c.getPais().getNombre();
            modelo.addRow(fila);
        }

        circuitosTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        longitudTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        circuitosTabla = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        agregarCircuitoBtn = new javax.swing.JButton();
        eliminarCircuitoBtn = new javax.swing.JButton();
        buscarCircuitoBtn = new javax.swing.JButton();
        paisBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel2.setText("INGRESA LOS DATOS DE LOS CIRCUITOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 700, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 25));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("LONGITUD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 25));
        getContentPane().add(longitudTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, 25));

        circuitosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "LONGITUD", "PAIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(circuitosTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 390));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 140));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION CIRCUITOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        agregarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarCircuitoBtn.setText("AGREGAR");
        agregarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 25));

        eliminarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCircuitoBtn.setText("ELIMINAR");
        eliminarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 25));

        buscarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarCircuitoBtn.setText("BUSCAR");
        buscarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 25));

        paisBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTADOS UNIDOS" }));
        getContentPane().add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("PAIS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CARRERAS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 100, 25));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("VER LISTA");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 100, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCircuitoBtnActionPerformed
        Circuito c = new Circuito();

        String nombre = nombreTxt.getText();
        int longitud = Integer.parseInt(longitudTxt.getText());
        Pais pais = gc.getPaises().get(paisBox.getItemCount());

        c.setNombre(nombre);
        c.setLongitud(longitud);
        c.setPais(pais);

        gc.agregarCircuito(c);
    }//GEN-LAST:event_agregarCircuitoBtnActionPerformed

    private void eliminarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCircuitoBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del circuito:");
        Circuito c = gc.buscarCircuito(nombre);

        if (c != null) {
            gc.eliminarCircuito(c);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "El circuito con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_eliminarCircuitoBtnActionPerformed

    private void buscarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCircuitoBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del circuito:");
        Circuito c = gc.buscarCircuito(nombre);

        if (c != null) {
            JOptionPane.showMessageDialog(null, "Circuito buscado: \n" + c.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El circuito con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_buscarCircuitoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCircuitoBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarCircuitoBtn;
    private javax.swing.JTable circuitosTabla;
    private javax.swing.JButton eliminarCircuitoBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField longitudTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> paisBox;
    // End of variables declaration//GEN-END:variables
}
