package gui;

import servicie.GestorDeClases;

public class VentanaInicio extends javax.swing.JFrame {

    private GestorDeClases gc;

    public VentanaInicio(GestorDeClases gc) {
        this.gc = gc;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        carrerasBtn = new javax.swing.JButton();
        paisesBtn = new javax.swing.JButton();
        autosBtn = new javax.swing.JButton();
        pilotosBtn = new javax.swing.JButton();
        mecanicosBtn = new javax.swing.JButton();
        escuderiasBtn = new javax.swing.JButton();
        circuitosBtn = new javax.swing.JButton();
        informesBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Inicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡ BIENVENIDO A ESCUDERÍAS UNIDAS !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTIONA LOS DATOS DE TUS EVENTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 20));

        carrerasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carrerasBtn.setText("CARRERAS");
        carrerasBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        carrerasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrerasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(carrerasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 50));

        paisesBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paisesBtn.setText("PAISES");
        paisesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        paisesBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        paisesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(paisesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, 80));

        autosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        autosBtn.setText("AUTOS");
        autosBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        autosBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        autosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(autosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 80));

        pilotosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pilotosBtn.setText("PILOTOS");
        pilotosBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pilotosBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pilotosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pilotosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, 80));

        mecanicosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mecanicosBtn.setText("MECANICOS");
        mecanicosBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mecanicosBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mecanicosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mecanicosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mecanicosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 120, 80));

        escuderiasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        escuderiasBtn.setText("ESCUDERIAS");
        escuderiasBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        escuderiasBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        escuderiasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuderiasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(escuderiasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 80));

        circuitosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        circuitosBtn.setText("CIRCUITOS");
        circuitosBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        circuitosBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        circuitosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuitosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(circuitosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 80));

        informesBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        informesBtn.setText("INFORMES");
        informesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        informesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(informesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 50));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autosBtnActionPerformed
        this.setVisible(false);
        VentanaAuto VentanaAuto = new VentanaAuto(gc);
    }//GEN-LAST:event_autosBtnActionPerformed

    private void pilotosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilotosBtnActionPerformed
        this.setVisible(false);
        VentanaPiloto ventanaPiloto = new VentanaPiloto(gc);
    }//GEN-LAST:event_pilotosBtnActionPerformed

    private void mecanicosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mecanicosBtnActionPerformed
        this.setVisible(false);
        VentanaMecanico ventanaMecanico = new VentanaMecanico(gc);
    }//GEN-LAST:event_mecanicosBtnActionPerformed

    private void carrerasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrerasBtnActionPerformed
        this.setVisible(false);
        VentanaCarrera ventanaCarrera = new VentanaCarrera(gc);
    }//GEN-LAST:event_carrerasBtnActionPerformed

    private void escuderiasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escuderiasBtnActionPerformed
        this.setVisible(false);
        VentanaEscuderia ventanaEscuderia = new VentanaEscuderia(gc);
    }//GEN-LAST:event_escuderiasBtnActionPerformed

    private void circuitosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuitosBtnActionPerformed
        this.setVisible(false);
        VentanaCircuito ventanaCircuito = new VentanaCircuito(gc);
    }//GEN-LAST:event_circuitosBtnActionPerformed

    private void paisesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisesBtnActionPerformed
        this.setVisible(false);
        VentanaPais ventanaPaises = new VentanaPais(gc);
    }//GEN-LAST:event_paisesBtnActionPerformed

    private void informesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informesBtnActionPerformed
        this.setVisible(false);
        //VentanaInforme ventanaInformes = new VentanaInforme(gc);
    }//GEN-LAST:event_informesBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autosBtn;
    private javax.swing.JButton carrerasBtn;
    private javax.swing.JButton circuitosBtn;
    private javax.swing.JButton escuderiasBtn;
    private javax.swing.JButton informesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mecanicosBtn;
    private javax.swing.JButton paisesBtn;
    private javax.swing.JButton pilotosBtn;
    // End of variables declaration//GEN-END:variables
}
