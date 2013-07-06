package br.trocatela.com;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class AppTelas3 extends Activity {

	Button bttela1, bttela2;
	
	public void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tela3);
	
	bttela1 = (Button)
			findViewById(R.id.bttela1);
	
	bttela2 = (Button)
			findViewById(R.id.bttela2);
	
	bttela1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent troca = new
			Intent(AppTelas3.this, AppTelas.class);
			AppTelas3.this.startActivity(troca);
			AppTelas3.this.finish();
			
		}
	});
	
	
	
	bttela2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent troca = new
			Intent(AppTelas3.this, AppTelas2.class);
			AppTelas3.this.startActivity(troca);
			AppTelas3.this.finish();
			
		}
	});
}
}
