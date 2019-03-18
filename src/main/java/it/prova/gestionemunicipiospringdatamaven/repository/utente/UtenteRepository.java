package it.prova.gestionemunicipiospringdatamaven.repository.utente;

import org.springframework.data.repository.CrudRepository;

import it.prova.gestionemunicipiospringdatamaven.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {

	Utente findByUsernameAndPassword(String username,String password);
}
