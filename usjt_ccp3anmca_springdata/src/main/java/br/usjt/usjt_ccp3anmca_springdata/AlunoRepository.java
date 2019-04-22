package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public Aluno findByEmail (String email);
	public Aluno getByEmail (String email);
	public int countByEmail (String email);
	
	@Transactional
	public long deleteByFone (String fone);
	public List <Aluno> queryByNome (String nome);
}
