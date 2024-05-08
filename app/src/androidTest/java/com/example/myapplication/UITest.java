package com.example.myapplication;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class UITest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);
//    editShape = findViewById(R.id.editShape);
//    editColor = findViewById(R.id.editColor);
//    button = findViewById(R.id.button);
//    information = findViewById(R.id.information);
    @Test
    public void testShapeInsert(){
        Espresso.onView(ViewMatchers.withId(R.id.editShape))
                .perform(ViewActions.typeText("Circle"));
        Espresso.onView(ViewMatchers.withId(R.id.editColor))
                .perform(ViewActions.typeText("Red"));

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.information))
                .check(ViewAssertions.matches(ViewMatchers.withText("The shape is Circle\nArea is 78.5\nPerimeter is 31.4\n")));

        Espresso.onView(ViewMatchers.withId(R.id.information))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Red\n")));
    }

}
