package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    private double num1;
    private char sign;
    private double result;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etInputDisplay = findViewById(R.id.etInputDisplay);
        EditText etOutputDisplay = findViewById(R.id.etOutputDisplay);

        Button btnAllClear = findViewById(R.id.btnAllClear);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnMod = findViewById(R.id.btnMod);
        Button btnDivision = findViewById(R.id.btnDivision);
        Button btnMultiplication = findViewById(R.id.btnMultiplication);
        Button btnSubtraction = findViewById(R.id.btnSubtraction);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnEqual = findViewById(R.id.btnEqual);
        Button btnDot = findViewById(R.id.btnDot);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btn00 = findViewById(R.id.btn00);


        btnAllClear.setOnClickListener(v -> {
            etInputDisplay.setText("");
            etOutputDisplay.setText("");
        });

        btnClear.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString();
            etInputDisplay.setText(val.substring(0, val.length() - 1));
        });

        btn1.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "1";
            etInputDisplay.setText(val);
        });
        btn2.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "2";
            etInputDisplay.setText(val);
        });
        btn3.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "3";
            etInputDisplay.setText(val);
        });
        btn4.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "4";
            etInputDisplay.setText(val);
        });
        btn5.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "5";
            etInputDisplay.setText(val);
        });
        btn6.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "6";
            etInputDisplay.setText(val);
        });
        btn7.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "7";
            etInputDisplay.setText(val);
        });
        btn8.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "8";
            etInputDisplay.setText(val);
        });
        btn9.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "9";
            etInputDisplay.setText(val);
        });
        btn0.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "0";
            etInputDisplay.setText(val);
        });
        btn00.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + "00";
            etInputDisplay.setText(val);
        });

        btnDot.setOnClickListener(v -> {
            String val = etInputDisplay.getText().toString() + ".";
            etInputDisplay.setText(val);
        });



        btnMod.setOnClickListener(v -> {
            num1 = Double.parseDouble(etInputDisplay.getText().toString());
            sign = '%';
            etInputDisplay.setText("");

        });

        btnDivision.setOnClickListener(v -> {
            num1 = Double.parseDouble(etInputDisplay.getText().toString());
            sign = '/';
            etInputDisplay.setText("");

        });

        btnMultiplication.setOnClickListener(v -> {
            num1 = Double.parseDouble(etInputDisplay.getText().toString());
            sign = '*';
            etInputDisplay.setText("");

        });

        btnSubtraction.setOnClickListener(v -> {
            num1 = Double.parseDouble(etInputDisplay.getText().toString());
            sign = '-';
            etInputDisplay.setText("");

        });

        btnAdd.setOnClickListener(v -> {
            num1 = Double.parseDouble(etInputDisplay.getText().toString());
            sign = '+';
            etInputDisplay.setText("");
        });

        btnEqual.setOnClickListener(v -> {
            if (num1 != 0) {
                double num2 = Double.parseDouble(etInputDisplay.getText().toString());
                switch (sign) {
                    case '%':
                        result = num1 % num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '+':
                        result = num1 + num2;
                        break;
                }

                etOutputDisplay.setText(String.valueOf(result));
            }

        });
    }
}