package br.soma.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.app.*;
import android.app.AlertDialog.Builder;

public class AppSoma extends Activity {
   
	EditText ednumero1, ednumero2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ednumero1 = (EditText)findViewById(R.id.ednumero1);
        ednumero2 = (EditText)findViewById(R.id.ednumero2);
        
        Button btsomar = (Button)findViewById(R.id.btsomar);
        
        btsomar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				double resultado = num1+num2;
				
				AlertDialog.Builder mensagem = new
						AlertDialog.Builder(AppSoma.this);
				mensagem.setTitle("Aviso");
				mensagem.setMessage("Soma:"+ resultado);
				mensagem.setNeutralButton("OK", null);
			    mensagem.show();
				
			}
		});
        
    }
}