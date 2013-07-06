package br.com.devmobilebrasil.submenu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class ClassePrincipal extends Activity {

	// Constantes
	public static final int MENU1 = Menu.FIRST; // mensagem
	public static final int MENU2 = Menu.FIRST + 1; // sair
	public static final int MENU3 = Menu.FIRST + 3;// opções
	public static final int MENU4 = Menu.FIRST + 4;// opções

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	// Menu
	public boolean onCreateOptionsMenu(Menu options) {
		options.add(0, MENU1, 0, "Mensagem");
		options.add(0, MENU2, 0, "Sair");

		// Sub Menu
		SubMenu sub = options.addSubMenu("Opções");
		sub.add(0, MENU3, 0, "Tela2");
		sub.add(0, MENU4, 0, "Site DevMobileBrasil");

		return super.onCreateOptionsMenu(options);

	}

	// Seleção dos menus
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {// recupera o item selecionado
		
		case MENU1: // mensagem

			Toast.makeText(this, "Fala ai Beleza?" + item, Toast.LENGTH_LONG)
					.show();

			return true;

		case MENU2: // finaliza

			finish();

			return true;

		case MENU3:// troca de layout

			Intent mudarDeTela = new Intent(this, Tela2.class);
			startActivity(mudarDeTela);

			return true;

		case MENU4:

			siteDevMobile(); // vizita o nosso site

			return true;
		}

		return false;

	}

	// método que abre o browser e visita o nosso site
	void siteDevMobile() {

		String end = "http://devmobilebrasil.com.br";

		Uri uri = Uri.parse(end);

		Intent it = new Intent(Intent.ACTION_VIEW, uri);

		startActivity(it);

	}

}
