package com.example.countgame_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView WinOrLose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 1;
        int b = 100;
        final int random_number = a + (int) (Math.random() * b );


        Button answer = findViewById(R.id.answer_Button);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seekBar.getProgress() - random_number > 10) {
                    WinOrLose.setText("Угадал");
                } else  if (random_number - seekBar.getProgress() > 30) {
                    WinOrLose.setText("Почти угадал");
                } else {
                    WinOrLose.setText("Не угадал");
                }
            }
        });

        WinOrLose = findViewById(R.id.win_or_lose_TextView);

        seekBar = findViewById(R.id.SeekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
