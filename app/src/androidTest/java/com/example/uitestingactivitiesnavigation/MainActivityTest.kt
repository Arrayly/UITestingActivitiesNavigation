package com.example.uitestingactivitiesnavigation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.*

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get : Rule
    val activityScenario = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_navigationTo_Secondary_buttonClicked() {
        onView(withId(R.id.MainActivity_btn)).perform(click())
        onView(withId(R.id.SecondaryActivity_rootLayout)).check(matches(isDisplayed()))
    }

    @Test
    fun test_navigationTo_MainActivity_buttonClicked() {
        onView(withId(R.id.MainActivity_btn)).perform(click())
        onView(withId(R.id.SecondaryActivity_btn)).perform(click())
        onView(withId(R.id.MainActivity_rootLayout)).check(matches(isDisplayed()))
    }
}