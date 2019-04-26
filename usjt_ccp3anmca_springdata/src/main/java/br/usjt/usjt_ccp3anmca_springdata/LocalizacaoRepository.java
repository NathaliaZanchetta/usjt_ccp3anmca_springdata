package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.Future;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

public interface LocalizacaoRepository extends JpaRepository<LocalizacaoRepository, Long>{

	
	@Async
	public Future <Localizacao> findByCidadeAsyc (String cidade);
	public Future <Localizacao> findByLatitudeELongitudeAsyc(String cidade);
	
	//@NamedQuery
	public Localizacao buscaPorCidadeNQ ( @Param ("Cidade") String cidade);
	public Localizacao buscaPorLatitudeELongitudeNQ ( @Param ("Latitude" ) int latitude,
			                                        @Param ("Longitude") int longitude);
	
	@Query("SELECT l FROM Localizacao l WHERE cidade = :cidade")
	public Localizacao buscaPorCidade ( @Param ("Cidade") String cidade);
	
	@Query ("SELECT l FROM Localizacao l WHERE latitude = :latitude AND longitude = :longitude")
	public Localizacao buscaPorLatitudeELongitude ( @Param ("Latitude" ) int latitude,
			                                        @Param ("Longitude") int longitude);
	
	
	
}
