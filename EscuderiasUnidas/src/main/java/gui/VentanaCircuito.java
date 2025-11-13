package gui;

import exceptions.DatoInvalidoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Carrera;
import logica.Pais;
import logica.Circuito;
import servicie.GestorDeClases;

public class VentanaCircuito extends javax.swing.JFrame {

    private GestorDeClases gc;
    private Circuito circuito;
    private DefaultTableModel modelo;

    public VentanaCircuito(GestorDeClases gc) {
        this.gc = gc;
        this.circuito = new Circuito();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarPaises();
        cargarTabla();
    }

    private void reiniciarCampos() {
        nombreTxt.setText("");
        longitudTxt.setText("");
        circuito = new Circuito();
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
        for (Circuito x : gc.getCircuitos()) {
            fila[0] = x.getNombre();
            fila[1] = x.getLongitud();
            fila[2] = x.getPais().getNombre();
            modelo.addRow(fila);
        }

        circuitosTabla.setModel(modelo);
    }

    private void mostrarCarreras() {
        modelo = new DefaultTableModel();
        String[] columnas = {"PAIS", "CIRCUITO", "VUELTAS", "FECHA", "HORA"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Carrera x : circuito.getCarreras()) {
            fila[0] = x.getPais().getNombre();
            fila[1] = x.getCircuito().getNombre();
            fila[2] = x.getNumeroVueltas();
            fila[3] = x.getFechaRealizacion();
            fila[4] = x.getHoraRealizacion();
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
        reiniciarBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        mostrarCarrerasBtn = new javax.swing.JButton();

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CARRERAS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, 25));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("LONGITUD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 25));
        getContentPane().add(longitudTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 150, 25));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 180));

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
        getContentPane().add(agregarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 25));

        eliminarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCircuitoBtn.setText("ELIMINAR");
        eliminarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 110, 25));

        buscarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarCircuitoBtn.setText("BUSCAR");
        buscarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 25));

        getContentPane().add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("PAIS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 25));

        reiniciarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarBtn.setText("REINICIAR");
        reiniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("NOMBRE:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, 25));

        mostrarCarrerasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarCarrerasBtn.setText("MOSTRAR");
        mostrarCarrerasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCarrerasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarCarrerasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCircuitoBtnActionPerformed
        String nombre = nombreTxt.getText();
        String longitud = longitudTxt.getText();
        Pais pais = gc.getPaises().get(paisBox.getItemCount() - 1);

        try {
            circuito.setNombre(nombre);
            circuito.setLongitud(Integer.parseInt(longitud));
            circuito.setPais(pais);

            gc.agregarCircuito(circuito);
            cargarTabla();
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensaje());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El valor de longitud debe ser un numero.");
        }
    }//GEN-LAST:event_agregarCircuitoBtnActionPerformed

    private void eliminarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCircuitoBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del circuito:");
        circuito = gc.buscarCircuito(nombre);

        if (circuito != null) {
            gc.eliminarCircuito(circuito);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "El circuito con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_eliminarCircuitoBtnActionPerformed

    private void buscarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCircuitoBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del circuito:");
        circuito = gc.buscarCircuito(nombre);

        if (circuito != null) {
            nombreTxt.setText(circuito.getNombre());
            longitudTxt.setText(Integer.toString(circuito.getLongitud()));
            paisBox.setSelectedItem(circuito.getPais().getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "El circuito con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_buscarCircuitoBtnActionPerformed

    private void reiniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarBtnActionPerformed
        reiniciarCampos();
        cargarTabla();
    }//GEN-LAST:event_reiniciarBtnActionPerformed

    private void mostrarCarrerasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCarrerasBtnActionPerformed
        mostrarCarreras();
    }//GEN-LAST:event_mostrarCarrerasBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCircuitoBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarCircuitoBtn;
    private javax.swing.JTable circuitosTabla;
    private javax.swing.JButton eliminarCircuitoBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField longitudTxt;
    private javax.swing.JButton mostrarCarrerasBtn;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> paisBox;
    private javax.swing.JButton reiniciarBtn;
    // End of variables declaration//GEN-END:variables
}
