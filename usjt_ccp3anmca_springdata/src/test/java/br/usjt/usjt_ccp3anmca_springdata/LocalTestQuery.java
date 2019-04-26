package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LocalTestQuery {
	
	@Autowired
	private LocalizacaoRepository LocalRepo;

	@Test
	public void testLocalizacaoQuery() throws InterruptedException, ExecutionException {
		LocalizacaoRepository Loc1 = (LocalizacaoRepository) LocalRepo.buscaPorCidade("São Paulo");
		System.out.println(Loc1);
		
		LocalizacaoRepository Loc2 = (LocalizacaoRepository) LocalRepo.buscaPorLatitudeELongitude(5,6);
		System.out.println(Loc2);
	}

}
