package com.vishvendu.cleanarch.newsapp.ui.fragment

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Before
import com.vishvendu.cleanarch.newsapp.R
import org.junit.Test


class MainFragmentTest{

   private lateinit var scenario : FragmentScenario<MainFragment>

   @Before
   fun setUP(){
      scenario = launchFragmentInContainer(themeResId = R.style.Theme_NewsApp)
      scenario.moveToState(Lifecycle.State.STARTED)
   }

   @Test
   fun display_all_buttons_to_main_fragment(){
      onView(withId(R.id.top_headlines)).check(matches(isDisplayed()))
      onView(withId(R.id.news_sources)).check(matches(isDisplayed()))
      onView(withId(R.id.country)).check(matches(isDisplayed()))
      onView(withId(R.id.languages)).check(matches(isDisplayed()))
      onView(withId(R.id.search)).check(matches(isDisplayed()))
   }

   @Test
   fun perform_click_on_top_headline_button(){
      onView(withId(R.id.top_headlines)).perform(click())
   }
}