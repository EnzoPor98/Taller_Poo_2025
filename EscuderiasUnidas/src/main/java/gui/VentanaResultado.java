package gui;

import exceptions.DatoInvalidoException;
import exceptions.FormatoIncorrectoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.*;
import javax.swing.table.DefaultTableModel;
import servicie.GestorDeClases;

public class VentanaResultado extends javax.swing.JFrame {

    private GestorDeClases gc;
    private Carrera carrera;
    private Resultado resultado;
    private DefaultTableModel modelo;
    private ArrayList<AutoPiloto> lista;

    public VentanaResultado(GestorDeClases gc, Carrera carrera) {
        this.gc = gc;
        this.carrera = carrera;
        this.resultado = carrera.getResultado();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarTabla();
        cargarPilotos();
        cargarDatosCarrera();
    }

    private void cargarDatosCarrera() {
        circuitoEtiq.setText("CIRCUITO: " + carrera.getCircuito().getNombre());
        fechaEtiq.setText("FECHA: " + carrera.getFechaRealizacion());
        horaEtiq.setText("HORA: " + carrera.getHoraRealizacion());
        paisEtiq.setText("PAIS: " + carrera.getPais().getNombre());
        vueltasEtiq.setText("VUELTAS: " + carrera.getNumeroVueltas());
    }

    private void cargarPilotos() {
        if (!carrera.getAutoPiloto().isEmpty()) {
            for (AutoPiloto x : carrera.getAutoPiloto()) {
                String nombre = x.getPiloto().getNombreCompleto();
                pilotosBox.addItem(nombre);
            }
        }
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"POSICION", "ESCUDERIA", "PILOTO", "VUELTA"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        int size = resultado.getParticipantes().size();
        for (int i = 0; i < size; i++) {
            fila[0] = i + 1;
            fila[1] = resultado.getParticipantes().get(i).getAuto().getEscuderia().getNombre();
            fila[2] = resultado.getParticipantes().get(i).getPiloto().getNombreCompleto();
            fila[3] = resultado.getVueltas().get(i);
            modelo.addRow(fila);
        }

        resultadosTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        eliminarPilotoBtn = new javax.swing.JButton();
        eliminarResultadoBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadosTabla = new javax.swing.JTable();
        paisEtiq = new javax.swing.JLabel();
        circuitoEtiq = new javax.swing.JLabel();
        fechaEtiq = new javax.swing.JLabel();
        horaEtiq = new javax.swing.JLabel();
        agregarPilotoBtn = new javax.swing.JButton();
        pilotosBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        vueltaTxt = new javax.swing.JTextField();
        confirmarResultadoBtn = new javax.swing.JButton();
        vueltasEtiq = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Resultados");
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
        jLabel2.setText("INGRESA LOS DATOS DE LOS RESULTADOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 140));

        eliminarPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarPilotoBtn.setText("ELIMINAR");
        eliminarPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 100, 25));

        eliminarResultadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarResultadoBtn.setText("ELIMINAR");
        eliminarResultadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarResultadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarResultadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 110, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GESTION RESULTADOS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        resultadosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "POSICION", "PILOTO", "ESCUDERIA", "VUELTA RAPIDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultadosTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 390));

        paisEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paisEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paisEtiq.setText("PAIS:");
        paisEtiq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(paisEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, 25));

        circuitoEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        circuitoEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        circuitoEtiq.setText("CIRCUITO:");
        circuitoEtiq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(circuitoEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 25));

        fechaEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fechaEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fechaEtiq.setText("FECHA:");
        fechaEtiq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fechaEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, 25));

        horaEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        horaEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        horaEtiq.setText("HORA:");
        horaEtiq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(horaEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 25));

        agregarPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPilotoBtn.setText("AGREGAR");
        agregarPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 25));

        getContentPane().add(pilotosBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 210, 25));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("PILOTO:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 25));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("VUELTA RAPIDA:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 100, 25));
        getContentPane().add(vueltaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, 25));

        confirmarResultadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmarResultadoBtn.setText("CONFIRMAR");
        confirmarResultadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarResultadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarResultadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 110, 25));

        vueltasEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vueltasEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vueltasEtiq.setText("VUELTAS:");
        vueltasEtiq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vueltasEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void confirmarResultadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarResultadoBtnActionPerformed
        if (resultado.getParticipantes().size() == 10
                && resultado.getVueltas().size() == 10) {
            try {
                carrera.setResultado(resultado);
                resultado.actualizarDatosPilotos();
                this.setVisible(false);
            } catch (DatoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensaje());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes completar la tabla de resultados para confirmar.");
        }
    }//GEN-LAST:event_confirmarResultadoBtnActionPerformed

    private void eliminarResultadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarResultadoBtnActionPerformed
        try {
            resultado = new Resultado();
            carrera.setResultado(resultado);
            cargarTabla();
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarResultadoBtnActionPerformed

    private void agregarPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPilotoBtnActionPerformed
        if (resultado.getParticipantes().size() == 10 && resultado.getVueltas().size() == 10) {
            JOptionPane.showMessageDialog(null, "Solo pueden agregarse 10 resultados.");
        } else {
            try {
                String vuelta = vueltaTxt.getText();
                if (!vuelta.matches("\\d{2}:\\d{2}:\\d{2}")) {
                    throw new FormatoIncorrectoException();
                }
                int indice = pilotosBox.getSelectedIndex();
                AutoPiloto ap = carrera.getAutoPiloto().get(indice);
                resultado.agregarParticipante(ap);
                resultado.agregarVuelta(vuelta);
                cargarTabla();
            } catch (DatoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensaje());
            } catch (FormatoIncorrectoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensaje());
            }
        }
    }//GEN-LAST:event_agregarPilotoBtnActionPerformed

    private void eliminarPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPilotoBtnActionPerformed
        try {
            String index = JOptionPane.showInputDialog("Ingresar posicion que desea eliminar.");
            if (!index.matches("\\d+")) {
                throw new FormatoIncorrectoException();
            }

            int indice = Integer.parseInt(index);
            resultado.borrarParticipante(indice - 1);
            resultado.borrarVuelta(indice - 1);
            cargarTabla();
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarPilotoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPilotoBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel circuitoEtiq;
    private javax.swing.JButton confirmarResultadoBtn;
    private javax.swing.JButton eliminarPilotoBtn;
    private javax.swing.JButton eliminarResultadoBtn;
    private javax.swing.JLabel fechaEtiq;
    private javax.swing.JLabel horaEtiq;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel paisEtiq;
    private javax.swing.JComboBox<String> pilotosBox;
    private javax.swing.JTable resultadosTabla;
    private javax.swing.JTextField vueltaTxt;
    private javax.swing.JLabel vueltasEtiq;
    // End of variables declaration//GEN-END:variables
}
