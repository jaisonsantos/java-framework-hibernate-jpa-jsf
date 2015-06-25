package converter.aula2;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import cursojsf.visao.util.MessageUtils;

import aula2.Horario;

@FacesConverter(forClass=aula2.Horario.class)
public class HorarioConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		if(arg2 == null || "".equals(arg2)){
			return null;
		}
		
		String[] parts = arg2.split(":");
		if(parts.length != 2){
			//FacesMessage message = new FacesMessage("Horário inválido");
			FacesMessage message = MessageUtils.getMessageFromBundle(FacesMessage.SEVERITY_ERROR, "converter.horario", arg2);
			throw new ConverterException(message);
		}
		if(parts[0].length() != 2){
			FacesMessage message = MessageUtils.getMessageFromBundle(FacesMessage.SEVERITY_ERROR, "converter.horario", arg2);
			throw new ConverterException(message);
			
		}
		if(parts[1].length() != 2){
			FacesMessage message = MessageUtils.getMessageFromBundle(FacesMessage.SEVERITY_ERROR, "converter.horario", arg2);
			throw new ConverterException(message);
			
		}
		
		Horario retorno = new Horario();
		
		retorno.setHoras(Integer.parseInt(parts[0]));
		retorno.setMinutos(Integer.parseInt(parts[1]));
		
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null){
			Horario h = (Horario) arg2;
			String hor = h.getHoras() + "";
			String min = h.getMinutos() + "";
			
			if(hor.length() == 1){
				hor = "0" + hor;
				
			}
			if(min.length() == 1){
				min = "0" + min;
			}
			
			return hor + ":" + min;
		}
		return null;
	}

}
