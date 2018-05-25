package com.brkckr.circularprogressbar.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;

import com.brkckr.circularprogressbar.CircularProgressBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private CircularProgressBar circularProgressBar = null;
    private Button btnDecrease = null;
    private Button btnIncrease = null;
    private Button btnRandom = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDecrease = findViewById(R.id.btnDecrease);
        btnIncrease = findViewById(R.id.btnIncrease);
        btnRandom = findViewById(R.id.btnRandom);

        ((SeekBar) findViewById(R.id.seekBar1)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                circularProgressBar.setBackgroundWidth(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });

        ((SeekBar) findViewById(R.id.seekBar2)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                circularProgressBar.setProgressWidth(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });

        ((RadioButton) findViewById(R.id.radioButton1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    circularProgressBar.setState(CircularProgressBar.StateEnum.Clockwise);
                }
            }
        });

        ((RadioButton) findViewById(R.id.radioButton2)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    circularProgressBar.setState(CircularProgressBar.StateEnum.CounterClockwise);
                }
            }
        });

        btnDecrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                circularProgressBar.setProgressWithAnimation(circularProgressBar.getProgress()-5, 200);
            }
        });

        btnIncrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                circularProgressBar.setProgressWithAnimation(circularProgressBar.getProgress()+5, 300);
            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int min = 0;
                int max = 100;

                Random r = new Random();
                int abc = r.nextInt(max - min + 1) + min;

                circularProgressBar.setProgressWithAnimation((float) abc);
            }
        });

        circularProgressBar = findViewById(R.id.circularProgressBar);
    }
}
