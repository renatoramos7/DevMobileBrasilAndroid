package br.instalacao.com;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.widget.*;

public class AppInstalar extends Activity implements Runnable {
	
	ProgressBar pb;
	Button bt;
	Thread td;
	Handler hd;
	int it;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        pb = (ProgressBar)findViewById(R.id.pbstatus);
        bt = (Button)findViewById(R.id.btinstalar);
        
        bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				hd=new Handler();
				td = new Thread(AppInstalar.this);
				
				td.start();
			}
		});
    }
    
    public void run(){
    	it=1;
    	try{
    		while(it<=100){
    			Thread.sleep(100);
    			hd.post(new Runnable (){
    				
    				public void run(){
    					pb.setProgress(it++);
    				}
    			
    		});
    	}
    	}catch (Exception e){}
    	
    	
    	
    }
}