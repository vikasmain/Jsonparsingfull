package com.example.vikas.wasa;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by dell on 1/6/2017.
 */
public class download extends Activity {
    public static final String Title="urlvideo";
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String VideoURL = getIntent().getStringExtra(Title);
setContentView(R.layout.downloa);
        DownloadManager.Request request=new DownloadManager.Request(Uri.parse(VideoURL));
        request.setTitle("Dhonifan");
        request.setDescription("File is being downloaded");
        //request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI);
    request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
DownloadManager manager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        Long re=manager.enqueue(request);


    }
}
