package com.example.rjcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rjcalc.R;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText num1,num2/*,nu1,nu2*/;
    TextView result;
    Button btnplus,btnminus,btnmultiply,btndivide,btnsin,btncos,btntan,btnlog;
    Button btncosec,btnsec,btncot,btnsqrt,btnsqr,btncube,btnpower,btnclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*nu1=(EditText)findViewById(R.id.txtnum1);
        nu2=(EditText)findViewById(R.id.txtnum2);*/
        num1=(EditText)findViewById(R.id.txtnum1);
        num2=(EditText)findViewById(R.id.txtnum2);
        result=(TextView)findViewById(R.id.txtresult);
        btnplus=(Button)findViewById(R.id.plus);
        btnminus=(Button)findViewById(R.id.minus);
        btnmultiply=(Button)findViewById(R.id.multiply);
        btndivide=(Button)findViewById(R.id.divide);
        btnsin=(Button)findViewById(R.id.sin);
        btncos=(Button)findViewById(R.id.cos);
        btntan=(Button)findViewById(R.id.tan);
        btnlog=(Button)findViewById(R.id.log);
        btncosec=(Button)findViewById(R.id.cosec);
        btnsec=(Button)findViewById(R.id.sec);
        btncot=(Button)findViewById(R.id.cot);
        btnsqrt=(Button)findViewById(R.id.sqrt);
        btnsqr=(Button)findViewById(R.id.sqr);
        btncube=(Button)findViewById(R.id.cube);
        btnpower=(Button)findViewById(R.id.power);
        btnclear=(Button)findViewById(R.id.clear);

        btnplus.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnsqrt.setOnClickListener(this);
        btncosec.setOnClickListener(this);
        btnsec.setOnClickListener(this);
        btncot.setOnClickListener(this);
        btnlog.setOnClickListener(this);
        btnsqr.setOnClickListener(this);
        btncube.setOnClickListener(this);
        btnpower.setOnClickListener(this);
        btnclear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String nu1,nu2;
        nu1=num1.getText().toString();
        nu2=num2.getText().toString();
        if ((nu1.equals(null) && nu2.equals(null)) || (nu1.equals("") && nu2.equals(""))){
            result.setText("Please enter value !!");
        }
        else if((nu1.equals(null)) || (nu1.equals(""))){
            double n1,n2;
            double out;
            switch (v.getId())
            {
                case R.id.plus:
                    n2=Float.parseFloat(nu2);
                    out=n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.minus:
                    n2=Float.parseFloat(nu2);
                    out=n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.multiply:
                    n2=Float.parseFloat(nu2);
                    out=n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.divide:
                    n2=Float.parseFloat(nu2);
                    out=n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sin:
                    n2=Float.parseFloat(nu2);
                    out=Math.sin(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cos:
                    n2=Float.parseFloat(nu2);
                    out=Math.cos(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.tan:
                    n2=Float.parseFloat(nu2);
                    out=Math.tan(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.log:
                    n2=Float.parseFloat(nu2);
                    out=Math.log(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cosec:
                    n2=Float.parseFloat(nu2);
                    out=(double) 1/Math.sin(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sec:
                    n2=Float.parseFloat(nu2);
                    out=(double) 1/Math.cos(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cot:
                    n2=Float.parseFloat(nu2);
                    out=(double) 1/Math.tan(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sqrt:
                    n2=Float.parseFloat(nu2);
                    out=Math.sqrt(n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sqr:
                    n2=Float.parseFloat(nu2);
                    out=Math.pow(n2,2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cube:
                    n2=Float.parseFloat(nu2);
                    out=Math.pow(n2,3);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.power:
                    n2=Float.parseFloat(nu2);
                    /*out=Math.pow(n1,n2);*/
                    result.setText("Enter num 1");
                    break;
                case R.id.clear:
                    num1.setText("");
                    num2.setText("");
                    break;
            }
        }

        else if((nu2.equals(null)) || (nu2.equals(""))){
            double n1,n2;
            double out;
            switch (v.getId())
            {
                case R.id.plus:
                    n1=Float.parseFloat(nu1);
                    out=n1;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.minus:
                    n1=Float.parseFloat(nu1);
                    out=n1;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.multiply:
                    n1=Float.parseFloat(nu1);
                    out=n1;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.divide:
                    n1=Float.parseFloat(nu1);
                    out=n1;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sin:
                    n1=Float.parseFloat(nu1);
                    out=Math.sin(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cos:
                    n1=Float.parseFloat(nu1);
                    out=Math.cos(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.tan:
                    n1=Float.parseFloat(nu1);
                    out=Math.tan(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.log:
                    n1=Float.parseFloat(nu1);
                    out=Math.log(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cosec:
                    n1=Float.parseFloat(nu1);
                    out=(double) 1/Math.sin(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sec:
                    n1=Float.parseFloat(nu1);
                    out=(double) 1/Math.cos(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cot:
                    n1=Float.parseFloat(nu1);
                    out=(double) 1/Math.tan(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sqrt:
                    n1=Float.parseFloat(nu1);
                    out=Math.sqrt(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sqr:
                    n1=Float.parseFloat(nu1);
                    out=Math.pow(n1,2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cube:
                    n1=Float.parseFloat(nu1);
                    out=Math.pow(n1,3);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.power:
                    n1=Float.parseFloat(nu1);
                    /*out=Math.pow(n1,n2);*/
                    result.setText("Enter num 2");
                    break;
                case R.id.clear:
                    num1.setText("");
                    num2.setText("");
                    break;
            }
        }

        else{
            double n1,n2;
            double out;
            switch (v.getId())
            {
                case R.id.plus:
                    n1=Float.parseFloat(nu1);
                    n2=Float.parseFloat(nu2);
                    out=n1+n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.minus:
                    n1=Float.parseFloat(nu1);
                    n2=Float.parseFloat(nu2);
                    out=n1-n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.multiply:
                    n1=Float.parseFloat(nu1);
                    n2=Float.parseFloat(nu2);
                    out=n1*n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.divide:
                    n1=Float.parseFloat(nu1);
                    n2=Float.parseFloat(nu2);
                    out=(double)n1/n2;
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sin:
                    n1=Float.parseFloat(nu1);
                    out=Math.sin(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cos:
                    n1=Float.parseFloat(nu1);
                    out=Math.cos(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.tan:
                    n1=Float.parseFloat(nu1);
                    out=Math.tan(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.log:
                    n1=Float.parseFloat(nu1);
                    out=Math.log(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cosec:
                    n1=Float.parseFloat(nu1);
                    out=(double) 1/Math.sin(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sec:
                    n1=Float.parseFloat(nu1);
                    out=(double) 1/Math.cos(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cot:
                    n1=Float.parseFloat(nu1);
                    out=(double) 1/Math.tan(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sqrt:
                    n1=Float.parseFloat(nu1);
                    out=Math.sqrt(n1);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.sqr:
                    n1=Float.parseFloat(nu1);
                    out=Math.pow(n1,2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.cube:
                    n1=Float.parseFloat(nu1);
                    out=Math.pow(n1,3);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.power:
                    n1=Float.parseFloat(nu1);
                    n2=Float.parseFloat(nu2);
                    out=Math.pow(n1,n2);
                    result.setText(String.valueOf(out));
                    break;
                case R.id.clear:
                    num1.setText("");
                    num2.setText("");
                    break;
            }
        }

    }
}