package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondypage extends AppCompatActivity {

    TextView name, work , email , numdber , female ,bod2,brithday2, languu2 , hobb2, expiess , profenal ,adq21,adq22,adq23 , cre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondypage);

        name = findViewById(R.id.namee);
        work = findViewById(R.id.job);
        email = findViewById(R.id.emaill);
        numdber = findViewById(R.id.noo);
        female = findViewById( R.id.male);
        bod2 = findViewById(R.id.bod);
        brithday2 = findViewById(R.id.brithday);
        languu2 = findViewById(R.id.languse);
        hobb2 = findViewById(R.id.hobbi);
        expiess = findViewById(R.id.expiese);
        profenal = findViewById(R.id.prosenal);
        adq21 = findViewById(R.id.oul21);
        adq22 = findViewById(R.id.oul22);
        adq23 = findViewById(R.id.oul23);
        cre = findViewById(R.id.car1);





        String Name = getIntent().getStringExtra("name");
        String job = getIntent().getStringExtra("work");
        String noo = getIntent().getStringExtra("no");
        String emaill = getIntent().getStringExtra("email");
        String male = getIntent().getStringExtra("male");
        String bod = getIntent().getStringExtra("cou");
        String brithday = getIntent().getStringExtra("britha");
        String langu3 = getIntent().getStringExtra("langu");
        String hobb  = getIntent().getStringExtra("hob");
        String expies  = getIntent().getStringExtra("expiesr");
        String porsenal = getIntent().getStringExtra("skisss");
        String aqd1 = getIntent().getStringExtra("adqq");
        String aqd2 = getIntent().getStringExtra("adqq2");
        String adq3 = getIntent().getStringExtra("adqq3");
        String caar = getIntent().getStringExtra("cree");


        name.setText(""+Name);
        work.setText(""+job);
        numdber.setText(""+noo);
        email.setText(""+emaill);
        female .setText(""+male);
        bod2 .setText(""+bod);
        brithday2 .setText(""+brithday);
        languu2.setText(""+langu3);
        hobb2.setText(""+hobb);
        expiess.setText(""+expies);
        profenal.setText(""+ porsenal);
        adq21.setText(""+ aqd1);
        adq22.setText(""+ aqd2);
        adq23.setText(""+adq3);
        cre.setText(""+caar);


    }
}