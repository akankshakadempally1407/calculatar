package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        textView=(TextView)findViewById(R.id.textview5);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
    }

    public void add(View view) {
        double num1,num2,sum;
        num1 = Double.parseDouble(editText1.getText().toString());
        num2 = Double.parseDouble(editText2.getText().toString());
        sum = num1 + num2;
        textView.setText(Double.toString(sum));
    }

    public void sub(View view) {
        double num1,num2,sub;
        num1 = Double.parseDouble(editText1.getText().toString());
        num2 = Double.parseDouble(editText2.getText().toString());
        sub = num1 - num2;
        textView.setText(Double.toString(sub));
    }

    public void mul(View view) {
        double num1, num2, mul;
        num1 = Double.parseDouble(editText1.getText().toString());
        num2 = Double.parseDouble(editText2.getText().toString());
        mul = num1 * num2;
        textView.setText(Double.toString(mul));
    }

    public void div(View view) {
        double num1, num2, div;
        num1 = Double.parseDouble(editText1.getText().toString());
        num2 = Double.parseDouble(editText2.getText().toString());
        div = num1 / num2;
        textView.setText(Double.toString(div));
    }
}


