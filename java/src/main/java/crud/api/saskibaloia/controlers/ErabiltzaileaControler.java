package crud.api.saskibaloia.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.api.saskibaloia.models.ErabiltzaileaModel;
import crud.api.saskibaloia.services.ErabiltzaileaService;

@RestController
@RequestMapping("/erabiltzailea")
public class ErabiltzaileaControler {
    
    @Autowired
    private ErabiltzaileaService ErabiltzaileaService;

    @PostMapping("/balidatuKorreoa")
    String balidatuKorreoa (@RequestBody String korreoa) {
        return ErabiltzaileaService.balidatuKorreoa(korreoa);
    }

    @PostMapping("/gordeErabiltzailea") 
    void gordeErabiltzailea (@RequestBody ErabiltzaileaModel erabiltzailea) {
        ErabiltzaileaService.gordeErabiltzailea(erabiltzailea);
    }

}
