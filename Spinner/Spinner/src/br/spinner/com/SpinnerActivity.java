package br.spinner.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends Activity {
	/** Called when the activity is first created. */

	private static final String[] times = { "","Corinthians", "Palmeiras",
			"São Paulo", "Flamengo", "Cruzeiro", "Ponte Preta", "Vasco" };
	ArrayAdapter<String> mTimes;
	Spinner spntimes;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mTimes = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, times);
		spntimes = (Spinner) findViewById(R.id.spntimes);
		spntimes.setAdapter(mTimes);

	}
}