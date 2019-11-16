package industria.resources;

import industria.model.Disquera;
import industria.respository.DAODisquera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DisqueraResource {

    @Autowired
    private DAODisquera daoDisquera;

    @RequestMapping(value = "/disqueras", method = RequestMethod.GET)
    public List<Disquera> disqueras(){
        return daoDisquera.getAllDisquera();
    }

    @RequestMapping(value = "/disquera/{disquera}", method = RequestMethod.GET)
    public Disquera disquera(@PathVariable(value = "disquera")String disquera){
        return daoDisquera.getDisquera(disquera);
    }

    @RequestMapping(value = "/disquera", method = RequestMethod.POST)
    public Disquera insertDisquera(@RequestBody Disquera disquera){
        daoDisquera.insertDisquera(disquera);
        return disquera;
    }

    @RequestMapping(value = "/disquera/{disquera}", method = RequestMethod.PUT)
    public Disquera updateDisquera(@PathVariable("disquera") String disqueraNombre,
                                   @RequestParam("pais") String disqueraPais,
                                   @RequestBody Disquera disquera){
        daoDisquera.updateDisquera(disqueraNombre,disqueraPais,disquera);
        return disquera;
    }

    @RequestMapping(value = "/{disquera}/{pais}/disquera", method = RequestMethod.DELETE)
    public Disquera deleteDisquera(@PathVariable("disquera") String disqueraNombre,
                                   @PathVariable("pais") String disqueraPais,
                                   @RequestBody Disquera disquera){
        daoDisquera.updateDisquera(disqueraNombre,disqueraPais,disquera);
        return disquera;
    }
}
