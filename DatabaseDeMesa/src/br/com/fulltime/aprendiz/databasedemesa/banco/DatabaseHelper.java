package br.com.fulltime.aprendiz.databasedemesa.banco;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

	
	private static final int DATABASE_VERSION = 2;
	private static final String DATABASE_NAME = "Banco_Local";
	
	private static final String TABLE_ATRIBUTOP = "ATRIBUTO_PRIMARIO";
	private static final String COL_NOME = "Nome";
	private static final String TABLE_AP_CREATE = 
			//Tabela Atributo Primario
			"CREATE TABLE " + TABLE_ATRIBUTOP
			+ " ( _id integer primary key autoincrement, "+
			COL_NOME + " TEXT " +
			");";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	/* 
	 * public DatabaseHelper(Context context) {
		super(context, Environment.getExternalStorageDirectory().getAbsolutePath()
		+ "/DatabaseDeMesa/database/" + DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}
	 * */ 

	
	
	private static final String DATABASE_CREATE = TABLE_AP_CREATE;
	
	public void onCreate(SQLiteDatabase db) {
		try{
		db.execSQL(DATABASE_CREATE);
		}catch(SQLException e){
			System.out.println("\n Erro SQL: \n"+e+"\n");
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(DatabaseHelper.class.getName(),
		        "Upgrading database from version " + oldVersion + " to "
		                + newVersion + ", which will destroy all old data");
		        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ATRIBUTOP);
		        onCreate(db);

	}

	public static String getColNome() {
		return COL_NOME;
	}

	public static String getTableAtributop() {
		return TABLE_ATRIBUTOP;
	}


}
