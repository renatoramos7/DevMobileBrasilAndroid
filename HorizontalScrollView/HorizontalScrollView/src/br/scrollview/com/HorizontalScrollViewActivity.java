package br.scrollview.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HorizontalScrollViewActivity extends Activity {
	/** Called when the activity is first created. */
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ImageButton Btn1 = (ImageButton) findViewById(R.id.b1);
		ImageButton Btn2 = (ImageButton) findViewById(R.id.b2);
		ImageButton Btn3 = (ImageButton) findViewById(R.id.b3);
		ImageButton Btn4 = (ImageButton) findViewById(R.id.b4);
		ImageButton Btn5 = (ImageButton) findViewById(R.id.b5);
		ImageButton Btn6 = (ImageButton) findViewById(R.id.b6);

		Btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(HorizontalScrollViewActivity.this,
						SegundaTela.class);
				HorizontalScrollViewActivity.this.startActivity(intent);

			}
		});

		Btn2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(HorizontalScrollViewActivity.this,
						SegundaTela.class);
				HorizontalScrollViewActivity.this.startActivity(intent);

			}
		});

		Btn3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(HorizontalScrollViewActivity.this,
						SegundaTela.class);
				HorizontalScrollViewActivity.this.startActivity(intent);

			}
		});
		Btn4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(HorizontalScrollViewActivity.this,
						SegundaTela.class);
				HorizontalScrollViewActivity.this.startActivity(intent);

			}
		});
		Btn5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(HorizontalScrollViewActivity.this,
						SegundaTela.class);
				HorizontalScrollViewActivity.this.startActivity(intent);

			}
		});
		Btn6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(HorizontalScrollViewActivity.this,
						SegundaTela.class);
				HorizontalScrollViewActivity.this.startActivity(intent);

			}
		});

	}

}
