package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.githang.statusbar.StatusBarCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button one,two,three,four,five,six,seven,eight,nine,zero,point,add,sub,mul,div,equ,del,clean;
    private TextView txt;
    double num1=0,num2=0;
    double result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        point.setOnClickListener(this);
        del.setOnClickListener(this);
        clean.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);

        StatusBarCompat.setStatusBarColor(this, 0xFAFAFA,true);
    }

    private void init(){
        one = findViewById(R.id.btn_1);
        two = findViewById(R.id.btn_2);
        three = findViewById(R.id.btn_3);
        four = findViewById(R.id.btn_4);
        five = findViewById(R.id.btn_5);
        six = findViewById(R.id.btn_6);
        seven = findViewById(R.id.btn_7);
        eight = findViewById(R.id.btn_8);
        nine = findViewById(R.id.btn_9);
        zero = findViewById(R.id.btn_0);
        point = findViewById(R.id.btn_point);
        add = findViewById(R.id.btn_add);
        sub = findViewById(R.id.btn_sub);
        mul = findViewById(R.id.btn_multiply);
        div = findViewById(R.id.btn_divide);
        equ = findViewById(R.id.btn_equal);
        del = findViewById(R.id.btn_del);
        clean = findViewById(R.id.btn_clean);
        txt = findViewById(R.id.show);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_clean:
                txt.setText(null);
                break;
            case R.id.btn_1:
                String str1 = txt.getText().toString();
                str1+="1";
                txt.setText(str1);
                break;
            case R.id.btn_2:
                String str2 = txt.getText().toString();
                str2 += "2";
                txt.setText(str2);
                break;
            case R.id.btn_3:
                String str3 = txt.getText().toString();
                str3 += "3";
                txt.setText(str3);
                break;
            case R.id.btn_4:
                String str4 = txt.getText().toString();
                str4 += "4";
                txt.setText(str4);
                break;
            case R.id.btn_5:
                String str5 = txt.getText().toString();
                str5 += "5";
                txt.setText(str5);
                break;
            case R.id.btn_6:
                String str6 = txt.getText().toString();
                str6 += "6";
                txt.setText(str6);
                break;
            case R.id.btn_7:
                String str7 = txt.getText().toString();
                str7 += "7";
                txt.setText(str7);
                break;
            case R.id.btn_8:
                String str8 = txt.getText().toString();
                str8 += "8";
                txt.setText(str8);
                break;
            case R.id.btn_9:
                String str9 = txt.getText().toString();
                str9 += "9";
                txt.setText(str9);
                break;
            case R.id.btn_0:
                String strr = txt.getText().toString();
                strr += "0";
                txt.setText(strr);
                break;
            case R.id.btn_point:
                String strb = txt.getText().toString();
                strb += ".";
                txt.setText(strb);
                break;
            case R.id.btn_del:
                String str = txt.getText().toString();
                if (str != null && !str.equals("")) {
                    str = str.substring(0, str.length() - 1);
                    txt.setText(str);
                }
                break;
            case R.id.btn_add:
                String stra = txt.getText().toString();
                stra+="+";
                txt.setText(stra);
                break;
            case R.id.btn_sub:
                String strs = txt.getText().toString();
                strs+="-";
                txt.setText(strs);
                break;
            case R.id.btn_multiply:
                String strm = txt.getText().toString();
                strm+="*";
                txt.setText(strm);
                break;
            case R.id.btn_divide:
                String strd = txt.getText().toString();
                strd+="/";
                txt.setText(strd);
                break;

        }
    }

    public int cal(int num1, int num2, int oper) {
        int res = 0;
        switch (oper) {
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '+':
                res = num1 + num2;
                break;
            default:
                break;
        }
        return res;
    }
}