package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstValue, etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMul);
        divide = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, SecondValue, ans;
                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue + SecondValue;
                tvAns.setText("Answer is = "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , SecondValue, ans;
                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue - SecondValue;
                tvAns.setText("Answer is = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , SecondValue, ans;
                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue * SecondValue;
                tvAns.setText("Answer is = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , SecondValue, ans;
                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue / SecondValue;
                tvAns.setText("Answer is = "+ans);
            }
        });
    }
}