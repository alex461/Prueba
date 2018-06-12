package com.example.alex.turuta.Fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alex.turuta.Adaptador.MyAdapter;
import com.example.alex.turuta.Model.RutasModel;
import com.example.alex.turuta.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimerFragment extends Fragment {

    private List<RutasModel>model1;
    private RecyclerView miRecycle;
    private RecyclerView.Adapter miAdapter;
    private RecyclerView.LayoutManager miLayoutManager;
    private Activity activity;
    private Context context;




    public PrimerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_primer, container, false);


        model1 = this.todoslosdatos();

        miRecycle = view.findViewById(R.id.my_recycler_view);
        miLayoutManager= new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        miAdapter=new MyAdapter(model1,R.layout.card_item,activity);

        miRecycle.setLayoutManager(miLayoutManager);
        miRecycle.setAdapter(miAdapter);

        return view;
    }

    private List<RutasModel>todoslosdatos(){

        return new ArrayList<RutasModel>(){{
            add(new RutasModel(R.drawable.group_144,"S/.13",R.drawable.group_140));
            add(new RutasModel(R.drawable.group_143,"S/.10",R.drawable.group_120));
        }};
    }



}
