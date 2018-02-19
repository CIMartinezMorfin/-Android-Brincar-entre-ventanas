package com.example.claudioivan.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button boton;
    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boton=(Button)findViewById(R.id.button2);
        edit=(EditText)findViewById(R.id.editText2);
        text=(TextView)findViewById(R.id.textView2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numerosEnTexto=edit.getText().toString();
                String[] elementos = numerosEnTexto.split(" ");
                int[] numeros = new int[elementos.length];
                for(int n = 0; n < elementos.length; n++) {
                    numeros[n] = Integer.parseInt(elementos[n]);
                }

                for(int i = 0; i < numeros.length - 1; i++) {
                    for(int j = 0; j < numeros.length - 1; j++){
                        if (numeros[j] > numeros[j + 1]){
                            int temporal = numeros[j+1];
                            numeros[j+1] = numeros[j];
                            numeros[j] = temporal;
                        }
                    }
                }
                String resultado="";
                for(int n:numeros)
                    resultado=resultado+" "+n;
                text.setText(resultado);

            }
        });

    }

    public void regresarMainActivity(View v){
        Intent cambiar=new Intent(Activity2.this,MainActivity.class);
        startActivity(cambiar);
        finish();
    }

    public void avanzarActivity3(View v){
        Intent cambiar=new Intent(Activity2.this,Activity3.class);
        startActivity(cambiar);
        finish();
    }
}
