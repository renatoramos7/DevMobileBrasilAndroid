package br.Notification.com;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends Activity {

	private Button btnNotification;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnNotification = (Button) findViewById(R.id.btnNotification);
        
        
        btnNotification.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
                new Thread() {

                    public void run() {

                           try {
                                  
                                Thread.sleep(1000);     
                                Notificacao("De Um Like em Nossa Fan Page no Facebook. Dev Mobile Brasil.. Agradecemos");


                           } catch (Exception e) {

                                  

                           }
                    }

             }.start();
             
			}
		});
           
    }
    
    
	// Exibe a notificaÁ„o
	private void Notificacao(String mensagem) {

		final String mensagemBarraStatus = "Notificação. Dev Mobile Brasil";
		final String titulo = "Dev Mobile Brasil Notificação";
		
		//Classe que voce Gostaria de Chamar Assim que clickado na notificacao.
		//Voce Pode colocar outra acitivity para outra tela aqui se desejar.
		final Class<?> activity = NotificationActivity.class;

		// Servico de Notificacao
		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

		//Escolhendo o Icone da Notificacao, Mensagem da Barra de Status e o Tempo que sera executado o horario.
		Notification notificacao = new Notification(R.drawable.ic_launcher, mensagemBarraStatus, System.currentTimeMillis());

		// PendingIntent para executar a Activity se o usuario selecionar a notificaÁ„o
		Intent intentMensagem = new Intent(this, activity);
		PendingIntent p = PendingIntent.getActivity(this, 0, intentMensagem, 0);

		// Reunindo todas as informacoes e Montando a mensagem e a notificacao
		notificacao.setLatestEventInfo(this, titulo, mensagem, p);

		// espera 100ms e vibra por 250ms.
		notificacao.vibrate = new long[] { 100, 250, 100, 500 };
		notificacao.defaults |= Notification.DEFAULT_LIGHTS;
		notificacao.defaults |= Notification.DEFAULT_SOUND;
		notificacao.flags 	 |= Notification.FLAG_AUTO_CANCEL; 

		
		// id (n˙mero ˙nico) que identifica esta notificaÁ„o. Mesmo id utilizado para cancelar
		nm.notify(R.string.app_name, notificacao);
	}
    
    
    
}