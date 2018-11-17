package com.example.angel.cuartob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pasarParametro extends AppCompatActivity {
    EditText cajadatos;
    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_parametro);
        cajadatos = (EditText) findViewById( R.id.txtenviarparametro);
        botonEnviar = (Button) findViewById(R.id.btn1);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pasarParametro.this, recibirParametro.class);

                Bundle bundle = new Bundle();
                bundle.putString("dato",cajadatos.getText() .toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
