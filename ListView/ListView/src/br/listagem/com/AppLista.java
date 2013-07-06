package br.listagem.com;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.view.*;

public class AppLista extends Activity {

	public ListView list;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, times);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);

		list.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parent, View view,
					int position, long id) {
				AlertDialog.Builder mensagem = new AlertDialog.Builder(
						AppLista.this);
				mensagem.setTitle("Atenção, você escolheu:");
				mensagem.setMessage(((TextView) view).getText().toString());
				mensagem.setNeutralButton("OK", null);
				mensagem.show();

			}
		});
	}

	static final String[] times = new String[] { "São Paulo", "Corinthians",
			"Palmeiras", "Santos", "Flamengo", "Vasco", "Botafogo", "Bahia",
			"Portuguesa", "Ceara" };

}