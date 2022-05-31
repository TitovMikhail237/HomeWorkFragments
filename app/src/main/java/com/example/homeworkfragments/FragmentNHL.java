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
import android.view.animation.Animation;
import android.widget.Button;


public class FragmentNHL extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("TAG", "onCreate NHL");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_n_h_l, null);
        Button buttonNHLToSite = (Button)view.findViewById(R.id.buttonNHLToSite);
        buttonNHLToSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhl.com"));
                requireContext().startActivity(intent);
            }
        });
        Log.d("TAG","onCreateView NHL");
        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("TAG", "onAttach NHL");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG", "onStart NHL");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG","onResume NHL");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG", "onPause NHL");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG", "onStop NHL");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG", "onDestroyView NHL");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy NHL");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG","onDetach NHL");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("TAG", "onViewStateRestore NHL");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("TAG","onSaveInstanceState NHL");
    }
}