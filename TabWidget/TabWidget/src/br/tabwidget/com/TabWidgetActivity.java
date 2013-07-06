package br.tabwidget.com;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabWidgetActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TabHost tbHost = getTabHost();
		TabHost.TabSpec Spec;
		Intent intent;

		intent = new Intent().setClass(this, AppTela1.class);
		Spec = tbHost.newTabSpec("tab1").setIndicator("Tela1")
				.setContent(intent);
		tbHost.addTab(Spec);

		intent = new Intent().setClass(this, AppTela2.class);
		Spec = tbHost.newTabSpec("tab2").setIndicator("Tela2")
				.setContent(intent);
		tbHost.addTab(Spec);

		intent = new Intent().setClass(this, AppTela3.class);
		Spec = tbHost.newTabSpec("tab3").setIndicator("Tela3")
				.setContent(intent);
		tbHost.addTab(Spec);

		tbHost.setCurrentTab(0);

	}
}