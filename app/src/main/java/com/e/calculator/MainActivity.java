package com.e.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btnAdd, btn4, btn5, btn6, btnSubtract, btn7, btn8, btn9,
            btnMultiply, btnReset, btn0, btnEqual, btnDivide;
    TextView result;
    float firstNum, secondNum, Result;
    boolean boolSum = false, boolSub = false, boolMulti = false, boolDiv = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnReset = findViewById(R.id.btnReset);
        btnReset = findViewById(R.id.btnReset);

        // For Displaying 0 in text view of the calculator
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        // For Displaying 1 in text view of the calculator
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
            }
        });

        // Taking first number and storing in first variable.

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(result.getText().toString());
                boolSum = true;
                result.setText(null);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(result.getText().toString());
                boolSub = true;
                result.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(result.getText().toString());
                boolMulti = true;
                result.setText(null);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(result.getText().toString());
                boolDiv = true;
                result.setText(null);

                // Taking Second number and Storing into variable after pressing Equals to sign

                btnEqual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        secondNum = Float.parseFloat(result.getText().toString());
                        if (boolSum == true) {
                            Result = firstNum + secondNum;
                            result.setText(result + "");
                            boolSum = false;
                        } else if (boolSub == true) {
                            Result = firstNum - secondNum;
                            result.setText(result + "");
                            boolSub = false;
                        } else if (boolMulti == true) {
                            Result = firstNum * secondNum;
                            result.setText(result + "");
                            boolMulti = false;
                        } else if (boolDiv == true) {
                            Result = firstNum / secondNum;
                            result.setText(result + "");
                            boolDiv = false;
                        }
                    }
                });

            }
        });
    }
}

