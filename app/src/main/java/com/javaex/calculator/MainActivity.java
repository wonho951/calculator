package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //필드
    private TextView edtText;
        //숫자
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
        //기호
    private Button btnDiv;
    private Button btnMul;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnClear;
    private Button btnEq;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Log.d("javaStudy", "클릭이벤트 작동");

                switch (view.getId()){
                    case R.id.btnOne:
                        Log.d("javaStudy", "btnOne 버튼 클릭" + R.id.btnOne);

                        edtText.append("1");
                        //edtText.setText(edtText.getText().toString() + "1");

                        break;

                    case R.id.btnTwo:
                        Log.d("javaStudy", "btnTwo 버튼 클릭" + R.id.btnTwo);

                        edtText.append("2");
                        //edtText.setText(edtText.getText().toString() + "2");
                        break;

                    case R.id.btnThree:
                        Log.d("javaStudy", "btnThree 버튼 클릭" + R.id.btnThree);

                        edtText.append("3");
                        //edtText.setText(edtText.getText().toString() + "3");
                        break;

                    case R.id.btnFour:
                        Log.d("javaStudy", "btnFour 버튼 클릭" + R.id.btnFour);

                        edtText.append("4");
                        //edtText.setText(edtText.getText().toString() + "4");
                        break;

                    case R.id.btnFive:
                        Log.d("javaStudy", "btnFive 버튼 클릭" + R.id.btnFive);

                        edtText.append("5");
                        //edtText.setText(edtText.getText().toString() + "5");
                        break;
                    case R.id.btnSix:
                        Log.d("javaStudy", "btnSix 버튼 클릭" + R.id.btnSix);

                        edtText.append("6");
                        //edtText.setText(edtText.getText().toString() + "6");
                        break;

                    case R.id.btnSeven:
                        Log.d("javaStudy", "btnSeven 버튼 클릭" + R.id.btnSeven);

                        edtText.append("7");
                        //edtText.setText(edtText.getText().toString() + "7");
                        break;

                    case R.id.btnEight:
                        Log.d("javaStudy", "btnEight 버튼 클릭" + R.id.btnEight);

                        edtText.append("8");
                        //edtText.setText(edtText.getText().toString() + "8");
                        break;

                    case R.id.btnNine:
                        Log.d("javaStudy", "btnNine 버튼 클릭" + R.id.btnNine);

                        edtText.append("9");
                        //edtText.setText(edtText.getText().toString() + "9");

                        break;
                    case R.id.btnZero:
                        Log.d("javaStudy", "btnZero 버튼 클릭" + R.id.btnZero);

                        edtText.append("0");
                        //edtText.setText(edtText.getText().toString() + "0");
                        break;
                    case R.id.btnPlus:
                        Log.d("javaStudy", "btnPlus 버튼 클릭" + R.id.btnPlus);

                        edtText.append("+");
                        //edtText.setText(edtText.getText().toString() + "+");
                        break;

                    case R.id.btnMinus:
                        Log.d("javaStudy", "btnMinus 버튼 클릭" + R.id.btnMinus);

                        edtText.append("-");
                        //edtText.setText(edtText.getText().toString() + "-");
                        break;

                    case R.id.btnMul:
                        Log.d("javaStudy", "btnMultiplication 버튼 클릭" + R.id.btnMul);

                        edtText.append("*");
                        //edtText.setText(edtText.getText().toString() + "*");

                        break;

                    case R.id.btnDiv:
                        Log.d("javaStudy", "btnDivision 버튼 클릭" + R.id.btnDiv);

                        edtText.append("/");
                        //edtText.setText(edtText.getText().toString() + "/");
                        break;

                    case R.id.btnClear:
                        Log.d("javaStudy", "btnClear 버튼 클릭" + R.id.btnClear);

                        edtText.setText("");

                        break;

                    case R.id.btnEq:
                        Log.d("javaStudy", "btnEquals 버튼 클릭" + R.id.btnEq);

                        String str = edtText.getText().toString();



                        break;



                }

            }
        };


        edtText = (EditText)findViewById(R.id.edtText);

        btnOne = (Button)findViewById(R.id.btnOne);
        btnOne.setOnClickListener(listener);

        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(listener);

        btnThree = (Button)findViewById(R.id.btnThree);
        btnThree.setOnClickListener(listener);

        btnFour = (Button)findViewById(R.id.btnFour);
        btnFour.setOnClickListener(listener);

        btnFive = (Button)findViewById(R.id.btnFive);
        btnFive.setOnClickListener(listener);

        btnSix = (Button)findViewById(R.id.btnSix);
        btnSix.setOnClickListener(listener);

        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(listener);

        btnEight = (Button)findViewById(R.id.btnEight);
        btnEight.setOnClickListener(listener);

        btnNine = (Button)findViewById(R.id.btnNine);
        btnNine.setOnClickListener(listener);

        btnZero = (Button)findViewById(R.id.btnZero);
        btnZero.setOnClickListener(listener);

        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(listener);

        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(listener);

        btnMul = (Button)findViewById(R.id.btnMul);
        btnMul.setOnClickListener(listener);

        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(listener);

        btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(listener);

        btnEq = (Button)findViewById(R.id.btnEq);
        btnEq.setOnClickListener(listener);








    }
}

