package com.vishvendu.cleanarch.newsapp.ui.activity


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Test
import com.vishvendu.cleanarch.newsapp.R
import org.junit.Rule


class TopHeadlinesActivityTest{

    @get:Rule
    val activityScenario = activityScenarioRule<TopHeadlinesActivity>()


    @Test
    fun display_top_Headlines_fragment(){
        onView(withId(R.id.topHeadlineContainer)).check(matches(isDisplayed()))
    }
}