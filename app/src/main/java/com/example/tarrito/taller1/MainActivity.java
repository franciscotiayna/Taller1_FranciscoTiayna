package com.example.tarrito.taller1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Switch swt;
    private CheckBox cbx;
    private final String Saludo = "Hola a todos desde activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "clock en el boton", Toast.LENGTH_SHORT).show();
            }
        });

        cbx = (CheckBox) findViewById(R.id.checkMain);
        cbx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clock en el check", Toast.LENGTH_SHORT).show();
            }
        });

        swt = (Switch) findViewById(R.id.switch1);
        swt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "clock en el switch", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void miMetodo(View v){
        Toast.makeText(MainActivity.this, "click en el boton", Toast.LENGTH_SHORT).show();
    }
}
