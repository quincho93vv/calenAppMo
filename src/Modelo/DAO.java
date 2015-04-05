package Modelo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.sql.SQLException;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO extends Observable {
    
    private JdbcConnectionSource connection;
    private static final String databaseUrl = "jdbc:mysql://localhost:3306/calendar";
    private Dao<Usuario, String> daoUsuario;
    private Dao<Actividad, String> daoActividad;
    
    public DAO() {
        try {
            connection = new JdbcConnectionSource(databaseUrl);
            connection.setUsername("user");
            connection.setPassword("user");
            daoUsuario = DaoManager.createDao(connection, Usuario.class);
            daoActividad = DaoManager.createDao(connection, Actividad.class);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistrarUsuario(Usuario u) {
        try {
            daoUsuario.createOrUpdate(u);
        } catch (SQLException ex) {
            System.out.println("Error al registrar un Usuario.");
        }
    }
    
    public Usuario getUsuario(String nick) {
        Usuario u = null;
        List<Usuario> l = null;
        try {
            l = daoUsuario.queryForEq("nick", nick);
            u = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return u;
    }
    
    public void RegistrarActividad(Actividad a) {
        try {
            daoActividad.createOrUpdate(a);
        } catch (SQLException ex) {
            System.out.println("Error al registrar un Usuario.");
        }
    }
    
    public Actividad getActividad(String nombre) {
        Actividad a = null;
        List<Actividad> l = null;
        try {
            l = daoActividad.queryForEq("nombre", nombre);
            a = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public Usuario getUsuario(String nick, String pass) {
        Usuario u = null;
        List<Usuario> l = null;
        try {
            QueryBuilder<Usuario, String> queryBuilder = daoUsuario.queryBuilder();
            Where where = queryBuilder.where();
            where.eq("nick", nick);
            where.and();
            where.eq("pass", pass);
            l = queryBuilder.query();
            u = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return u;
    }
    
}
