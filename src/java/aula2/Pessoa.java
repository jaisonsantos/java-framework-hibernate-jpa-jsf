package aula2;

import java.io.Serializable;
import java.util.Date;

import aula2.Horario;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7218436701209511575L;
	
	public static int idSource = 0;
	
	private Integer id;
	private String nome;
	private String telefone;
	private String endereco;
	private Date aniversario;
	private Double patrimonio;
	
	private Long idade;
	private Horario horarioPreferido;
	
	
	public Long getIdade() {
		return idade;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	public Horario getHorarioPreferido() {
		return horarioPreferido;
	}
	public void setHorarioPreferido(Horario horarioPreferido) {
		this.horarioPreferido = horarioPreferido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	public Double getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(Double patrimonio) {
		this.patrimonio = patrimonio;
	}
	
	
	

}
