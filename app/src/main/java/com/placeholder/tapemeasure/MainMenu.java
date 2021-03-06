package com.placeholder.tapemeasure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Button Measuring Tape opens Measuring Tape activity
        Button button_measuringTape = (Button) (findViewById(R.id.button_measuringtape));
        button_measuringTape.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MeasuringTape.class);
                startActivity(i);
            }
        });
    }
}
