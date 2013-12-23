package paginasweb.pe.ejercicio_login;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText txtusu, txtpass;
	Button btnlogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtusu = (EditText) findViewById(R.id.txtusu);
		txtpass = (EditText) findViewById(R.id.txtpass);
		btnlogin = (Button) findViewById(R.id.btnlogin);
		
		// Creamos el evento onclick del boton
		btnlogin.setOnClickListener(new OnClickListener() {
			//usuario: paginasweb
			//password: peru
			@Override
			public void onClick(View v) {
				if(txtusu.getText().toString().equals("paginasweb") && txtpass.getText().toString().equals("peru")){
					Toast.makeText(getApplicationContext(), "Usuario y password correctos :)", Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(getApplicationContext(),"Error revise usuario o password!!", Toast.LENGTH_SHORT).show();
				}
						
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
