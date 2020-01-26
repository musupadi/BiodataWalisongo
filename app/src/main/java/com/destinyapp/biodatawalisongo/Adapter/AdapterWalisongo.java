package com.destinyapp.biodatawalisongo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destinyapp.biodatawalisongo.Activity.DetailWalisongoActivity;
import com.destinyapp.biodatawalisongo.Model.DataModel;
import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterWalisongo extends RecyclerView.Adapter<AdapterWalisongo.HolderData> implements Filterable {
    private List<DataModel> mList;
    private List<DataModel> mListFull;
    private Context ctx;

    public AdapterWalisongo(Context ctx, List<DataModel> mList) {
        this.ctx = ctx;
        this.mList = mList;
        mListFull = new ArrayList<>(mList);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_biodata, viewGroup, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWalisongo.HolderData holderData, int posistion) {
        final DataModel dm = mList.get(posistion);
        holderData.tittle.setText(dm.getNama_walisongo());
        holderData.image.setImageResource(Integer.parseInt(dm.getGambar()));
        holderData.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(ctx, DetailWalisongoActivity.class);
                goInput.putExtra("GAMBAR",dm.getGambar());
                goInput.putExtra("NAMA",dm.getNama_walisongo());
                goInput.putExtra( "DESKRIPSI",dm.getDeskripsi_walisongo());
                goInput.putExtra( "MAKAM",dm.getMakam_walisongo());
                goInput.putExtra( "ALAMAT",dm.getAlamat_makam_walisongo());
                goInput.putExtra( "SUARA",dm.getSuara());
                ctx.startActivities(new Intent[]{goInput});
            }
        });
        holderData.dm = dm;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class HolderData extends RecyclerView.ViewHolder {
        TextView tittle;
        DataModel dm;
        LinearLayout linear;
        ImageView image;

        HolderData(View v) {
            super(v);
            tittle = v.findViewById(R.id.tvTittle);
            image = v.findViewById(R.id.ivIcon);
            linear = v.findViewById(R.id.linearInformasiKehamilan);
        }
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    private Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<DataModel> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(mListFull);
            } else {
                String fillterPattern = constraint.toString().toLowerCase().trim();

                for (DataModel dm : mListFull) {
                    if (dm.getNama_walisongo().toLowerCase().contains(fillterPattern)) {
                        filteredList.add(dm);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mList.clear();
            mList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}

