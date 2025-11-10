package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Pais;
import servicie.GestorDeClases;

public class VentanaPais extends javax.swing.JFrame {

    private Pais pais;
    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaPais(GestorDeClases gc) {
        this.gc = gc;
        this.pais = new Pais();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarTabla();
    }

    private void reiniciarCampos() {
        idEtiq.setText("ID: ");
        descripcionTxt.setText("");
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"ID", "NOMBRE", "DESCRIPCION"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Pais x : gc.getPaises()) {
            fila[0] = x.getIdPais();
            fila[1] = x.getNombre();
            fila[2] = x.getDescripcion();
            modelo.addRow(fila);
        }

        paisesTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        buscarPaisBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        agregarPaisBtn = new javax.swing.JButton();
        eliminarPaisBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        idEtiq = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descripcionTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        paisesTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();

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

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESA LOS DATOS DE LOS PAISES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 700, 25));

        buscarPaisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarPaisBtn.setText("BUSCAR");
        buscarPaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPaisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPaisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 140));

        agregarPaisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPaisBtn.setText("AGREGAR");
        agregarPaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPaisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPaisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 25));

        eliminarPaisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarPaisBtn.setText("ELIMINAR");
        eliminarPaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPaisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPaisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GESTION PAISES");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        idEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idEtiq.setText("ID:");
        getContentPane().add(idEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 390, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("DESCRIPCION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 25));
        getContentPane().add(descripcionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 300, 25));

        paisesTabla.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paisesTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 390));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NOMBRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 25));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 320, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarPaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPaisBtnActionPerformed
        pais = new Pais();

        int id = gc.getPaises().getLast().getIdPais() + 1;
        String descripcion = descripcionTxt.getText();
        String nombre = nombreTxt.getText();

        pais.setIdPais(id);
        pais.setNombre(nombre);
        pais.setDescripcion(descripcion);

        gc.agregarPais(pais);
        cargarTabla();
    }//GEN-LAST:event_agregarPaisBtnActionPerformed

    private void eliminarPaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPaisBtnActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del pais:"));
        pais = gc.buscarPais(id);

        if (pais != null) {
            gc.eliminarPais(pais);
        } else {
            JOptionPane.showMessageDialog(null, "El pais con el ID ingresado no existe.");
        }
    }//GEN-LAST:event_eliminarPaisBtnActionPerformed

    private void buscarPaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPaisBtnActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del pais:"));
        pais = gc.buscarPais(id);

        if (pais != null) {
            idEtiq.setText("ID: " + Integer.toString(pais.getIdPais()));
            nombreTxt.setText(pais.getNombre());
            descripcionTxt.setText(pais.getDescripcion());
        } else {
            JOptionPane.showMessageDialog(null, "El pais con el ID ingresado no existe.");
        }
    }//GEN-LAST:event_buscarPaisBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPaisBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarPaisBtn;
    private javax.swing.JTextField descripcionTxt;
    private javax.swing.JButton eliminarPaisBtn;
    private javax.swing.JLabel idEtiq;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTable paisesTabla;
    // End of variables declaration//GEN-END:variables
}
