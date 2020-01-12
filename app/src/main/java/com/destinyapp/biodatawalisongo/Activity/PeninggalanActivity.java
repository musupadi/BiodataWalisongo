package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destinyapp.biodatawalisongo.Adapter.AdapterPeninggalan;
import com.destinyapp.biodatawalisongo.Adapter.AdapterWalisongo;
import com.destinyapp.biodatawalisongo.Model.DataModel;
import com.destinyapp.biodatawalisongo.Model.PeninggalanWalisongo;
import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class PeninggalanActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<DataModel> pList = new ArrayList<>();
    private RecyclerView.LayoutManager mManager;
    AdapterPeninggalan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peninggalan);
        recyclerView = findViewById(R.id.recycler);
        pList.addAll(PeninggalanWalisongo.getListData());
        mManager = new LinearLayoutManager(PeninggalanActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(mManager);
        adapter = new AdapterPeninggalan(PeninggalanActivity.this,pList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
