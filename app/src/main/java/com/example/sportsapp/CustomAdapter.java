package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<> {
    // custom adapter acts as a bridge between data(list) and UI(recyclerview and cardview)

    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList)  {
        this.sportList = sportList;

        // adapter accepts a list of sport modal class

    }

    // implement methods
    @NonNull
    @Override

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflates layout for each item in the recyclerView
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout,
                        parent,
                        false
                );
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        // SportsViewHolder holds the references to the views within the item layout allowing efficient recycling of views





    }

}
