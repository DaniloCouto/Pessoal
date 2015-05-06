package br.com.fulltime.database_de_mesa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClick(View v){
		switch(v.getId()){
			case R.id.btnMenu1:
				break;
			case R.id.btnMenu2:
				break;
			case R.id.btnMenu3:
				break;
		}
	}
}
