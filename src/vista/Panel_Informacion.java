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
public class Panel_Informacion extends javax.swing.JPanel {
    
    Controlador_FRM_MantenimientoPrestamoLibros controlador;
            
    public Panel_Informacion() {
        initComponents();
        deshabilitarCampos();
    }
    
    public void agregarEventos(Controlador_FRM_MantenimientoPrestamoLibros controlador) {
        
        this.controlador=controlador;
    }
    
    public void colocarNumeroPrestamo(String numeroPrestamo) {
        this.jt_NumeroPrestamo.setText(numeroPrestamo);
    }
    
    public void mostrarInformacion(String arreglo[]) {
        this.jt_NombreUsuario.setText(arreglo[0]);
        this.jt_CedulaUsuario.setText(arreglo[1]);
        this.jt_IsbnLibro.setText(arreglo[2]);
    }
    
    public String[] devolverInformacion() {
        String arreglo[]= new String [4];
        
        arreglo[0]=this.jt_NumeroPrestamo.getText();
        arreglo[1]=this.jt_NombreUsuario.getText();
        arreglo[2]=this.jt_CedulaUsuario.getText();
        arreglo[3]=this.jt_IsbnLibro.getText();
        
        return arreglo;
    }
    
    public void limpiarCampos() {
        this.jt_NumeroPrestamo.setText("");
        this.jt_NombreUsuario.setText("");
        this.jt_CedulaUsuario.setText("");
        this.jt_IsbnLibro.setText("");
        habilitarCampoNumeroPrestamo();
        deshabilitarCampos();
    }
    
    public String devolverNumeroPrestamo() {
        return this.jt_NumeroPrestamo.getText();
    }
    
    public void habilitarCampoNumeroPrestamo() {
        this.jt_NumeroPrestamo.setEnabled(true);
    }
    
    public void deshabilitarCampoNumeroPrestamo() {
        this.jt_NumeroPrestamo.setEnabled(false);
    }
    
    public void habilitarCampos() {
        this.jt_NombreUsuario.setEnabled(true);
        this.jt_CedulaUsuario.setEnabled(true);
        this.jt_IsbnLibro.setEnabled(true);
    }
    
    public void deshabilitarCampos() {
        this.jt_NombreUsuario.setEnabled(false);
        this.jt_CedulaUsuario.setEnabled(false);
        this.jt_IsbnLibro.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroPrestamo = new javax.swing.JLabel();
        jl_NombreUsuario = new javax.swing.JLabel();
        jl_CedulaUsuario = new javax.swing.JLabel();
        jl_IsbnLibro = new javax.swing.JLabel();
        jt_NumeroPrestamo = new javax.swing.JTextField();
        jt_NombreUsuario = new javax.swing.JTextField();
        jt_CedulaUsuario = new javax.swing.JTextField();
        jt_IsbnLibro = new javax.swing.JTextField();

        jl_NumeroPrestamo.setText("Número de Préstamo");

        jl_NombreUsuario.setText("Nombre del Usuario");

        jl_CedulaUsuario.setText("Cédula del Usuario");

        jl_IsbnLibro.setText("ISBN del Libro");

        jt_NumeroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_NumeroPrestamoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_IsbnLibro)
                        .addGap(52, 52, 52)
                        .addComponent(jt_IsbnLibro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_CedulaUsuario)
                        .addGap(29, 29, 29)
                        .addComponent(jt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_NumeroPrestamo)
                        .addGap(18, 18, 18)
                        .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_NombreUsuario)
                        .addGap(25, 25, 25)
                        .addComponent(jt_NombreUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroPrestamo)
                    .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreUsuario)
                    .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CedulaUsuario)
                    .addComponent(jt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IsbnLibro)
                    .addComponent(jt_IsbnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NumeroPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NumeroPrestamoKeyPressed
        
      if(evt.getKeyCode()==10)
        {
            this.controlador.buscar();
        }  
    }//GEN-LAST:event_jt_NumeroPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaUsuario;
    private javax.swing.JLabel jl_IsbnLibro;
    private javax.swing.JLabel jl_NombreUsuario;
    private javax.swing.JLabel jl_NumeroPrestamo;
    private javax.swing.JTextField jt_CedulaUsuario;
    private javax.swing.JTextField jt_IsbnLibro;
    private javax.swing.JTextField jt_NombreUsuario;
    private javax.swing.JTextField jt_NumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
