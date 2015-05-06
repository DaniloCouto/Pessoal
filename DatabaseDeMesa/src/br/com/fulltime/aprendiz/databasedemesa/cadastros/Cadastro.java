package br.com.fulltime.aprendiz.databasedemesa.cadastros;

import br.com.fulltime.aprendiz.databasedemesa.R;
import br.com.fulltime.aprendiz.databasedemesa.R.id;
import br.com.fulltime.aprendiz.databasedemesa.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
				
	}
	
	public void onClick(View v){
		switch(v.getId()){
			case R.id.btnPersonagem:
				Intent i = new Intent(this,CadastroPersonagemActivity.class);
				startActivity(i);
				break;
			case R.id.btnItem:
				break;
		}
	}
}
