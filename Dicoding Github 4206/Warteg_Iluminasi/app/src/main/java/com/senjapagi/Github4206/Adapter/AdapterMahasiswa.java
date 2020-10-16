package com.senjapagi.Github4206.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.senjapagi.Github4206.Detail;
import com.senjapagi.Github4206.Model.ModelMahasiswa;
import com.senjapagi.Github4206.R;

import java.util.ArrayList;

public class AdapterMahasiswa extends RecyclerView.Adapter<AdapterMahasiswa.holderMahasiswa> {
    Context mContext;
    private ArrayList<ModelMahasiswa> listMahasiswa;

    public AdapterMahasiswa(ArrayList<ModelMahasiswa> list) {
        listMahasiswa=list;
    }

    @NonNull
    @Override
    public holderMahasiswa onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_anggota,parent,false);
        return new holderMahasiswa(v);
    }

    @Override
    public void onBindViewHolder(@NonNull holderMahasiswa holder, final int position) {
        final ModelMahasiswa mhs = listMahasiswa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mhs.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.ivFoto);
        holder.tvNama.setText(mhs.getNama());
        holder.tvKota.setText(mhs.getLokasi());
        holder.tvGithub.setText("github.com/"+mhs.getUsername());
        Animation a = AnimationUtils.loadAnimation(mContext,R.anim.fade_transition_animation);
        holder.itemView.setAnimation(a);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(mContext, Detail.class);
                a.putExtra("data",listMahasiswa.get(position));
                mContext.startActivity(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }

    class holderMahasiswa extends RecyclerView.ViewHolder{
        TextView tvNama,tvGithub,tvKota;
        ImageView ivFoto;
        public holderMahasiswa(@NonNull View itemView) {
            super(itemView);
            mContext=itemView.getContext();
            tvNama=itemView.findViewById(R.id.peserta_name);
            tvKota=itemView.findViewById(R.id.peserta_kota);
            tvGithub=itemView.findViewById(R.id.peserta_github);
            ivFoto=itemView.findViewById(R.id.peserta_profile);
        }
    }
}
