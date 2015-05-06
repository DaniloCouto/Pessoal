package br.com.fulltime.aprendiz.databasedemesa.consultas;

import br.com.fulltime.aprendiz.databasedemesa.R;
import br.com.fulltime.aprendiz.databasedemesa.banco.dao.DaoPersonagem;
import br.com.fulltime.aprendiz.databasedemesa.classes.Personagem;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class ConsultaFinalPersonagemActivity extends Activity {
	private DaoPersonagem dao = new DaoPersonagem(this);
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_celula);
		Bundle extras = getIntent().getExtras();
		Personagem p = dao.getAtributoPrimarioId(extras.getLong("_id"));
		EditText nome = (EditText)findViewById(R.id.edtNome);
		nome.setText(""+p.getNome());
	}
}
