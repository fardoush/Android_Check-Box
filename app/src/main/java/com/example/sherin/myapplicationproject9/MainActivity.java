package com.example.sherin.myapplicationproject9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private CheckBox salman, saruk, amir,saifily;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initFunctionality();
    }

    private void initFunctionality() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("Your Fav Actor Khan is \n");

                int checker = 0;

                if (salman.isChecked()){

                    String country = salman.getText().toString();
                    stringBuilder.append(country+"\n");

                    checker++;
                }

                if (saruk.isChecked()){

                    String country =  saruk.getText().toString();

                    stringBuilder.append(country+"\n");

                    checker++;
                }

                if (amir.isChecked()){

                    String country = amir.getText().toString();
                    stringBuilder.append(country+"\n");
                    checker++;
                }

                //paste
                if (saifily.isChecked()){

                    String country = saifily.getText().toString();
                    stringBuilder.append(country+"\n");
                    checker++;
                }

                if (checker>0) {
                    textView.setText(stringBuilder);
                }
                else {
                    textView.setText("Pls select a Actor");
                }
            }
        });
    }

    private void initView() {

        salman = findViewById(R.id.salmanId);
        saruk = findViewById(R.id.sarukId);
        amir = findViewById(R.id.amirId);
        saifily = findViewById(R.id.saifilyId);

        button = findViewById(R.id.selectButton);
        textView = findViewById(R.id.resultId);
    }
}
