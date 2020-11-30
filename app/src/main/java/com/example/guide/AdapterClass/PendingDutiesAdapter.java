package com.example.guide.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guide.Model.Pending;
import com.example.guide.R;

import java.util.ArrayList;

public class PendingDutiesAdapter extends RecyclerView.Adapter<PendingDutiesAdapter.RecViewHolder> {

    Context context;
   private ArrayList<Pending> demolist;


    public PendingDutiesAdapter(Context context, ArrayList<Pending> demolist) {
        this.context = context;
        this.demolist = demolist;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tourpending, parent, false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, final int position) {

        holder.tourcity.setText(demolist.get(position).getTours());
        holder.travels.setText(demolist.get(position).getTravelers());
        holder.tourstarts.setText(demolist.get(position).getTourstarts());
        holder.tourends.setText(demolist.get(position).getTourends());
        holder.language.setText(demolist.get(position).getLanguage());
//        holder.backarrow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(context, ItemOrderDetails_Activity.class);
//                context.startActivity(intent);
//            }
//        });
//        holder.itemdetaillayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    @Override
    public int getItemCount() {

        return demolist.size();
    }



    class RecViewHolder extends RecyclerView.ViewHolder {

       TextView tourcity,travels,tourstarts,tourends,language;
      ImageView backarrow;
//       RelativeLayout itemdetaillayout;

        public RecViewHolder(@NonNull final View itemView) {

            super(itemView);

            tourcity= itemView.findViewById(R.id.tourcity);
            travels=itemView.findViewById(R.id.travelrs);
            tourstarts = itemView.findViewById(R.id.tourstarts);
            tourends=itemView.findViewById(R.id.tourends);
            language=itemView.findViewById(R.id.language);
            backarrow=itemView.findViewById(R.id.backarrow);
//            itemdetaillayout=itemView.findViewById(R.id.relativelayout);

        }
    }
}