package com.example.woe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPasien extends AppCompatActivity {

    private Button btnPengumuman;
    private Button btnDokter;
    private Button btnPoliklinik;
    private Button btnCatatanPasien;
    private Button btnContactUs;
    private Button btnHistory;
    private Button btnNotifPasien;
    private Button btnMaps;
    private Button btnProfilePasien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pasien);

        btnCatatanPasien = (Button) findViewById(R.id.button15);
        btnContactUs = (Button) findViewById(R.id.button16);
        btnDokter = (Button) findViewById(R.id.button13);
        btnHistory = (Button) findViewById(R.id.button17);
        btnMaps = (Button) findViewById(R.id.button20);
        btnNotifPasien = (Button) findViewById(R.id.button18);
        btnPengumuman = (Button) findViewById(R.id.button19);
        btnPoliklinik = (Button) findViewById(R.id.button14);
        btnProfilePasien = (Button) findViewById(R.id.button21);

        btnCatatanPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catatanPasien();
            }
        });

        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactUs();
            }
        });

        btnDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dokter();
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                history();
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maps();
            }
        });

        btnNotifPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifPasien();
            }
        });

        btnPengumuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pengumuman();
            }
        });

        btnPoliklinik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                poliklinik();
            }
        });

        btnProfilePasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profilePasien();
            }
        });
    }

    private void catatanPasien(){
        Intent intent = new Intent(this, CatatanPasien.class);
        startActivity(intent);
    }

    private void contactUs(){
        Intent intent1 = new Intent(this, ContactUs.class);
        startActivity(intent1);
    }

    private void dokter(){
        Intent intent2 = new Intent(this, Dokter.class);
        startActivity(intent2);
    }

    private void history(){
        Intent intent3 = new Intent(this, History.class);
        startActivity(intent3);
    }

    private void maps(){
        Intent intent4 = new Intent(this, Maps.class);
        startActivity(intent4);
    }

    private void notifPasien(){
        Intent intent5 = new Intent(this, NotifPasien.class);
        startActivity(intent5);
    }

    private void pengumuman(){
        Intent intent6 = new Intent(this, Pengumuman.class);
        startActivity(intent6);
    }

    private void poliklinik(){
        Intent intent7 = new Intent(this, Poliklinik.class);
        startActivity(intent7);
    }

    private void profilePasien(){
        Intent intent8 = new Intent(this, ProfilePasien.class);
        startActivity(intent8);
    }
}