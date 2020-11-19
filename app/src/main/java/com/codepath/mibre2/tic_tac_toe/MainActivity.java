package com.codepath.mibre2.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 2d 3x3 array of buttons representing TTT Grid
    private Button[][] buttons = new Button[3][3];

    // player 1 set first as default
    private boolean player1Turn = true;

    private int roundCount;

    private int player1Points;
    private int player2Points;

    private TextView tvPlayer1;
    private TextView tvPlayer2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPlayer1 = findViewById(R.id.tvPlayer1);
        tvPlayer2 = findViewById(R.id.tvPlayer2);

        // Assign button arr to buttons using a nested loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String btnId = "btn_" + i + j;
                int resID = getResources().getIdentifier(btnId, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {

    }
}