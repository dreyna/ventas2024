
package pe.edu.ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ProfCisco
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    private int idproducto;
    private String nombre;
    private double precio;
    private int stock;
    private int idcategoria;
}
