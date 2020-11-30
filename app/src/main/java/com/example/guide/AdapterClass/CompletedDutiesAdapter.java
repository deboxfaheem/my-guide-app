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
public class CompletedDutiesAdapter extends RecyclerView.Adapter<CompletedDutiesAdapter.RecViewHolder> {
    Context context;
    private ArrayList<Pending> demolist;


    public CompletedDutiesAdapter(Context context, ArrayList<Pending> demolist) {
        this.context = context;
        this.demolist = demolist;
    }

    @NonNull
    @Override
    public CompletedDutiesAdapter.RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.completedtours, parent, false);
        return new CompletedDutiesAdapter.RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        holder.tourcity.setText(demolist.get(position).getTours());
        holder.travels.setText(demolist.get(position).getTravelers());
        holder.tourstarts.setText(demolist.get(position).getTourstarts());
        holder.tourends.setText(demolist.get(position).getTourends());
        holder.language.setText(demolist.get(position).getLanguage());
////
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

        }
    }
}