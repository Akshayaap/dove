package com.the_akshay.dove.addapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.the_akshay.dove.R;

import androidx.recyclerview.widget.RecyclerView;

public class UserAddapter {

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.SmshwImgProf);
        }
    }
}


