package br.cronometro.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.*;
import android.view.*;

public class AppCronometro extends Activity {
	Chronometer chronometer;
	Button btstart, btpause, btreset;
	boolean Click;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Click = true;
		chronometer = (Chronometer) findViewById(R.id.chronometer);
		btstart = (Button) findViewById(R.id.btstart);
		btpause = (Button) findViewById(R.id.btpause);
		btreset = (Button) findViewById(R.id.btreset);

		btstart.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (Click)
					chronometer.setBase(SystemClock.elapsedRealtime());
				chronometer.start();
			}
		});

		btpause.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Click = false;
				chronometer.stop();
			
				
				

			}
		});

		btreset.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Click = true;
				chronometer.stop();
			chronometer.setText("Total (00:00)");

			}
		});
	}
}