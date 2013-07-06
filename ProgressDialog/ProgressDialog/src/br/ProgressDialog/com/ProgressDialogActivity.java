package br.ProgressDialog.com;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressDialogActivity extends Activity {
    
	private ProgressDialog dialog;
	private Button btnProgress;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Capturando botão na tela
        btnProgress = (Button) findViewById(R.id.btnProgress);
        
        //Evento OnClick do botão
        btnProgress.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				dialog = ProgressDialog.show(ProgressDialogActivity.this,"Dev Moble Brasil","Realizando Login Agarde !!", false, true);
				dialog.setIcon(R.drawable.ic_launcher);
				dialog.setCancelable(false);
				
				new Thread() {

					public void run() {

						try {
							
							Thread.sleep(9000);
							dialog.dismiss();
						}catch (Exception e) {
							
							
						}
					}
				}.start();
			}
		});

        
    }
}