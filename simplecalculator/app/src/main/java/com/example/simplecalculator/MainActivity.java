package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    TextView display;
    double first, second;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);


        findViewById(R.id.btn1).setOnClickListener(v -> display.append("1"));
        findViewById(R.id.btn2).setOnClickListener(v -> display.append("2"));
        findViewById(R.id.btn3).setOnClickListener(v -> display.append("3"));
        findViewById(R.id.btn4).setOnClickListener(v -> display.append("4"));
        findViewById(R.id.btn5).setOnClickListener(v -> display.append("5"));
        findViewById(R.id.btn6).setOnClickListener(v -> display.append("6"));
        findViewById(R.id.btn7).setOnClickListener(v -> display.append("7"));
        findViewById(R.id.btn8).setOnClickListener(v -> display.append("8"));
        findViewById(R.id.btn9).setOnClickListener(v -> display.append("9"));
        findViewById(R.id.btn0).setOnClickListener(v -> display.append("0"));


        findViewById(R.id.btnAdd).setOnClickListener(v -> {
            first = Double.parseDouble(display.getText().toString());
            op = "+";
            display.setText("");
        });

        findViewById(R.id.btnSub).setOnClickListener(v -> {
            first = Double.parseDouble(display.getText().toString());
            op = "-";
            display.setText("");
        });

        findViewById(R.id.btnMul).setOnClickListener(v -> {
            first = Double.parseDouble(display.getText().toString());
            op = "*";
            display.setText("");
        });

        findViewById(R.id.btnDiv).setOnClickListener(v -> {
            first = Double.parseDouble(display.getText().toString());
            op = "/";
            display.setText("");
        });


        findViewById(R.id.btnEqual).setOnClickListener(v -> {
            second = Double.parseDouble(display.getText().toString());
            double result = 0;

            if (op.equals("+")) result = first + second;
            else if (op.equals("-")) result = first - second;
            else if (op.equals("*")) result = first * second;
            else if (op.equals("/")) {
                if (second == 0) {
                    display.setText("Error");
                    return;
                }
                result = first / second;
            }

            display.setText(String.valueOf(result));
        });


        findViewById(R.id.btnClear).setOnClickListener(v -> display.setText(""));
    }
}
