package br.listview.com;



import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageAdapter extends ArrayAdapter<String> 
{ 
    Activity context;
    String[] items;
    boolean[] arrows;
    int layoutId;
    int textId;
    int imageId;
    Color color;
    
    
    ImageAdapter(Activity context, int layoutId, int textId, int imageId, String[] items, boolean[] arrows) 
    { 
        super(context, layoutId, items); 

        this.context = context; 
        this.items = items;
        this.arrows = arrows;
        this.layoutId = layoutId;
        this.textId = textId; 
        this.imageId = imageId;
    } 

    public View getView(int pos, View convertView, ViewGroup parent) 
    { 
        LayoutInflater inflater=context.getLayoutInflater(); 
        View row = inflater.inflate(layoutId, null); 
        TextView label=(TextView)row.findViewById(textId); 
        
        
        label.setText(items[pos]);
        
        if (arrows[0])  
        { 
        	ImageView icon=(ImageView)row.findViewById(imageId);  
            icon.setImageResource(R.drawable.arrow); 
        }  
        
        

        return(row); 
    } 
} 