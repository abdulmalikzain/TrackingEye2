package com.example.lenovo.trackingeye2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.trackingeye2.Model.ModelData;
import com.example.lenovo.trackingeye2.R;
import com.example.lenovo.trackingeye2.SettingActivity;

import java.util.List;

/**
 * Created by Lenovo on 29/10/2017.
 */
//
public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private List<ModelData> mItems ;
    private Context context;

    public AdapterData (Context context, List<ModelData> items)
    {
        this.mItems = items;
        this.context = context;
    }

    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row,parent,false);
        HolderData holderData = new HolderData(layout);
        return holderData;
    }

    @Override
    public void onBindViewHolder(HolderData holder, int position) {
        ModelData md  = mItems.get(position);
        holder.tvusername.setText(md.getUsername());
        holder.tvid.setText(md.getId());

        holder.md = md;


    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    class HolderData extends RecyclerView.ViewHolder
    {
        TextView tvusername,tvid;
        ModelData md;

        public  HolderData (View view)
        {
            super(view);

            tvusername = (TextView) view.findViewById(R.id.username);
            tvid = (TextView) view.findViewById(R.id.id);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Intent update = new Intent(context, AdapterData.class);
//                    update.putExtra("update",1);
//                    update.putExtra("npm",md.getId());
//                    update.putExtra("nama",md.getUsername());
//                    update.putExtra("prodi",md.getEmail());
//                    update.putExtra("fakultas",md.getTelephone());
//
//                    context.startActivity(update);
                }
            });
        }
    }
}
