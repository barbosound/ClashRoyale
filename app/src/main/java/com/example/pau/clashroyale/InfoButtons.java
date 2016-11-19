package com.example.pau.clashroyale;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_buttons);

        ImageView foto = (ImageView) findViewById(R.id.imageView2);

        TextView nom = (TextView)findViewById(R.id.txt_nom);

        TextView tipus = (TextView)findViewById(R.id.txt_tipus);

        TextView vida = (TextView)findViewById(R.id.txt_vida);

        TextView atac = (TextView)findViewById(R.id.txt_atac);

        Button info = (Button)findViewById(R.id.button);

        Bundle b = getIntent().getExtras();

        Bitmap imatge = getIntent().getParcelableExtra("imatge");

        foto.setImageBitmap(imatge);

        nom.setText(b.getString("Nom"));
        tipus.setText(b.getString("Tipo"));
        vida.setText(b.getString("Vida"));
        atac.setText(b.getString("Atac"));


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b = getIntent().getExtras();

                Uri url = Uri.parse(b.getString("Link"));

                Intent intent = new Intent(Intent.ACTION_VIEW,url);

                startActivity(intent);


            }
        });


    }



}
