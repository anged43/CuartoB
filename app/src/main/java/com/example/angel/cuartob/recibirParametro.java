package com.example.angel.cuartob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class recibirParametro extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_parametro);
        texto = (TextView) findViewById(R.id.txt2);
        Bundle bundle = this.getIntent().getExtras();
        texto.setText(bundle.getString("dato"));
    }
}
