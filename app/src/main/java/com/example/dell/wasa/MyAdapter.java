package com.example.vikas.wasa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
/**
 * Created by Hp on 3/17/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> implements Filterable{
    Context c;
    ArrayList<Player> players,filterList;
    CustomFilter filter;
    public MyAdapter(Context ctx,ArrayList<Player> players)
    {
        this.c=ctx;
        this.players=players;
        this.filterList=players;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //CONVERT XML TO VIEW ONBJ
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        //HOLDER
        MyHolder holder=new MyHolder(v);

        return holder;
    }
    //DATA BOUND TO VIEWS
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        //BIND DATA
        holder.posTxt.setText(players.get(position).getPos());
        holder.nameTxt.setText(players.get(position).getName());
        holder.img.setImageResource(players.get(position).getImg());
        //IMPLEMENT CLICK LISTENET
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
switch (pos){
    case 0:c.startActivity(new Intent(c,newp.class));
        break;
    case 1:
        c.startActivity(new Intent(c,newp.class));
        break;
    case 2:
        c.startActivity(new Intent(c,newp.class));
        break;
    case 3:
        c.startActivity(new Intent(c,newp.class));
        break;
    case 4:
        c.startActivity(new Intent(c,newp.class));
        break;


    default:break;
}
            }
        });
    }
    //GET TOTAL NUM OF PLAYERS
    @Override
    public int getItemCount() {
        return players.size();
    }
    //RETURN FILTER OBJ
    @Override
    public Filter getFilter() {
        if(filter==null)
        {
            filter=new CustomFilter(filterList,this);
        }
        return filter;
    }
}
