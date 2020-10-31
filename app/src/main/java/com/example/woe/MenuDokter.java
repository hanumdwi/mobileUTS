package com.example.woe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuDokter extends AppCompatActivity {

    private Button btnPengumuman;
    private Button btnCatatanPasienDariDokter;
    private Button btnLihatJadwalSaya;
    private Button btnHistoryDokter;
    private Button btnNotifDokter;
    private Button btnMaps;
    private Button btnProfileDokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dokter);

        btnPengumuman = (Button) findViewById(R.id.button22);
        btnMaps = (Button) findViewById(R.id.button23);
        btnCatatanPasienDariDokter =(Button) findViewById(R.id.button8);
        btnHistoryDokter = (Button) findViewById(R.id.button24);
        btnLihatJadwalSaya = (Button) findViewById(R.id.button25);
        btnNotifDokter = (Button) findViewById(R.id.button7);
        btnProfileDokter = (Button) findViewById(R.id.button4);

        btnPengumuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pengumuman();
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maps();
            }
        });

        btnCatatanPasienDariDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catatandariDokter();
            }
        });

        btnHistoryDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                historyDokter();
            }
        });

        btnLihatJadwalSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lihatJadwalSaya();
            }
        });

        btnNotifDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifDokter();
            }
        });

        btnProfileDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileDokter();
            }
        });
    }

    private void pengumuman(){
        Intent intent6 = new Intent(this, Pengumuman.class);
        startActivity(intent6);
    }

    private void maps(){
        Intent intent4 = new Intent(this, Maps.class);
        startActivity(intent4);
    }

    private void catatandariDokter(){
        Intent intent5 = new Intent(this, CatatanPasienDariDokter.class);
        startActivity(intent5);
    }

    private void historyDokter(){
        Intent intent3 = new Intent(this, HistoryDokter.class);
        startActivity(intent3);
    }

    private void lihatJadwalSaya(){
        Intent intent2 = new Intent(this, JadwalSayaMenuDokter.class);
        startActivity(intent2);
    }

    private void notifDokter(){
        Intent intent1 = new Intent(this, NotifDokter.class);
        startActivity(intent1);
    }

    private void profileDokter(){
        Intent intent = new Intent(this, ProfileDokter.class);
        startActivity(intent);
    }
}