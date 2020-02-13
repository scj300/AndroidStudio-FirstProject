package com.example.firstexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button my_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_button = findViewById(R.id.Delete);

    /*
        btnOne = (Button)findViewById(R.id.One);
        btnTwo = (Button)findViewById(R.id.Two);
        btnThree = (Button)findViewById(R.id.Three);
        btnFour = (Button)findViewById(R.id.Four);
        btnFive = (Button)findViewById(R.id.Five);
        btnSix = (Button)findViewById(R.id.Six);
        btnSeven = (Button)findViewById(R.id.Seven);
        btnEight = (Button)findViewById(R.id.Eight);
        btnNine = (Button)findViewById(R.id.Nine);
        btnSum = (Button)findViewById(R.id.Sum);
        btnSubtract = (Button)findViewById(R.id.Subtract);
        btnMultiply = (Button)findViewById(R.id.Multiply);
        btnClean = (Button)findViewById(R.id.Clean);
        btnDelete = (Button)findViewById(R.id.Delete);
        result = (TextView)findViewById(R.id.Label);
        btnDot = (Button)findViewById(R.id.Dot);
        btnEqual = (Button)findViewById(R.id.Equal);

        btnOne.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "1";

                result.setText(show);
            }
        });

        btnTwo.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "2";

                result.setText(show);
            }
        });

        btnThree.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "3";

                result.setText(show);
            }
        });

        btnFour.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "4";

                result.setText(show);
            }
        });

        btnFive.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "5";

                result.setText(show);
            }
        });

        btnSix.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "6";

                result.setText(show);
            }
        });

        btnSeven.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "7";

                result.setText(show);
            }
        });

        btnEight.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "8";

                result.setText(show);
            }
        });

        btnNine.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "9";

                result.setText(show);
            }
        });

        btnSum.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                operator = "+";

                result.setText("");
            }
        });

        btnSubtract.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                operator = "-";

                result.setText("");
            }
        });

        btnMultiply.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                operator = "*";

                result.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                operator = "/";

                result.setText("");
            }
        });

        btnDot.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + ".";

                result.setText(show);
            }
        });

        btnClean.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = "";
                result.setText(show);
                reserve = "";
                operator = "";
            }
        });

        btnDelete.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show.substring(0, show.length() - 1);

                result.setText(show);
            }
        });

        btnEqual.setOnClickListener(new View.onClickListener(){

            public void onClick(View v){
                show = result.getText().toString();
                show = show + "1";

                if(operator.equals("-")){
                    result = Double.parseDouble(reserve) - Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(result));
                }
                if(operator.equals("+")){
                    result = Double.parseDouble(reserve) + Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(result));
                }
                if(operator.equals("/")){
                    result = Double.parseDouble(reserve) / Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(result));
                }
                if(operator.equals("*")){
                    result = Double.parseDouble(reserve) * Double.parseDouble(result.getText().toString());
                    result.setText(String.valueOf(result));
                }
            }
        });

     */

    }

    public void changeActivity (View v){
       // Intent intent = new Intent(this, Main2Activity.class);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hi ^^");
        Intent intentChooser = Intent.createChooser(intent, "Sending msg ^^");
        //intent.putExtra("message", "Hi ^^");
        startActivity(intentChooser);
    }

}
