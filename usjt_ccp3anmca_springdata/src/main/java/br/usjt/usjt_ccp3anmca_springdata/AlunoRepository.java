package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.Future;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	@Async
	public Future < List <Aluno> > findByNome (String nome);

	public List<Aluno> buscarPeloEmail(String string);
	public List<Aluno> buscarPorLetraInicialDoNome(String string);
}
