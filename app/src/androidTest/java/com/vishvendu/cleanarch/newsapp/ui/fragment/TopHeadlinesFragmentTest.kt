package com.vishvendu.cleanarch.newsapp.ui.fragment

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.vishvendu.cleanarch.newsapp.R
import com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter
import org.junit.Before
import org.junit.Test


class TopHeadlinesFragmentTest{
    private lateinit var scenario : FragmentScenario<TopHeadlinesFragment>

    @Before
    fun setUP(){
        scenario = launchFragmentInContainer(themeResId = R.style.Theme_NewsApp)
        scenario.moveToState(Lifecycle.State.STARTED)
    }

    @Test
    fun test_showRecyclerView(){
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))
    }

    @Test
    fun test_displayRecyclerView_item_onclick(){
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        onView(withId(R.id.recyclerView)).perform(actionOnItemAtPosition<TopHeadlinesAdapter.DataViewHolder>(6,click()))
    }
}