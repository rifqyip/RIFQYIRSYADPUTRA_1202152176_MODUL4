package com.example.android.rifqyirsyadputra_1202152176_modul4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CariGambar extends AppCompatActivity {

    //Deklarasi variabel
    ImageView gambar;
    EditText et_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_gambar);

        //Memanggil Variabel
        gambar = (ImageView)findViewById(R.id.gambar);
        et_url = (EditText) findViewById(R.id.et_url);
    }

    //Untuk mencari gambar dari internet, kemudian menampilkan gambar tersebut pada imageview
    public void cariGambar(View view) {
        //loading gambar dari internet ke imageview

        String url = et_url.getText().toString();

        if (url.isEmpty()) {
            et_url.setError("Input URL");
            et_url.requestFocus();
            return;
        }

        Picasso.with(CariGambar.this).load(et_url.getText().toString())
                .placeholder(R.drawable.time)
                .error(R.drawable.nope)
                .into(gambar);
    }
}
