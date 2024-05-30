
package pe.edu.ventas.config;

/**
 *
 * @author ProfCisco
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       if(Conexion.getConexion()!=null){
           System.out.println("Conectado");
       }else{
           System.out.println("No Conectado");
       }
    }
    
}
