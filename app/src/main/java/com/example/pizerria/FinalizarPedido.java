package com.example.pizerria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FinalizarPedido extends AppCompatActivity {
public Button recibir,regresar;
public TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_pedido);
        recibir=(Button) findViewById(R.id.btnconfrirmar);
        mensaje=(TextView) findViewById(R.id.txtpedido);
        regresar=(Button) findViewById(R.id.btnregresar);

        Bundle p =getIntent().getExtras();
        String pedido=p.getString("Pedido");
        mensaje.setText(pedido);

        recibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Su pedido ha sido enviado",Toast.LENGTH_LONG).show();
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