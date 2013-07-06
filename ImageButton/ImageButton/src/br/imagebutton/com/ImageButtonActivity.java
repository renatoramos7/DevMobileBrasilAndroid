package br.imagebutton.com;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
 
public class ImageButtonActivity extends Activity {
//Declarando o ImageView e TextView
ImageView img;
TextView text1;
 
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);
 
// capturando o ImageView
 
img = (ImageView) findViewById(R.id.img);
 
//capturando o TextView
 
text1 = (TextView)findViewById(R.id.text1);
 
// Capturando os botoes (ImageButton)
 
ImageButton Btn1 = (ImageButton) findViewById(R.id.b1);
ImageButton Btn2 = (ImageButton) findViewById(R.id.b2);
ImageButton Btn3 = (ImageButton) findViewById(R.id.b3);
ImageButton Btn4 = (ImageButton) findViewById(R.id.b4);
ImageButton Btn5 = (ImageButton) findViewById(R.id.b5);
ImageButton Btn6 = (ImageButton) findViewById(R.id.b6);
ImageButton Btn7 = (ImageButton) findViewById(R.id.b7);
ImageButton Btn8 = (ImageButton) findViewById(R.id.b8);
 
//Evento ao clicar no ImageButton
Btn1.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto1);
text1.setText("Brasil");
 
}
});
 
Btn2.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto2);
text1.setText("Uruguai");
 
}
});
 
Btn3.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto3);
text1.setText("Alemanha");
 
}
});
 
Btn4.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto4);
text1.setText("França");
 
}
});
Btn5.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto5);
text1.setText("Argentina");
 
}
});
Btn6.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto6);
text1.setText("Japao");
 
}
});
Btn7.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto7);
text1.setText("Paraguai");
 
}
});
Btn8.setOnClickListener(new View.OnClickListener() {
 
@Override
public void onClick(View arg0) {
img.setImageResource(R.drawable.foto8);
text1.setText("Jamaica");
 
}
});
 
}
 
}