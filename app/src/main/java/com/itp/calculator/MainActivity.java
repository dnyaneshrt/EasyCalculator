
package com.itp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_add,btn_sub,btn_div,btn_mult;
    EditText et_num1,et_num2;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btn_add=  findViewById(R.id.btn_add);
      btn_sub=findViewById(R.id.btn_sub);
      btn_div=findViewById(R.id.btn_div);
      btn_mult=findViewById(R.id.btn_mult);

      et_num1=findViewById(R.id.et_num1);
      et_num2=findViewById(R.id.et_num2);
      tv_result=findViewById(R.id.tv_result);

      btn_add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             String num1=et_num1.getText().toString();
             String num2=et_num2.getText().toString();
             //String to int conversion.
            int result=Integer.parseInt(num1)+Integer.parseInt(num2);
            tv_result.setText("result: "+result);

          }
      });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et_num1.getText().toString();
                String num2=et_num2.getText().toString();
                //String to int conversion.
                int result=Integer.parseInt(num1)-Integer.parseInt(num2);
                tv_result.setText("result: "+result);
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et_num1.getText().toString();
                String num2=et_num2.getText().toString();
                //String to int conversion.
                int result=Integer.parseInt(num1)/Integer.parseInt(num2);
                tv_result.setText("result: "+result);
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et_num1.getText().toString();
                String num2=et_num2.getText().toString();
                //String to int conversion.
                int result=Integer.parseInt(num1)*Integer.parseInt(num2);
                tv_result.setText("result: "+result);
            }
        });
    }
}