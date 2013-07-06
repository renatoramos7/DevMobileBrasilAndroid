package br.alerta.com;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class AppAlerta extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // BOTOES SIM  executa algo se o botao sim for pressionado
        
        AlertDialog.Builder dialog = new
        		AlertDialog.Builder(this);
        dialog.setMessage("Deseja sair desta activity ???");
        dialog.setPositiveButton("Sim", new
        		DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface di, int arg) {
						
						Intent myIntent = new Intent
							    (AppAlerta.this, Tela2.class);
							     AppAlerta.this.startActivity(myIntent);
							     

						// TODO Auto-generated method stub
						
					}
				});
        
        
        
        
        
        
        // botao nao executa algo se o botao nao for pressionado
        dialog.setNegativeButton("Não", new 
        		DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface di, int arg) {
						// TODO Auto-generated method stub
						
					}
				});
        dialog.setTitle("Aviso");
        dialog.show();
        
    }
}