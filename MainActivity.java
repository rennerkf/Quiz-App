package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submit(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        EditText answerField = (EditText) findViewById(R.id.answer_field);
        String hasAnswerField = answerField.getText().toString();
        //check answer for text field question number 7
        if (hasAnswerField.equalsIgnoreCase("Whale shark")) {
            score = score + 1;
        } else {
            Toast.makeText(MainActivity.this, "The largest shark is the Whale shark ", Toast.LENGTH_SHORT).show();
        }


        //figure out if user checked mosquito box
        CheckBox mosquitoCheckBox = (CheckBox) findViewById(R.id.question_6_mosquito);
        boolean hasMosquito = mosquitoCheckBox.isChecked();

        //figure out if user wants checked snow leopard
        CheckBox snowLeopardCheckBox = (CheckBox) findViewById(R.id.question_6_snow_leopard);
        boolean hasSnowLeopard = snowLeopardCheckBox.isChecked();
        //figure out if user checked orangutan

        CheckBox orangutanCheckBox = (CheckBox) findViewById(R.id.question_6_orangutan);
        boolean hasOrangutan = orangutanCheckBox.isChecked();

        //figure out if user checked none of  the above
        CheckBox noneOfAboveCheckBox = (CheckBox) findViewById(R.id.question_6_none_above);
        boolean hasNoneOfAbove = noneOfAboveCheckBox.isChecked();

        //check id correct answer for 6th question
        if (hasOrangutan && hasSnowLeopard && !hasMosquito && !hasNoneOfAbove) {
            score = score + 1;
            snowLeopardCheckBox.setTextColor(Color.GREEN);
            orangutanCheckBox.setTextColor(Color.GREEN);


        } else {
            noneOfAboveCheckBox.setTextColor(Color.RED);
            mosquitoCheckBox.setTextColor(Color.RED);
            snowLeopardCheckBox.setTextColor(Color.GREEN);
            orangutanCheckBox.setTextColor(Color.GREEN);
        }

        //figure out if user checked  less than 55
        RadioButton lessThanFiftyFive = (RadioButton) findViewById(R.id.radio_button1);
        boolean hasFiftyFive = lessThanFiftyFive.isChecked();
        //figure out if user checked  more than 100
        RadioButton lessThanOneHundred = (RadioButton) findViewById(R.id.radio_button2);
        boolean hasLessThanOneHundred = lessThanOneHundred.isChecked();
        //figure out if user checked  more than 500
        RadioButton moreThanFiveHundred = (RadioButton) findViewById(R.id.radio_button3);
        boolean hasMoreThanFiveHundred = moreThanFiveHundred.isChecked();
        //figure out if user checked  the right answer for first question
        if (hasFiftyFive) {
            score = score + 1;
            lessThanFiftyFive.setTextColor(Color.GREEN);

        } else {
            moreThanFiveHundred.setTextColor(Color.RED);
            lessThanOneHundred.setTextColor(Color.RED);
            lessThanFiftyFive.setTextColor(Color.GREEN);
        }

        //figure out if user checked 2021
        RadioButton twentyTwentyOne = (RadioButton) findViewById(R.id.radio_group_2_button1);
        boolean hasTwentyTwentyOne = twentyTwentyOne.isChecked();
        //figure out if user checked 2050
        RadioButton twentyFifty = (RadioButton) findViewById(R.id.radio_group_2_button2);
        boolean hasTwentyFifty = twentyFifty.isChecked();
        //figure out if user checked 2030
        RadioButton twentyThirty = (RadioButton) findViewById(R.id.radio_group_2_button3);
        boolean hasTwentyThirty = twentyThirty.isChecked();
        //figure out if user checked  the right answer for 2nd question
        if (hasTwentyTwentyOne) {
            score = score + 1;
            twentyTwentyOne.setTextColor(Color.GREEN);

        } else {
            twentyFifty.setTextColor(Color.RED);
            twentyThirty.setTextColor(Color.RED);
            twentyTwentyOne.setTextColor(Color.GREEN);
        }

        //figure out if user checked blue whale
        RadioButton blueWhale = (RadioButton) findViewById(R.id.radio_group_3_button3);
        boolean hasBlueWhale = blueWhale.isChecked();
        //figure out if user checked bowhead whale
        RadioButton bowheadWhale = (RadioButton) findViewById(R.id.radio_group_3_button1);
        boolean hasBowheadWhale = bowheadWhale.isChecked();
        //figure out if user checked beluga whale
        RadioButton belugaWhale = (RadioButton) findViewById(R.id.radio_group_3_button2);
        boolean hasBelugaWhale = belugaWhale.isChecked();
        //figure out if user checked  the right answer for 3rd question
        if (hasBlueWhale) {
            score = score + 1;
            blueWhale.setTextColor(Color.GREEN);

        } else {
            bowheadWhale.setTextColor(Color.RED);
            belugaWhale.setTextColor(Color.RED);
            blueWhale.setTextColor(Color.GREEN);
        }

        //figure out if user checked  3,900
        RadioButton aroundFourThousand = (RadioButton) findViewById(R.id.radio_group_4_button1);
        boolean hasAroundFourThousand = aroundFourThousand.isChecked();
        //figure out if user checked less than 10,000
        RadioButton lessThan = (RadioButton) findViewById(R.id.radio_group_4_button2);
        boolean hasLessThan = lessThan.isChecked();
        //figure out if user checked more than 20,000
        RadioButton moreThan = (RadioButton) findViewById(R.id.radio_group_4_button3);
        boolean hasMoreThan = moreThan.isChecked();

        //figure out if user checked  the right answer for 4th question
        if (hasAroundFourThousand) {
            score = score + 1;
            aroundFourThousand.setTextColor(Color.GREEN);

        } else {
            lessThan.setTextColor(Color.RED);
            moreThan.setTextColor(Color.RED);
            aroundFourThousand.setTextColor(Color.GREEN);
        }

        //figure out if user checked kemp ripleys sea turtle
        RadioButton kempRipley = (RadioButton) findViewById(R.id.radio_group_5_button1);
        boolean hasKempRipley = kempRipley.isChecked();
        //figure out if user checked green sea turtle
        RadioButton greenTurtle = (RadioButton) findViewById(R.id.radio_group_5_button3);
        boolean hasGreenTurtle = greenTurtle.isChecked();
        //figure out if user checked hawksbill sea turtle

        RadioButton hawksbill = (RadioButton) findViewById(R.id.radio_group_5_button2);
        boolean hasHawksbill = hawksbill.isChecked();
        //figure out if user checked  the right answer for 5th question
        if (hasKempRipley) {
            score = score + 1;
            kempRipley.setTextColor(Color.GREEN);
        } else {
            greenTurtle.setTextColor(Color.RED);
            hawksbill.setTextColor(Color.RED);
            kempRipley.setTextColor(Color.GREEN);
        }

        Toast.makeText(MainActivity.this, name + " Your score is " + score + " /7", Toast.LENGTH_SHORT).show();

        score = 0;
    }


}