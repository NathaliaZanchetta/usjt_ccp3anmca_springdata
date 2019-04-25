package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TesteBuscaLocalizacao {
	
	private LocalizacaoRepository Locrepository;
	
	@Test
	public void test() throws InterruptedException, ExecutionException {
		Localizacao Loc1 = Locrepository.buscaPorCidade("São Paulo");
		System.out.println(Loc1);
		Localizacao Loc2 = Locrepository.buscaPorLatitudeELongitude(2,5);
		System.out.println(Loc2);
	}

}
