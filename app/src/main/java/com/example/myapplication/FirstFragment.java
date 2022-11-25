package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    ListView simpleList;
    String countryList[] = {"Inde", "Chine", "Australie", "Portugal", "Amerique", "Nouvelle Zelande"};

    public FirstFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.first_fragment, container, false);
        return rootView;


    }
}
