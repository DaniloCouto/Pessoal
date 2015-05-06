package br.com.fulltime.aprendiz.databasedemesa;

import br.com.fulltime.aprendiz.databasedemesa.banco.DatabaseHelper;
import br.com.fulltime.aprendiz.databasedemesa.banco.dao.DaoPersonagem;
import br.com.fulltime.aprendiz.databasedemesa.cadastros.Cadastro;
import br.com.fulltime.aprendiz.databasedemesa.consultas.ConsultaMenuActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	private DaoPersonagem dao;
	DatabaseHelper openHelper = new DatabaseHelper(null);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	public void onClick(View v){
		Intent i ;
		switch(v.getId())
		{
			case R.id.btnCadastro:
				i = new Intent(this, Cadastro.class);
				startActivity(i);
				break;
			case R.id.btnConsulta:
				i = new Intent(this, ConsultaMenuActivity.class);
				startActivity(i);
				break;
				
			case R.id.btnCalculos:
				break;
		}
		
	}
}
