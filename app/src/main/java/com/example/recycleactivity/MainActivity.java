package com.example.recycleactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapter adapters;
    private ArrayList<Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleView);
        adapters = new adapter(models,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapters);



    }

    private void getData() {
        models = new ArrayList<>();
        models.add(new Model("Kevin Sanjaya","Indonesia","02-Agustus-1995",getString(R.string.kevin),R.drawable.kevinsanjaya));
        models.add(new Model("Viktor Axelsen","Denmark","04-Januari-1994",getString(R.string.axelsen),R.drawable.axelsen));
        models.add(new Model("Sinisuka Ginting","Indonesia","20-Oktober-1996",getString(R.string.ginting),R.drawable.ginting));
        models.add(new Model("Kunlavut Vitidsarn","Thailand","11-Mei-2001",getString(R.string.vitidsarn),R.drawable.kunlavut));
        models.add(new Model("Kodai Naraoka","Jepang","30-juni-2001",getString(R.string.naraoka),R.drawable.naraoka));
        models.add(new Model("Jonathan Christie","Indonesia","15-September-1997",getString(R.string.jojo),R.drawable.jojo));
        models.add(new Model("Li Shi Feng","Tiongkok","09-Januari-2000",getString(R.string.shinfeng),R.drawable.shifeng));
        models.add(new Model("Aya Ohori","Jepang","02-Oktober-1996",getString(R.string.ohari),R.drawable.ohori));
        models.add(new Model("Rawinda Prajongjai","Thailand","29-Juni-1993",getString(R.string.prajongjai),R.drawable.projangjai));
        models.add(new Model("Alexandra Boje","Denmark","06-Desember-1999",getString(R.string.boje),R.drawable.boje));
        models.add(new Model("Chiharu Shida","Jepang","29-April-1997",getString(R.string.shida),R.drawable.shida));
        models.add(new Model("Huang Ya Qiong","China","28-Februari-1994",getString(R.string.yaqiong),R.drawable.yaqiong));
        models.add(new Model("Kento Momota","Jepang","01-September-1994",getString(R.string.momota),R.drawable.momota));
        models.add(new Model("Loh Kean Yew","Singapura","26-Juni-1997",getString(R.string.yew),R.drawable.yeaw));
        models.add(new Model("Shi Yu Qi","Tiongkok"," 28-Februari-1996",getString(R.string.shiyuqi),R.drawable.shiyuqi));




    }
}