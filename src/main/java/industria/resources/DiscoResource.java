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
}