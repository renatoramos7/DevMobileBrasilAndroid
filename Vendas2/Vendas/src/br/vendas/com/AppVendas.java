package br.vendas.com;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;


public class AppVendas extends Activity {
	
	CheckBox cbcamisa, 
	cbcalca, 
	cbbermuda, 
	cbsapato, 
	cbtenis, 
	cbchinelo;
   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        cbcamisa = (CheckBox)
        findViewById(R.id.cbcamisa);
        cbcalca = (CheckBox)
        findViewById(R.id.cbcalca);
        cbbermuda = (CheckBox)
        findViewById (R.id.cbbermuda);
        cbsapato = (CheckBox)
        findViewById(R.id.cbsapato);
        cbtenis = (CheckBox)
        findViewById(R.id.cbtenis);
        cbchinelo = (CheckBox)
        findViewById(R.id.cbchinelo);
        Button btsomar = (Button)
        findViewById(R.id.btsomar);
        
        btsomar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				double resultado = 0;
				if(cbcamisa.isChecked())
					resultado += 40.00;
				if(cbcalca.isChecked())
					resultado+=45.00;
				if(cbbermuda.isChecked())
					resultado+=28.00;
				if(cbsapato.isChecked())
					resultado+=60.00;
				if(cbtenis.isChecked())
					resultado+=68.00;
				if(cbchinelo.isChecked())
					resultado+=34.00;
				
				AlertDialog.Builder mensagem = new
				AlertDialog.Builder(AppVendas.this);
				mensagem.setTitle("Atenção");
				mensagem.setMessage("Total:"+String.valueOf(resultado));
				mensagem.setNeutralButton("OK", null);
				mensagem.show();
					
				
			}
		});
    }
}