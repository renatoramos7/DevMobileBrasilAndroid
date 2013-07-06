package br.webview.com;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SiteActivity extends Activity {

	private WebView myWebView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.site);

		myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.getSettings().setJavaScriptEnabled(true);
		myWebView.loadUrl("http://www.devmobilebrasil.com.br");

	}
}