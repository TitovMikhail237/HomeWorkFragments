package com.example.homeworkfragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentNFL extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_n_f_l, null);
        Button buttonNFLToSite = (Button) view.findViewById(R.id.buttonNFLToSite);
        buttonNFLToSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.nfl.com"));
                requireContext().startActivity(intent);

            }
        });
        return view;
    }


//    public void UFC(View view){
//        Intent browserIntent = new Intent(
//                Intent.ACTION_VIEW, Uri.parse("https://www.nfl.com")
//        );
//        getContext().startActivity(browserIntent);
//    }
}