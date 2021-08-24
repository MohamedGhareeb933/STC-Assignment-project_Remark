package management.controller;

import management.dto.JBody;
import management.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/patient", method = RequestMethod.POST)
public class PatientController {

    private EntityService entityService;

    @Autowired
    public PatientController(EntityService entityService) {
        this.entityService = entityService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String AddAppointment(@RequestBody JBody body) {

        return entityService.addAppointment(body);
    }

}
