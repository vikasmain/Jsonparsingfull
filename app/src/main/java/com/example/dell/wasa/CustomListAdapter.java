package com.example.vikas.wasa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Movie> movieItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Movie> movieItems) {
        this.activity = activity;
        this.movieItems = movieItems;
    }

    @Override
    public int getCount() {
        return movieItems.size();
    }

    @Override
    public Object getItem(int location) {
        return movieItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView thumbNail = (NetworkImageView) convertView
                .findViewById(R.id.profilePic);
        TextView title = (TextView) convertView.findViewById(R.id.name);
        TextView rating = (TextView) convertView.findViewById(R.id.timestamp);
        TextView genre = (TextView) convertView.findViewById(R.id.txtStatusMsg);
        TextView url = (TextView) convertView.findViewById(R.id.txtUrl);
        TextView lo1=(TextView)convertView.findViewById(R.id.lotext);
        FeedImageView feedImageView = (FeedImageView) convertView


                .findViewById(R.id.feedImage1);

        // getting movie data for the row
        Movie m = movieItems.get(position);

        // thumbnail image
        thumbNail.setImageUrl(m.getThumbnailUrl(), imageLoader);

        // title
        title.setText(m.getTitle());
        if (m.getUrl() != null) {
            url.setText(Html.fromHtml("<a href=\"" + m.getUrl() + "\">"
                    + m.getUrl() + "</a> "));

            // Making url clickable
            url.setMovementMethod(LinkMovementMethod.getInstance());
            url.setVisibility(View.VISIBLE);
        } else {
            // url is null, remove from the view
            url.setVisibility(View.GONE);
        }

        // rating
        rating.setText("Rating: " + String.valueOf(m.getRating()));
        if (m.getThumbnailUrl() != null) {
            feedImageView.setImageUrl(m.getThumbnailUrl(), imageLoader);
            feedImageView.setVisibility(View.VISIBLE);
            feedImageView
                    .setResponseObserver(new FeedImageView.ResponseObserver() {
                        @Override
                        public void onError() {
                        }

                        @Override
                        public void onSuccess() {
                        }
                    });
        } else {
            feedImageView.setVisibility(View.GONE);
        }
lo1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
long po=getItemId(position);
        if (po == 0) {
            Intent intent = new Intent(activity, myswl.class);
            activity.startActivity(intent);

        } else if (po == 1) {
            Intent intent2 = new Intent(activity, mwl.class);
            activity.startActivity(intent2);

        } else if (po == 2) {
            Intent intent3 = new Intent(activity, mwl2.class);
            activity.startActivity(intent3);

        } else if (po == 3) {
            Intent intent4 = new Intent(activity, mwl.class);
            activity.startActivity(intent4);

        } else if (po == 4) {
            Intent intent5 = new Intent(activity, mwl.class);
            activity.startActivity(intent5);

        } else if (po == 5) {
            Intent intent6 = new Intent(activity, mwl.class);
            activity.startActivity(intent6);

        } else {
        }
    }
});
     // genre
        String genreStr = "";
        for (String str : m.getGenre()) {
            genreStr += str + ", ";
        }
        genreStr = genreStr.length() > 0 ? genreStr.substring(0,
                genreStr.length() - 2) : genreStr;
        genre.setText(genreStr);

        // release year

        return convertView;
    }

}