package br.telefones.com;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelefonesUteisActivity extends Activity {
	/** Called when the activity is first created. */
	Button TelefonarCasa;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TelefonarCasa = (Button) findViewById(R.id.btnCasa);

		TelefonarCasa.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Digita o telefone no lugar do 00000000

				Uri u = Uri.parse ("tel: 00000000");

				Intent i = new Intent(Intent.ACTION_CALL, u);
				startActivity(i);

			}
		});
	}
}