package com.example.guide.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guide.AdapterClass.AlertAdapter;
import com.example.guide.Model.Alert;
import com.example.guide.R;

import java.util.ArrayList;

public class AlertFrag extends Fragment {

    AlertAdapter alertAdapter;
    RecyclerView alerRecyclerview;
    ArrayList<Alert> alertfra;
    public AlertFrag() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_alert, container, false);
        alerRecyclerview=view.findViewById(R.id.alerrecycler);
        alertfra=new ArrayList<>();
        itemPen();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        alerRecyclerview.setLayoutManager(layoutManager);
        alertAdapter=new AlertAdapter(getContext(),alertfra);
        alerRecyclerview.setAdapter(alertAdapter);

        return view;
    }
    public void itemPen()
    {
        alertfra.add(new Alert("You have a tour assigned to you.","10 minutes ago ","Pending"));
        alertfra.add(new Alert("You have a tour assigned to you.","15 minutes ago  ","Pending"));
        alertfra.add(new Alert("Fantastic! Your tour is completed.","18 minutes ago  ","Completed"));
        alertfra.add(new Alert("You have a tour assigned to you.","15 Oct at 4:00pm","Pending"));
        alertfra.add(new Alert("You have a tour assigned to you.","15 Oct at 3:40pm","Pending"));
        alertfra.add(new Alert("You have a tour assigned to you.","15 Oct at 2:00pm","Pending"));
        alertfra.add(new Alert("Fantastic! Your tour is completed.","15 Oct at 11:40pm","Completed"));
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}