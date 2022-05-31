package com.example.homeworkfragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentNFL extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("TAG", "onCreate NFL");

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

       // View viewNFL = inflater.inflate(R.layout.fragment_n_f_l, null);
        Button buttonWallpaper = (Button)view.findViewById(R.id.buttonWallpaper);
        buttonWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FragmentNFL.this.getActivity(), Wallpaper.class);
                startActivity(intent);
            }
        });

        Log.d("TAG", "onCreateView NFL");
        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("TAG", "onAttach NFL");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG", "onStart NFL");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG","onResume NFL");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG", "onPause NFL");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG", "onStop NFL");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG", "onDestroyView NFL");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy NFL");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG","onDetach NFL");
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("TAG", "onViewStateRestore NFL");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("TAG","onSaveInstanceState NFL");
    }
}