package com.example.dell.wasa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;

/**
 * Created by dell on 12/30/2016.
 */
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder> {
private Context context;

    private static String Title="urlvideo";
    ArrayList<Album> albumList=new ArrayList<>();
  public class MyViewHolder extends RecyclerView.ViewHolder  {
      public TextView title,count;
      Context cptx;
      public NetworkImageView thumbnail;
              public ImageView cover;
      ArrayList<Album> albumList=new ArrayList<>();
Context context;
public Button button;
      public MyViewHolder(View itemView) {
          super(itemView);
          this.albumList=albumList;
          title=(TextView)itemView.findViewById(R.id.title);
          count=(TextView)itemView.findViewById(R.id.count);
          thumbnail= (NetworkImageView) itemView.findViewById(R.id.thumbnail);
          cover=(ImageView) itemView.findViewById(R.id.cover);




      }





  }
    public AlbumAdapter(Context context,ArrayList<Album> albumList){
        this.context=context;
        this.albumList=albumList;
    }
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewtype){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_card,parent,false);
       return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final AlbumAdapter.MyViewHolder holder, final int position) {
final Album album=albumList.get(position);
        ImageLoader imageLoader = AppController.getInstance().getImageLoader();
        holder.thumbnail.setImageUrl(album.getNoofthumbnails(),imageLoader);

        holder.title.setText(album.getName());
        holder.count.setText(album.getNoofsongs()+"songs");
holder.count.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name=album.getUrls();
        Intent intent=new Intent(context,VideoViewActivity.class);
        intent.putExtra(Title,name);
        context.startActivity(intent);
    }
});
        holder.cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPOPmenu(holder.cover);
            }
        });

    }
private void showPOPmenu(View view){
    PopupMenu popupMenu=new PopupMenu(context,view);
    MenuInflater menuInflater=popupMenu.getMenuInflater();
    menuInflater.inflate(R.menu.menu_main,popupMenu.getMenu());
    popupMenu.setOnMenuItemClickListener(new MymenuItemlistener());
    popupMenu.show();

}
    class MymenuItemlistener implements PopupMenu.OnMenuItemClickListener{
        Context ctx;


        public MymenuItemlistener(){

        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch(item.getItemId()){
                case R.id.action_add:
                                    show2(context);

                                    break;
                case R.id.action_addme:
MainActivity.showme(context);
                                       break;
                default:
                       break;
            }


            return false;
        }
    }
    @Override
    public int getItemCount() {
        return albumList.size();
    }
    public void show(){



    }
private void show2(Context context1){

Album album=new Album();
    Intent intent = new Intent(context1, a.class);
    intent.putExtra(Title,album.getName());
    context1.startActivity(intent);
}
}
