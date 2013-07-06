package br.margemdelucro.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;
import android.app.AlertDialog.Builder;

public class AppLucro extends Activity {
	
	EditText edvalor;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        edvalor = (EditText)
        findViewById(R.id.edvalor);		
        
        Button btcalcular = (Button)
        findViewById(R.id.btcalcular);
        btcalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(edvalor.length()==0){
					AlertDialog.Builder mensagem=new
					AlertDialog.Builder(AppLucro.this);
				mensagem.setTitle("Atenção");
				mensagem.setMessage("Obrigatorio digitar valor");
				mensagem.setNeutralButton("OK", null);
				mensagem.show();
				} else{
				double value, new_value;
				
			    EditText edvalor=(EditText)
				findViewById(R.id.edvalor);		
				
				value = Double.parseDouble(edvalor.getText().toString());
				
				RadioGroup rg = (RadioGroup)
				findViewById(R.id.rgopcoes);
				int op = rg.getCheckedRadioButtonId();
				
				if(op==R.id.rb25)
				new_value = value+(value*0.25);
				else
					if(op==R.id.rb50)
				new_value = value+(value*0.50);
					else
				new_value = value+(value*0.75);
				
				AlertDialog.Builder mensagem = new
				AlertDialog.Builder(AppLucro.this);
				mensagem.setTitle("Atenção");
				mensagem.setMessage("Vender por R$:"+ String.valueOf(new_value));
				mensagem.setNeutralButton("OK", null);
				mensagem.show();
				}
			}
		});
    }
}