package com.hfad.lab4v2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class FragmentList extends ListFragment implements AdapterView.OnItemClickListener {


    public FragmentList() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.SmaklosaAlbums, android.R.layout.simple_list_item_1);

        setListAdapter(adapter);

        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String[] smaklosaAlbum = getActivity().getResources().getStringArray(R.array.SmaklosaAlbums);
        Toast.makeText(getActivity(), "Öppnar " + smaklosaAlbum[position], Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), InformationActivity.class);

        intent.putExtra("AlbumID", smaklosaAlbum[position]);

        startActivity(intent);

    }
}