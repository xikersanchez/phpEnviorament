package crud.api.saskibaloia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "erabiltzailea")
public class ErabiltzaileaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_erabiltzailea;

    private String ErabiltzaileaIzena;

    private String PertsonarenIzena;

    private String Abizena;

    private String Pasahitza;

    private String Korreoa;

    private String Mota;

    private String AutentifikazioKodea;

    public long getId_erabiltzailea() {
        return id_erabiltzailea;
    }

    public void setId_erabiltzailea(long id_erabiltzailea) {
        this.id_erabiltzailea = id_erabiltzailea;
    }

    public String getErabiltzaileaIzena() {
        return ErabiltzaileaIzena;
    }

    public void setErabiltzaileaIzena(String erabiltzaileaIzena) {
        ErabiltzaileaIzena = erabiltzaileaIzena;
    }

    public String getPertsonarenIzena() {
        return PertsonarenIzena;
    }

    public void setPertsonarenIzena(String pertsonarenIzena) {
        PertsonarenIzena = pertsonarenIzena;
    }

    public String getAbizena() {
        return Abizena;
    }

    public void setAbizena(String abizena) {
        Abizena = abizena;
    }

    public String getPasahitza() {
        return Pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        Pasahitza = pasahitza;
    }

    public String getKorreoa() {
        return Korreoa;
    }

    public void setKorreoa(String korreoa) {
        Korreoa = korreoa;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getAutentifikazioKodea() {
        return AutentifikazioKodea;
    }

    public void setAutentifikazioKodea(String autentifikazioKodea) {
        AutentifikazioKodea = autentifikazioKodea;
    }



}
