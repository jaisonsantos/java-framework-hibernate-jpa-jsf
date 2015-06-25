package mbean.aula1;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TesteBean {

	
	private String nome = "";

	private Integer sorte = new Random().nextInt(11);
	private Integer papite;
	private String respostaSorte;
	
	public String verificarPalpite(){
		
            if (papite != null){ 
                
                if(papite.equals(sorte)){
			respostaSorte = "Acertou!";
		}else{
			respostaSorte = "Errou! Era " + sorte;
			sorte = new Random().nextInt(11);
		}
            }
		
		
		return null;
		
	}
	
	

	public Integer getSorte() {
		return sorte;
	}



	public Integer getPapite() {
		return papite;
	}



	public void setPapite(Integer papite) {
		this.papite = papite;
	}

	


	public void setSorte(Integer sorte) {
		this.sorte = sorte;
	}



	public String getRespostaSorte() {
		return respostaSorte;
	}



	public void setRespostaSorte(String respostaSorte) {
		this.respostaSorte = respostaSorte;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
