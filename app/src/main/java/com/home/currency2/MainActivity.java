package com.home.currency2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNtd = findViewById(R.id.et_ntd);
    }

    public void exchangeUSD(View v){
        if(etNtd.length()==0){
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter your NTD amount.")
                    .setPositiveButton("OK",null)
                    .show();
        }
        else{
            float ntd=Float.parseFloat(etNtd.getText().toString());
            float usd= (float) (ntd/30.9);
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("USD is "+usd+". ")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            etNtd.setText("");
                        }
                    })
                    .show();
        }
    }
}
