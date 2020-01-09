package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destinyapp.biodatawalisongo.Adapter.AdapterHome;
import com.destinyapp.biodatawalisongo.Model.BiodataWalisongo;
import com.destinyapp.biodatawalisongo.Model.DataModel;
import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class BiodataActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<DataModel> pList = new ArrayList<>();
    private RecyclerView.LayoutManager mManager;
    AdapterHome adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        recyclerView = findViewById(R.id.recycler);
        pList.addAll(BiodataWalisongo.getListData());
        mManager = new LinearLayoutManager(BiodataActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(mManager);
        adapter = new AdapterHome(BiodataActivity.this,pList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
