package com.example.jurara.tablasmultiplicar2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,SeekBar.OnSeekBarChangeListener {

    TextView txtTitulo;
    SeekBar bar;
    Button btnCalc;
    TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.-construir referencias a componentes xml
        txtTitulo=(TextView)findViewById(R.id.txt_titulo);
        bar=(SeekBar)findViewById(R.id.seekBar);
        btnCalc=(Button)findViewById(R.id.btn_calc);
        txtRes=(TextView)findViewById(R.id.txt_res);
        //2.-asociar Listener a btnCalc
        btnCalc.setOnClickListener(this);
        bar.setMax(10);
        bar.setOnSeekBarChangeListener(this);
    }




    @Override
    public void onClick(View v) {
        //3.-Obtener el valor numerico de la tabla
        int numero;
        String res="";
        numero=bar.getProgress();
        for(int i=1;i<11;i++){
            res+=numero+" * "+i+" = "+(numero*i)+"\n";
        }
        txtRes.setText("Este es el resultado\n"+res);
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        //3.-Obtener el valor numerico de la tabla
        int numero;
        String res="";
        numero=bar.getProgress();
        for(int i=1;i<11;i++){
            res+=numero+" * "+i+" = "+(numero*i)+"\n";
        }
        txtRes.setText("Este es el resultado\n"+res);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
