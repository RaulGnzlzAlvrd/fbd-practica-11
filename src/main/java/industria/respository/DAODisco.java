package industria.respository;

import industria.model.Disco;

import java.util.List;

public interface DAODisco {

    /**
     * Obten todos los registros de la tabla Disco
     * @return List<Disco>
     */
    List<Disco> getAllDiscos();
}
