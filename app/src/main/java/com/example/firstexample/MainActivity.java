package com.example.firstexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public Switch my_switch;
   // private int[] CELDAS;
   // private int[] CELDAS_CLICKED;
   // public int contador = 0;

    protected boolean endGame = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_switch = findViewById(R.id.switch1);

        my_switch.setOnContextClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                boolean isOn = ((ToggleButton)v)).isCheked();
            }
        });

        /*
        //iniciamos el aray CELDAS
        CELDAS = new int[9];
        CELDAS_CLICKED = new int[9];

        for(int i = 0; i < 9; i++)
            CELDAS_CLICKED[i] = 0;

        CELDAS[0] = R.id.a1;
        CELDAS[1] = R.id.a2;
        CELDAS[2] = R.id.a3;
        CELDAS[3] = R.id.b1;
        CELDAS[4] = R.id.b2;
        CELDAS[5] = R.id.b3;
        CELDAS[6] = R.id.c1;
        CELDAS[7] = R.id.c2;
        CELDAS[8] = R.id.c3;
        */


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

    } // end onCreate()...


    /*
    public void play(View v){

        ImageView image;
        contador = 0;
        endGame = false;
        for(int eachCelda:CELDAS) {

            image = (ImageView) findViewById((eachCelda));
            image.setImageResource(R.drawable.celda);
            image.setBackgroundColor(Color.parseColor("#007C7373"));
        }

    }  // end play()...


    public void click(View vista){
        if (endGame){
            contador = 9;
            return;
        }

        //if (contador == 9) {
           // checkWinner();
          //  return;
        //}

        //if (endGame)
          //  return;

        int celda = 0;

        for (int i = 0; i < 9; i++){

            if (CELDAS[i] == vista.getId()){

                celda = i;
                break;
            }
        }

        if (contador > 1)
            if(checkClicked(celda))
                return;

        marca(celda);
        contador++;

        checkWinner();

    }


    public void marca(int number){
        ImageView image;

        image = (ImageView)findViewById(CELDAS[number]);

        if (contador % 2 == 0){
            image.setImageResource(R.drawable.aspa);
            image.setBackgroundColor(Color.parseColor("#D3FCC7"));
            image.setContentDescription("X");
        }
        else
            {
            image.setImageResource(R.drawable.circulo);
            image.setBackgroundColor(Color.parseColor("#C7F2FC"));
            image.setContentDescription("O");
        }
        CELDAS_CLICKED[contador] = number;

    }// end marca()...


    protected boolean checkClicked(int number) {
        for (int i = 0; i < 9; i++){
            if (CELDAS_CLICKED[i] == number)
                return true;
        }
        return false;
    }


    protected void checkWinner() {
        String winner;
        CharSequence a1 = findViewById(R.id.a1).getContentDescription();
        CharSequence a2 = findViewById(R.id.a2).getContentDescription();
        CharSequence a3 = findViewById(R.id.a3).getContentDescription();
        CharSequence b1 = findViewById(R.id.b1).getContentDescription();
        CharSequence b2 = findViewById(R.id.b2).getContentDescription();
        CharSequence b3 = findViewById(R.id.b3).getContentDescription();
        CharSequence c1 = findViewById(R.id.c1).getContentDescription();
        CharSequence c2 = findViewById(R.id.c2).getContentDescription();
        CharSequence c3 = findViewById(R.id.c3).getContentDescription();

        // Comprobamos la vertical
        if(a1 != null || b1 != null || c1 != null)
            if(a1.equals(b1) && b1.equals(c1)) {
                endGame = true;
                if (a1.equals("X")) {
                    winner = "Player 1 (X)";
                    return;
                }
                else
                {
                    winner = "Player 2 (O)";
                    return;
                }
            }
        if(a2 != null || b2 != null || c2 != null)
            if(a2.equals(b2) && b2.equals(c2)) {
                endGame = true;
                if (a2.equals("X")) {
                    winner = "Player 1 (X)";
                    return;
                }
                else
                {
                    winner = "Player 2 (O)";
                    return;
                }
            }
        if(a3 != null || b3 != null || c3 != null)
            if(a3.equals(b3) && b3.equals(c3)) {
                endGame = true;
                if (a1.equals("X")) {
                    winner = "Player 1 (X)";
                    return;
                }
                else
                {
                    winner = "Player 2 (O)";
                    return;
                }
            }

        // Comprobamos las horizontales
        if(a1.equals(a2) && a2.equals(a3)) {
            endGame = true;
            if (a1.equals("X")) {
                winner = "Player 1 (X)";
                return;
            }
            else
            {
                winner = "Player 2 (O)";
                return;
            }
        }

        if(b1.equals(b2) && b2.equals(b3)) {
            endGame = true;
            if (b1.equals("X")) {
                winner = "Player 1 (X)";
                return;
            }
            else
            {
                winner = "Player 2 (O)";
                return;
            }
        }

        if(c1.equals(c2) && c2.equals(c3)) {
            endGame = true;
            if (c1.equals("X")) {
                winner = "Player 1 (X)";
                return;
            }
            else
            {
                winner = "Player 2 (O)";
                return;
            }
        }

        // Comprobamos las dos diagonales
        if(a1.equals(b2) && b2.equals(c3)) {
            endGame = true;
            if (a1.equals("X")) {
                winner = "Player 1 (X)";
                return;
            }
            else
            {
                winner = "Player 2 (O)";
                return;
            }
        }

        if(a3.equals(b2) && b2.equals(c1)) {
            endGame = true;
            if (a3.equals("X")) {
                winner = "Player 1 (X)";
                return;
            }
            else
            {
                winner = "Player 2 (O)";
                return;
            }
        }

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
     */

}
