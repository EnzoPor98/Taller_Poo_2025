package gui;

import exceptions.DatoInvalidoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Escuderia;
import logica.Pais;
import servicie.GestorDeClases;
import logica.*;

public class VentanaEscuderia extends javax.swing.JFrame {

    private Escuderia escuderia;
    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaEscuderia(GestorDeClases gc) {
        this.gc = gc;
        this.escuderia = new Escuderia();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarPaises();
        cargarTabla();
    }

    private void reiniciarCampos() {
        nombreTxt.setText("");
        escuderia = new Escuderia();
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

    private void mostrarMecanicos() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE", "APELLIDO", "DNI", "PAIS", "ESPECIALIDAD", "AÑOS EXP."};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Mecanico x : escuderia.getMecanicos()) {
            fila[0] = x.getNombre();
            fila[1] = x.getApellido();
            fila[2] = x.getDni();
            fila[3] = x.getPais().getNombre();
            fila[4] = x.getEspecialidad();
            fila[5] = x.getAñosExperiencia();
            modelo.addRow(fila);
        }

        escuderiasTabla.setModel(modelo);
    }

    private void mostrarPilotos() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE", "APELLIDO", "DNI", "PAIS"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (PilotoEscuderia pe : escuderia.getPilotoEscuderia()) {
            fila[0] = pe.getPiloto().getNombre();
            fila[1] = pe.getPiloto().getApellido();
            fila[2] = pe.getPiloto().getDni();
            fila[3] = pe.getPiloto().getPais().getNombre();
            modelo.addRow(fila);
        }

        escuderiasTabla.setModel(modelo);
    }

    private void mostrarAutos() {
        modelo = new DefaultTableModel();
        String[] columnas = {"MODELO", "MOTOR", "ESCUDERIA"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Auto a : escuderia.getAutos()) {
            fila[0] = a.getModelo();
            fila[1] = a.getMotor();
            fila[2] = a.getEscuderia().getNombre();
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
        mostrarMecanicos = new javax.swing.JButton();
        agregarMecanico = new javax.swing.JButton();
        eliminarMecanico = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        mostrarPiloto = new javax.swing.JButton();
        agregarPiloto = new javax.swing.JButton();
        eliminarPiloto = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        mostrarAuto = new javax.swing.JButton();
        agregarAuto = new javax.swing.JButton();
        eliminarAuto = new javax.swing.JButton();
        reiniciarBtn = new javax.swing.JButton();

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 180));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 25));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PAIS:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 25));

        getContentPane().add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MECANICOS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 25));

        mostrarMecanicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarMecanicos.setText("MOSTRAR");
        mostrarMecanicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMecanicosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarMecanicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 100, 25));

        agregarMecanico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarMecanico.setText("AGREGAR");
        agregarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMecanicoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, 25));

        eliminarMecanico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarMecanico.setText("ELIMINAR");
        eliminarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMecanicoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 100, 25));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PILOTOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 100, 25));

        mostrarPiloto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarPiloto.setText("MOSTRAR");
        mostrarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 100, 25));

        agregarPiloto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPiloto.setText("AGREGAR");
        agregarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 25));

        eliminarPiloto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarPiloto.setText("ELIMINAR");
        eliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("AUTOS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 100, 25));

        mostrarAuto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarAuto.setText("MOSTRAR");
        mostrarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAutoActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 25));

        agregarAuto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarAuto.setText("AGREGAR");
        agregarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAutoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 100, 25));

        eliminarAuto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarAuto.setText("ELIMINAR");
        eliminarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAutoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, 25));

        reiniciarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarBtn.setText("REINICIAR");
        reiniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 100, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEscuderiaBtnActionPerformed
        String nombre = nombreTxt.getText();
        Pais pais = gc.getPaises().get(paisBox.getItemCount() - 1);

        if (!nombre.isBlank()) {
            escuderia.setNombre(nombre);
            escuderia.setPais(pais);

            gc.agregarEscuderia(escuderia);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "No puede dejar espacios en blanco.");
        }
    }//GEN-LAST:event_agregarEscuderiaBtnActionPerformed

    private void eliminarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEscuderiaBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la escuderia:");
        escuderia = gc.buscarEscuderia(nombre);

        if (escuderia != null) {
            gc.eliminarEscuderia(escuderia);
            cargarTabla();
            JOptionPane.showMessageDialog(null, "La escuderia eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La escuderia con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_eliminarEscuderiaBtnActionPerformed

    private void buscarEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEscuderiaBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la escuderia:");
        escuderia = gc.buscarEscuderia(nombre);

        if (escuderia != null) {
            nombreTxt.setText(escuderia.getNombre());
            paisBox.setSelectedItem(escuderia.getPais().getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "La escuderia con el nombre ingresado no existe.");
        }
    }//GEN-LAST:event_buscarEscuderiaBtnActionPerformed

    // ********** RELACION ESCUDERIA-MECANICO ********** //

    private void agregarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMecanicoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del mecanico:");
        Mecanico m = gc.buscarMecanico(dni);

        if (m != null) {
            escuderia.agregarMecanico(m);
            m.agregarEscuderia(escuderia);
            mostrarMecanicos();
            JOptionPane.showMessageDialog(null, "Mecánico agregado correctamente a la escudería.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el mecánico.");
        }
    }//GEN-LAST:event_agregarMecanicoActionPerformed

    private void mostrarMecanicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMecanicosActionPerformed
        mostrarMecanicos();
    }//GEN-LAST:event_mostrarMecanicosActionPerformed

    private void eliminarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMecanicoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del mecánico a eliminar:");

        boolean encontrado = false;
        for (Mecanico m : escuderia.getMecanicos()) {
            if (m.getDni().equalsIgnoreCase(dni)) {
                escuderia.borrarMecanico(m);
                m.borrarEscuderia(escuderia);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            mostrarMecanicos();
            JOptionPane.showMessageDialog(null, "Mecánico eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un mecánico con ese DNI.");
        }
    }//GEN-LAST:event_eliminarMecanicoActionPerformed

// ********** RELACION ESCUDERIA-PILOTO ********** //

    private void agregarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPilotoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del Piloto:");
        Piloto piloto = gc.buscarPiloto(dni);

        if (piloto != null) {
            PilotoEscuderia pe = new PilotoEscuderia();

            String desde = JOptionPane.showInputDialog("Ingrese la fecha de inicio:");
            String hasta = JOptionPane.showInputDialog("Ingrese la fecha de fin:");

            pe.setPiloto(piloto);
            pe.setEscuderia(escuderia);
            pe.setDesdeFecha(desde);
            pe.setHastaFecha(hasta);

            escuderia.agregarPilotoEscuderia(pe);
            piloto.agregarEscuderia(pe);
            mostrarPilotos();

            JOptionPane.showMessageDialog(null, "Piloto agregado correctamente a la escudería.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el Piloto.");
        }
    }//GEN-LAST:event_agregarPilotoActionPerformed

    private void eliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPilotoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del Piloto a eliminar:");

        boolean encontrado = false;
        for (PilotoEscuderia p : escuderia.getPilotoEscuderia()) {
            if (p.getPiloto().getDni().equalsIgnoreCase(dni)) {
                escuderia.borrarPilotoEscuderia(p);
                break;
            }
        }

        if (encontrado) {
            mostrarPilotos();
            JOptionPane.showMessageDialog(null, "Piloto eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un Piloto con ese DNI.");
        }
    }//GEN-LAST:event_eliminarPilotoActionPerformed

    private void mostrarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPilotoActionPerformed
        mostrarPilotos();
    }//GEN-LAST:event_mostrarPilotoActionPerformed

    // ********** RELACION ESCUDERIA-AUTO ********** //

    private void agregarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAutoActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el modelo del Auto:");
        Auto a = gc.buscarAuto(dni);

        if (a != null) {
            escuderia.agregarAuto(a);
            try {
                a.setEscuderia(escuderia);
            } catch (DatoInvalidoException ex) {
                Logger.getLogger(VentanaEscuderia.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrarAutos();
            JOptionPane.showMessageDialog(null, "Auto agregado correctamente a la escudería.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el Auto.");
        }
    }//GEN-LAST:event_agregarAutoActionPerformed

    private void eliminarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAutoActionPerformed
        String modeloAuto = JOptionPane.showInputDialog("Ingrese el Modelo del Auto a eliminar:");

        boolean encontrado = false;
        for (Auto a : escuderia.getAutos()) {
            if (a.getModelo().equalsIgnoreCase(modeloAuto)) {
                escuderia.borrarAuto(a);
                try {
                    a.setEscuderia(new Escuderia());
                } catch (DatoInvalidoException ex) {
                    Logger.getLogger(VentanaEscuderia.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }

        if (encontrado) {
            mostrarAutos();
            JOptionPane.showMessageDialog(null, "Auto eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un Auto con ese modelo.");
        }
    }//GEN-LAST:event_eliminarAutoActionPerformed

    private void mostrarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAutoActionPerformed
        mostrarAutos();
    }//GEN-LAST:event_mostrarAutoActionPerformed

    private void reiniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarBtnActionPerformed
        reiniciarCampos();
        cargarTabla();
    }//GEN-LAST:event_reiniciarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAuto;
    private javax.swing.JButton agregarEscuderiaBtn;
    private javax.swing.JButton agregarMecanico;
    private javax.swing.JButton agregarPiloto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarEscuderiaBtn;
    private javax.swing.JButton eliminarAuto;
    private javax.swing.JButton eliminarEscuderiaBtn;
    private javax.swing.JButton eliminarMecanico;
    private javax.swing.JButton eliminarPiloto;
    private javax.swing.JTable escuderiasTabla;
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
    private javax.swing.JButton mostrarAuto;
    private javax.swing.JButton mostrarMecanicos;
    private javax.swing.JButton mostrarPiloto;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> paisBox;
    private javax.swing.JButton reiniciarBtn;
    // End of variables declaration//GEN-END:variables
}
