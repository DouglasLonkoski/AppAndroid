package com.lonkoski.idadecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class segundaTela extends AppCompatActivity {

    private TextView  textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        textResultado = findViewById(R.id.textResultado);
        
        Intent intentRecebedora = getIntent();

        Bundle parametros = intentRecebedora.getExtras();

        if(parametros != null){

            int idade = parametros.getInt("chave_idade");

            Toast.makeText(segundaTela.this, "Idade ="+idade, Toast.LENGTH_SHORT).show();

            textResultado.setText("Idade humana do seu cachorro é: "+idade+" anos");

        }

    }
    public  void  voltarTelaPrincipal(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
       startActivity(intent2);
    }

}
