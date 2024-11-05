package com.nel.tic;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.content.pm.ActivityInfo;


public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String krest, nol;
    TextView textView, humanPoints, pcPoints;
    int pointsOfHuman, pointsOfPC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
        humanPoints = findViewById(R.id.humanPoints);
        pcPoints = findViewById(R.id.pcPoints);

        krest = "X";
        nol = "O";
        textView.setText("");

    }

    public void clcBtn1(View view) {
        if (button1.getText() == ""  && textView.getText() == ""){
            button1.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn2(View view) {
        if (button2.getText() == "" && textView.getText() == ""){
            button2.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn3(View view) {
        if (button3.getText() == "" && textView.getText() == ""){
            button3.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn4(View view) {
        if (button4.getText() == "" && textView.getText() == ""){
            button4.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn5(View view) {
        if (button5.getText() == "" && textView.getText() == ""){
            button5.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn6(View view) {
        if (button6.getText() == "" && textView.getText() == ""){
            button6.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn7(View view) {
        if (button7.getText() == "" && textView.getText() == ""){
            button7.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn8(View view) {
        if (button8.getText() == "" && textView.getText() == ""){
            button8.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }

    public void clcBtn9(View view) {
        if (button9.getText() == "" && textView.getText() == ""){
            button9.setText(krest);
            isPlayerWinner();
            if (textView.getText() == ""){
                hodPC();
            }
        }
    }




    public void isPlayerWinner () {
        if (button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else
        if (button4.getText() == krest && button5.getText() == krest && button6.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else
        if (button7.getText() == krest && button8.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else

        if (button1.getText() == krest && button4.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else
        if (button2.getText() == krest && button5.getText() == krest && button8.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else
        if (button3.getText() == krest && button6.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else

        if (button1.getText() == krest && button5.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);
        } else
        if (button3.getText() == krest && button5.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_massage);
            pointsOfHuman ++;
            humanPoints.setText("" + pointsOfHuman);

        }else
        if ( button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.draw_massage);
        }
    }

    public void isPCWinner () {
        if (button1.getText() == nol && button2.getText() == nol && button3.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else
        if (button4.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else
        if (button7.getText() == nol && button8.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else

        if (button1.getText() == nol && button4.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else
        if (button2.getText() == nol && button5.getText() == nol && button8.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else
        if (button3.getText() == nol && button6.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else

        if (button1.getText() == nol && button5.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        } else
        if (button3.getText() == nol && button5.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.PC_winner_massage);
            pointsOfPC ++;
            pcPoints.setText("" + pointsOfPC);
        }
    }


    private void hodPC() {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        Log.i("hodPC", "buttonPcClick - " + buttonPcClick);
        switch (buttonPcClick) {

            case (1): if (button1.getText() == ""){
                button1.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (2): if (button2.getText() == ""){
                button2.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (3): if (button3.getText() == ""){
                button3.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (4): if (button4.getText() == ""){
                button4.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (5): if (button5.getText() == ""){
                button5.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (6): if (button6.getText() == ""){
                button6.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (7): if (button7.getText() == ""){
                button7.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (8): if (button8.getText() == ""){
                button8.setText(nol); isPCWinner();
            }else {hodPC();}
                break;

            case (9): if (button9.getText() == ""){
                button9.setText(nol); isPCWinner();
            }else {hodPC();}
                break;
        }
    }

    public void clickRestart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");
    }
}