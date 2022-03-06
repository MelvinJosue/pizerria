package com.example.pizerria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class menu extends AppCompatActivity {
    private EditText nombre;
    private RadioButton personal,mediana,Familiar;
    private CheckBox Aceituna,Carne,Tocino,Championes,elote,choclo,tomate;
    private double precio=0;
    private String pedidos;
    private Button limpiar,pedido,regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        nombre = findViewById(R.id.Nombre);
        regresar = findViewById(R.id.btnregresar1);
        personal = findViewById(R.id.rPersonal);
        mediana = findViewById(R.id.Rmediana);
        Familiar = findViewById(R.id.rfamiliar);
        limpiar = findViewById(R.id.limpiar);
        pedido = findViewById(R.id.btnpedido);
        Aceituna = findViewById(R.id.btnaceituna);
        Carne = findViewById(R.id.btnCarne);
        Tocino = findViewById(R.id.btnaceituna);
        Championes = findViewById(R.id.btnaceituna);
        elote = findViewById(R.id.btnaceituna);
        choclo = findViewById(R.id.btnChoclo);
        tomate = findViewById(R.id.Btntomate);
        pedidos= "";

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
                finish();
            }
        });

        pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Ingrese por favor su nombre",Toast.LENGTH_LONG).show();

                }else {
                    if (personal.isChecked()==false&&mediana.isChecked()==false&&Familiar.isChecked()==false){
                        Toast.makeText(getApplicationContext(),"Selecciona un tipo de pizza",Toast.LENGTH_LONG).show();
                    }else {
                        if (Tocino.isChecked()==false&&Aceituna.isChecked()==false&&Carne.isChecked()==false&&Championes.isChecked()==false&&elote.isChecked()==false&&choclo.isChecked()==false&&tomate.isChecked()==false){
                            Toast.makeText(getApplicationContext(),"Selecciona un ingrediente minimo",Toast.LENGTH_LONG).show();
                        }else {
                            pedidos+= "Muchas gracias, "+nombre.getText().toString()+", Tu pedido es el siguiente:";
                            pedidos+="\n";

                            if (personal.isChecked() == true) {
                                precio=precio+5;
                                pedidos+=personal.getText().toString();
                                pedidos+="\n";
                            }
                            else if (mediana.isChecked()== true){
                                precio=precio+8;
                                pedidos+=mediana.getText().toString();
                                pedidos+="\n";
                            }
                            else if (Familiar.isChecked()== true){
                                precio=precio+10;
                                pedidos+=Familiar.getText().toString();
                                pedidos+="\n";
                            }
                            if (Aceituna.isChecked()==true){
                                precio=precio+5;
                                pedidos+=Aceituna.getText().toString();
                                pedidos+="\n";
                            }
                            if (Tocino.isChecked()==true){
                                precio=precio+5;
                                pedidos+=Tocino.getText().toString();
                                pedidos+="\n";
                            }
                            if (Championes.isChecked()==true){
                                precio=precio+5;
                                pedidos+=Championes.getText().toString();
                                pedidos+="\n";
                            }
                            if (elote.isChecked()==true){
                                precio=precio+5;
                                pedidos+=elote.getText().toString();
                                pedidos+="\n";
                            }
                            if (tomate.isChecked()==true){
                                precio=precio+5;
                                pedidos+=tomate.getText().toString();
                                pedidos+="\n";
                            }
                            if (choclo.isChecked()==true){
                                precio=precio+5;
                                pedidos+=choclo.getText().toString();
                                pedidos+="\n";
                            }
                            if (Carne.isChecked()==true){
                                precio=precio+5;
                                pedidos+=Carne.getText().toString();
                                pedidos+="\n";
                            }
                            pedidos+="Tu total es: "+precio;
                            pedidos+="\n";
                            pedidos+="Presiona el boton comfirmar para enviar el pedido";
                           Intent intent=new Intent(getApplicationContext(),FinalizarPedido.class);
                           intent.putExtra("Pedido",pedidos);
                           startActivity(intent);

                        }
                    }
                }
            }
        });

            regresar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });




    }
}