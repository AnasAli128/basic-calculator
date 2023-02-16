package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstvalue , secondvalue;
    Button btnadd , btnsubs , btnmultiply , btndivision ;
    int num1 , num2;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstvalue = findViewById(R.id.firstvalue);
        secondvalue = findViewById(R.id.secondvalue);
        btnadd = findViewById(R.id.btnadd);
        btnsubs = findViewById(R.id.btnsubs);
        btndivision = findViewById(R.id.btndivision);
        btnmultiply = findViewById(R.id.btnmultiply);
        tvresult = findViewById(R.id.tvresult);
        Clicklistener();

    }
    public void Clicklistener() {
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstvalue.getText().toString());
                num2 = Integer.parseInt(secondvalue.getText().toString());
                int result  = num1 +num2;
                tvresult.setText(result + "");
            }
        });

        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstvalue.getText().toString());
                num2 = Integer.parseInt(secondvalue.getText().toString());
                int result = num1 - num2 ;
                tvresult.setText(result + "");
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstvalue.getText().toString());
                num2 = Integer.parseInt(secondvalue.getText().toString());
                int result  = num1 * num2;
                tvresult.setText(result + "");

            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstvalue.getText().toString());
                num2 =Integer.parseInt(secondvalue.getText().toString());

                int result = num1 / num2;
                tvresult.setText(result + "");
            }
        });

    }
}