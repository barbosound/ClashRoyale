package com.example.pau.clashroyale;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public boolean game = false;
    public Toast correcte;
    public TextView text;
    public EditText resp;
    public Button ok;
    public int cont = 0;
    public int resCorrecte = 0;
    public ArrayList <String> preguntes = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.textView);
        resp = (EditText)findViewById(R.id.resposta);
        resp.setVisibility(View.INVISIBLE);


        ok = (Button)findViewById(R.id.button2);
        ok.setVisibility(View.INVISIBLE);


        preguntes.add("Quanta vida té el sabueso?");
        preguntes.add("Quant atac té la bruja?");
        preguntes.add("Quin tipus és la Descarga?");
        preguntes.add("Com es diu la primera tropa?");
        preguntes.add("Quanta vida te l'esquelet?");


        ImageButton button = (ImageButton) findViewById(R.id.duendes);
        button.setOnClickListener(this); // calling onClick()

        ImageButton button1 = (ImageButton) findViewById(R.id.duendelanza);
        button1.setOnClickListener(this); // calling onClick()

        ImageButton button2 = (ImageButton) findViewById(R.id.bombardero);
        button2.setOnClickListener(this);

        ImageButton button3 = (ImageButton) findViewById(R.id.flechas);
        button3.setOnClickListener(this);

        ImageButton button4 = (ImageButton) findViewById(R.id.canon);
        button4.setOnClickListener(this);

        ImageButton button5 = (ImageButton) findViewById(R.id.descarga);
        button5.setOnClickListener(this);

        ImageButton button6 = (ImageButton) findViewById(R.id.espiritfoc);
        button6.setOnClickListener(this);

        ImageButton button7 = (ImageButton) findViewById(R.id.espiritgel);
        button7.setOnClickListener(this);

        ImageButton button8 = (ImageButton) findViewById(R.id.arquera);
        button8.setOnClickListener(this);

        ImageButton button9 = (ImageButton) findViewById(R.id.caballero);
        button9.setOnClickListener(this);

        ImageButton button10 = (ImageButton) findViewById(R.id.esqueleto);
        button10.setOnClickListener(this);

        ImageButton button11 = (ImageButton) findViewById(R.id.esbirro);
        button11.setOnClickListener(this);

        ImageButton button12 = (ImageButton) findViewById(R.id.bomb);
        button12.setOnClickListener(this);

        ImageButton button13 = (ImageButton) findViewById(R.id.bola);
        button13.setOnClickListener(this);

        ImageButton button14 = (ImageButton) findViewById(R.id.choza);
        button14.setOnClickListener(this);

        ImageButton button15 = (ImageButton) findViewById(R.id.chozabarb);
        button15.setOnClickListener(this);

        ImageButton button16 = (ImageButton) findViewById(R.id.gigante);
        button16.setOnClickListener(this);

        ImageButton button17 = (ImageButton) findViewById(R.id.minipekka);
        button17.setOnClickListener(this);

        ImageButton button18 = (ImageButton) findViewById(R.id.monta);
        button18.setOnClickListener(this);

        ImageButton button19 = (ImageButton) findViewById(R.id.valquiria);
        button19.setOnClickListener(this);

        ImageButton button20 = (ImageButton) findViewById(R.id.principe);
        button20.setOnClickListener(this);

        ImageButton button21 = (ImageButton) findViewById(R.id.bruja);
        button21.setOnClickListener(this);

        ImageButton button22 = (ImageButton) findViewById(R.id.golem);
        button22.setOnClickListener(this);

        ImageButton button23 = (ImageButton) findViewById(R.id.pekka);
        button23.setOnClickListener(this);

        ImageButton button24 = (ImageButton) findViewById(R.id.magohielo);
        button24.setOnClickListener(this);

        ImageButton button25 = (ImageButton) findViewById(R.id.princesa);
        button25.setOnClickListener(this);

        ImageButton button26 = (ImageButton) findViewById(R.id.chispitas);
        button26.setOnClickListener(this);

        ImageButton button27 = (ImageButton) findViewById(R.id.sabueso);
        button27.setOnClickListener(this);

        Button juga = (Button) findViewById(R.id.button3);
        juga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = true;
                text.setText(preguntes.get(cont));
                ok.setVisibility(View.VISIBLE);
                resp.setVisibility(View.VISIBLE);
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(preguntes.get(cont));
                switch (cont){

                    case 0:
                        if ((resp.getText().toString().equalsIgnoreCase("3300"))){

                            correcte = Toast.makeText(getApplicationContext(),"correcte",Toast.LENGTH_SHORT);
                            correcte.show();
                            resCorrecte = resCorrecte +1;

                        }else{
                            correcte = Toast.makeText(getApplicationContext(),"incorrecte",Toast.LENGTH_SHORT);
                            correcte.show();
                        }
                        break;
                    case 1:
                        if ((resp.getText().toString().equalsIgnoreCase("53"))){

                            correcte = Toast.makeText(getApplicationContext(),"correcte",Toast.LENGTH_SHORT);
                            correcte.show();
                            resCorrecte = resCorrecte +1;

                        }else{
                            correcte = Toast.makeText(getApplicationContext(),"incorrecte",Toast.LENGTH_SHORT);
                            correcte.show();
                        }
                        break;
                    case 2:
                        if ((resp.getText().toString().equalsIgnoreCase("hechizo"))){

                            correcte = Toast.makeText(getApplicationContext(),"correcte",Toast.LENGTH_SHORT);
                            correcte.show();
                            resCorrecte = resCorrecte +1;

                        }else{
                            correcte = Toast.makeText(getApplicationContext(),"incorrecte",Toast.LENGTH_SHORT);
                            correcte.show();
                        }
                        break;
                    case 3:
                        if ((resp.getText().toString().equalsIgnoreCase("duende"))){

                            correcte = Toast.makeText(getApplicationContext(),"correcte",Toast.LENGTH_SHORT);
                            correcte.show();
                            resCorrecte = resCorrecte +1;

                        }else{
                            correcte = Toast.makeText(getApplicationContext(),"incorrecte",Toast.LENGTH_SHORT);
                            correcte.show();
                        }
                        break;
                    case 4:
                        if ((resp.getText().toString().equalsIgnoreCase("32"))){

                            correcte = Toast.makeText(getApplicationContext(),"correcte",Toast.LENGTH_SHORT);
                            correcte.show();
                            resCorrecte = resCorrecte +1;

                        }else{
                            correcte = Toast.makeText(getApplicationContext(),"incorrecte",Toast.LENGTH_SHORT);
                            correcte.show();
                        }
                        break;

                }

                cont = cont +1;
                resp.setText("");

                if (cont == 5){
                    correcte = Toast.makeText(getApplicationContext(),"final del joc, has encertat "+ resCorrecte+"/5",Toast.LENGTH_SHORT);
                    correcte.show();
                    cont = 0;
                    ok.setVisibility(View.INVISIBLE);
                    resp.setVisibility(View.INVISIBLE);
                    text.setText("");
                    game = false;

                }
                else{
                    text.setText(preguntes.get(cont));
                }
            }
        });

    }


    public void onClick(View v) {
        // default method for handling onClick Events..
    if (game == false){
        Bundle b = new Bundle();
        switch (v.getId()) {

            case R.id.duendes:
                Bitmap duende = BitmapFactory.decodeResource(getResources(), R.drawable.duende);
                b.putParcelable("imatge", duende);
                b.putString("Nom", "Duende");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "186");
                b.putString("Atac", "116");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Goblins");
                break;

            case R.id.duendelanza:
                Bitmap duendelanza = BitmapFactory.decodeResource(getResources(), R.drawable.duendelanza);
                b.putParcelable("imatge", duendelanza);
                b.putString("Nom", "Duende con lanza");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "110");
                b.putString("Atac", "50");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Goblins");
                break;

            case R.id.bombardero:
                Bitmap bombardero = BitmapFactory.decodeResource(getResources(), R.drawable.bombardero);
                b.putParcelable("imatge", bombardero);
                b.putString("Nom", "Bombardero");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "235");
                b.putString("Atac", "196");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Bomber");
                break;

            case R.id.flechas:
                Bitmap flechas = BitmapFactory.decodeResource(getResources(), R.drawable.flechas);
                b.putParcelable("imatge", flechas);
                b.putString("Nom", "Flechas");
                b.putString("Tipo", "Hechizo");
                b.putString("Vida", "-");
                b.putString("Atac", "243");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Arrows");
                break;

            case R.id.canon:
                Bitmap canon = BitmapFactory.decodeResource(getResources(), R.drawable.canon);
                b.putParcelable("imatge", canon);
                b.putString("Nom", "Cañon");
                b.putString("Tipo", "Estructura");
                b.putString("Vida", "560");
                b.putString("Atac", "96");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Cannon");
                break;

            case R.id.descarga:
                Bitmap descarga = BitmapFactory.decodeResource(getResources(), R.drawable.descarga);
                b.putParcelable("imatge", descarga);
                b.putString("Nom", "Descarga");
                b.putString("Tipo", "Hechizo");
                b.putString("Vida", "-");
                b.putString("Atac", "186");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Zap");
                break;

            case R.id.espiritfoc:
                Bitmap espiritfoc = BitmapFactory.decodeResource(getResources(), R.drawable.espiritfoc);
                b.putParcelable("imatge", espiritfoc);
                b.putString("Nom", "Espiritu de fuego");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "68");
                b.putString("Atac", "128");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Fire_Spirits");
                break;

            case R.id.espiritgel:
                Bitmap espiritgel = BitmapFactory.decodeResource(getResources(), R.drawable.espiritgel);
                b.putParcelable("imatge", espiritgel);
                b.putString("Nom", "Espiritu de hielo");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "119");
                b.putString("Atac", "66");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Ice_Spirit");
                break;

            case R.id.arquera:
                Bitmap arquera = BitmapFactory.decodeResource(getResources(), R.drawable.arquera);
                b.putParcelable("imatge", arquera);
                b.putString("Nom", "Arquera");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "125");
                b.putString("Atac", "41");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Archers");
                break;

            case R.id.caballero:
                Bitmap caballero = BitmapFactory.decodeResource(getResources(), R.drawable.caballero);
                b.putParcelable("imatge", caballero);
                b.putString("Nom", "Caballero");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "660");
                b.putString("Atac", "75");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Knight");
                break;

            case R.id.esqueleto:
                Bitmap esqueleto = BitmapFactory.decodeResource(getResources(), R.drawable.esqueleto);
                b.putParcelable("imatge", esqueleto);
                b.putString("Nom", "Esqueleto");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "32");
                b.putString("Atac", "32");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Skeletons");
                break;

            case R.id.esbirro:
                Bitmap esbirro = BitmapFactory.decodeResource(getResources(), R.drawable.esbirros);
                b.putParcelable("imatge", esbirro);
                b.putString("Nom", "Esqueleto");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "90");
                b.putString("Atac", "40");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Minions");
                break;

            case R.id.bomb:
                Bitmap bomb = BitmapFactory.decodeResource(getResources(), R.drawable.bomb);
                b.putParcelable("imatge", bomb);
                b.putString("Nom", "Torre Bombardera");
                b.putString("Tipo", "Estructura");
                b.putString("Vida", "1045");
                b.putString("Atac", "110");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Bomb_Tower");
                break;

            case R.id.bola:
                Bitmap bola = BitmapFactory.decodeResource(getResources(), R.drawable.bola);
                b.putParcelable("imatge", bola);
                b.putString("Nom", "Bola de fuego");
                b.putString("Tipo", "Hechizo");
                b.putString("Vida", "-");
                b.putString("Atac", "572");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Fireball");
                break;


            case R.id.choza:
                Bitmap choza = BitmapFactory.decodeResource(getResources(), R.drawable.choza);
                b.putParcelable("imatge", choza);
                b.putString("Nom", "Choza de duendes");
                b.putString("Tipo", "Estructura");
                b.putString("Vida", "1022");
                b.putString("Atac", "-");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Goblin_Hut");
                break;

            case R.id.chozabarb:
                Bitmap chozabarb = BitmapFactory.decodeResource(getResources(), R.drawable.chozabarb);
                b.putParcelable("imatge", chozabarb);
                b.putString("Nom", "Choza de barbaros");
                b.putString("Tipo", "Estructura");
                b.putString("Vida", "1463");
                b.putString("Atac", "-");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Barbarian_Hut");
                break;

            case R.id.gigante:
                Bitmap gigante = BitmapFactory.decodeResource(getResources(), R.drawable.gigante);
                b.putParcelable("imatge", gigante);
                b.putString("Nom", "Gigante");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "3040");
                b.putString("Atac", "192");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Giant");
                break;

            case R.id.minipekka:
                Bitmap minipekka = BitmapFactory.decodeResource(getResources(), R.drawable.minipekka);
                b.putParcelable("imatge", minipekka);
                b.putString("Nom", "Mini pekka");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "960");
                b.putString("Atac", "520");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Mini_P.E.K.K.A.");
                break;

            case R.id.monta:
                Bitmap monta = BitmapFactory.decodeResource(getResources(), R.drawable.monta);
                b.putParcelable("imatge", monta);
                b.putString("Nom", "Montapuercos");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "1280");
                b.putString("Atac", "240");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Hog_Rider");
                break;

            case R.id.valquiria:
                Bitmap valquiria = BitmapFactory.decodeResource(getResources(), R.drawable.valq);
                b.putParcelable("imatge", valquiria);
                b.putString("Nom", "Valquiria");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "1548");
                b.putString("Atac", "211");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Valkyrie");
                break;

            case R.id.principe:
                Bitmap principe = BitmapFactory.decodeResource(getResources(), R.drawable.principe);
                b.putParcelable("imatge", principe);
                b.putString("Nom", "Príncipe");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "1331");
                b.putString("Atac", "296");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Prince");
                break;

            case R.id.bruja:
                Bitmap bruja = BitmapFactory.decodeResource(getResources(), R.drawable.bruja);
                b.putParcelable("imatge", bruja);
                b.putString("Nom", "Bruja");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "550");
                b.putString("Atac", "53");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Witch");
                break;

            case R.id.golem:
                Bitmap golem = BitmapFactory.decodeResource(getResources(), R.drawable.golem);
                b.putParcelable("imatge", golem);
                b.putString("Nom", "Golem");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "3520");
                b.putString("Atac", "214");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Golem");
                break;

            case R.id.pekka:
                Bitmap pekka = BitmapFactory.decodeResource(getResources(), R.drawable.pekka);
                b.putParcelable("imatge", pekka);
                b.putString("Nom", "PEKKA");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "3520");
                b.putString("Atac", "617");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/P.E.K.K.A.");
                break;

            case R.id.magohielo:
                Bitmap magohielo = BitmapFactory.decodeResource(getResources(), R.drawable.magohielo);
                b.putParcelable("imatge", magohielo);
                b.putString("Nom", "Mago de hielo");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "665");
                b.putString("Atac", "63");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Ice_Wizard");
                break;

            case R.id.princesa:
                Bitmap princesa = BitmapFactory.decodeResource(getResources(), R.drawable.princesa);
                b.putParcelable("imatge", princesa);
                b.putString("Nom", "Princesa");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "216");
                b.putString("Atac", "140");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Princess");
                break;

            case R.id.chispitas:
                Bitmap chispitas = BitmapFactory.decodeResource(getResources(), R.drawable.chispitas);
                b.putParcelable("imatge", chispitas);
                b.putString("Nom", "Chispitas");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "1200");
                b.putString("Atac", "1300");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Sparky");
                break;

            case R.id.sabueso:
                Bitmap sabueso = BitmapFactory.decodeResource(getResources(), R.drawable.sabueso);
                b.putParcelable("imatge", sabueso);
                b.putString("Nom", "Sabueso");
                b.putString("Tipo", "Tropa");
                b.putString("Vida", "3300");
                b.putString("Atac", "49");
                b.putString("Link", "http://clashroyale.wikia.com/wiki/Lava_Hound");
                break;

        }

        Intent intencion = new Intent(MainActivity.this, InfoButtons.class);
        intencion.putExtras(b);

        startActivity(intencion);



}
}



}
