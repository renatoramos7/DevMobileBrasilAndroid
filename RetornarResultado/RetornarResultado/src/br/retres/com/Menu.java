package br.retres.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Menu extends Activity {
	/** Called when the activity is first created. */
	Button btnOk;
	RadioGroup rgOpcoes;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.telaescolha);

		btnOk = (Button) findViewById(R.id.btnOk);
		btnOk.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				rgOpcoes = (RadioGroup) findViewById(R.id.rgOpcoes);

				int rg = rgOpcoes.getCheckedRadioButtonId();

				if (rg == R.id.rg1) {
					Intent i = new Intent();
					i.putExtra("msg", "1º Opção:");
					setResult(1, i);
					finish();

				} else if (rg == R.id.rg2) {

					Intent i = new Intent();
					i.putExtra("msg", "2º opção");
					setResult(2, i);
					finish();

				}

			}
		});

	}
}
