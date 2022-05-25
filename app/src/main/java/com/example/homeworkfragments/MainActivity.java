package com.example.homeworkfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNHL = findViewById(R.id.buttonNHL);
        buttonNHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentNHL fragmentNHL = new FragmentNHL();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.conteiner, fragmentNHL);
                fragmentTransaction.commit();

            }
        });

        Button buttonNFL = findViewById(R.id.buttonNFL);
        buttonNFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentNFL fragmentNFL = new FragmentNFL();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.conteiner, fragmentNFL);
                fragmentTransaction.commit();
            }
        });

        Button buttonUFC = findViewById(R.id.buttonUFC);
        buttonUFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentUFC fragmentUFC = new FragmentUFC();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.conteiner, fragmentUFC);
                fragmentTransaction.commit();
            }
        });
    }

//    public void onClick1(){
//
//    }
//    public void onClick2(){
//
//    }
//    public void onClick3(){
//
//
//    }
}