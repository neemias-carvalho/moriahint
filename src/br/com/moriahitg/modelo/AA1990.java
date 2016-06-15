package br.com.moriahitg.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AA1990 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7736940715323704795L;
	
	@Id
	public String AA1_NOMTEC;
	
	@Id
	public String getAA1_NOMTEC() {
		return AA1_NOMTEC;
	}
	
	@Id
	public void setAA1_NOMTEC(String aA1_NOMTEC) {
		AA1_NOMTEC = aA1_NOMTEC;
	}	
}