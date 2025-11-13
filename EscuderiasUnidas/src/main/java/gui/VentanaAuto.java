package gui;

import exceptions.DatoInvalidoException;
import exceptions.FormatoIncorrectoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Auto;
import logica.AutoPiloto;
import logica.Escuderia;
import logica.Piloto;
import servicie.GestorDeClases;

public class VentanaAuto extends javax.swing.JFrame {

    private GestorDeClases gc;
    private Auto auto;
    private DefaultTableModel modelo;

    public VentanaAuto(GestorDeClases gc) {
        this.gc = gc;
        this.auto = new Auto();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarTabla();
    }

    public void reiniciarCampos() {
        auto = new Auto();
        modeloTxt.setText("");
        motorTxt.setText("");
        escuderiaEtiq.setText("ESCUDERIA: ");
        cargarTabla();
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"MODELO", "MOTOR", "ESCUDERIA"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Auto a : gc.getAutos()) {
            fila[0] = a.getModelo();
            fila[1] = a.getMotor();
            fila[2] = a.getEscuderia().getNombre();
            modelo.addRow(fila);
        }

        autosTabla.setModel(modelo);
    }

    private void mostrarPilotos() {
        modelo = new DefaultTableModel();
        String[] columnas = {"FECHA ASIGNACION", "PILOTO", "DNI", "PAIS"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (AutoPiloto ap : auto.getAutoPiloto()) {
            fila[0] = ap.getFechaAsignacion();
            fila[1] = ap.getPiloto().getNombreCompleto();
            fila[2] = ap.getPiloto().getDni();
            fila[3] = ap.getPiloto().getPais().getNombre();
            modelo.addRow(fila);
        }

        autosTabla.setModel(modelo);
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
        jLabel3 = new javax.swing.JLabel();
        motorTxt = new javax.swing.JTextField();
        escuderiaEtiq = new javax.swing.JLabel();
        reiniciarBtn = new javax.swing.JButton();
        agregarPilotosBtn = new javax.swing.JButton();
        eliminarPilotoBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();
        mostrarPilotosBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        asignarEscuderiaBtn = new javax.swing.JButton();
        eliminarEscuderiaBtn = new javax.swing.JButton();

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION AUTOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 180));

        agregarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarAutoBtn.setText("AGREGAR");
        agregarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 25));

        eliminarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarAutoBtn.setText("ELIMINAR");
        eliminarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 110, 25));

        buscarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarAutoBtn.setText("BUSCAR");
        buscarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 25));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("MOTOR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 25));
        getContentPane().add(motorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 25));

        escuderiaEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        escuderiaEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        escuderiaEtiq.setText("ESCUDERIA:");
        getContentPane().add(escuderiaEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, 25));

        reiniciarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarBtn.setText("REINICIAR");
        reiniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, 25));

        agregarPilotosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPilotosBtn.setText("AGREGAR");
        agregarPilotosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPilotosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPilotosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 100, 25));

        eliminarPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarPilotoBtn.setText("ELIMINAR");
        eliminarPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 100, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("MODELO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, 25));
        getContentPane().add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 150, 25));

        mostrarPilotosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarPilotosBtn.setText("MOSTRAR");
        mostrarPilotosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPilotosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPilotosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 100, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PILOTOS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 100, 25));

        asignarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        asignarEscuderiaBtn.setText("ASIGNAR");
        asignarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(asignarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, 25));

        eliminarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarEscuderiaBtn.setText("ELIMINAR");
        eliminarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 100, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAutoBtnActionPerformed
        if (gc.getAutos().contains(auto)) {
            JOptionPane.showMessageDialog(null, "Hay un auto seleccionado, presiona reiniciar.");
        } else {
            try {
                String modeloAuto = modeloTxt.getText();
                String motor = motorTxt.getText();

                auto.setModelo(modeloAuto);
                auto.setMotor(motor);

                gc.agregarAuto(auto);
                reiniciarCampos();
                cargarTabla();
            } catch (DatoInvalidoException e) {
                JOptionPane.showMessageDialog(null, e.getMensaje());
            }
        }
    }//GEN-LAST:event_agregarAutoBtnActionPerformed

    private void eliminarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAutoBtnActionPerformed
        String variable = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
        auto = gc.buscarAuto(variable);

        if (auto != null) {
                gc.eliminarAuto(auto);
                reiniciarCampos();
                cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el auto con el modelo ingresado.");
        }
    }//GEN-LAST:event_eliminarAutoBtnActionPerformed

    private void buscarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAutoBtnActionPerformed
        String modeloAuto = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
        auto = gc.buscarAuto(modeloAuto);

        if (auto != null) {
            modeloTxt.setText(auto.getModelo());
            motorTxt.setText(auto.getMotor());
            escuderiaEtiq.setText("ESCUDERIA: " + auto.getEscuderia().getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el auto con el modelo ingresado.");
        }
    }//GEN-LAST:event_buscarAutoBtnActionPerformed

    private void reiniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarBtnActionPerformed
        reiniciarCampos();
        cargarTabla();
    }//GEN-LAST:event_reiniciarBtnActionPerformed

    // ********** RELACION AUTO-PILOTO  ********** //

    private void agregarPilotosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPilotosBtnActionPerformed
        try {
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha de hoy:");
            String dni = JOptionPane.showInputDialog("Ingrese el dni del piloto:");

            if (!fecha.matches("\\d{4}/\\d{2}/\\d{2}") || !dni.matches("\\d{8}")) {
                throw new FormatoIncorrectoException();
            }

            Piloto piloto = gc.buscarPiloto(dni);

            AutoPiloto ap = new AutoPiloto();
            ap.setAuto(auto);
            ap.setPiloto(piloto);
            ap.setFechaAsignacion(fecha);

            auto.agregarAutoPiloto(ap);
            piloto.agregarAuto(ap);

            mostrarPilotos();
            JOptionPane.showMessageDialog(this, "Piloto asignado correctamente.");
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_agregarPilotosBtnActionPerformed

    private void eliminarPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPilotoBtnActionPerformed
        try {
            String dni = JOptionPane.showInputDialog("Ingrese el dni del piloto:");
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha de asignacion:");

            if (!fecha.matches("\\d{4}/\\d{2}/\\d{2}") || !dni.matches("\\d{8}")) {
                throw new FormatoIncorrectoException();
            }

            boolean encontrado = false;
            for (AutoPiloto ap : auto.getAutoPiloto()) {
                if (ap.getPiloto().getDni().equalsIgnoreCase(dni)
                        && ap.getFechaAsignacion().equals(fecha)) {
                    ap.getAuto().borrarPiloto(ap);
                    ap.getPiloto().borrarAuto(ap);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                mostrarPilotos();
                JOptionPane.showMessageDialog(null, "El piloto con el DNI ingresado no se relaciona con este  auto.");
            }
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarPilotoBtnActionPerformed

    private void mostrarPilotosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPilotosBtnActionPerformed
        mostrarPilotos();
    }//GEN-LAST:event_mostrarPilotosBtnActionPerformed

    private void asignarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarEscuderiaBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la escuderia:");
        Escuderia e = gc.buscarEscuderia(nombre);

        if (e != null) {
            try {
                auto.setEscuderia(e);
                escuderiaEtiq.setText("ESCUDERIA: " + e.getNombre());
                cargarTabla();
            } catch (DatoInvalidoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMensaje());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro la escuderia con el nombre ingresado.");
        }
    }//GEN-LAST:event_asignarEscuderiaBtnActionPerformed

    private void eliminarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEscuderiaBtnActionPerformed
        try {
            auto.setEscuderia(new Escuderia());
            escuderiaEtiq.setText("ESCUDERIA: ");
            cargarTabla();
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(this, e.getMensaje());
        }
    }//GEN-LAST:event_eliminarEscuderiaBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAutoBtn;
    private javax.swing.JButton agregarPilotosBtn;
    private javax.swing.JButton asignarEscuderiaBtn;
    private javax.swing.JTable autosTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarAutoBtn;
    private javax.swing.JButton eliminarAutoBtn;
    private javax.swing.JButton eliminarEscuderiaBtn;
    private javax.swing.JButton eliminarPilotoBtn;
    private javax.swing.JLabel escuderiaEtiq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JButton mostrarPilotosBtn;
    private javax.swing.JTextField motorTxt;
    private javax.swing.JButton reiniciarBtn;
    // End of variables declaration//GEN-END:variables
}
