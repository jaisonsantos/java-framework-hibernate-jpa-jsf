package converter.aula2;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import cursojsf.negocio.services.ConversaoServices;
import cursojsf.visao.util.MessageUtils;

public class NumeroConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String stringEnviada) {
		try{
			return ConversaoServices.portuguesToByte(stringEnviada);
		}catch(Exception e){
			FacesMessage message = MessageUtils.getMessageFromBundle(FacesMessage.SEVERITY_ERROR, "converter.numero", stringEnviada);
			throw new ConverterException(message);
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object stringEnviada) {
		return ConversaoServices.byteToPortugues((Byte) stringEnviada);
	}

}
