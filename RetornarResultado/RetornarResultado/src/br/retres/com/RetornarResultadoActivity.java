package br.retres.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RetornarResultadoActivity extends Activity {
	private static final int Activity_UM_DOIS = 1;
	Button BtnStart;

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		BtnStart = (Button) findViewById(R.id.btnStart);

		BtnStart.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(RetornarResultadoActivity.this,
						Menu.class);
				startActivityForResult(myIntent, Activity_UM_DOIS);

			}

		});

	}

	protected void onActivityResult(int codigo, int resultado, Intent i) {

		if (codigo == Activity_UM_DOIS) {
			Bundle params = i != null ? i.getExtras() : null;
			if (params != null) {
				String msg = params.getString("msg");
				if (resultado == 1) {
					Toast.makeText(this, "Escolhida: " + msg,
							Toast.LENGTH_LONG).show();
				} else if (resultado == 2) {
					Toast.makeText(this, "Escolhida: " + msg,
							Toast.LENGTH_LONG).show();
				}
			}

		}
	}

}
