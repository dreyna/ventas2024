
package pe.edu.ventas.dao;

import java.util.List;
import pe.edu.ventas.entity.Producto;

/**
 *
 * @author ProfCisco
 */
public interface ProductoDao {
    public int create(Producto p);
    public int update(Producto p);
    public int delete(int id);
    public Producto read(int id);
    public List<Producto> readAll();
}
