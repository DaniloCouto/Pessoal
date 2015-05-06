package br.com.fulltime.aprendiz.databasedemesa.consultas;

import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;
import br.com.fulltime.aprendiz.databasedemesa.R;
import br.com.fulltime.aprendiz.databasedemesa.banco.dao.DaoPersonagem;
import br.com.fulltime.aprendiz.databasedemesa.classes.Personagem;


public class ConsultaPersonagensActivity extends ListActivity{
	DaoPersonagem dao = new DaoPersonagem(this);
	Intent i = new Intent(this , ConsultaFinalPersonagemActivity.class);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consulta);
		List<Personagem> values = dao.getAllAtributoPrimario();
		ArrayAdapter<Personagem> adaptador = new ArrayAdapter<Personagem>(this, android.R.layout.simple_list_item_1, values);
		setListAdapter(adaptador);
		
		ListView listview = (ListView)findViewById(R.id.listConsulta);
		
		listview.setOnItemClickListener(new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {
						i.putExtra("id",id);
						startActivity(i);
						
					}
		});
	}
	public void onClick(View v){
		TextView text = (TextView)findViewById(R.id.edtConsulta);
		String filtro = text.getText().toString();
		List<Personagem> values = null;
		if(filtro != ""){
			values = dao.getAtributoPrimario(filtro);
		}else{
			values = dao.getAllAtributoPrimario();
		}
			
		ArrayAdapter<Personagem> adaptador = null;
		if(values != null){
			adaptador = new ArrayAdapter<Personagem>(this, android.R.layout.simple_list_item_1, values);
		}else{
			Toast.makeText(this, "Não Encontrado", Toast.LENGTH_LONG);
		}			
		setListAdapter(adaptador);
	}
	
	
}
