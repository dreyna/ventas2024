/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ventas.daoImpl;


import java.util.List;
import pe.edu.ventas.dao.ProductoDao;
import pe.edu.ventas.entity.Producto;
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
public class ProductoDaoImpl implements ProductoDao{
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    @Override
    public int create(Producto p) {
        int x = 0;
        try {
            x =1;
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return x;
   }

    @Override
    public int update(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> readAll() {
        List<Producto> lista = new ArrayList<>();
        String SQL  = "select *from productos";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Producto p = new Producto();
                p.setIdcategoria(rs.getInt("idcategoria"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                lista.add(p);         
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
