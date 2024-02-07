package com.example.normal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    ArrayList<Person> data ;

    public RecyclerViewAdapter(ArrayList<Person> data ){
        this.data = data;

    }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_cell, null, false);

        viewHolder viewholder = new viewHolder(v);

        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);

        return viewholder ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Person person = data.get(position);
        holder.name.setText(person.getName());
        holder.birthDay.setText(person.getBirthday());
        holder.sex.setText(person.getSex());

    }

    @Override
    public int getItemCount() {
        return data.size() ;
    }


    class viewHolder extends RecyclerView.ViewHolder {

        TextView name ;
        TextView birthDay ;
        TextView sex ;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.textview1); ;
            this.birthDay = itemView.findViewById(R.id.textview2);
            this.sex = itemView.findViewById(R.id.textview3);
        }
    }

}



//        name.setText(person.getName());
//                birthDay.setText(person.getBirthday());
//                sex.setText(person.getSex());
