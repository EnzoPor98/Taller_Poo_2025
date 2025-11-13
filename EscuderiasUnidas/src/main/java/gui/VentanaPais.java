package gui;

import exceptions.DatoInvalidoException;
import exceptions.FormatoIncorrectoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Carrera;
import logica.Circuito;
import logica.Escuderia;
import logica.Pais;
import logica.Persona;
import logica.Piloto;
import servicie.GestorDeClases;

public class VentanaPais extends javax.swing.JFrame {

    private Pais pais;
    private GestorDeClases gc;
    private DefaultTableModel modelo;

    public VentanaPais(GestorDeClases gc) {
        this.gc = gc;
        this.pais = new Pais();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        cargarTabla();
    }

    private void reiniciarCampos() {
        pais = new Pais();
        idEtiq.setText("ID: ");
        nombreTxt.setText("");
        descripcionTxt.setText("");
    }

    private void cargarTabla() {
        modelo = new DefaultTableModel();
        String[] columnas = {"ID", "NOMBRE", "DESCRIPCION"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Pais x : gc.getPaises()) {
            fila[0] = x.getIdPais();
            fila[1] = x.getNombre();
            fila[2] = x.getDescripcion();
            modelo.addRow(fila);
        }

        paisesTabla.setModel(modelo);
    }

    private void mostrarCircuitos() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE", "LONGITUD"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Circuito x : pais.getCircuitos()) {
            fila[0] = x.getNombre();
            fila[1] = x.getLongitud();
            modelo.addRow(fila);
        }

        paisesTabla.setModel(modelo);
    }

    private void mostrarCarreras() {
        modelo = new DefaultTableModel();
        String[] columnas = {"CIRCUITO", "VUELTAS", "FECHA", "HORA"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Carrera x : pais.getCarreras()) {
            fila[0] = x.getCircuito().getNombre();
            fila[1] = x.getNumeroVueltas();
            fila[2] = x.getFechaRealizacion();
            fila[3] = x.getHoraRealizacion();
            modelo.addRow(fila);
        }

        paisesTabla.setModel(modelo);
    }

    private void mostrarEscuderias() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Escuderia x : pais.getEscuderias()) {
            fila[0] = x.getNombre();
            modelo.addRow(fila);
        }

        paisesTabla.setModel(modelo);
    }

    private void mostrarPersonas() {
        modelo = new DefaultTableModel();
        String[] columnas = {"NOMBRE", "APELLIDO", "DNI", "ROL"};
        modelo.setColumnIdentifiers(columnas);
        Object[] fila = new Object[modelo.getColumnCount()];

        modelo.setRowCount(0);
        for (Persona x : pais.getPersonas()) {
            fila[0] = x.getNombre();
            fila[1] = x.getApellido();
            fila[2] = x.getDni();
            if (x instanceof Piloto) {
                fila[3] = "PILOTO";
            } else {
                fila[3] = "MECANICO";
            }
            modelo.addRow(fila);
        }

        paisesTabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        buscarPaisBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        agregarPaisBtn = new javax.swing.JButton();
        eliminarPaisBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        idEtiq = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descripcionTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        paisesTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        reiniciarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mostrarCircuitosBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mostrarCarrerasBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mostrarEscuderiasBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mostrarPersonasBtn = new javax.swing.JButton();

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

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESA LOS DATOS DE LOS PAISES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 700, 25));

        buscarPaisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarPaisBtn.setText("BUSCAR");
        buscarPaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPaisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPaisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 10, 180));

        agregarPaisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPaisBtn.setText("AGREGAR");
        agregarPaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPaisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPaisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 25));

        eliminarPaisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarPaisBtn.setText("ELIMINAR");
        eliminarPaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPaisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPaisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 110, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GESTION PAISES");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 25));

        idEtiq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idEtiq.setText("ID:");
        getContentPane().add(idEtiq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CIRCUITOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, 25));
        getContentPane().add(descripcionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 540, 25));

        paisesTabla.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paisesTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 350));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NOMBRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 25));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 320, 25));

        reiniciarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarBtn.setText("REINICIAR");
        reiniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DESCRIPCION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 25));

        mostrarCircuitosBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarCircuitosBtn.setText("MOSTRAR");
        mostrarCircuitosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCircuitosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarCircuitosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CARRERAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 25));

        mostrarCarrerasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarCarrerasBtn.setText("MOSTRAR");
        mostrarCarrerasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCarrerasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarCarrerasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ESCUDERIAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 90, 25));

        mostrarEscuderiasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarEscuderiasBtn.setText("MOSTRAR");
        mostrarEscuderiasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEscuderiasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarEscuderiasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PILOTOS/MECANICOS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 130, 25));

        mostrarPersonasBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarPersonasBtn.setText("MOSTRAR");
        mostrarPersonasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPersonasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPersonasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaInicio inicio = new VentanaInicio(gc);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void agregarPaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPaisBtnActionPerformed
        int id = gc.getPaises().getLast().getIdPais() + 1;
        String descripcion = descripcionTxt.getText();
        String nombre = nombreTxt.getText();

        try {
            pais.setIdPais(id);
            pais.setNombre(nombre);
            pais.setDescripcion(descripcion);

            gc.agregarPais(pais);
            cargarTabla();
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_agregarPaisBtnActionPerformed

    private void eliminarPaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPaisBtnActionPerformed
        try {
            String num = JOptionPane.showInputDialog("Ingrese ID del pais:");

            if (!num.matches("\\d+")) {
                throw new FormatoIncorrectoException();
            }

            int id = Integer.parseInt(num);
            pais = gc.buscarPais(id);

            if (pais != null) {

                gc.eliminarPais(pais);
                cargarTabla();

            } else {
                JOptionPane.showMessageDialog(null, "El pais con el ID ingresado no existe.");
            }
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_eliminarPaisBtnActionPerformed

    private void buscarPaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPaisBtnActionPerformed
        try {
            String num = JOptionPane.showInputDialog("Ingrese ID del pais:");

            if (!num.matches("\\d+")) {
                throw new FormatoIncorrectoException();
            }

            int id = Integer.parseInt(num);
            pais = gc.buscarPais(id);

            if (pais != null) {
                idEtiq.setText("ID: " + Integer.toString(pais.getIdPais()));
                nombreTxt.setText(pais.getNombre());
                descripcionTxt.setText(pais.getDescripcion());
            } else {
                JOptionPane.showMessageDialog(null, "El pais con el ID ingresado no existe.");
            }
        } catch (DatoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        } catch (FormatoIncorrectoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMensaje());
        }
    }//GEN-LAST:event_buscarPaisBtnActionPerformed

    private void reiniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarBtnActionPerformed
        reiniciarCampos();
        cargarTabla();
    }//GEN-LAST:event_reiniciarBtnActionPerformed

    private void mostrarCircuitosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCircuitosBtnActionPerformed
        mostrarCircuitos();
    }//GEN-LAST:event_mostrarCircuitosBtnActionPerformed

    private void mostrarCarrerasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCarrerasBtnActionPerformed
        mostrarCarreras();
    }//GEN-LAST:event_mostrarCarrerasBtnActionPerformed

    private void mostrarEscuderiasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEscuderiasBtnActionPerformed
        mostrarEscuderias();
    }//GEN-LAST:event_mostrarEscuderiasBtnActionPerformed

    private void mostrarPersonasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPersonasBtnActionPerformed
        mostrarPersonas();
    }//GEN-LAST:event_mostrarPersonasBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPaisBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buscarPaisBtn;
    private javax.swing.JTextField descripcionTxt;
    private javax.swing.JButton eliminarPaisBtn;
    private javax.swing.JLabel idEtiq;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton mostrarCarrerasBtn;
    private javax.swing.JButton mostrarCircuitosBtn;
    private javax.swing.JButton mostrarEscuderiasBtn;
    private javax.swing.JButton mostrarPersonasBtn;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTable paisesTabla;
    private javax.swing.JButton reiniciarBtn;
    // End of variables declaration//GEN-END:variables
}
