package industria.resources;

import industria.model.Disco;
import industria.respository.DAODisco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiscoResource {

    @Autowired
    private DAODisco daoDisco;

    @RequestMapping(value = "/discos", method = RequestMethod.GET)
    public List<Disco> discos() {
        return daoDisco.getAllDiscos();
    }

    @RequestMapping(value = "/discosInterprete/{interprete}", method = RequestMethod.GET)
    public List<Disco> getDiscosByNombreInt(@PathVariable(value = "interprete")String interprete){
        return daoDisco.getDiscosByNombreInt(interprete);
    }

    @RequestMapping(value = "/disco", method = RequestMethod.POST)
    public Disco insertDisco(@RequestBody Disco disco){
        daoDisco.insertDisco(disco);
        return disco;
    }
}