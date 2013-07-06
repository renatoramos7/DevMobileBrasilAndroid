package br.listview.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListViewImageAdapterActivity extends Activity {
	
	private ListView lista;	
	private String[] paises;
	boolean[] listImages={true};
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Tela
        setContentView(R.layout.lisprincipal);
        
        //ListView
        lista= (ListView)findViewById(R.id.lstprincipal);
        
        paises = new String[] { "Brasil", "Colombia",
			"Chile", "Paraguai", "Uruguai", "Argentina", "Mexico", "Canada",
			"Italia", "França" };
       
        
        
        ArrayAdapter<String> adapter = new ImageAdapter(ListViewImageAdapterActivity.this, R.layout.main,  R.id.text1, R.id.image1, paises, listImages);
		
		lista.setAdapter(adapter);
		
		lista.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

				if (lista.getItemAtPosition(myItemInt) != null) {

					// Pega o item naquela posição
					Object o = lista.getItemAtPosition(myItemInt);
					 
					//((ViewGroup)myView).getChildAt(2).setBackgroundColor(Color.RED);
					
					lista.getPositionForView(myView);

					String pais = o.toString(); 

					// Create a piece of toast.
					Toast pieceToast = Toast.makeText(getApplicationContext(), pais, Toast.LENGTH_SHORT);

					// Show the toast.
					pieceToast.show();
					
				}
			}
		});
        
        
    }
}