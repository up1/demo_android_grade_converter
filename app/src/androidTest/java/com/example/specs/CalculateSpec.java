package com.example.specs;

import com.example.EspressoSpec;
import com.example.pages.StartPage;
import com.example.somkiat.calculate.MyActivity;


public class CalculateSpec extends EspressoSpec<MyActivity> {
    public CalculateSpec() {
        super(MyActivity.class);
    }

    StartPage startPage = new StartPage();

    public void testShouldShowText() {
        startPage.checkButtonHasText("Convert");
    }


    public void testShouldShowGradeA() {
        startPage.checkButtonHasText("Convert");
        startPage.fillInScore(80);
        startPage.clickConvertScore();
        startPage.checkResultFromExpected("Your grade = A");
    }

}
