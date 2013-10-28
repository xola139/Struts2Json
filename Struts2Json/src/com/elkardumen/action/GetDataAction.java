package com.elkardumen.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class GetDataAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6257361238381983954L;
	
	private List resultado=new ArrayList();
	
	public GetDataAction(){
		
		resultado.add("objeto1");
		resultado.add("objeto2");
		resultado.add("objeto3");
		resultado.add("objeto4");
		
		
	}

	public List getResultado() {
		return resultado;
	}

	public void setResultado(List resultado) {
		this.resultado = resultado;
	}
	
	

}
