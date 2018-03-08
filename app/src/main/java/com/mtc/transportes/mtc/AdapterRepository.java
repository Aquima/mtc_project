package com.mtc.transportes.mtc;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import api.model.Repository;
import java.util.List;
/**
 * Created by raulquispe on 3/7/18.
 */

public class AdapterRepository extends RecyclerView.Adapter<AdapterRepository.ViewHolderDatos> {


    List<Repository> listData;

    public AdapterRepository(List<Repository> listData) {
        this.listData = listData;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignarDatos(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder{
        TextView repo;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            repo = itemView.findViewById(R.id.idRepo);
        }

        public void asignarDatos(Repository repository) {
            repo.setText(repository.getName());
        }
    }
}
