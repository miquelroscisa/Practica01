package com.example.cfgs2inf.practica01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
public class Paginaprincipal extends AppCompatActivity {
    EditText nom, cognom, edat;
    CheckBox CHECK;
    private CheckBox dades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprincipal);
        nom = (EditText) findViewById(R.id.txtnom);
        cognom = (EditText) findViewById(R.id.textcognom);
        CHECK = (CheckBox) findViewById(R.id.check);
        edat = (EditText) findViewById(R.id.textedat);
        Button aceptar = (Button) findViewById(R.id.aceptar);


}
    public void onClick(View v) {
        Bundle b = new Bundle();
        b.putString("NOM", nom.getText().toString());
        b.putString("COGNOM", cognom.getText().toString());
        b.putString("EDAT", edat.getText().toString());

        String s= (dades.isChecked()?"Permet publicar dades":"No permet publicar dades");
        Toast.makeText(Paginaprincipal.this,s,Toast.LENGTH_LONG).show();

        Intent intencio = new Intent(Paginaprincipal.this, segonactivitat.class);
        intencio.putExtras(b);
        startActivity(intencio);
    }
}











