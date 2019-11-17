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
     * @param nombreInt
     * @return List<Disco>
     */
    List<Disco> getDiscosByNombreInt(String nombreInt);

    /**
     * Inserta un nuevo disco en la base de datos
     * @param disco
     * @return Disco
     */
    Disco insertDisco(Disco disco);
}
