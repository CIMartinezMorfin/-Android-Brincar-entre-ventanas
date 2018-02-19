package com.example.claudioivan.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    Button boton;
    EditText edit;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        boton=(Button)findViewById(R.id.button3);
        edit=(EditText)findViewById(R.id.editText3);
        text=(TextView)findViewById(R.id.textView3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int elemento=Integer.parseInt(edit.getText().toString());
                int valor=1; boolean par=true;
                if(elemento>1){
                    do{
                        valor= (par==true) ? valor+1 : valor+2;
                        par= !par;
                        elemento--;
                    }while(elemento>1);
                }text.setText(""+valor);

            }
        });

    }

    public void regresarActivity2(View v){
        Intent cambiar=new Intent(Activity3.this,Activity2.class);
        startActivity(cambiar);
        finish();
    }
}
