package br.trocatela.com;


import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class AppTelas extends Activity {
	
	Button bttela2, bttela3;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bttela2 = (Button)
        findViewById (R.id.bttela2);
        
        bttela3 = (Button)
                findViewById(R.id.bttela3);
        
        bttela2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent trocatela = new
						Intent(AppTelas.this,AppTelas2.class);
				AppTelas.this.startActivity(trocatela);
				AppTelas.this.finish();
				
			}
		});
    
       
        
        bttela3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent trocatela = new
						Intent(AppTelas.this,AppTelas3.class);
				AppTelas.this.startActivity(trocatela);
				AppTelas.this.finish();
			}
		});
    }
}