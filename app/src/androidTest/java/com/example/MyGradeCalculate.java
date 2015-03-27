package com.example;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.somkiat.calculate.MyActivity;
import com.example.somkiat.calculate.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class MyGradeCalculate extends ActivityInstrumentationTestCase2<MyActivity> {

    public MyGradeCalculate() {
        super(MyActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testShowGradeDWhenScoreIs50() {
        onView(withId(R.id.score)).perform(typeText(String.valueOf(50)));
        onView(withId(R.id.addButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Your grade = D")));
    }
}
