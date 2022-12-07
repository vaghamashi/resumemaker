package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btn ;
    EditText txt , workk, email , numberr , female ,naeg , brithaday ,inaguu,hobb , expiess , skill , oull1,oull2,oull3 , cre1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btn = findViewById(R.id.btnn);
        txt = findViewById(R.id.name);
        workk = findViewById(R.id.work);
        email = findViewById(R.id.email);
        numberr = findViewById(R.id.number);
        female = findViewById(R.id.male);
        naeg = findViewById(R.id.cou);
        brithaday = findViewById(R.id.brith);
        inaguu = findViewById(R.id.iangu);
        hobb = findViewById(R.id.hobbi);
        expiess = findViewById(R.id.expisenc);
        skill = findViewById(R.id.skiss);
        oull1 = findViewById(R.id.oul1);
        oull2 = findViewById(R.id.oul2);
        oull3 = findViewById(R.id.oul3);
        cre1 = findViewById(R.id.cre);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Name = txt.getText().toString();
                String Work = workk.getText().toString();
                String emaill = email.getText().toString();
                String number = numberr.getText().toString();
                String maale = female.getText().toString();
                String cou = naeg.getText().toString();
                String brith = brithaday.getText().toString();
                String langu2 = inaguu.getText().toString();
                String hoobie = hobb.getText().toString();
                String expiesss = expiess.getText().toString();
                String skiss = skill.getText().toString();
                String adq = oull1.getText().toString();
                String adp2 = oull2.getText().toString();
                String adq3 = oull3.getText().toString();
                String sree = cre1.getText().toString();



                Intent intent = new Intent(MainActivity.this,secondypage.class);
                intent.putExtra("name",Name);
                intent.putExtra("work",Work);
                intent.putExtra("email",emaill);
                intent.putExtra("no",number);
                intent.putExtra("male",maale);
                intent.putExtra("cou",cou);
                intent.putExtra("britha",brith);
                intent.putExtra("langu",langu2);
                intent.putExtra("hob",hoobie);
                intent.putExtra("expiesr",expiesss);
                intent.putExtra("skisss",skiss);
                intent.putExtra("adqq",adq);
                intent.putExtra("adqq2",adp2);
                intent.putExtra("adqq3",adq3);
                intent.putExtra("cree",sree);
                startActivity(intent);

            }
        });

    }
}