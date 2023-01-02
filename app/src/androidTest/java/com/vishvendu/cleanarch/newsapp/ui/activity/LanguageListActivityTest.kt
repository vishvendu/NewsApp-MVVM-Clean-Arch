package com.vishvendu.cleanarch.newsapp.ui.activity

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.vishvendu.cleanarch.newsapp.R
import org.junit.Rule
import org.junit.Test


class LanguageListActivityTest{
    @get:Rule
    val activityScenario = activityScenarioRule<LanguageListActivity>()


    @Test
    fun display_top_Headlines_fragment(){
        Espresso.onView(ViewMatchers.withId(R.id.container))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}