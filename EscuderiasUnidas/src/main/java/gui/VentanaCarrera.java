package gui;

import logica.*;
import servicie.GestorDeClases;

public class VentanaCarrera extends javax.swing.JFrame {

    private GestorDeClases gc;

    public VentanaCarrera(GestorDeClases gc) {
        this.gc = gc;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        //cargarTabla();
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
        jTable1 = new javax.swing.JTable();
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
        eliminarCircuitoBtn = new javax.swing.JButton();
        buscarCarreraBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        paisBox = new javax.swing.JComboBox<>();
        eliminarParticipanteBtn = new javax.swing.JButton();
        eliminarCarreraBtn = new javax.swing.JButton();
        asignarResultadoBtn = new javax.swing.JButton();
        asignarCircuitoBtn = new javax.swing.JButton();

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
        getContentPane().add(agregarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 25));

        reiniciarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarCarreraBtn.setText("REINICIAR");
        getContentPane().add(reiniciarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 100, 25));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("FECHA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 25));
        getContentPane().add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 150, 25));
        getContentPane().add(horaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("HORA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("VUELTAS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 25));
        getContentPane().add(vueltasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, 25));

        circuitoEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        circuitoEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        circuitoEtiq.setText("CIRCUITO:");
        getContentPane().add(circuitoEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PARTICIPANTES");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 100, 25));

        mostrarParticipantesBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarParticipantesBtn.setText("MOSTRAR");
        getContentPane().add(mostrarParticipantesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 25));

        agregarParticipanteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarParticipanteBtn.setText("AGREGAR");
        getContentPane().add(agregarParticipanteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 100, 25));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("RESULTADO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, 25));

        mostrarResultadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarResultadoBtn.setText("MOSTRAR");
        getContentPane().add(mostrarResultadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 100, 25));

        eliminarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCircuitoBtn.setText("ASIGNAR");
        getContentPane().add(eliminarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 25));

        buscarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarCarreraBtn.setText("BUSCAR");
        getContentPane().add(buscarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("PAIS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 40, 25));

        getContentPane().add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, 25));

        eliminarParticipanteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarParticipanteBtn.setText("ELIMINAR");
        getContentPane().add(eliminarParticipanteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, 25));

        eliminarCarreraBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCarreraBtn.setText("ELIMINAR");
        getContentPane().add(eliminarCarreraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 25));

        asignarResultadoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        asignarResultadoBtn.setText("ASIGNAR");
        getContentPane().add(asignarResultadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 100, 25));

        asignarCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        asignarCircuitoBtn.setText("ASIGNAR");
        getContentPane().add(asignarCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCarreraBtn;
    private javax.swing.JButton agregarParticipanteBtn;
    private javax.swing.JButton asignarCircuitoBtn;
    private javax.swing.JButton asignarResultadoBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarCarreraBtn;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mostrarParticipantesBtn;
    private javax.swing.JButton mostrarResultadoBtn;
    private javax.swing.JComboBox<String> paisBox;
    private javax.swing.JButton reiniciarCarreraBtn;
    private javax.swing.JTextField vueltasTxt;
    // End of variables declaration//GEN-END:variables
}
