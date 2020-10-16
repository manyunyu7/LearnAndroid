package com.senjapagi.Github4206;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.senjapagi.Github4206.Adapter.AdapterMahasiswa;
import com.senjapagi.Github4206.Model.Data_Mahasiswa;
import com.senjapagi.Github4206.Model.ModelMahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView rvMahasiswa;
    private ArrayList<ModelMahasiswa> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.splash).setVisibility(View.GONE);
        findViewById(R.id.txtMenu).setVisibility(View.VISIBLE);
        findViewById(R.id.logo_iluminasi).setVisibility(View.GONE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        rvMahasiswa = findViewById(R.id.rv_menu);
        rvMahasiswa.setVisibility(View.VISIBLE);
        rvMahasiswa.setHasFixedSize(true);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false));
        list.addAll(Data_Mahasiswa.getListData());


        String a = String.valueOf(list.size());
        showRecyclerList();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),splash_screen.class));
    }

    private void showRecyclerList(){
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        AdapterMahasiswa adapterMahasiswa = new AdapterMahasiswa(list);
        rvMahasiswa.setAdapter(adapterMahasiswa);
    }
}