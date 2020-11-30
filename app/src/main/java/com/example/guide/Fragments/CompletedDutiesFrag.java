package com.example.guide.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.guide.AdapterClass.CompletedDutiesAdapter;
import com.example.guide.Model.Pending;
import com.example.guide.R;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
public class CompletedDutiesFrag extends Fragment {

  CompletedDutiesAdapter completedDutiesAdapter;
    RecyclerView m_rec_pen;
    ArrayList<Pending> Completedduties;
    private NavigationView sidebarnavigation;
    public CompletedDutiesFrag() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_completedtour, container, false);
        m_rec_pen=view.findViewById(R.id.recpen);
        sidebarnavigation=view.findViewById(R.id.nav_view);
        Completedduties=new ArrayList<>();
        Completedduties=new ArrayList<>();
        itemPen();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        m_rec_pen.setLayoutManager(layoutManager);
        completedDutiesAdapter=new CompletedDutiesAdapter(getContext(),Completedduties);
        m_rec_pen.setAdapter(completedDutiesAdapter);
        return view;
    }
    public void itemPen() {
        Completedduties.add(new Pending("Agra City Tour", "Travelers: 7", "Tour Starts: 07:00 am 13-11-2020\nDomestic Airport of Agra", "Tour Ends: 05:00 pm 13-11-2020\nDomestic Airport of Agra","Language: English"));
        Completedduties.add(new Pending("Tour Guide Taj Mahal Agra", "Travelers: 8", "Tour Starts: 08:00 am 03-11-2020\nAgra Fort, Agra ", "Tour Ends: 06:00 pm 03-11-2020\nHotel Goverdhan, Fathepur sikri","Language: English"));
        Completedduties.add(new Pending("Fatehpur Sikri - Agra", "Travelers: 9", "Tour Starts: 08:30 am 02-11-2020\nHotel Goverdhan, Fathpur sikri", "Tour Ends: 07:00 pm 02-11-2020\nFatehpur Sikri Railway Station","Language: English"));

    }}