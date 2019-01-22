package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTestUnit {

    private static final String TAG = EndpointsAsyncTaskTestUnit.class.getName();

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    private IdlingResource mIdlingResource;

    @Before
    public void registerIdlingResource() {
        mIdlingResource = activityTestRule.getActivity().getIdlingResource();
        IdlingRegistry.getInstance().register(mIdlingResource);
    }

    @Test
    public void nonEmptyJokeTest() {

        try {
            EndpointsAsyncTaskTest endpointsAsyncTaskTest = new EndpointsAsyncTaskTest();
            endpointsAsyncTaskTest.execute(InstrumentationRegistry.getContext());
            String joke = endpointsAsyncTaskTest.get(5, TimeUnit.SECONDS);
            Assert.assertTrue(!joke.equals(""));
        } catch (Exception e) {
            Log.d(TAG, "test Exception");
        }
    }

    @Test
    public void jokeIsDisplayed() {
        onView(withId(R.id.tellJokeButton)).perform(click());
        onView(withId(R.id.textView_joke)).check(matches(isDisplayed()));
    }

    @After
    public void unregisterIdlingResource() {
        if (mIdlingResource != null) {
            IdlingRegistry.getInstance().unregister(mIdlingResource);
        }
    }


}
