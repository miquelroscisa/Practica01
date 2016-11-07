package com.example.cfgs2inf.practica01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class segonactivitat extends AppCompatActivity {
    EditText nom, cognom,edat;
    CheckBox CHECK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segonactivitat);
        TextView nom = (TextView)findViewById(R.id.text_nom);
        TextView cognom = (TextView)findViewById(R.id.text_cog);
        TextView edat = (TextView)findViewById(R.id.text_edat);
        CheckBox check = (CheckBox) findViewById(R.id.check);
        Button aceptar = (Button)findViewById(R.id.aceptar);
        Bundle b = getIntent().getExtras();
        nom.setText(b.getString("NOM"));
        cognom.setText(b.getString("COGNOM"));
        edat.setText(b.getString("EDAT"));

        }
}
