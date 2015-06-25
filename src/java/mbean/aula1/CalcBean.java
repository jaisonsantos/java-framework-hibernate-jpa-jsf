package mbean.aula1;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CalcBean {

	private Double avalue;
	private Double bvalue;
        private String message;
	
	private Double result;
	
	public Double multiplicar(){
            
            
            
            try{ 
                result = avalue * bvalue;
                if (result <= 0) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
                }
                
            } catch(NullPointerException e) {
                e.printStackTrace();
            }
		
		
		return null;
	}

	public Double getAvalue() {
		return avalue;
	}

	public void setAvalue(Double avalue) {
		this.avalue = avalue;
	}

	public Double getBvalue() {
		return bvalue;
	}

	public void setBvalue(Double bvalue) {
		this.bvalue = bvalue;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	
}
