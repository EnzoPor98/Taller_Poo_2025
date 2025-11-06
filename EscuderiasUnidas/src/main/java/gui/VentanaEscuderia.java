package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Escuderia;
import logica.Pais;
import servicie.GestorDeClases;

public class VentanaEscuderia extends javax.swing.JFrame {

    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaEscuderia(GestorDeClases gc) {
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
        String[] columnas = {"NOMBRE", "PAIS"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Escuderia e : gc.getEscuderias()) {
            fila[0] = e.getNombre();
            fila[1] = e.getPais().getNombre();
            modelo.addRow(fila);
        }

        escuderiasTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        agregarEscuderiaBtn = new javax.swing.JButton();
        eliminarEscuderiaBtn = new javax.swing.JButton();
        buscarEscuderiaBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        escuderiasTabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        paisBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

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
        jLabel2.setText("INGRESA LOS DATOS DE LAS ESCUDERIAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 700, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 140));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION ESCUDERIAS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        agregarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarEscuderiaBtn.setText("AGREGAR");
        agregarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 25));

        eliminarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarEscuderiaBtn.setText("ELIMINAR");
        eliminarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 25));

        buscarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarEscuderiaBtn.setText("BUSCAR");
        buscarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 25));

        escuderiasTabla.setModel(new javax.swing.table.DefaultTableModel(
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
                "NOMBRE", "PAIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(escuderiasTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 390));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 25));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 150, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PAIS:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 25));

        getContentPane().add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MECANICOS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 100, 25));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("VER LISTA");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("AGREGAR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 100, 25));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BORRAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 100, 25));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PILOTOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 100, 25));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("VER LISTA");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 100, 25));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("AGREGAR");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, 25));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("BORRAR");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("AUTOS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 100, 25));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("VER LISTA");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 100, 25));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("AGREGAR");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 100, 25));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("BORRAR");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 100, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEscuderiaBtnActionPerformed
        Escuderia e = new Escuderia();

        String nombre = nombreTxt.getText();
        Pais pais = gc.getPaises().get(paisBox.getItemCount());

        e.setNombre(nombre);
        e.setPais(pais);

        gc.agregarEscuderia(e);
        cargarTabla();
    }//GEN-LAST:event_agregarEscuderiaBtnActionPerformed

    private void eliminarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEscuderiaBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la escuderia:");
        Escuderia e = gc.buscarEscuderia(nombre);

        if (e != null) {
            gc.eliminarEscuderia(e);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "La escuderia con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_eliminarEscuderiaBtnActionPerformed

    private void buscarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEscuderiaBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la escuderia:");
        Escuderia e = gc.buscarEscuderia(nombre);

        if (e != null) {
            JOptionPane.showMessageDialog(null, "Escuderia buscada: \n" + e.toString());
        } else {
            JOptionPane.showMessageDialog(null, "La escuderia con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_buscarEscuderiaBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarEscuderiaBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarEscuderiaBtn;
    private javax.swing.JButton eliminarEscuderiaBtn;
    private javax.swing.JTable escuderiasTabla;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> paisBox;
    // End of variables declaration//GEN-END:variables
}
