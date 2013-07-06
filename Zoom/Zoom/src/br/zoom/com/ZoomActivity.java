package br.zoom.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ZoomControls;

public class ZoomActivity extends Activity {
	/** Called when the activity is first created. */
	ZoomControls ZmControls;
	ImageView imagem;

	int sizeX = 130, sizeY = 100;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ZmControls = (ZoomControls) findViewById(R.id.ZmControls);
		imagem = (ImageView) findViewById(R.id.image1);

		ZmControls.setOnZoomInClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				sizeX += 6;
				sizeY += 6;
				imagem.setLayoutParams(new LinearLayout.LayoutParams(sizeX,
						sizeY));

			}
		});

		ZmControls.setOnZoomOutClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sizeX -= 6;
				sizeY -= 6;

				imagem.setLayoutParams(new LinearLayout.LayoutParams(sizeX,
						sizeY));
			}
		});

	}
}