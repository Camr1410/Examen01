/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class PrestamoLibro {
    
    private String numeroPrestamo;
    private String nombreUsuario;
    private String CedulaUsuario;
    private String isbnLibro;

    public PrestamoLibro(String numeroPrestamo, String nombreUsuario, String CedulaUsuario, String isbnLibro) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreUsuario = nombreUsuario;
        this.CedulaUsuario = CedulaUsuario;
        this.isbnLibro = isbnLibro;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return CedulaUsuario;
    }

    public void setCedulaUsuario(String CedulaUsuario) {
        this.CedulaUsuario = CedulaUsuario;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }
}
