
package pe.edu.ventas.daoImpl;


import java.util.List;
import pe.edu.ventas.dao.CategoriaDao;
import pe.edu.ventas.entity.Categoria;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pe.edu.ventas.dao.ProductoDao;
import pe.edu.ventas.entity.Producto;
import pe.edu.ventas.config.Conexion;
/**
 *
 * @author ProfCisco
 */
public class CategoriaDaoImpl implements CategoriaDao{
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    @Override
    public int create(Categoria c) {
        int x = 0;
        try {
            x =1;
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return x;
   }

    @Override
    public int update(Categoria c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categoria read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categoria> readAll() {
        List<Categoria> lista = new ArrayList<>();
        String SQL  = "select *from categoria";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Categoria c = new Categoria();
                c.setIdcategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);         
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
