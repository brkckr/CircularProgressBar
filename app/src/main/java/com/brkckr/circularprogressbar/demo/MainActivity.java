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
    CircularProgressBar circularProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressBar = findViewById(R.id.circularProgressBar);
        Button btnDecrease = findViewById(R.id.btnDecrease);
        Button btnIncrease = findViewById(R.id.btnIncrease);
        Button btnRandom = findViewById(R.id.btnRandom);

        ((SeekBar) findViewById(R.id.seekBarBackground)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
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

        ((SeekBar) findViewById(R.id.seekBarProgress)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
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

        ((RadioButton) findViewById(R.id.radioClockwise)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    circularProgressBar.setState(CircularProgressBar.State.CLOCKWISE);
                }
            }
        });

        ((RadioButton) findViewById(R.id.radioCounter)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    circularProgressBar.setState(CircularProgressBar.State.COUNTERCLOCKWISE);
                }
            }
        });

        btnDecrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                circularProgressBar.setProgressValueWithAnimation(circularProgressBar.getProgressValue()-5, 200);
            }
        });

        btnIncrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                circularProgressBar.setProgressValueWithAnimation(circularProgressBar.getProgressValue()+5, 300);
            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int min = 0;
                int max = 100;

                Random random = new Random();
                int progressValue = random.nextInt(max - min + 1) + min;

                circularProgressBar.setProgressValueWithAnimation((float) progressValue);
            }
        });
    }
}
