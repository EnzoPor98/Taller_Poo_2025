package gui;

import exceptions.DatoInvalidoException;
import exceptions.FormatoIncorrectoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.*;
import servicie.GestorDeClases;

public class VentanaCarrera extends javax.swing.JFrame {

    private Carrera carrera;
    private GestorDeClases gc;
    private DefaultTableModel modelo;
    private String fecha;

    public VentanaCarrera(GestorDeClases gc) {
        this.gc = gc;
        this.carrera = new Carrera();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarTabla();
    }

    private void reiniciarCampos() {
        carrera = new Carrera();
        fechaTxt.setText("");
        horaTxt.setText("");
        vueltasTxt.setText("");
        circuitoEtiq.setText("CIRCUITO: ");
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"PAIS", "CIRCUITO", "VUELTAS", "FECHA", "HORA"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Carrera x : gc.getCarreras()) {
            fila[0] = x.getPais().getNombre();
            fila[1] = x.getCircuito().getNombre();
            fila[2] = x.getNumeroVueltas();
            fila[3] = x.getFechaRealizacion();
            fila[4] = x.getHoraRealizacion();
            modelo.addRow(fila);
        }

        carrerasTabla.setModel(modelo);
    }

    private void mostrarParticipantes() {
        modelo = new DefaultTableModel();
        String[] columnas = {"ESCUDERIA", "PILOTO", "AUTO"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (AutoPiloto x : carrera.getAutoPiloto()) {
            String nombre = x.getPiloto().getNombre() + " " + x.getPiloto().getApellido();
            String auto = x.getAuto().getModelo() + " " + x.getAuto().getMotor();
            String escuderia = x.getAuto().getEscuderia().getNombre();

            fila[0] = escuderia;
            fila[1] = nombre;
            fila[2] = auto;
            modelo.addRow(fila);
        }

        carrerasTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        agregarCarreraBtn = new javax.swing.JButton();
        reiniciarCarreraBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrerasTabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JTextField();
        horaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vueltasTxt = new javax.swing.JTextField();
        circuitoEtiq = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mostrarParticipantesBtn = new javax.swing.JButton();
        agregarParticipanteBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        mostrarResultadoBtn = new javax.swing.JButton();
        buscarCarreraBtn = new javax.swing.JButton();
        eliminarParticipanteBtn = new javax.swing.JButton();
        eliminarCarreraBtn = new javax.swing.JButton();
        asignarResultadoBtn = new javax.swing.JButton();
        eliminarCircuitoBtn = new javax.swing.JButton();
        agregarCircuitoBtn = new javax.swing.JButton();

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
        jLabel2.setText("INGRESA LOS DATOS DE LA CARRERA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 180));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTION CARRERAS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        agregarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarCarreraBtn.setText("AGREGAR");
        agregarCarreraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCarreraBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 25));

        reiniciarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarCarreraBtn.setText("REINICIAR");
        reiniciarCarreraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarCarreraBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, 25));

        carrerasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PAIS", "CIRCUITO", "FECHA", "HORA", "VUELTAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carrerasTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("FECHA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 25));
        getContentPane().add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 25));
        getContentPane().add(horaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("HORA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("VUELTAS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 25));
        getContentPane().add(vueltasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 25));

        circuitoEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        circuitoEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        circuitoEtiq.setText("CIRCUITO:");
        getContentPane().add(circuitoEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PARTICIPANTES");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, 25));

        mostrarParticipantesBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarParticipantesBtn.setText("MOSTRAR");
        mostrarParticipantesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarParticipantesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarParticipantesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, 25));

        agregarParticipanteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarParticipanteBtn.setText("AGREGAR");
        agregarParticipanteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarParticipanteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarParticipanteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 100, 25));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("RESULTADO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 100, 25));

        mostrarResultadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarResultadoBtn.setText("MOSTRAR");
        mostrarResultadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarResultadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 100, 25));

        buscarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarCarreraBtn.setText("BUSCAR");
        buscarCarreraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCarreraBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 25));

        eliminarParticipanteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarParticipanteBtn.setText("ELIMINAR");
        eliminarParticipanteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarParticipanteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarParticipanteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 100, 25));

        eliminarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCarreraBtn.setText("ELIMINAR");
        eliminarCarreraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCarreraBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 110, 25));

        asignarResultadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        asignarResultadoBtn.setText("ASIGNAR");
        asignarResultadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarResultadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(asignarResultadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 100, 25));

        eliminarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCircuitoBtn.setText("ELIMINAR");
        eliminarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 25));

        agregarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarCircuitoBtn.setText("ASIGNAR");
        agregarCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarCarreraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCarreraBtnActionPerformed
        if (gc.getCarreras().contains(carrera)) {
            JOptionPane.showMessageDialog(null, "Hay una escuderia seleccionada, presiona reiniciar.");
        } else {
            try {
                if (!gc.getCircuitos().contains(carrera.getCircuito())) {
                    throw new DatoInvalidoException("Se debe asignar un circuito a la carrera.");
                }

                if (carrera.getAutoPiloto().size() != 10) {
                    throw new DatoInvalidoException("Se deben asignar 10 participantes a la carrera.");
                }

                String fecha = fechaTxt.getText();
                String hora = horaTxt.getText();
                String vueltas = vueltasTxt.getText();

                carrera.setFechaRealizacion(fecha);
                carrera.sethoraRealizacion(hora);
                carrera.setNumeroVueltas(Integer.parseInt(vueltas));

                gc.agregarCarrera(carrera);
                cargarTabla();
                reiniciarCampos();
            } catch (DatoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensaje());
            } catch (FormatoIncorrectoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensaje());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Las vueltas deben ser un valor numerico.");
            }
        }
    }//GEN-LAST:event_agregarCarreraBtnActionPerformed

    private void eliminarCarreraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCarreraBtnActionPerformed
        try {
            String fecha = JOptionPane.showInputDialog("Ingrese fecha de la carrera:");
            String hora = JOptionPane.showInputDialog("Ingrese hora de la carrera:");

            if (!fecha.matches("\\d{4}/\\d{2}/\\d{2}") || !hora.matches("\\d{2}:\\d{2}")) {
                throw new FormatoIncorrectoException();
            }

            carrera = gc.buscarCarrera(fecha, hora);
            if (carrera != null) {
                gc.eliminarCarrera(carrera);
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se organizo carrera en las fecha y hora ingresada.");
            }
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarCarreraBtnActionPerformed

    private void buscarCarreraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCarreraBtnActionPerformed
        try {
            String fecha = JOptionPane.showInputDialog("Ingrese fecha de la carrera:");
            String hora = JOptionPane.showInputDialog("Ingrese hora de la carrera:");

            if (!fecha.matches("\\d{4}/\\d{2}/\\d{2}") || !hora.matches("\\d{2}:\\d{2}")) {
                throw new FormatoIncorrectoException();
            }

            carrera = gc.buscarCarrera(fecha, hora);
            if (carrera != null) {
                fechaTxt.setText(carrera.getFechaRealizacion());
                horaTxt.setText(carrera.getHoraRealizacion());
                vueltasTxt.setText(Integer.toString(carrera.getNumeroVueltas()));
                circuitoEtiq.setText("CIRCUITO: " + carrera.getCircuito().getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "No se organizo carrera en las fecha y hora ingresada.");
            }
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensaje());
        }
    }//GEN-LAST:event_buscarCarreraBtnActionPerformed

    private void reiniciarCarreraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarCarreraBtnActionPerformed
        reiniciarCampos();
        cargarTabla();
    }//GEN-LAST:event_reiniciarCarreraBtnActionPerformed

    // ********** RELACION CARRERA-AUTOPILOTO ********** //

    private void agregarParticipanteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarParticipanteBtnActionPerformed
        if (carrera.getAutoPiloto().size() != 10) {
            try {
                fecha = JOptionPane.showInputDialog("Ingrese la fecha de hoy:");
                String dni = JOptionPane.showInputDialog("Ingrese dni del piloto:");

                if (!dni.matches("\\d{8}")) {
                    throw new FormatoIncorrectoException();
                }

                Piloto p = gc.buscarPiloto(dni);
                if (p != null) {
                    boolean encontrado = false;
                    for (AutoPiloto ap : p.getAutoPiloto()) {
                        if (ap.getPiloto() == p && ap.getFechaAsignacion().compareTo(fecha) > 0) {
                            carrera.agregarAutoPilotoParticipante(ap);
                            encontrado = true;
                            mostrarParticipantes();
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontro el auto del piloto.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro piloto con el DNI ingresado.");
                }
            } catch (FormatoIncorrectoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensaje());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede haber mas de 10 participantes.");
        }
    }//GEN-LAST:event_agregarParticipanteBtnActionPerformed

    private void eliminarParticipanteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarParticipanteBtnActionPerformed
        if (carrera.getAutoPiloto().size() != 0) {
            String v = JOptionPane.showInputDialog(
                    "Lista de participantes:" + carrera.mostrarParticipantes() + "\n"
                    + "Ingresa el indice del participante que deseas eliminar."
            );
            int valor = Integer.parseInt(v);
            valor--;
            carrera.getAutoPiloto().remove(valor);
            mostrarParticipantes();
        } else {
            JOptionPane.showMessageDialog(null, "No hay participantes.");
        }
    }//GEN-LAST:event_eliminarParticipanteBtnActionPerformed

    private void mostrarParticipantesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarParticipantesBtnActionPerformed
        mostrarParticipantes();
    }//GEN-LAST:event_mostrarParticipantesBtnActionPerformed

    // ********** RELACION CARRERA-RESULTADO ********** //

    private void asignarResultadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarResultadoBtnActionPerformed
        VentanaResultado ventana = new VentanaResultado(gc, carrera);
    }//GEN-LAST:event_asignarResultadoBtnActionPerformed

    private void mostrarResultadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadoBtnActionPerformed
        VentanaResultado ventana = new VentanaResultado(gc, carrera);
    }//GEN-LAST:event_mostrarResultadoBtnActionPerformed

    private void agregarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCircuitoBtnActionPerformed
        String circuito = JOptionPane.showInputDialog("Ingrese el nombre del circuito:");
        Circuito c = gc.buscarCircuito(circuito);

        if (c != null) {
            try {
                carrera.setCircuito(c);
                carrera.setPais(c.getPais());
                circuitoEtiq.setText("CIRCUITO: " + c.getNombre());
            } catch (DatoInvalidoException e) {
                JOptionPane.showMessageDialog(null, e.getMensaje());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el circuito con el nombre ingresado.");
        }
    }//GEN-LAST:event_agregarCircuitoBtnActionPerformed

    private void eliminarCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCircuitoBtnActionPerformed
        try {
            carrera.setCircuito(new Circuito());
            carrera.setPais(new Pais());
            circuitoEtiq.setText("CIRCUITO: ");
        } catch (DatoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMensaje());
        }
    }//GEN-LAST:event_eliminarCircuitoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCarreraBtn;
    private javax.swing.JButton agregarCircuitoBtn;
    private javax.swing.JButton agregarParticipanteBtn;
    private javax.swing.JButton asignarResultadoBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarCarreraBtn;
    private javax.swing.JTable carrerasTabla;
    private javax.swing.JLabel circuitoEtiq;
    private javax.swing.JButton eliminarCarreraBtn;
    private javax.swing.JButton eliminarCircuitoBtn;
    private javax.swing.JButton eliminarParticipanteBtn;
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JTextField horaTxt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton mostrarParticipantesBtn;
    private javax.swing.JButton mostrarResultadoBtn;
    private javax.swing.JButton reiniciarCarreraBtn;
    private javax.swing.JTextField vueltasTxt;
    // End of variables declaration//GEN-END:variables
}
