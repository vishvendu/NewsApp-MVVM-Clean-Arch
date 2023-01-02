package com.vishvendu.cleanarch.newsapp.ui.activity

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import com.vishvendu.cleanarch.newsapp.R
import org.junit.Rule
import org.junit.Test


class MainActivityTest{

    @get:Rule
    val activityScenario = activityScenarioRule<MainActivity>()

    @Test
    fun main_fragment_display(){
        onView(withId(R.id.container)).check(matches(isDisplayed()))
    }

}