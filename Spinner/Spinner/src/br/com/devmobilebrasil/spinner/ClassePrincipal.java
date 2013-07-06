package br.com.devmobilebrasil.spinner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ClassePrincipal extends Activity {

	// criando o Array de String
	private static final String[] opcoes = { "Mudar de tela",
			"Exibe uma mensagem", "Sair" };
	ArrayAdapter<String> aOpcoes;
	// Declarando variavel do tipo Spinner
	Spinner spinner;
	// declarando variavel tipo Button
	Button mostrar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// capturando o botao do xml pela id
		mostrar = (Button) findViewById(R.id.btnEscolha);

		aOpcoes = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, opcoes);
		// capturando o spinner do xml pela id
		spinner = (Spinner) findViewById(R.id.spnOpcoes);
		spinner.setAdapter(aOpcoes);

		// Evento de click do botao mostrar
		mostrar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// aqui eu recupero as posições selecionadas
				switch (spinner.getSelectedItemPosition()) {
				
				case 0:
					chamaTela2();
					break;

				case 1:
					showMessage(
							"Fala ai!! você selecionou a segunda opçao do Spinner",
							ClassePrincipal.this);
					break;

				case 2:
					finish();
				}

			}
		});

	}

	// método que me direciona a tela2 do exemplo 
	public void chamaTela2() {

		Intent chamarTela2 = new Intent(ClassePrincipal.this, Tela2.class);
		ClassePrincipal.this.startActivity(chamarTela2);

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
