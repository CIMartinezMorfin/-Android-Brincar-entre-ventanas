package com.example.claudioivan.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.button);
        edit=(EditText)findViewById(R.id.editText);
        text=(TextView)findViewById(R.id.textView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int elemento=Integer.parseInt(edit.getText().toString());
                int valor=1; int ante=1; int ante2=1; int posisicon=3;
                if(elemento==1 || elemento==2){text.setText("1");}else {
                    elemento-=2;
                    do{
                        valor=ante+ante2;
                        ante2=ante;
                        ante=valor;
                        elemento--;
                       }while(elemento>0);
                }text.setText(""+valor);

            }
        });
    }

    public void avanzarActivity2(View v){
        Intent cambiar=new Intent(MainActivity.this,Activity2.class);
        startActivity(cambiar);
        finish();
    }

}
