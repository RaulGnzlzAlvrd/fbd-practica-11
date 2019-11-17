package industria.respository;

import industria.model.Disco;

import java.util.List;

public interface DAODisco {

    /**
     * Obten todos los registros de la tabla Disco
     * @return List<Disco>
     */
    List<Disco> getAllDiscos();

    /**
     * Obtiene todos los registros de la tabla Disco asociadas un nombreInterp
     * @param nombreInterp
     * @return List<Disco>
     */
    List<Disco> getDiscosByNombreInterp(String nombreInterp);

    /**
     * Inserta un nuevo disco en la base de datos
     * @param disco
     * @return Disco
     */
    Disco insertDisco(Disco disco);
}
