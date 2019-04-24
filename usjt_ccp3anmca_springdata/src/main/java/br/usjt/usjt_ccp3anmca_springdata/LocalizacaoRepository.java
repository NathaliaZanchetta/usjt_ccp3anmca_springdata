package br.usjt.usjt_ccp3anmca_springdata;

import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

public interface LocalizacaoRepository extends JpaRepository<LocalizacaoRepository, Long>{

	
	@Async
	public Future <Localizacao> findByCidade (String cidade);
	public Future <Localizacao> findByLatitudeELongitude(String cidade);
	
	public Localizacao buscaPorCidade   (String cidade);
	public Localizacao buscaPorLatitudeELongitude ( int latitude, int longitude);
	
}
