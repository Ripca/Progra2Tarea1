/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author VELA
 */
public class Empleado extends Persona {
    private String codigo;

    public Empleado(){
    }
    
    public Empleado(String codigo, String nombres, String apellidos, String direccion, int telefono, String fec_nac) {
        super(nombres, apellidos, direccion, telefono, fec_nac);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
