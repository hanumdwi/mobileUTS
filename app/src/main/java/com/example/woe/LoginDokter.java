package com.example.woe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginDokter extends AppCompatActivity {

    private Button mLoginMenuDokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dokter);

        mLoginMenuDokter = (Button) findViewById(R.id.button33);

        mLoginMenuDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuDokter();
            }
        });
    }

    private void menuDokter(){
        Intent intent = new Intent(this, MenuDokter.class);
        intent.putExtra("name", "username");
        startActivity(intent);
    }
}