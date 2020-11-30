package com.example.guide.AdapterClass;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guide.Model.Alert;
import com.example.guide.R;

import java.util.ArrayList;

public class AlertAdapter extends RecyclerView.Adapter<AlertAdapter.ViewHolder> {
    private ArrayList<Alert> mAlert;
    private Context mContext;
    int index = -1;
    public AlertAdapter(Context context, ArrayList<Alert>mAlert){
        this.mContext=context;
        this.mAlert=mAlert;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(mContext).inflate(R.layout.itemalert,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
     holder.texttime.setText(mAlert.get(position).getItemtime());
     holder.textname.setText(mAlert.get(position).getItemname());
     holder.delivery.setText(mAlert.get(position).getDelivery());
//        index = position;
        holder.itemlayout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
//                notifyDataSetChanged();
                holder.itemlayout.setBackground(mContext.getResources().getDrawable(R.drawable.whiteplane_background));
                holder.delivery.setTextColor(Color.parseColor("#BE0D1B"));
                holder.delivery.setBackground(mContext.getResources().getDrawable(R.drawable.clickdeliverybackground));
                holder.imageicon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.redalericon));
            }
        });
//        if(index==position){
//            holder.itemlayout.setBackground(mContext.getResources().getDrawable(R.drawable.whiteplane_background));
//            holder.delivery.setTextColor(Color.parseColor("#008000"));
//            holder.delivery.setBackground(mContext.getResources().getDrawable(R.drawable.clickdeliverybackground));
//            holder.imageicon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.beliconcricle));
//        }else{
//            holder.itemlayout.setBackground(mContext.getResources().getDrawable(R.drawable.recycleralertbackground));
//            holder.delivery.setTextColor(Color.parseColor("#292826"));
//            holder.delivery.setBackground(mContext.getResources().getDrawable(R.drawable.deliverborder));
//            holder.itemlayout.setBackground(mContext.getResources().getDrawable(R.drawable.whiteplane_background));
//            holder.delivery.setTextColor(Color.parseColor("#008000"));
//            holder.delivery.setBackground(mContext.getResources().getDrawable(R.drawable.clickdeliverybackground));
//            holder.imageicon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.beliconcricle));
//        }
    }

    @Override
    public int getItemCount() {
        return mAlert.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageicon;
        private TextView texttime,textname,delivery;
        private LinearLayout itemlayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageicon=itemView.findViewById(R.id.imageicon);
            textname=itemView.findViewById(R.id.itemName);
            texttime=itemView.findViewById(R.id.itemtime);
            delivery=itemView.findViewById(R.id.delivery);
            itemlayout=itemView.findViewById(R.id.item_layout);
        }
    }
}
