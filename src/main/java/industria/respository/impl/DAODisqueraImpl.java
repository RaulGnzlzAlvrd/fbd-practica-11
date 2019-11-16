package industria.respository.impl;

import industria.config.DBConfig;
import industria.model.Disquera;
import industria.respository.DAODisquera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@PropertySource("classpath:application.queries.properties")
public class DAODisqueraImpl implements DAODisquera {
    //Se inyecta configuracion de la base de datos
    @Autowired
    private DBConfig dbConfig;
    //Objeto que ayuda a cargar configuracion
    @Autowired
    private Environment env;
    //Objeto para crear la conexión
    private Connection connection;
    //Objeto para executar queries
    private Statement stmt;
    //Objeto para prepara un query para ejecución
    PreparedStatement ps;
    // F9 para saltar al siguiente punto de debug
    //F8 para saltar a la siguiente linea de debug
    public List<Disquera> getAllDisquera() {
        //Leo query a ejecutar
        String query = env.getProperty("allDisqueras");
        //Preparo respuesta
        List<Disquera> disqueraList = new ArrayList<Disquera>();
        try {
            //Genero conexion
            connection = dbConfig.dataSource().getConnection();
            //Preparo base de datos para una instruccion
            stmt = connection.createStatement();
            //Ejecuto Query
            ResultSet rs = stmt.executeQuery(query);
            //Itero resultado
            while (rs.next()) {
                //Mappeo objetos de la base renglon por renglon
                Disquera disquera = new Disquera(
                        rs.getString("DISQUERA")
                        , rs.getString("PAIS")
                        , rs.getString("DIRECCION")
                        , rs.getString("TELEFONO"));
                //agrego objeto a resultado
                disqueraList.add(disquera);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return disqueraList;
    }

    public Disquera getDisquera(String disqueraNombre) {
        //Leo query a ejecutar
        String query = env.getProperty("disquera");
        //Preparo respuesta
        Disquera disquera = new Disquera();
        try {
            //Genero conexion
            connection = dbConfig.dataSource().getConnection();
            //Preparo base de datos para una instruccion
            ps =  connection.prepareStatement(query);
            ps.setString(1,disqueraNombre);
            //Ejecuto Query
            ResultSet rs = ps.executeQuery();
            //Itero resultado
            while (rs.next()) {
                //Mappeo objetos de la base renglon por renglon
                disquera = new Disquera(
                        rs.getString("DISQUERA")
                        , rs.getString("PAIS")
                        , rs.getString("DIRECCION")
                        , rs.getString("TELEFONO"));
                //agrego objeto a resultado
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return disquera;
    }

    public Disquera insertDisquera(Disquera disquera){
        String query = env.getProperty("insertDisquera");
        try {
            connection = dbConfig.dataSource().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,disquera.getDisquera());
            ps.setString(2,disquera.getPais());
            ps.setString(3,disquera.getDireccion());
            ps.setString(4,disquera.getTelefono());
            ps.executeUpdate();
            connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return disquera;
    }

    public Disquera updateDisquera(String disqueraNombre, String disqueraPais, Disquera disquera){
        String query = env.getProperty("updateDisquera");
        try {
            connection = dbConfig.dataSource().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,disquera.getDisquera());
            ps.setString(2,disquera.getPais());
            ps.setString(3,disquera.getDireccion());
            ps.setString(4,disquera.getTelefono());
            ps.setString(5,disqueraNombre);
            ps.setString(6,disqueraPais);
            ps.executeUpdate();
            connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return disquera;
    }
}
