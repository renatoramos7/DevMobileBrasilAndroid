package br.autocomplete.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class AutoCompleteActivity extends Activity {
   
	AutoCompleteTextView AutComp;
 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ArrayAdapter<String>adapter = new 
        		ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, nomes);
        AutComp = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        AutComp.setAdapter(adapter);
    }
       
        private final String[] nomes = new String[]
        		{
        		"Alex", "Afonso", "Ademir", "Bruno", "Bruna", 
        		"Carlos", "Carina", "Diego", "Danilo", "Eduardo", "Edilson",
        		"Fernando", "Fabio", "Guilherme", "gilson", "Tiago", "Tadeu"
        		
        		};
    }
