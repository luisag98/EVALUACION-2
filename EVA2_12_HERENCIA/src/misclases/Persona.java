/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author Luisa María González Ordóñez
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int estadoCivil;
    private String direccion;
    
    public Persona(){
        nombre = "Isabel";
        apellido = "González";
        edad = 18;
        estadoCivil = estadocivil.soltero;
        direccion = "Calle 62 1/2 #1802 Col. Cerro de la Cruz C.P. 31460";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
