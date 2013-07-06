package br.imagens.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Gallery;

public class ImagensActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		((Gallery) findViewById(R.id.gallery1))
				.setAdapter(new ImageAdapter(this));
	}
}