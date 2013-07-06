package br.com.devmobilebrasil.gridview;

import android.app.Activity;
import android.app.AlertDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class ClassePrincipal extends Activity {
	// Declarando um MediaPlayer
	MediaPlayer m;

	// array de inteiros com imagens
	private int[] bandeiraPaises = { R.drawable.foto1, R.drawable.foto2,
			R.drawable.foto3, R.drawable.foto4, R.drawable.foto5,
			R.drawable.foto6, R.drawable.foto7, R.drawable.foto8 };
	GridView g;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// capturando GridView pelo id
		g = (GridView) findViewById(R.id.gridView);
		
	
		m = MediaPlayer.create(this,R.raw.musica);
		
		try{
			m.prepare();
		}catch (Exception e){}
		
		

		// setando configurações
		g.setAdapter(new ImageAdapter(this, bandeiraPaises,
				new GridView.LayoutParams(60, 60)));

		// evento de click
		g.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				
				switch (position) {

				case 0:
					// Hino nacional
					Toast.makeText(ClassePrincipal.this,
							"Tocando o Hino nacional: " ,
							Toast.LENGTH_LONG).show();
					m.start();
					break;
				case 1:
					// pausando o hino nacional
					Toast.makeText(ClassePrincipal.this,
							"Uruguai Posicção : " + position,
							Toast.LENGTH_LONG).show();
					
					break;
				case 2:
					// Brinque um pouco use a Imaginação. Crie um Método e chame
					// ele aqui
					break;
				case 3:
					// Brinque um pouco use a Imaginação. Crie um Método e chame
					// ele aqui
					break;
					// finaliza
				case 7:
					// se clicar na ultima opção para o hino e encerra a apliação
					m.pause();
					finish();

				default:
					// caso clicar em algum que eu nao codifiquei essa é a mensagem padrão
					showMessage(" Indice: " + position, ClassePrincipal.this);
				}
			}
		});
	
	
	
	
	}

	// METODO DE MENSAGEM NA TELA DO USUARIO
	public void showMessage(String Caption, Activity activity) {

		// GERANDO UMA INSTANCIA DA CLASSE DIALOG
		AlertDialog.Builder dialogo = new AlertDialog.Builder(activity);

		// GERANDO O BOX DE MENSAGEM
		dialogo.setTitle("Bem Vindo");
		dialogo.setMessage(Caption);
		dialogo.setIcon(R.drawable.ic_launcher);
		dialogo.setNeutralButton("OK", null);
		dialogo.show();
	}
}
