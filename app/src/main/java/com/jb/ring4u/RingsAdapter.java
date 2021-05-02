package com.jb.ring4u;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jb.ring4u.model.WeddingRing;

import java.util.List;

public class RingsAdapter extends ArrayAdapter<WeddingRing> {

    private final LayoutInflater mInflater;
    private int mLayoutRes;

    public RingsAdapter(Context context, int layoutRes,List<WeddingRing> objects){
        super(context,layoutRes,objects);
        mInflater = LayoutInflater.from(context);
        mLayoutRes=layoutRes;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /*1.Fetch*/
        WeddingRing ring = getItem(position);
        /*2.1 Create*/
        View rowView = mInflater.inflate(mLayoutRes, parent, false);

        ImageView image = rowView.findViewById(R.id.iv_ring);
        TextView name = rowView.findViewById(R.id.tv_name);
        TextView price = rowView.findViewById(R.id.tv_price);
        TextView code = rowView.findViewById(R.id.tv_code);
        /*2.2 Bind*/
        image.setImageResource(ring.getImage());
        name.setText(ring.getName());
        price.setText(String.valueOf(ring.getPrice()));
        code.setText(ring.getCode());
        /*3.Pass*/
        return rowView;
    }
}
