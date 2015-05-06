package br.com.fulltime.aprendiz.databasedemesa.banco.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fulltime.aprendiz.databasedemesa.banco.DatabaseHelper;
import br.com.fulltime.aprendiz.databasedemesa.classes.Personagem;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DaoPersonagem {
	
	private SQLiteDatabase db;
	private DatabaseHelper dbHelper;
	
	public DaoPersonagem(Context context) {
		dbHelper = new DatabaseHelper(context);
	}
	
	public void openDatabase() throws SQLException{
		db = dbHelper.getWritableDatabase();
	}
	
	public void close(){
		dbHelper.close();
	}
	
	// Atributos Principais
	
	public boolean createAtributoPrimario(String nome){
		String[] temp = { "_id",DatabaseHelper.getColNome()};
		try{
			db.execSQL("INSERT INTO "+DatabaseHelper.getTableAtributop()+"("+DatabaseHelper.getColNome()+") VALUES ('"+nome+"');");
			//db.insert(DatabaseHelper.getTableAtributop(), null,values);
		}catch(SQLException e){
			System.out.println("\n ERRO SQL : \n" + e + "");
			return false;
		}
		return true;
	}
	
	public List<Personagem> getAtributoPrimario(String nome){
		Cursor cursor;
		List<Personagem> lista = new ArrayList<Personagem>();
		
		try{
			 cursor = db.query(DatabaseHelper.getTableAtributop(), new String[]{DatabaseHelper.getColNome()},nome, null, null, null, null);
			//db.insert(DatabaseHelper.getTableAtributop(), null,values);
		}catch(SQLException e){
			System.out.println("\n ERRO SQL : \n" + e + "");
			return null;
		}
		cursor.moveToFirst();
		
		while(!cursor.isAfterLast()){
			Personagem at = cursorToAtributoPrimario(cursor);
			lista.add(at);
			cursor.moveToNext();
		}
			
		return lista;
	}
	
	public Personagem getAtributoPrimarioId(long id){
		Cursor cursor;
		Personagem lista = new Personagem();
		
		try{
			 cursor = db.query(DatabaseHelper.getTableAtributop(), new String[]{"_id"},String.valueOf(id), null, null, null, null);
			//db.insert(DatabaseHelper.getTableAtributop(), null,values);
		}catch(SQLException e){
			System.out.println("\n ERRO SQL : \n" + e + "");
			return null;
		}
		cursor.moveToFirst();
		Personagem at = cursorToAtributoPrimario(cursor);
			
		return lista;
	}
	
	public void deleteAtributoPrimario(Personagem at){
		long id = at.getId();
		db.delete(DatabaseHelper.getTableAtributop(), "_id = "+ id, null);
	}
	
	public List<Personagem> getAllAtributoPrimario(){
		String[] temp = { "_id",DatabaseHelper.getColNome()};
		List<Personagem> ats = new ArrayList<Personagem>();
		Cursor cursor = db.query(DatabaseHelper.getTableAtributop(), temp, null, null, null, null, null);
		cursor.moveToFirst();
		
		while(!cursor.isAfterLast()){
			Personagem at = cursorToAtributoPrimario(cursor);
			ats.add(at);
			cursor.moveToNext();
		}
		
		cursor.close();
		return ats;
	}
	
	private Personagem cursorToAtributoPrimario(Cursor cursor){
		Personagem at = new Personagem();
		at.setId(cursor.getLong(0));
		at.setNome(cursor.getString(1));
		return at;
	}
	
}
