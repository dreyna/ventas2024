
package pe.edu.ventas.config;

import com.google.gson.Gson;
import pe.edu.ventas.dao.CategoriaDao;
import pe.edu.ventas.dao.ProductoDao;
import pe.edu.ventas.daoImpl.CategoriaDaoImpl;
import pe.edu.ventas.daoImpl.ProductoDaoImpl;

/**
 *
 * @author ProfCisco
 */
public class Test {
  static Gson g = new Gson();
  static ProductoDao pdao = new ProductoDaoImpl();
  static CategoriaDao cdao = new CategoriaDaoImpl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       if(Conexion.getConexion()!=null){
           System.out.println("Conectado");
       }else{
           System.out.println("No Conectado");
       }
        System.out.println(g.toJson(cdao.readAll()));
    }
    
}
