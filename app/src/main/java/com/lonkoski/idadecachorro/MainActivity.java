package com.lonkoski.idadecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editIdade = findViewById(R.id.editIdade);

    }

    public void irSegundaTela(View view){
        int idade = Integer.parseInt(editIdade.getText().toString());
        int resultado = idade*7;
        Intent intentEnviadora = new Intent(getApplicationContext(), segundaTela.class);
        Bundle parametros = new Bundle();
        parametros.putInt("chave_idade", resultado);
        intentEnviadora.putExtras(parametros);
        startActivity(intentEnviadora);
    }

   // public void calcularIdade(View view){
    // textResultado.setText("Idade igual a: "+resultado);
    // }
}







