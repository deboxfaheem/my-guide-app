package com.example.guide.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guide.AdapterClass.PendingDutiesAdapter;
import com.example.guide.Model.Pending;
import com.example.guide.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class PendingTourFrag extends Fragment {

    PendingDutiesAdapter pendingAdapter;
    RecyclerView m_rec_pen;
    private NavigationView sidebarnavigation;
    ArrayList<Pending> pendingduties;
    public PendingTourFrag() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_pendingtour, container, false);
        m_rec_pen=view.findViewById(R.id.recpen);
        sidebarnavigation=view.findViewById(R.id.nav_view);
        pendingduties=new ArrayList<>();
        itemPen();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        m_rec_pen.setLayoutManager(layoutManager);
        pendingAdapter=new PendingDutiesAdapter(getContext(),pendingduties);
        m_rec_pen.setAdapter(pendingAdapter);
        return view;
    }
    public void itemPen() {
        pendingduties.add(new Pending("Taj Mahal - Agra Fort", "Travelers: 15", "Tour Starts: 07:00 am 30-11-2020\nThe Oberoi Amarvilas Lobby,Taj East Gate Rd, Paktola, Tajganj,Agra", "Tour Ends: 05:00 pm 31-11-2020\nMankameshwar Temple,Sheb Bazar,Mantola, Agra","Language: French"));
        pendingduties.add(new Pending("Jaipur Full Day Tour - Private", "Travelers: 2", "Tour Starts: 08:00 am 05-12-2020\nHawa Mahal - Palace of wind, Jaipur ", "Tour Ends: 06:00 pm 05-12-2020\nShri Galta Peeth, Galav Ashram,Jaipur","Language: English"));
        pendingduties.add(new Pending("Delhi One Day - Full Day Tour", "Travelers: 8", "Tour Starts: 08:30 am 11-12-2020\nABC Hotel, Airport", "Tour Ends: 07:00 pm 11-12-2020\nHumayun Tomb, Delhi","Language: English"));
//

    }}