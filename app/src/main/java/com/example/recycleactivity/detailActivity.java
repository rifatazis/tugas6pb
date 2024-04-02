package com.example.recycleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class detailActivity extends AppCompatActivity {

    private String nama;
    private String negara;
    private String tglLahir;
    private String desc;
    private int foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = getIntent().getStringExtra("nama");
        negara = getIntent().getStringExtra("negara");
        tglLahir = getIntent().getStringExtra("tglLahir");
        desc = getIntent().getStringExtra("desc");
        foto = getIntent().getIntExtra("foto", 0);

        ImageView fotoo = findViewById(R.id.ivFoto);
        TextView detail = findViewById(R.id.tvdetail);

        detail.setText(nama + "\n" + negara + "\n" + tglLahir+ "\n" + desc );
        fotoo.setImageResource(foto);

        Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareDetails();
            }
        });
    }

    private void shareDetails() {
        Intent share = new Intent();
        share.setAction(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Nama: " + nama + "\nNegara: " + negara + "\nTanggal Lahir: " + tglLahir+"\ndesc: " + desc );
        share.setType("text/plain");

        Intent sharee = Intent.createChooser(share, null);
        startActivity(sharee);
    }
}
