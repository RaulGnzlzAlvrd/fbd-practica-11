package industria.respository.impl;

import industria.config.DBConfig;
import industria.model.Disco;
import industria.respository.DAODisco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@PropertySource("classpath:application.queries.properties")
public class DAODiscoImpl implements DAODisco {
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
    public List<Disco> getAllDiscos() {
        //Leo query a ejecutar
        String query = env.getProperty("allDiscos");
        //Preparo respuesta
        List<Disco> discoList = new ArrayList<>();
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
                Disco disco = new Disco(
                        rs.getInt("num_ref")
                        , rs.getString("album")
                        , rs.getString("genero")
                        , rs.getString("fecha_l")
                        , rs.getString("disquera")
                        , rs.getString("pais_disquera")
                        , rs.getString("nombre_int")
                );
                //agrego objeto a resultado
                discoList.add(disco);
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
        return discoList;
    }

    // TODO: Implementar este método
    public List<Disco> getDiscosByNombreInterp(String nombreInterp){
        List<Disco> discoList = new ArrayList<>();
        return discoList;
    }

    // TODO: Implementar este método
    public Disco insertDisco(Disco disco){
        return disco;
    }
}
