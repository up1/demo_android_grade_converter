package com.example.pages;

import com.example.somkiat.calculate.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class StartPage {

    public void checkButtonHasText(String expected) {
        onView(withId(R.id.addButton)).check(matches(withText(expected)));
    }

    public void fillInScore(int score) {
        onView(withId(R.id.score)).perform(typeText(String.valueOf(score)));
    }

    public void clickConvertScore() {
        onView(withId(R.id.addButton)).perform(click());
    }

    public void checkResultFromExpected(String expectedMessage) {
        onView(withId(R.id.result)).check(matches(withText(expectedMessage)));
    }

}
