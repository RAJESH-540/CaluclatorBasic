package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.calculator.databinding.ActivityMainBinding;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    double var1, var2;
    boolean ADD, SUB, DIV, MUL, PERCENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);


       //

        mBinding.lower.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"1");
            }
        });

        //
        mBinding.lower.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"2");
            }
        });

        mBinding.lower.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"3");
            }
        });

        mBinding.lower.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"4");
            }
        });

        mBinding.lower.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"5");
            }
        });

        mBinding.lower.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"6");
            }
        });

        mBinding.lower.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"7");
            }
        });

        mBinding.lower.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"8");
            }
        });

        mBinding.lower.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"9");
            }
        });

        mBinding.lower.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"0");
            }
        });

        mBinding.lower.btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+"00");
            }
        });

        mBinding.lower.btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText(mBinding.uper.output.getText()+".");
            }
        });

        mBinding.lower.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1=Double.parseDouble(mBinding.uper.output.getText()+"");
                ADD =true;
                mBinding.uper.output.setText(null);
            }
        });


        mBinding.lower.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(mBinding.uper.output.getText()+"");
                SUB =true;
                mBinding.uper.output.setText(null);
            }
        });

        mBinding.lower.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(mBinding.uper.output.getText()+"");
                MUL =true;
            //    mBinding.uper.output.setText(null);
            }
        });

        mBinding.lower.division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(mBinding.uper.output.getText()+"");
                DIV =true;
                mBinding.uper.output.setText(null);
            }
        });


        mBinding.lower.percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(mBinding.uper.output.getText()+"");
                PERCENT =true;
                mBinding.uper.output.setText(null);
            }
        });




        mBinding.lower.btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(mBinding.uper.output.getText()+"");
                if (ADD== true){
                    mBinding.uper.output.setText(var1+var2+"");
                    ADD=false;
                }

                if (SUB== true){
                    mBinding.uper.output.setText(var1-var2+"");
                    SUB=false;
                }

                if (DIV== true){
                    mBinding.uper.output.setText(var1/var2+"");
                    DIV=false;
                }
                if (MUL== true){
                    mBinding.uper.output.setText(var1*var2+"");
                    MUL=false;
                }
                if (PERCENT== true){
                    mBinding.uper.output.setText(var1*var2/100+"");
                    PERCENT=false;
                }


            }


        });


        mBinding.lower.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.uper.output.setText("");
            }
        });







    }

}
