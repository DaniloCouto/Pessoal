package br.com.fulltime.aprendiz.databasedemesa.classes;

public class Item {
	
	private int id;
	private String name;
	private AtributosSecundarios ats;
	
	Item(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AtributosSecundarios getAts() {
		return ats;
	}
	public void setAts(AtributosSecundarios ats) {
		this.ats = ats;
	}
	
	
	
}
