package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {


    /*
    Changelog
    10116060 - MUHAMMAD HAFIZH BUDIMAN

    Aplikasi v0.0.1
    Rabu, 3 april 2019. 14.38
    1. Membuat splash screen

    Aplikasi v0.0.2
    Rabu, 3 april 2019. 15.31
    2. Membuat Halaman Kode Keluarga

    Aplikasi v0.0.3
    Rabu, 3 april 2019. 14.16
    3. Membuat Halaman Daftar

    Aplikasi v0.0.4
    Rabu, 3 april 2019. 14.58
    4. Membuat Halaman Selesai

    Aplikasi v.0.0.5
    jumat, 5 april 2019, 22.19
    1.membuat fungsi intent di masing masing halaman

     */


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukahalamanlogin();
            }
        });
    }
    public void bukahalamanlogin() {
        Intent intent = new Intent(this, logincode.class);
        startActivity(intent);
    }
    }
