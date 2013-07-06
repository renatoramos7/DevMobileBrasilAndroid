package br.imagens.com;

import android.content.Context;
import android.view.*;
import android.widget.*;

public class ImageAdapter extends BaseAdapter {

	private Context Context;

	private int[] Images = { R.drawable.foto1, R.drawable.foto2,
			R.drawable.foto3, R.drawable.foto4, R.drawable.foto5,
			R.drawable.foto6, R.drawable.foto7, R.drawable.foto8 };

	public ImageAdapter(Context c) {
		this.Context = c;
	}

	public int getCount() {
		return this.Images.length;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView img = new ImageView(this.Context);
		img.setImageResource(this.Images[position]);
		img.setScaleType(ImageView.ScaleType.FIT_XY);
		img.setLayoutParams(new Gallery.LayoutParams(165, 165));
		return img;
	}

	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}
}
