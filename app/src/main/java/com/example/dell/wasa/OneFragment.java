package com.example.dell.wasa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dell on 1/5/2017.
 */
public class OneFragment extends Fragment {
   private RecyclerView recyclerView;
    String string[]={"KAps","holmes","komes","loomies","holwps","dhbb","vdd","bbdd"};
    String string2[]={"kapilsharma","yes we got this in the last","yo you can","ya what is this","yrfhednj","jdnjsnd sd s d sd sn ds","sghdbshdbhsd dh sdn","hdbsnsandd  dn ahd"};
    int fgg[]={R.drawable.nw,R.drawable.nw,R.drawable.nw,R.drawable.nw,R.drawable.nw,R.drawable.nw,R.drawable.nw,R.drawable.nw};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ci,container,false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new Myadapter(getActivity(),string,fgg,string2));

        return view;
    }
}
