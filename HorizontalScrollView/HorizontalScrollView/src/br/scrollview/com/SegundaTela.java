package br.scrollview.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTela extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);

		Button btnVoltar = (Button) findViewById(R.id.btnVoltar);

		btnVoltar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent(SegundaTela.this,
						HorizontalScrollViewActivity.class);
				SegundaTela.this.startActivity(it);
				finish();

			}
		});
	}

}
