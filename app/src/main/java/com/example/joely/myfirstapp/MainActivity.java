package com.example.joely.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity{

    Button btnAdd;
    Button btnSub;
    Button btnMlt;
    Button btnDiv;
    Button btnEquals;
    Button btnAC;
    Button btnDEL;
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
        btnDiv = (Button) findViewById(R.id.buttonMulti);
        btnEquals = (Button) findViewById(R.id.buttonEquals);
        btnAC = (Button) findViewById(R.id.buttonAC);
        btnDec = (Button) findViewById(R.id.buttonDec);
        btnDEL = (Button) findViewById(R.id.buttonDel);
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
                    if(Character.isDigit(calculate[position-1])){
                        calculate[position] = '+';
                        position++;
                    }
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position-1])){
                        calculate[position] = '-';
                        position++;
                    }
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btnMlt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position-1])){
                        calculate[position] = '*';
                        position++;
                    }
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20 && position != 0){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position-1])){
                        calculate[position] = '/';
                        position++;
                    }
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '1';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '2';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '3';
                    position++;

                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '4';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '5';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '6';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '7';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '8';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '9';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // check if length is less than array size
                if(position < 20){
                    calculate[position] = '0';
                    position++;
                }
                tvResult.setText(String.valueOf(calculate));
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(position < 20){
                    //check if previous character is number
                    if(Character.isDigit(calculate[position-1])){
                        result = calculateResult();
                    }
                }
                calculate = new char[20];
                position = 0;
                tvResult.setText(result+"");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate = new char[20];
                position = 0;
                tvResult.setText("0");
            }
        });

        btnDEL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(position > 0){
                    position = position-1;
                    calculate[position] = 0;
                    tvResult.setText(String.valueOf(calculate));
                } else{
                    tvResult.setText("0");
                }

            }
        });
    }

    public int calculateResult(){
        String value = "";
        char currentOperator = '+';
        int currentResult = 0;
        int i = 0;
        //accumulate current result for first integer
        while (Character.isDigit(calculate[i])) {
            value = value + calculate[i];
            i++;
        }
        currentResult = Integer.parseInt(value);

        //reset value for second value to be read
        value = "";

        //go through character array to find next value
        while (i < position){
            // must be operator value
            currentOperator = calculate[i];
            i++;

            //read integers after operator until you reach the next operator
            while (Character.isDigit(calculate[i])) {
                value = value + calculate[i];
                i++;
            }

            switch (currentOperator){
                case '+':
                    currentResult = currentResult + Integer.parseInt(value);
                    break;
                case '-':
                    currentResult = currentResult - Integer.parseInt(value);
                    break;
                case '*':
                    currentResult = currentResult * Integer.parseInt(value);
                    break;
                case '/':
                    currentResult = currentResult / Integer.parseInt(value);
                    break;
            }
        }
        return currentResult;
    }
}

