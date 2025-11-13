package gui;

import java.util.*;
import exceptions.*;
import logica.*;
import servicie.GestorDeClases;
import javax.swing.JOptionPane;

public class VentanaInformes extends javax.swing.JFrame {

    private GestorDeClases gc;

    public VentanaInformes(GestorDeClases gc) {
        this.gc = gc;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        carrerasPilotoBtn = new javax.swing.JButton();
        carreraEntreFechaBtn = new javax.swing.JButton();
        mecanicosEscuderiaBtn = new javax.swing.JButton();
        rankingPilotosBtn = new javax.swing.JButton();
        podiosVictoriasPilotoSBtn = new javax.swing.JButton();
        autosUsadosBtn = new javax.swing.JButton();
        carrerasEnCircuitoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTxt = new javax.swing.JTextArea();

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
        jLabel2.setText("SELECCIONA UNO DE LOS INFORMES QUE DESEAS GENERAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        carrerasPilotoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carrerasPilotoBtn.setText("CARRERAS DE UN PILOTO EN UN CIRCUITO");
        carrerasPilotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrerasPilotoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(carrerasPilotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 25));

        carreraEntreFechaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carreraEntreFechaBtn.setText("CARRERAS ENTRE FECHAS");
        carreraEntreFechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraEntreFechaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(carreraEntreFechaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 25));

        mecanicosEscuderiaBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mecanicosEscuderiaBtn.setText("EXP. Y ESP. DE MECANICOS DE UNA ESCUDERIA");
        mecanicosEscuderiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mecanicosEscuderiaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mecanicosEscuderiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 25));

        rankingPilotosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rankingPilotosBtn.setText("RANKING DE PILOTOS");
        rankingPilotosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingPilotosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rankingPilotosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 25));

        podiosVictoriasPilotoSBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        podiosVictoriasPilotoSBtn.setText("PODIOS Y VICTORIAS DE PILOTO/S");
        podiosVictoriasPilotoSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podiosVictoriasPilotoSBtnActionPerformed(evt);
            }
        });
        getContentPane().add(podiosVictoriasPilotoSBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 25));

        autosUsadosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        autosUsadosBtn.setText("AUTOS POR CARRERA DE UNA ESCUDERIA");
        autosUsadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autosUsadosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(autosUsadosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 25));

        carrerasEnCircuitoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carrerasEnCircuitoBtn.setText("CANTIDAD DE CARRERAS EN UN CIRCUITO");
        carrerasEnCircuitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrerasEnCircuitoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(carrerasEnCircuitoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 25));

        areaTxt.setColumns(20);
        areaTxt.setRows(5);
        jScrollPane1.setViewportView(areaTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void carreraEntreFechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraEntreFechaBtnActionPerformed
        String fechaInicio = JOptionPane.showInputDialog("Ingrese fecha de inicio (YYYY-MM-DD):");
        String fechaFin = JOptionPane.showInputDialog("Ingrese fecha de fin (YYYY-MM-DD):");
        String lista = "Carrera entre" + fechaInicio + "y" + fechaFin + ":\n\n";
        for (Carrera c : gc.getCarreras()) {
            String f = c.getFechaRealizacion();
            if (f.compareTo(fechaInicio) >= 0 && f.compareTo(fechaFin) <= 0) {
                lista += c.getCircuito().getNombre() + "(" + f + ")";
            }
        }
        if (lista.equals("")) {
            lista = "No hay carreras entre esas fechas.";
        } else {
            areaTxt.setText(lista);
        }
    }//GEN-LAST:event_carreraEntreFechaBtnActionPerformed

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    private void rankingPilotosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingPilotosBtnActionPerformed
        /*
        ArrayList<Piloto> lista = gc.getPilotos();
        Collections.sort(lista, (p1, p2) -> p2.getVictorias() - p1.getVictorias());
        String texto = "RANKING DE PILOTOS (por victorias):\n\n";
        int i = 1;
        for (Piloto p : lista) {
            texto += i + ". " + p.getNombre() + " " + p.getApellido() + " - " + p.getVictorias() + " victorias\n";
            i++;
        }
        areaTxt.setText(texto);
         */

        ArrayList<Piloto> lista = gc.getPilotos();
        Collections.sort(lista);

        String texto = "RANKING DE PILOTOS POR PUNTOS:\n\n";
        for (int i = 0; i < 9; i++) {
            Piloto p = lista.get(i);
            texto += i+1 + ". " + p.getNombreCompleto() + ": " + p.getPuntaje() + "\n";
        }

        areaTxt.setText(texto);
    }//GEN-LAST:event_rankingPilotosBtnActionPerformed

    private void podiosVictoriasPilotoSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podiosVictoriasPilotoSBtnActionPerformed
        String texto = "PODIOS Y VICTORIAS DE LOS PILOTOS:\n\n";

        for (Piloto p : gc.getPilotos()) {
            texto += p.getNombre() + " " + p.getApellido()
                    + " - Podios: " + p.getPodios()
                    + " | Victorias: " + p.getVictorias() + "\n";
        }
        areaTxt.setText(texto);
    }//GEN-LAST:event_podiosVictoriasPilotoSBtnActionPerformed

    private void autosUsadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autosUsadosBtnActionPerformed
        String nombreEsc = JOptionPane.showInputDialog("Ingrese el nombre de la escudería:");
        Escuderia e = gc.buscarEscuderia(nombreEsc);
        if (e != null) {
            String texto = "AUTOS DE LA ESCUDERÍA " + e.getNombre() + ":\n\n";
            for (Auto a : e.getAutos()) {
                texto += "- " + a.getModelo() + " (" + a.getMotor() + ")\n";
            }
            areaTxt.setText(texto);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la escudería.");
        }
    }//GEN-LAST:event_autosUsadosBtnActionPerformed

    private void mecanicosEscuderiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mecanicosEscuderiaBtnActionPerformed
        String nombreEsc = JOptionPane.showInputDialog("Ingrese el nombre de la escudería:");
        Escuderia e = gc.buscarEscuderia(nombreEsc);
        if (e != null) {
            String texto = "MECÁNICOS DE LA ESCUDERÍA " + e.getNombre() + ":\n\n";
            for (Mecanico m : e.getMecanicos()) {
                texto += "- " + m.getNombre() + " " + m.getApellido()
                        + " | " + m.getEspecialidad()
                        + " | " + m.getAñosExperiencia() + " años de experiencia\n";
            }
            areaTxt.setText(texto);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la escudería.");
        }
    }//GEN-LAST:event_mecanicosEscuderiaBtnActionPerformed

    private void carrerasPilotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrerasPilotoBtnActionPerformed
        try{
            String dni = JOptionPane.showInputDialog("Ingrese el DNI del piloto:");
            String nombreCircuito = JOptionPane.showInputDialog("Ingrese el nombre del circuito:");
            Piloto piloto = gc.buscarPiloto(dni);

            String texto = "CARRERAS DE " + piloto.getNombre() + " EN " + nombreCircuito + ":\n\n";
            for (AutoPiloto ap : piloto.getAutoPiloto()) {
                for (Carrera c : ap.getCarreras()) {
                    if (c.getCircuito().getNombre().equalsIgnoreCase(nombreCircuito)) {
                        texto += "- " + c.getFechaRealizacion() + " (" + c.getNumeroVueltas() + " vueltas)\n";
                    }
                }
            }
            areaTxt.setText(texto);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el piloto.");
        }
    }//GEN-LAST:event_carrerasPilotoBtnActionPerformed

    private void carrerasEnCircuitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrerasEnCircuitoBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del circuito:");
        int contador = 0;

        for (Carrera c : gc.getCarreras()) {
            if (c.getCircuito().getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
        }
        areaTxt.setText("El circuito " + nombre + " tiene " + contador + " carrera(s) registradas.");
    }//GEN-LAST:event_carrerasEnCircuitoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTxt;
    private javax.swing.JButton autosUsadosBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton carreraEntreFechaBtn;
    private javax.swing.JButton carrerasEnCircuitoBtn;
    private javax.swing.JButton carrerasPilotoBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mecanicosEscuderiaBtn;
    private javax.swing.JButton podiosVictoriasPilotoSBtn;
    private javax.swing.JButton rankingPilotosBtn;
    // End of variables declaration//GEN-END:variables
}
