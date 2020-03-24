package com.bb.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.security.cert.Extension;
import java.util.Arrays;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_Add,btn_Sub,btn_Mul,btn_Div,btn_calc,btn_dec,btn_clear;
    Button sci1_button, sci2_button, sci3_button, sci4_button, sci5_button, sci6_button, sci7_button, sci8_button, sci9_button, sci10_button;
    Button sci11_button, sci12_button, sci13_button, sci14_button, sci15_button, sci16_button, sci17_button, sci18_button, sci19_button, sci20_button;
    Button sci21_button, sci22_button, sci23_button, sci24_button, sci25_button, sci26_button, sci27_button, sci28_button, sci29_button, sci30_button;
    Button scientific;
    TextView ed1;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.zero_button);
        btn_1 = (Button) findViewById(R.id.one_button);
        btn_2 = (Button) findViewById(R.id.two_button);
        btn_3 = (Button) findViewById(R.id.three_button);
        btn_4 = (Button) findViewById(R.id.four_button);
        btn_5 = (Button) findViewById(R.id.five_button);
        btn_6 = (Button) findViewById(R.id.six_button);
        btn_7 = (Button) findViewById(R.id.seven_button);
        btn_8 = (Button) findViewById(R.id.eight_button);
        btn_9 = (Button) findViewById(R.id.nine_button);
        btn_Add = (Button) findViewById(R.id.add_button);
        btn_Div = (Button) findViewById(R.id.division_button);
        btn_Sub = (Button) findViewById(R.id.subtract_button);
        btn_Mul = (Button) findViewById(R.id.multiply_button);
        btn_calc = (Button) findViewById(R.id.equal_button);
        btn_dec = (Button) findViewById(R.id.dot_button);
        btn_clear = (Button) findViewById(R.id.ac_button);
        sci1_button = (Button) findViewById(R.id.sci1_button);
        sci2_button = (Button) findViewById(R.id.sci2_button);
        sci3_button = (Button) findViewById(R.id.sci3_button);
        sci4_button = (Button) findViewById(R.id.sci4_button);
        sci5_button = (Button) findViewById(R.id.sci5_button);
        sci6_button = (Button) findViewById(R.id.sci6_button);
        sci7_button = (Button) findViewById(R.id.sci7_button);
        sci8_button = (Button) findViewById(R.id.sci8_button);
        sci9_button = (Button) findViewById(R.id.sci9_button);
        sci10_button = (Button) findViewById(R.id.sci10_button);
        sci11_button = (Button) findViewById(R.id.sci11_button);
        sci12_button = (Button) findViewById(R.id.sci12_button);
        sci13_button = (Button) findViewById(R.id.sci13_button);
        sci14_button = (Button) findViewById(R.id.sci14_button);
        sci15_button = (Button) findViewById(R.id.sci15_button);
        sci16_button = (Button) findViewById(R.id.sci16_button);
        sci17_button = (Button) findViewById(R.id.sci17_button);
        sci18_button = (Button) findViewById(R.id.sci18_button);
        sci19_button = (Button) findViewById(R.id.sci19_button);
        sci20_button = (Button) findViewById(R.id.sci20_button);
        sci21_button = (Button) findViewById(R.id.sci21_button);
        sci22_button = (Button) findViewById(R.id.sci22_button);
        sci23_button = (Button) findViewById(R.id.sci23_button);
        sci24_button = (Button) findViewById(R.id.sci24_button);
        sci25_button = (Button) findViewById(R.id.sci25_button);
        sci26_button = (Button) findViewById(R.id.sci26_button);
        sci27_button = (Button) findViewById(R.id.sci27_button);
        sci28_button = (Button) findViewById(R.id.sci28_button);
        sci29_button = (Button) findViewById(R.id.sci29_button);
        sci30_button = (Button) findViewById(R.id.sci30_button);
        scientific = (Button) findViewById(R.id.Scientific_button);
        ed1 = (TextView) findViewById(R.id.user_input_textview);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ed1 == null){
                    ed1.setText("");
                }else {
                    Value1 = Float.parseFloat(ed1.getText() + "");
                    mAddition = true;
                    ed1.setText(null);
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                mSubtract = true ;
                ed1.setText(null);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                mMultiplication = true ;
                ed1.setText(null);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText()+"");
                mDivision = true ;
                ed1.setText(null);
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(ed1.getText() + "");

                if (mAddition == true){

                    ed1.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    ed1.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    ed1.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    ed1.setText(Value1 / Value2+"");
                    mDivision=false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

        scientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(R.layout.activity_main_landscape)));
                startActivity(i);
            }
        });
    }

}