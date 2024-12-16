package com.example.gojekapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SiswaKontakAdapter extends RecyclerView.Adapter<SiswaKontakAdapter.ViewHolder>{

    private List<SiswaModel> itemListSiswa;

    public SiswaKontakAdapter(List<SiswaModel> itemListSiswa) {
        this.itemListSiswa = itemListSiswa;
    }

    @NonNull
    @Override
    public SiswaKontakAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SiswaKontakAdapter.ViewHolder holder, int position) {
        SiswaModel item = itemListSiswa.get(position);
        holder.tvNama.setText(item.getNama());
        holder.tvNomer.setText(item.getNomerHp());
    }

    @Override
    public int getItemCount() {
        return itemListSiswa.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvNomer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvName);
            tvNomer = itemView.findViewById(R.id.tvNo);
        }
    }

}
