package it.prova.gestionemunicipiospringdatamaven.repository.abitante;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.prova.gestionemunicipiospringdatamaven.model.Abitante;

public interface AbitanteRepository extends CrudRepository<Abitante, Long> {

	// la query viene costruita in automatico!!!
	List<Abitante> findByNome(String name);

	// Anche questa!!!
	List<Abitante> findByEtaGreaterThan(int etaInput);

	// Combinazione di campi!!! (Come i dynamic finders)
	List<Abitante> findByNomeAndEta(String nome, int eta);

	// Order by!!!!
	List<Abitante> findByEtaOrderByNomeDesc(int eta);
	
	 //se ho necessità particolari
	 @Query("from Abitante p where p.nome like ?1%")
	 List<Abitante> findByNomeStartsWith(String token);

}
