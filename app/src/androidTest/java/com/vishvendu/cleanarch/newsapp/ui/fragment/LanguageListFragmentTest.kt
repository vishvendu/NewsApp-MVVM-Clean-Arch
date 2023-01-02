package com.vishvendu.cleanarch.newsapp.ui.fragment

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.vishvendu.cleanarch.newsapp.R
import com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter
import com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter
import org.junit.Before
import org.junit.Test


class LanguageListFragmentTest{
    private lateinit var scenario : FragmentScenario<LanguageListFragment>

    @Before
    fun setUP(){
        scenario = launchFragmentInContainer(themeResId = R.style.Theme_NewsApp)
        scenario.moveToState(Lifecycle.State.STARTED)
    }

    @Test
    fun test_showRecyclerView(){
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun test_displayRecyclerView_item_onclick(){
        try {
            Thread.sleep(5000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        onView(withId(R.id.recyclerView)).perform(actionOnItemAtPosition<LanguageListAdapter.ViewHolder>(3, longClick()))
        onView(withId(R.id.recyclerView)).perform(actionOnItemAtPosition<LanguageListAdapter.ViewHolder>(1, longClick()))

        onView(withId(R.id.buttonLanguage)).perform(click())
    }
}