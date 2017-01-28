package com.example.dell.wasa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dell on 1/6/2017.
 */
public class Myadapter extends RecyclerView.Adapter<Myadapter.RecyclerVH> {
   String[] space
           ;
    String[] space2;
    int[] fgs;


    Context context;
    public Myadapter(Context contexts,String[] space,int[] fgs,String[] space2){
        this.context=contexts;
        this.space=space;
        this.fgs=fgs;
        this.space2=space2;
    }




    public class RecyclerVH extends RecyclerView.ViewHolder implements View.OnClickListener {
TextView tt,tt2;
        ImageView imageView;
        Context ctx;
        public RecyclerVH(View itemView,Context ctx) {

            super(itemView);
this.ctx=ctx;
            itemView.setOnClickListener(this);
            imageView=(ImageView) itemView.findViewById(R.id.kapil);
            tt=(TextView)itemView.findViewById(R.id.textkaps);
            tt2=(TextView)itemView.findViewById(R.id.tgdg);

        }



        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
switch (position){
    case 0:
        Intent in=new Intent(this.ctx,newp.class);
this.ctx.startActivity(in);
        break;
    default:break;
    case 1:
        Intent in2=new Intent(this.ctx,newp2.class);
        this.ctx.startActivity(in2);
}
        }
    }

    @Override
    public Myadapter.RecyclerVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.model,parent,false);
       Myadapter.RecyclerVH myadap=new Myadapter.RecyclerVH(view,context);
        return myadap;
    }

    @Override
    public void onBindViewHolder(Myadapter.RecyclerVH holder, int position) {
holder.tt.setText(space[position]);
        holder.tt2.setText(space2[position]);
        holder.imageView.setImageResource(fgs[position]);

    }

    @Override
    public int getItemCount() {
        return space.length;
    }
}
