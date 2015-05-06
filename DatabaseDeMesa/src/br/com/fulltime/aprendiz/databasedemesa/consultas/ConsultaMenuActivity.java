package br.com.fulltime.aprendiz.databasedemesa.consultas;

import br.com.fulltime.aprendiz.databasedemesa.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConsultaMenuActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		TextView txt = (TextView)findViewById(R.id.LabelCadastro);
		Button btn1 = (Button)findViewById(R.id.btnPersonagem);
		Button btn2 = (Button)findViewById(R.id.btnItem);
		
		txt.setText("Consulta");
	}
	
	public void onClick(View v){
		Intent i;
		switch(v.getId()){
			case R.id.btnPersonagem:
				i = new Intent(this, ConsultaPersonagensActivity.class);
				startActivity(i);
				break;
			case R.id.btnItem:
				break;
		}
		
	}
}
