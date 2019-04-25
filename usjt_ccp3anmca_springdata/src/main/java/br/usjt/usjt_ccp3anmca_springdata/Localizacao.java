package br.usjt.usjt_ccp3anmca_springdata;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQuery (name = "Localizacao.buscaPorCidade", 
             query = "SELECT l FROM Localizacao l WHERE cidade = :cidade")

@NamedQuery (name = "Localizacao.buscaPorLatitudeELongitude", 
             query = "SELECT l FROM Localizacao l WHERE latitude = :latitude AND longitude = :longitude")


@Entity
@Table(name = "tb_Localizacao")
public class Localizacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int latitude;
	private int longitude;
	private String cidade;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLatitude() {
		return latitude;
	}
	
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	
	public int getLongitude() {
		return longitude;
	}
	
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
