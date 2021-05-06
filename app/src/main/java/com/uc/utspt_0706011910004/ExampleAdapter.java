package com.uc.utspt_0706011910004;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<AdapterUser> mAdapterList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.name);
            mTextView2 = itemView.findViewById(R.id.age);
            mTextView3 = itemView.findViewById(R.id.address);
        }
    }

    public ExampleAdapter(ArrayList<AdapterUser> adapterList){
        mAdapterList = adapterList;
    }



    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        AdapterUser currentItem = mAdapterList.get(position);
        holder.mTextView1.setText(currentItem.getmName());
        holder.mTextView2.setText(currentItem.getmAge());
        holder.mTextView3.setText(currentItem.getmAddress());
    }

    @Override
    public int getItemCount() {
        return mAdapterList.size();
    }
}
