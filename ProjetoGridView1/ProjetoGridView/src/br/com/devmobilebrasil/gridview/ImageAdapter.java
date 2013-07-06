package br.com.devmobilebrasil.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context context;
	private final int[] fotos;
	private final android.view.ViewGroup.LayoutParams params;

	// Método
	public ImageAdapter(Context context, int[] fotos,
			android.view.ViewGroup.LayoutParams params) {
		this.context = context;
		this.fotos = fotos;
		this.params = params;
	}

	public int getCount() {
		return fotos.length;
	}

	@Override
	public Object getItem(int position) {

		return position;
	}

	@Override
	public long getItemId(int position) {

		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imagem = new ImageView(context);
		imagem.setImageResource(fotos[position]);
		imagem.setAdjustViewBounds(true);
		imagem.setLayoutParams(params);
		return imagem;

	}

}
