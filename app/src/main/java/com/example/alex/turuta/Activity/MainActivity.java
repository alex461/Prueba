package com.example.alex.turuta.Activity;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.example.alex.turuta.Adaptador.DialogoPersonalizado;
import com.example.alex.turuta.Adaptador.DialogoPersonalizado2;
import com.example.alex.turuta.R;

public class MainActivity extends FragmentActivity {


    FloatingActionButton btftaxi ,btfbus;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  showToolbar("     OPCION DE RUTA");
        cast();

        context=this;
        new DialogoPersonalizado(context);

    btftaxi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        new DialogoPersonalizado2(context);

        }
    });

    }

    private void cast() {
        btftaxi = findViewById(R.id.btftaxi);
        btfbus = findViewById(R.id.btfbus);

    }



   /* private void showToolbar(String tittle) {
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setLogo(R.drawable.group_95);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

    }*/




}
