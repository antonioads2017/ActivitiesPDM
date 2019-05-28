package com.example.atividade1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        textView=(TextView)findViewById(R.id.textView2);
        String texto = getIntent().getStringExtra("text");
        textView.setText(texto);
    }
}
