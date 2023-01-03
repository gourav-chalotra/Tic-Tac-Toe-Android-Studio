package com.firstandroidapp.tictactoegame;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int flag = 0,count = 0;
    ImageButton imgBtn1, imgBtn2, imgBtn3, imgBtn4, imgBtn5, imgBtn6, imgBtn7, imgBtn8, imgBtn9;
    ImageButton reset;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetValues();
            }
        });
    }
    public void init()
    {
        imgBtn1 = findViewById(R.id.ImgBtn1);
        imgBtn2 = findViewById(R.id.ImgBtn2);
        imgBtn3 = findViewById(R.id.ImgBtn3);
        imgBtn4 = findViewById(R.id.ImgBtn4);
        imgBtn5 = findViewById(R.id.ImgBtn5);
        imgBtn6 = findViewById(R.id.ImgBtn6);
        imgBtn7 = findViewById(R.id.ImgBtn7);
        imgBtn8 = findViewById(R.id.ImgBtn8);
        imgBtn9 = findViewById(R.id.ImgBtn9);
        reset = findViewById(R.id.ImgBtnRefresh);

        imgBtn1.setContentDescription("");
        imgBtn2.setContentDescription("");
        imgBtn3.setContentDescription("");
        imgBtn4.setContentDescription("");
        imgBtn5.setContentDescription("");
        imgBtn6.setContentDescription("");
        imgBtn7.setContentDescription("");
        imgBtn8.setContentDescription("");
        imgBtn9.setContentDescription("");

    }
    public  void resetValues()
    {
        imgBtn1.setImageResource(R.drawable.round_button);
        imgBtn1.setContentDescription("");
        imgBtn2.setImageResource(R.drawable.round_button);
        imgBtn2.setContentDescription("");
        imgBtn3.setImageResource(R.drawable.round_button);
        imgBtn3.setContentDescription("");
        imgBtn4.setImageResource(R.drawable.round_button);
        imgBtn4.setContentDescription("");
        imgBtn5.setImageResource(R.drawable.round_button);
        imgBtn5.setContentDescription("");
        imgBtn6.setImageResource(R.drawable.round_button);
        imgBtn6.setContentDescription("");
        imgBtn7.setImageResource(R.drawable.round_button);
        imgBtn7.setContentDescription("");
        imgBtn8.setImageResource(R.drawable.round_button);
        imgBtn8.setContentDescription("");
        imgBtn9.setImageResource(R.drawable.round_button);
        imgBtn9.setContentDescription("");
        count = 0;
    }
    public void clickImg(View v) throws InterruptedException {
        ImageButton IB = (ImageButton) v;
        if(IB.getContentDescription().equals(""))
        {
            if (flag == 0) {
                IB.setImageResource(R.drawable.cross);
                IB.setContentDescription("x");
                count++;
                flag = 1;
            } else {
                IB.setImageResource(R.drawable.circle);
                IB.setContentDescription("o");
                count++;
                flag = 0;
            }
            if (count > 4)
            {
                if (imgBtn1.getContentDescription().equals("x") && imgBtn2.getContentDescription().equals("x") && imgBtn3.getContentDescription().equals("x") && imgBtn1 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn4.getContentDescription().equals("x") && imgBtn5.getContentDescription().equals("x") && imgBtn6.getContentDescription().equals("x") && imgBtn6 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn7.getContentDescription().equals("x") && imgBtn8.getContentDescription().equals("x") && imgBtn9.getContentDescription().equals("x") && imgBtn9 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn1.getContentDescription().equals("x") && imgBtn5.getContentDescription().equals("x") && imgBtn9.getContentDescription().equals("x") && imgBtn9 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn3.getContentDescription().equals("x") && imgBtn5.getContentDescription().equals("x") && imgBtn7.getContentDescription().equals("x") && imgBtn7 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn1.getContentDescription().equals("x") && imgBtn4.getContentDescription().equals("x") && imgBtn7.getContentDescription().equals("x") && imgBtn7 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn2.getContentDescription().equals("x") && imgBtn5.getContentDescription().equals("x") && imgBtn8.getContentDescription().equals("x") && imgBtn8 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if (imgBtn3.getContentDescription().equals("x") && imgBtn6.getContentDescription().equals("x") && imgBtn9.getContentDescription().equals("x") && imgBtn9 != null) {
                    Toast.makeText(this, "X winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                //circle condition
                if(imgBtn1.getContentDescription().equals("o") && imgBtn2.getContentDescription().equals("o") && imgBtn3.getContentDescription().equals("o") && imgBtn1 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn4.getContentDescription().equals("o") && imgBtn5.getContentDescription().equals("o") && imgBtn6.getContentDescription().equals("o") && imgBtn6 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn7.getContentDescription().equals("o") && imgBtn8.getContentDescription().equals("o") && imgBtn9.getContentDescription().equals("o") && imgBtn9 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn1.getContentDescription().equals("o") && imgBtn5.getContentDescription().equals("o") && imgBtn9.getContentDescription().equals("o") && imgBtn9 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn3.getContentDescription().equals("o") && imgBtn5.getContentDescription().equals("o") && imgBtn7.getContentDescription().equals("o") && imgBtn7 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn1.getContentDescription().equals("o") && imgBtn4.getContentDescription().equals("o") && imgBtn7.getContentDescription().equals("o") && imgBtn7 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn2.getContentDescription().equals("o") && imgBtn5.getContentDescription().equals("o") && imgBtn8.getContentDescription().equals("o") && imgBtn8 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(imgBtn3.getContentDescription().equals("o") && imgBtn6.getContentDescription().equals("o") && imgBtn9.getContentDescription().equals("o") && imgBtn9 != null)
                {
                    Toast.makeText(this, "O winner", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
                else if(count == 9)
                {
                    Toast.makeText(this, "match was draw", Toast.LENGTH_SHORT).show();
                    resetValues();
                }
            }
        }
        else
        {
            Toast.makeText(this, "alrady selected !", Toast.LENGTH_SHORT).show();
        }
    }
}