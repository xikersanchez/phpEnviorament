package crud.api.saskibaloia.services;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.api.saskibaloia.emailSender.EmailSenderService;
import crud.api.saskibaloia.models.ErabiltzaileaModel;
import crud.api.saskibaloia.repositories.IErabiltzaileaRepositorie;

@Service
public class ErabiltzaileaService {
    
    @Autowired
    private IErabiltzaileaRepositorie erabiltzaileaRepositorie;

    @Autowired
	private EmailSenderService senderService;

    public ArrayList<ErabiltzaileaModel> getErabiltzaileak () {
        return (ArrayList<ErabiltzaileaModel>) erabiltzaileaRepositorie.findAll();
    }

    public String balidatuKorreoa(String email) {
        String kodeaUkerak = "QWERTYUIOPASDFGHJKLÑZXCVBNM1234567890";
        String authCode = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            authCode += kodeaUkerak.charAt(random.nextInt(kodeaUkerak.length()-1));
        }
        senderService.sendMail(email, "Autentifikazio kodea", "Zure autentifikazio kodea: " + authCode);
        System.out.println( email + " erabiltzaileari "+ authCode +" kodea bidali da!");
        return authCode;
    }

    public void gordeErabiltzailea(ErabiltzaileaModel erabiltzailea) {
        if (erabiltzailea != null) {
            erabiltzaileaRepositorie.save(erabiltzailea);
        }
        // TODO crear un erro si este es null
        System.out.println("Erabiltzailea gorde da!");
    }


}
 