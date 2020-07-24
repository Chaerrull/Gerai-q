package com.app.chaerrull.geraiq.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.chaerrull.geraiq.R;
import com.app.chaerrull.geraiq.detail;
import com.app.chaerrull.geraiq.model.Requests;

import java.util.List;

public class RequestAdapterRecyclerView extends RecyclerView.Adapter<RequestAdapterRecyclerView.MyViewHolder>{
    private List<Requests> moviesList;
    private Activity mActivity;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout rl_layout;
        public TextView tv_title, tv_alamat;


        public MyViewHolder(View view) {
            super(view);
            rl_layout = view.findViewById(R.id.rl_layout);
            tv_title = view.findViewById(R.id.tv_title);
            tv_alamat = view.findViewById(R.id.tv_alamat);

        }
    }

    public RequestAdapterRecyclerView(List<Requests> moviesList, Activity activity) {
        this.moviesList = moviesList;
        this.mActivity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_request, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Requests movie = moviesList.get(position);

        holder.tv_title.setText(movie.getNama());
        holder.tv_alamat.setText(movie.getAlamat());

        holder.rl_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goDetail = new Intent(mActivity, detail.class);
                goDetail.putExtra("id", movie.getKey());
                goDetail.putExtra("Nama", movie.getNama());
                goDetail.putExtra("Alamat", movie.getAlamat());
                goDetail.putExtra("Web", movie.getWeb());

                mActivity.startActivity(goDetail);


            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}

