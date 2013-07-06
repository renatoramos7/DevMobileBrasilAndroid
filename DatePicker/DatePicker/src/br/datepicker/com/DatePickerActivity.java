package br.datepicker.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class DatePickerActivity extends Activity {
	DatePicker Dp;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btmostrar = (Button) findViewById(R.id.btdata);
		Dp = (DatePicker) findViewById(R.id.datePicker);

		btmostrar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				AlertDialog.Builder mensagem = new AlertDialog.Builder(
						DatePickerActivity.this);
				mensagem.setMessage("Data escolhida:"
						+ String.valueOf(Dp.getDayOfMonth()) + "/"
						+ String.valueOf(Dp.getMonth() + 1) + "/" +

						String.valueOf(Dp.getYear()));
				mensagem.setNeutralButton("OK", null);
				mensagem.setTitle("Atenção");
				mensagem.show();

			}
		});
	}

}