package com.example.somkiat.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import demo.GradeConverter;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void doConvert(View view) {
        EditText score = (EditText)this.findViewById(R.id.score);
        String grade = new GradeConverter().convert(Integer.parseInt(score.getText().toString()));
        TextView result = (TextView)this.findViewById(R.id.result);
        result.setText("Your grade = " + grade);
    }

}
