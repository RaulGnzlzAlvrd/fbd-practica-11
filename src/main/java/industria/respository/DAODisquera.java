package industria.respository;

import industria.model.Disquera;

import java.util.List;

public interface DAODisquera {

    /**
     * Obten todos los registros de la tabla Discoteca
     * @return
     */
    List<Disquera> getAllDisquera();

    /**
     * Obtiene la informacion de una disquera
     * @param disquera
     * @return
     */
    Disquera getDisquera(String disquera);

    /**
     * Inserta una nueva disquera a la base de datos
     * @param disquera
     * @return
     */
    Disquera insertDisquera(Disquera disquera);

    /**
     * Actualiza una disquera a la base de datos
     * @param disquera
     * @return
     */
    Disquera updateDisquera(String disqueraNombre,String disqueraPais,Disquera disquera);
}
