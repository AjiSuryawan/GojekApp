package com.example.gojekapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListKontakSiswa extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_kontak_siswa);

        recyclerView = findViewById(R.id.rvKontakSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<SiswaModel> itemList = new ArrayList<>();
        itemList.add(new SiswaModel("Budi", "0812223434"));
        itemList.add(new SiswaModel("Ani", "082222222"));


        // set data to adapter
        SiswaKontakAdapter adapter = new SiswaKontakAdapter(itemList);
        // set adapter to recyvlew view
        recyclerView.setAdapter(adapter);

    }
}