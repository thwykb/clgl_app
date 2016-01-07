package com.gdsx.clgl.view;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.gdsx.clgl.R;
import com.gdsx.clgl.tricks.Constants;
import com.gdsx.clgl.tricks.HomeGridViewAdapter;
import com.gdsx.clgl.tricks.PhotoAdapter;

import java.util.ArrayList;
import java.util.List;

import me.iwf.photopicker.PhotoPagerActivity;
import me.iwf.photopicker.PhotoPickerActivity;
import me.iwf.photopicker.utils.PhotoPickerIntent;

/**
 * Created by mglory on 2015/12/18.
 */
public class FragmentHome extends Fragment implements AdapterView.OnItemClickListener{
    private String[] gridlist;


    private GridView gd;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        gd = (GridView)view.findViewById(R.id.home_gridview);
        initView();
        return view;
    }

    public void initView(){
        gridlist = getResources().getStringArray(R.array.home_grid);
        HomeGridViewAdapter adapter = new HomeGridViewAdapter(getActivity(),gridlist);
        gd.setAdapter(adapter);
        gd.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(getActivity(),TakePhotoActivity.class));
                break;
        }
    }

}
