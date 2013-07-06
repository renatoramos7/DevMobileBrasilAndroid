package br.browser.com;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class BowserActivity extends Activity {
	/** Called when the activity is first created. */
	ImageButton b;
	EditText e;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		b = (ImageButton) findViewById(R.id.imgBtnOk);

		b.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				e = (EditText) findViewById(R.id.endereco);

				String end = e.getText().toString();

				Uri uri = Uri.parse(end);
				Intent it = new Intent(Intent.ACTION_VIEW, uri);

				startActivity(it);
			}
		});

	}

}