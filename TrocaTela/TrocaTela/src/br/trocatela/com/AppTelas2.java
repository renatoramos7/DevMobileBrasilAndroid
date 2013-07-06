package br.trocatela.com;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class AppTelas2 extends Activity {

	Button bttela1, bttela3;
	
	public void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tela2);
	
	bttela1 = (Button)
	findViewById(R.id.bttela1);
	
	bttela3 = (Button)
			findViewById(R.id.bttela3);
	
	bttela1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent troca = new
			Intent(AppTelas2.this, AppTelas.class);
			AppTelas2.this.startActivity(troca);
			AppTelas2.this.finish();
		}
	});
	
	
	
	bttela3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent troca = new
			Intent(AppTelas2.this, AppTelas3.class);
			AppTelas2.this.startActivity(troca);
			AppTelas2.this.finish();
			
		}
	});
	}
	
}
