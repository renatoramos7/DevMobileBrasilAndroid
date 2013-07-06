package br.splash.com;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

public class MyApp extends Activity {

	private ProgressDialog dialog;
	private WebView myWebView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		dialog = ProgressDialog.show(MyApp.this, "Dev Moble Brasil","Carregando Site.... \n Agarde !!", false, true);
		dialog.setIcon(R.drawable.ic_launcher);
		dialog.setCancelable(false);

		new Thread() {

			public void run() {

				try {

					myWebView = (WebView) findViewById(R.id.webView1);
					myWebView.getSettings().setJavaScriptEnabled(true);
					myWebView.loadUrl("http://devmobilebrasil.com.br");
					Thread.sleep(5000);

					dialog.dismiss();
				} catch (Exception e) {
				}
			}
		}.start();

	}

}
