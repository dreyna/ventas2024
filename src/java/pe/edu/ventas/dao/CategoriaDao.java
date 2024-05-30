
package pe.edu.ventas.dao;

import java.util.List;
import pe.edu.ventas.entity.Categoria;

/**
 *
 * @author ProfCisco
 */
public interface CategoriaDao {
    public int create(Categoria c);
    public int update(Categoria c);
    public int delete(int id);
    public Categoria read(int id);
    public List<Categoria> readAll();
}
