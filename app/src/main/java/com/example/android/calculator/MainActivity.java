package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.R.attr.button;
import static android.R.attr.x;
import static android.R.attr.y;
import static android.R.string.no;
import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {
    long no = 0;
    long no1 = 0;
    long no2 = 0;
    long result ;
    float result1;
    double result2;
    int a = 0;
    int b = 0;
    String op ;
    String string1;
    String string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNumber1(long x){
        TextView text_view_1 = (TextView) findViewById(R.id.tv1);
        text_view_1.setText(String.valueOf(x));
    }
    public void displayNumber2(String x) {
        TextView text_view_1 = (TextView) findViewById(R.id.tv1);
        text_view_1.setText(String.valueOf(x));
    }

    public void number(long i){
        if(a==0){
            no1 = no1*10 + i;
            displayNumber1(no1);
            b_result(no1);
        }
        else {
            no2 = no2 * 10 + i;
            string1 = no1 + " " + op + " " + no2;
            displayNumber2(string1);
            if (b == 1) {
                result = no1 + no2 ;
                b_result(result);
            }
            else if (b == 2) {
                result = no1 - no2 ;
                b_result(result);
            }
            else if (b == 3) {
                result = no1 * no2 ;
                b_result(result);
            }
            else if (b == 4) {
                result1 = (float)no1 / no2 ;
                b_result1(result1);
            }
            else if (b == 5) {
                result2 = pow(no1,no2);
                result = (long) result2;
                b_result(result);
            }

        }

    }


    public void b1(View v){
        no = 1;
        number(1);

    }

    public void b2(View v){
        no = 2;
        number(2);
    }

    public void b3(View v){
        no = 3;
        number(3);
    }

    public void b4(View v){
        no = 4;
        number(4);
    }

    public void b5(View v){
        no = 5;
        number(5);
    }

    public void b6(View v){
        no = 6;
        number(6);
    }

    public void b7(View v){
        no = 7;
        number(7);
    }

    public void b8(View v){
        no = 8;
        number(8);
    }

    public void b9(View v){
     no = 9;
        number(9);
    }

    public void b0(View v){
        no = 0;
        number(0);
    }

    public void b_add(View v){
        op = "+";
        ++a;
        string1 = no1 + " " + op;
        displayNumber2(string1);
        b = 1;
    }

    public void b_sub(View v){
        op = "-";
        ++a;
        string1 = no1 + " " + op;
        displayNumber2(string1);
        b =2;
    }

    public void b_mul(View v){
        op = "*";
        ++a;
        string1 = no1 + " " + op;
        displayNumber2(string1);
        b=3;
    }

    public void b_div(View v){
        op = "/";
        ++a;
        string1 = no1 + " " + op;
        displayNumber2(string1);
        b=4;
    }

    public void b_pow(View v){
        op = "^";
        ++a;
        string1 = no1 + " " + op;
        displayNumber2(string1);
        b=5;
    }

    public void b_per(View v){
        op = "%";
        ++a;
        string1 = no1 + " " + op;
        displayNumber2(string1);
    }

    public void b_result(long x){
        TextView text_view_1 = (TextView) findViewById(R.id.tv2);
        text_view_1.setText(String.valueOf(x));

    }

    public void b_result1(float x){
        TextView text_view_1 = (TextView) findViewById(R.id.tv2);
        text_view_1.setText(String.valueOf(x));

    }

    public void b_equal(View v) {
        String x = "";
        TextView text_view_1 = (TextView) findViewById(R.id.tv2);
        text_view_1.setText(String.valueOf(x));

        if (b == 4) {
            TextView text_view_2 = (TextView) findViewById(R.id.tv1);
            text_view_2.setText(String.valueOf(result1));
            no1 = (int)result1;
        }
        else {
            TextView text_view_2 = (TextView) findViewById(R.id.tv1);
            text_view_2.setText(String.valueOf(result));
            no1 = result;
        }
        no2 = 0;
        a = 0;
        b = 0;
    }

    public void b_clear(View v){
         no = 0;
         no1 = 0;
         no2 = 0;
         result = 0;
         result1 = 0;
         result2 = 0;
         a = 0;
         b = 0;
        String x = "";
        TextView text_view_1 = (TextView) findViewById(R.id.tv1);
        text_view_1.setText(String.valueOf(x));

        TextView text_view_2 = (TextView) findViewById(R.id.tv2);
        text_view_2.setText(String.valueOf(x));

    }


}
