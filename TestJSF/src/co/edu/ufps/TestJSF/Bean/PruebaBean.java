package co.edu.ufps.TestJSF.Bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PruebaBean {
	
	public String variable="";
	
	public void prueba() {
		System.out.println("Utilizamos un metodo"+ this.variable);
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public String procesar() {
		return "Procesamos el valor"+ this.variable;
	}
	
	public Boolean ver() {
		if(this.variable.contentEquals("1")) {
			return true;
			
		}
		return false;
	}

}
