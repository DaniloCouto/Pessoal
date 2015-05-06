package br.com.fulltime.aprendiz.databasedemesa.classes;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
	
	private long id;
	private String nome;
	private Atributos at;
	private AtributosSecundarios ats;
	private List<Item> equipamento = new ArrayList<Item>();
	private List<Item> inventario = new ArrayList<Item>();
	
	

	public AtributosSecundarios getAtsTotal() {
		AtributosSecundarios atsTotal = new AtributosSecundarios();
		for(int i=0; i < equipamento.size(); i++){
			atsTotal.patk = equipamento.get(i).getAts().patk + ats.patk;
			atsTotal.pdef = equipamento.get(i).getAts().pdef + ats.pdef;
			atsTotal.matk = equipamento.get(i).getAts().matk + ats.matk;
			atsTotal.mdef = equipamento.get(i).getAts().mdef + ats.mdef;
			atsTotal.acc = equipamento.get(i).getAts().acc + ats.acc;
			atsTotal.evas = equipamento.get(i).getAts().evas + ats.evas;
			atsTotal.crit = equipamento.get(i).getAts().crit + ats.crit;
			atsTotal.hpmax = equipamento.get(i).getAts().hpmax + ats.hpmax;
			atsTotal.mpmax = equipamento.get(i).getAts().mpmax + ats.mpmax;			
		}
		return atsTotal;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Atributos getAt() {
		return at;
	}
	public void setAt(Atributos at) {
		this.at = at;
	}
	public AtributosSecundarios getAts() {
		return ats;
	}
	public void setAts(AtributosSecundarios ats) {
		this.ats = ats;
	}
	public List<Item> getInventario() {
		return inventario;
	}
	public void setInventario(List<Item> inventario) {
		this.inventario = inventario;
	}
	
	
}
