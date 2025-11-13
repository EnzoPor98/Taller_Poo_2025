package gui;

import exceptions.DatoInvalidoException;
import exceptions.FormatoIncorrectoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Auto;
import logica.AutoPiloto;
import logica.Escuderia;
import servicie.GestorDeClases;
import logica.Pais;
import logica.Piloto;
import logica.PilotoEscuderia;

public class VentanaPiloto extends javax.swing.JFrame {

    private Piloto piloto;
    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaPiloto(GestorDeClases gc) {
        this.gc = gc;
        this.piloto = new Piloto();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarPaises();
        cargarTabla();
    }

    public void reiniciarCampos() {
        nombreTxt.setText("");
        apellidoTxt.setText("");
        dniTxt.setText("");
        piloto = new Piloto();
        cargarTabla();
    }

    private void cargarPaises() {
        for (Pais p : gc.getPaises()) {
            paisBox.addItem(p.getNombre());
        }
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE", "APELLIDO", "DNI", "PAIS", "COMPETENCIAS", "VICTORIAS", "VUELTAS R.", "PODIOS"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Piloto p : gc.getPilotos()) {
            fila[0] = p.getNombre();
            fila[1] = p.getApellido();
            fila[2] = p.getDni();
            fila[3] = p.getPais().getNombre();
            fila[4] = p.getNumeroCompetencia();
            fila[5] = p.getVictorias();
            fila[6] = p.getVueltasRapidas();
            fila[7] = p.getPodios();
            modelo.addRow(fila);
        }

        pilotosTabla.setModel(modelo);
    }

    private void mostrarEscuderias() {
        modelo = new DefaultTableModel();
        String[] columnas = {"ESCUDERIA", "FECHA INICIO", "FECHA FIN"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (PilotoEscuderia pe : piloto.getEscuderias()) {
            fila[0] = pe.getEscuderia().getNombre();
            fila[1] = pe.getDesdeFecha();
            fila[2] = pe.getHastaFecha();
            modelo.addRow(fila);
        }

        pilotosTabla.setModel(modelo);
    }

    private void mostrarAutos() {
        modelo = new DefaultTableModel();
        String[] columnas = {"FECHA ASIGNACION", "MODELO", "MOTOR"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (AutoPiloto ap : piloto.getAutoPiloto()) {
            fila[0] = ap.getFechaAsignacion();
            fila[1] = ap.getAuto().getModelo();
            fila[2] = ap.getAuto().getMotor();
            modelo.addRow(fila);
        }

        pilotosTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pilotosTabla = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dniTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        eliminarEscuderiaBtn = new javax.swing.JButton();
        agregarEscuderiaBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        eliminarAutoBtn = new javax.swing.JButton();
        mostrarAutosBtn = new javax.swing.JButton();
        agregarAutoBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        agregarPilotoBtn = new javax.swing.JButton();
        eliminarPilotoBtn = new javax.swing.JButton();
        buscarPilotoBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mostrarEscuderiasBtn = new javax.swing.JButton();
        paisBox = new javax.swing.JComboBox<>();
        reiniciarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pilotosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "DNI", "PAIS", "COMPETENCIAS", "VICTORIAS", "VUELTAS R.", "PODIOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pilotosTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

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
        jLabel2.setText("INGRESA LOS DATOS DE LOS PILOTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, -1));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 25));
        getContentPane().add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, 25));
        getContentPane().add(dniTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ESCUDERIAS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, 25));

        eliminarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarEscuderiaBtn.setText("ELIMINAR");
        eliminarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 100, 25));

        agregarEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarEscuderiaBtn.setText("AGREGAR");
        agregarEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 100, 25));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("AUTOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, 25));

        eliminarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarAutoBtn.setText("ELIMINAR");
        eliminarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 100, 25));

        mostrarAutosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarAutosBtn.setText("MOSTRAR");
        mostrarAutosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAutosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarAutosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 100, 25));

        agregarAutoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarAutoBtn.setText("AGREGAR");
        agregarAutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAutoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAutoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 100, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 180));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION PILOTOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        agregarPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPilotoBtn.setText("AGREGAR");
        agregarPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 25));

        eliminarPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarPilotoBtn.setText("ELIMINAR");
        eliminarPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 110, 25));

        buscarPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarPilotoBtn.setText("BUSCAR");
        buscarPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("PAIS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 25));

        mostrarEscuderiasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarEscuderiasBtn.setText("MOSTRAR");
        mostrarEscuderiasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEscuderiasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarEscuderiasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, 25));

        getContentPane().add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, 25));

        reiniciarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarBtn.setText("REINICIAR");
        reiniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPilotoBtnActionPerformed
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String dni = dniTxt.getText();
        Pais pais = gc.getPaises().get(paisBox.getSelectedIndex());

        try {
            piloto.setNombre(nombre);
            piloto.setApellido(apellido);
            piloto.setDni(dni);
            piloto.setPais(pais);

            gc.agregarPiloto(piloto);

            reiniciarCampos();
            cargarTabla();
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_agregarPilotoBtnActionPerformed

    private void eliminarPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPilotoBtnActionPerformed
        try {
            String dni = JOptionPane.showInputDialog("Ingrese DNI del piloto:");
            if (dni.matches("\\d{8}")) {
                throw new FormatoIncorrectoException();
            }

            this.piloto = gc.buscarPiloto(dni);
            if (piloto != null) {
                gc.eliminarPiloto(piloto);
                cargarTabla();
                reiniciarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "El piloto con el DNI ingresado no existe.");
            }
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarPilotoBtnActionPerformed

    private void buscarPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPilotoBtnActionPerformed
        try {
            String dni = JOptionPane.showInputDialog("Ingrese DNI del piloto:");
            if (dni.matches("\\d{8}")) {
                throw new FormatoIncorrectoException();
            }

            this.piloto = gc.buscarPiloto(dni);
            if (piloto != null) {
                nombreTxt.setText(piloto.getNombre());
                apellidoTxt.setText(piloto.getApellido());
                dniTxt.setText(piloto.getDni());
                paisBox.setSelectedItem(piloto.getPais().getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "El piloto con el DNI ingresado no existe.");
            }
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_buscarPilotoBtnActionPerformed

    private void reiniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarBtnActionPerformed
        reiniciarCampos();
    }//GEN-LAST:event_reiniciarBtnActionPerformed

    // ********** RELACION PILOTO-ESCUDERIA  ********** //

    private void agregarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEscuderiaBtnActionPerformed
        try {
            PilotoEscuderia pe = new PilotoEscuderia();

            String desdeFecha = JOptionPane.showInputDialog("Ingrese fecha de inicio:");
            String hastaFecha = JOptionPane.showInputDialog("Ingrese fecha de fin:");
            String nombre = JOptionPane.showInputDialog("Ingrese nombre de la escuderia:");
            Escuderia escuderia = gc.buscarEscuderia(nombre);

            pe.setDesdeFecha(desdeFecha);
            pe.setHastaFecha(hastaFecha);
            pe.setPiloto(piloto);
            pe.setEscuderia(escuderia);

            piloto.agregarEscuderia(pe);
            escuderia.agregarPilotoEscuderia(pe);

            mostrarEscuderias();
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_agregarEscuderiaBtnActionPerformed

    private void eliminarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEscuderiaBtnActionPerformed
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre de la escuderia:");
            String fecha = JOptionPane.showInputDialog("Ingrese fecha de inicio:");

            if (fecha.matches("\\d{4}/\\d{2}/\\d{2}")) {
                throw new FormatoIncorrectoException();
            }

            boolean encontrado = false;
            for (PilotoEscuderia pe : piloto.getEscuderias()) {
                if (pe.getEscuderia().getNombre().equalsIgnoreCase(nombre)
                        && pe.getDesdeFecha().equals(fecha)) {
                    pe.getPiloto().borrarEscuderia(pe);
                    pe.getEscuderia().borrarPilotoEscuderia(pe);
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                mostrarEscuderias();
                JOptionPane.showMessageDialog(null, "Se ha eliminado la escuderia.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la escuderia.");
            }
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarEscuderiaBtnActionPerformed

    private void mostrarEscuderiasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEscuderiasBtnActionPerformed
        mostrarEscuderias();
    }//GEN-LAST:event_mostrarEscuderiasBtnActionPerformed

    // ********** RELACION PILOTO-AUTO  ********** //

    private void agregarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAutoBtnActionPerformed
        try {
            AutoPiloto ap = new AutoPiloto();

            String fecha = JOptionPane.showInputDialog("Ingrese la fecha de hoy:");
            String modeloAuto = JOptionPane.showInputDialog("Ingrese modelo del auto:");
            Auto auto = gc.buscarAuto(modeloAuto);

            if (!fecha.isBlank() || !modeloAuto.isBlank() || auto != null) {
                ap.setAuto(auto);
                ap.setPiloto(piloto);
                ap.setFechaAsignacion(fecha);

                piloto.agregarAuto(ap);
                try {
                    auto.agregarAutoPiloto(ap);
                } catch (DatoInvalidoException ex) {
                    Logger.getLogger(VentanaPiloto.class.getName()).log(Level.SEVERE, null, ex);
                }

                mostrarAutos();
            } else {
                JOptionPane.showMessageDialog(null, "No puede dejar espacios en blanco.");
            }
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_agregarAutoBtnActionPerformed

    private void eliminarAutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAutoBtnActionPerformed
        try {
            String modeloAuto = JOptionPane.showInputDialog("Ingrese modelo del auto:");
            String fecha = JOptionPane.showInputDialog("Ingrese fecha de inicio:");

            if (fecha.matches("\\d{4}/\\d{2}/\\d{2}")) {
                throw new FormatoIncorrectoException();
            }

            boolean encontrado = false;
            for (AutoPiloto ap : piloto.getAutoPiloto()) {
                if (ap.getAuto().getModelo().equalsIgnoreCase(modeloAuto)
                        && ap.getFechaAsignacion().equals(fecha)) {
                    ap.getAuto().borrarPiloto(ap);
                    ap.getPiloto().borrarAuto(ap);
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                mostrarAutos();
                JOptionPane.showMessageDialog(null, "Auto eliminado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el auto.");
            }
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarAutoBtnActionPerformed

    private void mostrarAutosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAutosBtnActionPerformed
        mostrarAutos();
    }//GEN-LAST:event_mostrarAutosBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAutoBtn;
    private javax.swing.JButton agregarEscuderiaBtn;
    private javax.swing.JButton agregarPilotoBtn;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarPilotoBtn;
    private javax.swing.JTextField dniTxt;
    private javax.swing.JButton eliminarAutoBtn;
    private javax.swing.JButton eliminarEscuderiaBtn;
    private javax.swing.JButton eliminarPilotoBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton mostrarAutosBtn;
    private javax.swing.JButton mostrarEscuderiasBtn;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> paisBox;
    private javax.swing.JTable pilotosTabla;
    private javax.swing.JButton reiniciarBtn;
    // End of variables declaration//GEN-END:variables
}
