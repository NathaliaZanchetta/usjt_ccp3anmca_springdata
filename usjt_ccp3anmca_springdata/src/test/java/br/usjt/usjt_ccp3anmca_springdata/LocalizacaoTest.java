package br.usjt.usjt_ccp3anmca_springdata;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocalizacaoTest {
	
	@Autowired
	private LocalizacaoRepository localizacaorepository;

	@Test
	public void testBuscaPorLatitude() {
		Optional<LocalizacaoRepository> l = localizacaorepository.findById(2L);
		System.out.println(l.get());
	}
	
	@Test
	public void testBuscaPorLongitude() {
		Optional<LocalizacaoRepository> l = localizacaorepository.findById(2L);
		System.out.println(l.get());
	}
	
	@Test
	public void testBuscaPorCidade() {
		Optional<LocalizacaoRepository> l = localizacaorepository.findById(2L);
		System.out.println(l.get());
	}
	
}
