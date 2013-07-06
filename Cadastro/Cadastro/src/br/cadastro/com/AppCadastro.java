package br.cadastro.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class AppCadastro extends Activity {
   Registro pri, reg, ult, aux;
   EditText ednome, edendereco, edcidade,edtelefone;
   int numreg,pos;
   
   void CarregaTelaInicial(){
	   setContentView(R.layout.main);
	   Button btnovo = (Button)findViewById(R.id.btnovo);
	   Button btcadastrados = (Button)findViewById(R.id.btcadastrados);
	   
	   btnovo.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			CarregaTelaCadastro();
			
		}
	});
	   
	   btcadastrados.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			CarregaTelaCadastrados();
			
		}
	});
   
   }
	   
	   void CarregaTelaCadastro(){
		   
		   setContentView (R.layout.cadastro);
		   
		   Button btconfirma = (Button)findViewById(R.cadastro.btconfirma);
		   Button btcancelar = (Button)findViewById(R.cadastro.btcancelar);
		   
		   btconfirma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					reg = new Registro();
					
					ednome = (EditText)findViewById(R.cadastro.ednome);
					edendereco = (EditText)findViewById(R.cadastro.edendereco);
					edcidade = (EditText)findViewById(R.cadastro.edcidade);
					edtelefone = (EditText)findViewById(R.cadastro.edtelefone);
					
					reg.nome = ednome.getText().toString();
					reg.endereco = edendereco.getText().toString();
					reg.cidade = edcidade.getText().toString();
					reg.telefone = edtelefone.getText().toString();
					
					if(pri==null)
						pri=reg;
					
					reg.Ant = ult;
					if(ult==null)
						ult=reg;
					else{
						ult.Prox=reg;
						ult=reg;
					}
				
				numreg++;
				showMessage("Cadastrado com Exito", AppCadastro.this);
				CarregaTelaInicial();
				
			}
			catch(Exception e){
				showMessage("Erro Ao efetivar o cadastro", AppCadastro.this);
				
			}}
		});
	   
		   btcancelar.setOnClickListener (new View.OnClickListener() {
			   public void onClick(View arg0){
				   CarregaTelaInicial();
			   }
		   });
	   
   }

       void CarregaTelaCadastrados(){
    	   if (numreg==0){
    		   showMessage("Não consta Cadastro", AppCadastro.this);
    		   
    		   CarregaTelaInicial();
    		   return;
    	   }
    	   
    	   setContentView(R.layout.cadastrados);
    	   pos=1;
    	   aux=pri;
    	   TextView txtnome = (TextView)findViewById(R.cadastrados.txtnome);
    	   TextView txtendereco = (TextView)findViewById(R.cadastrados.txtendereco);
    	   TextView txtcidade = (TextView)findViewById(R.cadastrados.txtcidade);
    	   TextView txttelefone = (TextView)findViewById(R.cadastrados.txttelefone);
    	   
    	   Button btmenu = (Button)findViewById(R.cadastrados.btmenu);
    	   Button btavancar = (Button)findViewById(R.cadastrados.btavancar);
    	   Button btvoltar = (Button)findViewById(R.cadastrados.btvoltar);
    	   
    	   txtnome.setText(aux.nome);
    	   txtendereco.setText(aux.endereco);
    	   txtcidade.setText(aux.cidade);
    	   txttelefone.setText(aux.telefone);
    	   
    	   btmenu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				CarregaTelaInicial();
				
				
			}
		});
    	   
    	   btvoltar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				if(pos==1)
					return;
				pos--;
				aux=aux.Ant;
				TextView txtnome = (TextView)findViewById(R.cadastrados.txtnome);
				TextView txtendereco = (TextView)findViewById(R.cadastrados.txtendereco);
				TextView txtcidade = (TextView)findViewById(R.cadastrados.txtcidade);
				TextView txttelefone = (TextView)findViewById(R.cadastrados.txttelefone);
				
				txtnome.setText(aux.nome);
				txtendereco.setText(aux.endereco);
				txtcidade.setText(aux.cidade);
				txttelefone.setText(aux.telefone);
				
					
			}
		});
    	 
    	   btavancar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(pos==numreg)
					return;
				pos++;
				aux=aux.Prox;
				TextView txtnome = (TextView)findViewById(R.cadastrados.txtnome);
				TextView txtendereco = (TextView)findViewById(R.cadastrados.txtendereco);
				TextView txtcidade = (TextView)findViewById(R.cadastrados.txtcidade);
				TextView txttelefone = (TextView)findViewById(R.cadastrados.txttelefone);
				
				txtnome.setText(aux.nome);
				txtendereco.setText(aux.endereco);
				txtcidade.setText(aux.cidade);
				txttelefone.setText(aux.telefone);
				
			}
		});
    	   
       }
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numreg=0;
        pri=ult=null;
        CarregaTelaInicial();
        
    }
 // METODO DE MENSAGEM NA TELA DO USUARIO
    public void showMessage(String Caption, Activity activity) {

    // GERANDO UMA INSTANCIA DA CLASSE DIALOG
    AlertDialog.Builder dialogo = new AlertDialog.Builder(activity);

    // GERANDO O BOX DE MENSAGEM
    dialogo.setTitle("Atencao");
    dialogo.setMessage(Caption);
    dialogo.setNeutralButton("OK", null);
    dialogo.show();
    }
}