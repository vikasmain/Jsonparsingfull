package com.example.vikas.wasa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hp on 3/17/2016.
 */
public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //OUR VIEWS
    Context ctx;
    ImageView img;
    TextView nameTxt,posTxt;
    ItemClickListener itemClickListener;
    public MyHolder(View itemView) {
        super(itemView);
        this.img= (ImageView) itemView.findViewById(R.id.kapil);
        this.nameTxt= (TextView) itemView.findViewById(R.id.textkaps);
        this.posTxt= (TextView) itemView.findViewById(R.id.tgdg);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}