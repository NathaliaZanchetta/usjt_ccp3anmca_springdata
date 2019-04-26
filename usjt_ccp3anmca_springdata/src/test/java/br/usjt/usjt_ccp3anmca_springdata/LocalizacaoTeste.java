package br.usjt.usjt_ccp3anmca_springdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocalizacaoTeste {
	
	@Autowired
	private LocalizacaoRepository localizacaorepository;

	@Test
	public void testInsertCidade() {
		Localizacao l = new Localizacao();
		l.setCidade("São Paulo");
		l.setCidade("Rio de Janeiro");
		l.setCidade("Minas Gerais");
		l = localizacaorepository.save(l);
		System.out.println(l.getCidade());
	}
}
