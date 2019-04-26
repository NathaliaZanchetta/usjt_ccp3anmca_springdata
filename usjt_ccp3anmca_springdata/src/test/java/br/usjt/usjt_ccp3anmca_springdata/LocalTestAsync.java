package br.usjt.usjt_ccp3anmca_springdata;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith (SpringRunner.class)
public class LocalTestAsync {

	@Autowired
	private LocalizacaoRepository localizacaorepository;

	@Test
	public void testFindAssincronoCidade() throws InterruptedException, ExecutionException {
		Future Localizacaorepository = localizacaorepository.findByCidadeAsyc("Osasco");
		System.out.println("Cidade aqui");
	}
	
	@Test
	public void testFindAssincronoLatLong()throws InterruptedException, ExecutionException{
		Future Localizacaorepository = localizacaorepository.findByLatitudeELongitudeAsyc("Osasco");
		System.out.println("Latitude e longitude");
	}
}
