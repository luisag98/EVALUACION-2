
import misclases.Clientes;
import misclases.Empleados;
import misclases.Persona;
import misclases.estadocivil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa María González Ordóñez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pObj = new Persona();
        System.out.println(pObj.getNombre()+ " "+ pObj.getApellido()+" "+pObj.getDireccion());
        /*
        pObj.setNombre("Luisa María González Ordóñez");
        pObj.setEstadoCivil(estadocivil.soltero);
        */
        Empleados eObj = new Empleados();
        System.out.println(eObj.getNombre()+ " "+ eObj.getApellido()+" "+eObj.getDireccion());
        /*
        eObj.setNombre("Juan");
        eObj.setApellido("González Aragón");
        eObj.setEstadoCivil(estadocivil.casado);
        */
        eObj.setSalario(1);
        Clientes cObj = new Clientes();
        System.out.println(cObj.getNombre()+ " "+ cObj.getApellido()+" "+cObj.getDireccion());
        /*
        cObj.setNombre("Pedro");
        cObj.setRfc("");
        */
        
    }
    
}
