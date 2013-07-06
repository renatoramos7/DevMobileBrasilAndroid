package br.listacontatos.com;

import android.app.ListActivity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class LayoutContatosActivity extends ListActivity {
	private ListAdapter adapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.main);

		Uri u = ContactsContract.Contacts.CONTENT_URI;

		Cursor cursor = getContentResolver().query(u, null, null, null, null);
		startManagingCursor(cursor);

		String[] coluns = new String[] { ContactsContract.Contacts.DISPLAY_NAME };
		int[] campos = new int[] { R.id.contato };

		adapter = new SimpleCursorAdapter(this, R.layout.main, cursor, coluns,
				campos);
		setListAdapter(adapter);

	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		Cursor cursor = (Cursor) adapter.getItem(position);

		String nameColuna = ContactsContract.Contacts.DISPLAY_NAME;
		String nome = cursor
				.getString(cursor.getColumnIndexOrThrow(nameColuna));
		Toast.makeText(this, nome, Toast.LENGTH_SHORT).show();

	}

}
