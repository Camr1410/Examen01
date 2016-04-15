/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_MantenimientoPrestamoLibros;

/**
 *
 * @author Carlos
 */
public class Panel_Botones extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Botones
     */
    public Panel_Botones() {
        initComponents();
        this.btn_Agregar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
    }
    
    public void agregarEventos(Controlador_FRM_MantenimientoPrestamoLibros controlador) {
        this.btn_Buscar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    
    public void habilitarAgregar() {
        this.btn_Agregar.setEnabled(true);
    }
    
    public void deshabilitarAgregar() {
        this.btn_Agregar.setEnabled(false);
    }
    
    public void habilitarBuscar() {
        this.btn_Buscar.setEnabled(true);
    }
    
    public void deshabilitarBuscar() {
        this.btn_Buscar.setEnabled(false);
    }
    
    public void habilitarEdicion() {
        this.btn_Modificar.setEnabled(true);
        this.btn_Eliminar.setEnabled(true);
    }
    
    public void deshabilitarEdicion() {
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Buscar.setText("Buscar");

        btn_Agregar.setText("Agregar");

        btn_Modificar.setText("Modificar");

        btn_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Buscar)
                .addGap(18, 18, 18)
                .addComponent(btn_Agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_Modificar)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
