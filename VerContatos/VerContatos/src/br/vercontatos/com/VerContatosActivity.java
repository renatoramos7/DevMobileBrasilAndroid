package br.vercontatos.com;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class VerContatosActivity extends Activity {
	private static final int SEL_CONT = 1;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ImageButton b = (ImageButton) findViewById(R.id.imgBtnOk);

		b.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri u = Uri.parse("content://com.android.contacts/contacts");

				Intent i = new Intent(Intent.ACTION_PICK, u);

				startActivityForResult(i, SEL_CONT);

			}
		});
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent i) {

		Uri u = i.getData();
		Cursor c = managedQuery(u, null, null, null, null);
		c.moveToNext();

		int nameColumn = c
				.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME);
		String name = c.getString(nameColumn);
		Toast.makeText(this, "Contato:" + name, Toast.LENGTH_LONG).show();
		
		
	}

}
