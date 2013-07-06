package br.webview.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WebViewDevMobileActivity extends Activity {
  Button btnMostrar;
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
btnMostrar = (Button)findViewById(R.id.btnMostrar);
btnMostrar.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		Intent intent = new Intent(WebViewDevMobileActivity.this, SiteActivity.class);
		WebViewDevMobileActivity.this.startActivity(intent);
		finish();
		
	}
});

    }
}