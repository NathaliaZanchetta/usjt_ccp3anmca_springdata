package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncQueryTest {
	@Autowired
	private AlunoRepository alunoRepo;

	@Test
	public void testFindAllAssincrono() throws InterruptedException, ExecutionException {
		Future<List<Aluno>> future = alunoRepo.findByNome("Ana");
		System.out.println("Código aqui");
		System.out.println("Mais coisas aqui");

		
		List<Aluno> alunos = future.get();
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
