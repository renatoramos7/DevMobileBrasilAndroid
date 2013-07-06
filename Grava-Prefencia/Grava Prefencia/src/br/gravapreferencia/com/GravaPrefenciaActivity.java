package br.gravapreferencia.com;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GravaPrefenciaActivity extends Activity {
	
	
	private Button btnGuardar,btnRecuperaPref;
	private EditText txtNome, txtEmail, txtApelido; 
	private SharedPreferences sharedPreferences;
	private final String PREFS_PRIVATE = "PREFS_PRIVATE";
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
                
        //Capturando os Botês da Tela
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnRecuperaPref = (Button) findViewById(R.id.btnRecuperaPref);
        //Capturando os Campos da Tela
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtApelido = (EditText) findViewById(R.id.txtApelido);
        
        
        
        btnGuardar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				GravaPreferencias(txtNome.getText().toString(), txtEmail.getText().toString(), txtApelido.getText().toString());
				
				
			}
		});
        
        
        btnRecuperaPref.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				RecuperaPreferencias();

			}
		});

    }
    
	public void RecuperaPreferencias() {

	   sharedPreferences = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);

		txtNome.setText(sharedPreferences.getString("nome", "nome"));
		txtEmail.setText(sharedPreferences.getString("email", "email"));
		txtApelido.setText(sharedPreferences.getString("apelido", "apelido"));

		sharedPreferences = null;
	}
    
	public void GravaPreferencias( String nome, String email, String apelido) {

		sharedPreferences = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
		
		Editor prefsPrivateEditor = sharedPreferences.edit();
		
		prefsPrivateEditor.putString("nome", nome);
		prefsPrivateEditor.putString("email", email);
		prefsPrivateEditor.putString("apelido", apelido);

		prefsPrivateEditor.commit();

	}

}