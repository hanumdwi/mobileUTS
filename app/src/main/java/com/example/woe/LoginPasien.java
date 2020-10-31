package com.example.woe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPasien extends AppCompatActivity {

    private Button mLoginMenuPasien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pasien);

        mLoginMenuPasien = (Button) findViewById(R.id.button10);

        mLoginMenuPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuPasien();
            }
        });
    }

    private void menuPasien(){
        Intent intent = new Intent(this, MenuPasien.class);
        intent.putExtra("name", "username");
        startActivity(intent);
    }
}