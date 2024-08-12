package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {
    // added SportViewHolder class as the type parameter
    // custom adapter acts as a bridge between data(list) and UI(recyclerview and cardview)

    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList)  {
        this.sportList = sportList;

        // adapter accepts a list of sport modal class

    }

    // implement methods
    @NonNull
    @Override

    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflates layout for each item in the recyclerView
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout,
                        parent,
                        false
                );
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        // called for each item in the list
        // binding data from sport object to views within the SportsViewHolder
        // always use the custom viewholder

        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);

    }

    @Override
    public int getItemCount() {
        // how many items to display
        return sportList.size();
    }

    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        // SportsViewHolder holds the references to the views within the item layout allowing efficient recycling of views

        TextView textView;
        ImageView imageView;


        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageviewcard);

        }
    }

}
