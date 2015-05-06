package br.com.fulltime.aprendiz.databasedemesa.cadastros;

import br.com.fulltime.aprendiz.databasedemesa.R;
import br.com.fulltime.aprendiz.databasedemesa.R.id;
import br.com.fulltime.aprendiz.databasedemesa.R.layout;
import br.com.fulltime.aprendiz.databasedemesa.banco.dao.DaoPersonagem;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroPersonagemActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_celula);
		Button btn = (Button)findViewById(R.id.btnDeletar);
		btn.setVisibility(View.INVISIBLE);
	}
	
	public void onClick(View v){
		TextView text;
		float stats;
		switch(v.getId()){
			case R.id.btnCadastrar:
				DaoPersonagem dao = new DaoPersonagem(this);
				TextView nome = (TextView)findViewById(R.id.edtNome);
				String parametro = nome.getText().toString();
				dao.openDatabase();
				dao.createAtributoPrimario(parametro);
				dao.close();
				Toast.makeText(this, "Cadastro de"+ parametro +" Feito com Sucesso", Toast.LENGTH_LONG);
				finish();
				break;
			case R.id.btnDeletar:
				break;
			case R.id.btnConPlus:
				text = (TextView)findViewById(R.id.LabelConstituicaoTotal);
				stats = Float.valueOf(text.getText().toString());
				stats++;
				text.setText(""+stats);
				break;
			case R.id.btnConLess:
				text = (TextView)findViewById(R.id.LabelConstituicaoTotal);
				stats = Float.valueOf(text.getText().toString());
				if(stats>0){
					stats--;
				}
				text.setText(""+stats);
				break;
			case R.id.btnForPlus:
				break;
			case R.id.btnForLess:
				break;
			case R.id.btnDexPlus:
				break;
			case R.id.btnDexLess:
				break;
			case R.id.btnAgiPlus:
				break;
			case R.id.btnAgiLess:
				break;
			case R.id.btnIntPlus:
				break;
			case R.id.btnIntLess:
				break;
			case R.id.btnSabPlus:
				break;
			case R.id.btnSabLess:
				break;
		}
		
	}
}
