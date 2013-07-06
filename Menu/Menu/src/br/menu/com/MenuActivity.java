package br.menu.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends Activity {
	/** Called when the activity is first created. */

	public static final int MENU1 = 0;
	public static final int MENU2 = 1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU1, 0, "Menu1");
		menu.add(0, MENU2, 0, "Menu2");

		return super.onCreateOptionsMenu(menu);

	}

	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case MENU1:
			Toast.makeText(MenuActivity.this, "Menu1 Selecionado", Toast.LENGTH_SHORT)
					.show();
			return true;

		case MENU2:
			Toast.makeText(MenuActivity.this, "Menu2 Selecionado", Toast.LENGTH_SHORT)
					.show();
			return true;

		}

		return false;
	}
}