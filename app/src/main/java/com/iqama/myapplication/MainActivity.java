package com.iqama.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView,textView2,resultText ,resultText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        resultText = findViewById(R.id.resultText);
        resultText2 = findViewById(R.id.resultText2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int diceOne = rollDice1() ;
                diceOne = diceOne + 1;

                int diceTow = rollDice2();
                diceTow = diceTow + 1;

                textView.setText( "" + diceOne);

                textView2.setText("" +diceTow);


                /*
                 * This String will appear in result TextView2
                 *
                */
                if (diceOne==10){
                    textView.setTextSize(50);

                }
                else if (diceOne==0||diceOne==1||diceOne==2||diceOne==3||diceOne==4||diceOne==5||diceOne==6||diceOne==7||diceOne==8||diceOne==9){
                    textView.setTextSize(40);
                }
                String resultSt ;

                switch (diceOne){
                    case 0:   resultText.setTextColor(Color.RED); resultSt = "Try another Time";
                    break;
                    case 1: resultText.setTextColor(Color.RED); resultSt = "oops! Try again ";
                    break;
                    case 2: resultText.setTextColor(Color.RED); resultSt = "ooh! Try again All the best ,";
                    break;
                    case 3: resultText.setTextColor(Color.RED); resultSt = "Not that bad, Try again for best ";
                    break;
                    case 4: resultText.setTextColor(Color.RED); resultSt = "Not bad, Try again for best ";
                    break;
                    case 5: resultText.setTextColor(Color.GREEN); resultSt = "Good Job!, Try again for best ";
                    break;
                    case 6: resultText.setTextColor(Color.BLUE); resultSt = "Good Job! Go ahead ";
                    break;
                    case 7:  resultText.setTextColor(Color.YELLOW); resultSt = "Great Job! Broh! ";
                    break;
                    case 8:  resultText.setTextColor(Color.MAGENTA); resultSt = "Great Job! Congratulation! ";
                    break;
                    case 9:  resultText.setTextColor(Color.CYAN); resultSt = "Great Job! Good Luck For You ";
                    break;
                    case 10: resultText.setTextColor(Color.RED);  resultSt = " Hurrah!!! Congratulation! Yoy are our top scourer!  ";
                    break;

                    default: resultSt = "Looks you are in wrong place";
                }


                String resultSt2;
                switch (diceTow){
                    case 0: resultSt2 = " Try another Time ";
                    break;
                    case 1: resultSt2 = "oops! Try again ";
                    break;
                    case 2: resultSt2 = "ooh! Try again All the best ,";
                    break;
                    case 3: resultSt2 = "Not that bad, Try again for best ";
                    break;
                    case 4: resultSt2 = "Not bad, Try again for best ";
                    break;
                    case 5: resultSt2 = "Good Job!, Try again for best ";
                    break;
                    case 6: resultSt2 = "Good Job! Go ahead ";
                    break;
                    case 7: resultSt2 = "Great Job! Broh! ";
                    break;
                    case 8: resultSt2 = "Great Job! Congratulation! ";
                    break;
                    case 9: resultSt2 = "Great Job! Good Luck For You ";
                    break;
                    case 10: resultSt2 = " Hurrah!!! Congratulation! Yoy are our top scourer! Good Luck For You ";
                    break;
                    default: resultSt2 = "Looks you are in wrong place";
                }

                resultText.setText(resultSt);
                resultText2.setText(resultSt2);



            }
        });



    }
    public int rollDice1(){
        double random = Math.random();
        random = random * 10;
        int randomInt = (int) random ;
        return randomInt;
    }

    public int rollDice2(){
        double random = Math.random();
        random = random * 10;
        int randomInt = (int) random ;
        return randomInt;
    }

}