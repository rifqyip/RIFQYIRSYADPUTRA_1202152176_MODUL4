package com.example.android.rifqyirsyadputra_1202152176_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Untuk berpindah ke layout ListNama
    public void listMahasiswa(View view) {
        Intent intent = new Intent(MainActivity.this, ListNama.class);
        startActivity(intent);
    }

    //Untuk berpindah ke layout CariGambar
    public void searchGambar(View view) {
        Intent intent = new Intent(MainActivity.this, CariGambar.class);
        startActivity(intent);
    }
}
