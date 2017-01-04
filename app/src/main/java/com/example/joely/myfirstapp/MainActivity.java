package com.example.joely.myfirstapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity{

    Button btnAdd;
    Button btnSub;
    Button btnMlt;
    Button btnDiv;
    Button btnEquals;
    Button btnDec;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;

    private DecimalFormat decimalFormat;
    private char[] calculate = new char[20];
    //stores position of last element
    private int position = 0;
    private int result;

    TextView tvResult;

    String oper = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting maximum decimals
        decimalFormat = new DecimalFormat("#.#####");

        //assign varaibles to elements
        btnAdd = (Button) findViewById(R.id.buttonPlus);
        btnSub = (Button) findViewById(R.id.buttonMinus);
        btnMlt = (Button) findViewById(R.id.buttonMulti);
        btnDiv = (Button) findViewById(R.id.buttonDivide);
        btnEquals = (Button) findViewById(R.id.buttonEquals);
        btnDec = (Button) findViewById(R.id.buttonDec);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);

        tvResult = (TextView) findViewById(R.id.result);

        //set Listeners
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position])){
                        position++;
                        calculate[position] = '+';
                    }
                }
                tvResult.setText(calculate.toString());
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position])){
                        position++;
                        calculate[position] = '-';
                    }
                }
                tvResult.setText(calculate.toString());
            }
        });
        btnMlt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position])){
                        position++;
                        calculate[position] = '*';
                    }
                }
                tvResult.setText(calculate.toString());
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position])){
                        position++;
                        calculate[position] = '/';
                    }
                }
                tvResult.setText(calculate.toString());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                        position++;
                        calculate[position] = '1';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '2';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '3';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '4';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '5';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '6';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '7';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '8';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '9';
                }
                tvResult.setText(calculate.toString());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    position++;
                    calculate[position] = '0';
                }
                tvResult.setText(calculate.toString());
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(position < 20){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position])){
                        result = calculateResult();
                    }
                }
                tvResult.setText(result);
            }
        });
    }

    public int calculateResult(){
        String value1 = "";
        String value2 = "";
        char currentOperator;
        int currentResult;
        int i = 0;
        while (i < position)
            if(Character.isDigit(calculate[i])){
                value1 = value1 + calculate[i];
                i++;
            } else {
                // must be operator value
                currentOperator = calculate[i];

                //read integers after operator
            }
        }
    }
}

