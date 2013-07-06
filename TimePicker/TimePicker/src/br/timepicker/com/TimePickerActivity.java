package br.timepicker.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TimePickerActivity extends Activity {
	TimePicker time;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btmostrar = (Button) findViewById(R.id.bthora);
		time = (TimePicker) findViewById(R.id.timePicker);

		btmostrar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				showMessage(
						"Hora escolhida:"
								+ String.valueOf(time.getCurrentHour ()) + ":"
								+ String.valueOf(time.getCurrentMinute()),
						TimePickerActivity.this);
			}
		});
	}

	public void showMessage(String Caption, Activity activity) {
		AlertDialog.Builder dialogo = new AlertDialog.Builder(activity);
		dialogo.setTitle("Atenção");
		dialogo.setMessage(Caption);
		dialogo.setNeutralButton("OK", null);
		dialogo.show();
	}

}