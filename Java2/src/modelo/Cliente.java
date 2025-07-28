/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author VELA
 */
public class Cliente extends Persona {
    private String nit;

    public Cliente(){
    }
    
    public Cliente(String nit, String nombres, String apellidos, String direccion, int telefono, String fec_nac) {
        super(nombres, apellidos, direccion, telefono, fec_nac);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public String[] crear(){
        
        try{
            String datos[] =new String[6];
            datos[0]=getNit();
            datos[1]=getNombres();
            datos[2]=getApellidos();
            datos[3]=getDireccion();
            datos[4]=String.valueOf(getTelefono());
            datos[5]=getFec_nac();
            return datos;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return null;

        }
        
    }
    
    
}
