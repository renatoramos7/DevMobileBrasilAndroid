package br.player.com;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends Activity {
	Button btplay, btpausar;
	MediaPlayer Player;
	boolean Click;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btplay = (Button) findViewById(R.id.bttocar);
		btpausar = (Button) findViewById(R.id.btpausar);
		Player = MediaPlayer.create(this, R.raw.player);

		try {
			Player.prepare();
		} catch (Exception e) {
		}

		btplay.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Player.start();

			}
		});
		
		btpausar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Player.pause();

			}
		});
		

	}
}