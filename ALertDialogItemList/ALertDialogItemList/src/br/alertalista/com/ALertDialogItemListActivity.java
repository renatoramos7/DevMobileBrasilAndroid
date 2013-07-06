package br.alertalista.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ALertDialogItemListActivity extends Activity {

	ImageButton b;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		b = (ImageButton) findViewById(R.id.imgBtnMostrar);

		b.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder mensagem = new AlertDialog.Builder(
						ALertDialogItemListActivity.this);
				final String[] lista = { "Item1", "Item2", "Item3", "Item4",
						"Item5", "Item6", "Item7", "Sair" };
				mensagem.setTitle("Escolha um item");
				mensagem.setItems(lista, new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int item) {
						// TODO Auto-generated method stub
						switch (item) {
						case 0:
							showMessage("Item1 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 1:
							showMessage("Item2 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 2:
							showMessage("Item3 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 3:
							showMessage("Item4 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 4:
							showMessage("Item5 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 5:
							showMessage("Item6 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 6:
							showMessage("Item7 - Selecionado",
									ALertDialogItemListActivity.this);
							break;

						case 7:
							finish();

						}
					}
				});
				mensagem.show();

			}
		});
	}

	// METODO DE MENSAGEM NA TELA DO USUARIO
	public void showMessage(String Caption, Activity activity) {

		// GERANDO UMA INSTANCIA DA CLASSE DIALOG
		AlertDialog.Builder dialogo = new AlertDialog.Builder(activity);

		// GERANDO O BOX DE MENSAGEM
		dialogo.setTitle("Atenção");
		dialogo.setMessage(Caption);
		dialogo.setNeutralButton("OK", null);
		dialogo.show();

	}
}