package crud.api.saskibaloia.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.api.saskibaloia.models.ErabiltzaileaModel;

@Repository
public interface IErabiltzaileaRepositorie extends JpaRepository<ErabiltzaileaModel, Long>{
    
    
}
